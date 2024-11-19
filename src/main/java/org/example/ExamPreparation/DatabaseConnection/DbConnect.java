package org.example.ExamPreparation.DatabaseConnection;
import java.sql.*;

public class DbConnect {
    private static final String CONNECTION_STRING = "sdf";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void getNekeStvari(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM ovdje WHERE id = ?");
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("id"));
        }
    }

    public void getBla() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM table");
        ResultSet rs = statement.executeQuery();
    }

    public void getAllTasks() throws SQLException {
        PreparedStatement statement= this.connection.prepareStatement("SELECT * FROM tasks");
        ResultSet rs = statement.executeQuery();
    }

    public void getTaskById(int id) throws SQLException {
        PreparedStatement statement =  this.connection.prepareStatement("SELECT * FROM tasks WHERE id = ?");
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();
    }

    public void getTaskByName(String name) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM tasks WHERE name = ?");
        statement.setString(1, name);
        ResultSet rs = statement.executeQuery();
    }

    public void getNesto(int id, String name) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM customers WHERE id = ? AND name = ?");
        statement.setInt(1, id);
        statement.setString(2, name);
        ResultSet rs = statement.executeQuery();
    }

    public void tooTimurkooo(String timur) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement("SELECT * FROM timur WHERE timur = ?");
        statement.setString(1, timur);
        ResultSet rs = statement.executeQuery();
    }
}
