package org.example.week3;

import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

enum TaskStatus {
    TO_DO, IN_PROGRESS, COMPLETED, CANCELLED
}

class TaskItem {
    public int id;
    public String description;
    public TaskStatus status;
    public TaskItem(int taskId, String taskDescription, TaskStatus taskStatus) {
        this.id = taskId;
        this.description = taskDescription;
        this.status = taskStatus;

    }

}

class DataStructures {
    private List<TaskItem> tasks = new ArrayList<>();

    public DataStructures() {
        tasks = Arrays.asList(
                new TaskItem(1,"Push lab code to the github", TaskStatus.TO_DO),
                new TaskItem(2,"Prepare for the quiz", TaskStatus.IN_PROGRESS),
                new TaskItem(3,"Go over tasks from lab2", TaskStatus.COMPLETED));
    }

    // TODO create a method to get all objects
    public List<TaskItem> toGetAllObjects() {
        return tasks;
    }

    // TODO create a method getByStatus that will accept a Status parameter and filter the tasks with the provided status
    public List<TaskItem> getByStatus(TaskStatus status) {
        List<TaskItem> taskovi = new ArrayList<>();
        for(TaskItem task : tasks) {
            if(task.status.equals(status)) {
                taskovi.add(task);
            }
        }
        return taskovi;
    }

    // TODO create a method to find tasks whose id parameter greater than or equal to 2
    public List<TaskItem> idGreaterThanOrEqualToTwo() {
        List<TaskItem> taskovi = new ArrayList<>();
        for(TaskItem task : tasks) {
            if(task.id >= 2) {
                taskovi.add(task);
            }
        }
        return taskovi;
    }

    // TODO create a method that will, by using the forEach stream method, print to the console the description of each task
    public void printDescription() {
        tasks.forEach(task -> System.out.println(task.description));
    }

}

class DbConnect {
    private static final String CONNECTION_STRING = "jdbc:mysql://localhost:3306/lab3";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private Connection connection = null;

    public DbConnect() {
        try {
            connection = DriverManager.getConnection(CONNECTION_STRING, USERNAME, PASSWORD);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    public void fetchAllEntities() throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM tasks"
        );
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void fetchById(int id) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "SELECT * FROM tasks WHERE id = ?"
        );
        statement.setInt(1, id);
        ResultSet rs = statement.executeQuery();

        while (rs.next()) {
            System.out.println(rs.getString("id"));
            System.out.println(rs.getString("task_description"));
            System.out.println(rs.getString("task_status"));
        }
    }

    public void createNewTask(int id, String taskDescription, TaskStatus status) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "INSERT INTO tasks (id, task_description, task_status) VALUES (?, ?, ?)"
        );
        statement.setInt(1, id);
        statement.setString(2, taskDescription);
        statement.setString(3, status.toString());
        statement.executeUpdate();
    }

    public void upsdateTaslNameWithId(int id, String taskDescription) throws SQLException {
        PreparedStatement statement = this.connection.prepareStatement(
                "UPDATE tasks SET task_description = ? WHERE id = ?"
        );
        statement.setString(1, taskDescription);
        statement.setInt(2, id);
        statement.executeUpdate();
    }

}


class Main{
    public static void main(String[] args) throws SQLException {
        //DataStructures ds = new DataStructures();
        //ds.printDescription();
        DbConnect db = new DbConnect();
        //db.fetchAllEntities();

        //db.fetchById(2);

        //db.createNewTask(5, "Finish casks from this lab", TaskStatus.IN_PROGRESS);
        //db.fetchAllEntities();

        db.upsdateTaslNameWithId(3, "Finish tasks from previous lab");
        db.fetchAllEntities();
    }
}