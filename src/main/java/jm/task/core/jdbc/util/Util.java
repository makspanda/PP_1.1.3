package jm.task.core.jdbc.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Util {
    private static final String URL = "jdbc:mysql://localhost:3306/dbtest";
    private static final String USER = "Admin";
    private static final String PASSWORD = "Tru124~k78!";

    static Connection conn = null;

    public static Connection getConnection() {
        try {
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("Соединение с БД установлено");
        } catch (SQLException e) {
            System.err.println("Ошибка при попытке соединения: " + e.getMessage());
        }
        return conn;
    }
}
