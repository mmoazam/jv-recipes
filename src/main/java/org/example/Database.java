package org.example;
import org.example.model.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.sql.Driver;

import static java.lang.Boolean.TRUE;
import static org.hibernate.cfg.AvailableSettings.*;
//import static org.hibernate.cfg.JdbcSettings.*;



public class Database {
    public static void main(String[] args) {
        Database.getSessionFactory()
                .getSchemaManager()
                .exportMappedObjects(true);
    }
    public static SessionFactory getSessionFactory(){

        var sessionFactory = new Configuration()
                .addAnnotatedClass(Ingredient.class)
                .addAnnotatedClass(Recipe.class)
                .addAnnotatedClass(Category.class)
                .addAnnotatedClass(AppUser.class)
                .addAnnotatedClass(Comment.class)
                .addAnnotatedClass(Tag.class)
                .addAnnotatedClass(Image.class)
                .addAnnotatedClass(Rating.class)
                .setProperty(JAKARTA_JDBC_URL, "jdbc:h2:mem:db1")
                .setProperty(JAKARTA_JDBC_USER, "sa")
                .setProperty(JAKARTA_JDBC_PASSWORD, "")
                .setProperty(SHOW_SQL, TRUE.toString())
                .setProperty(FORMAT_SQL, TRUE.toString())
                .setProperty(HIGHLIGHT_SQL, TRUE.toString())
                .setProperty("hibernate.agroal.maxSize", "20")
                .buildSessionFactory();

        return sessionFactory;
    }// getSessionFactory
}// end class
