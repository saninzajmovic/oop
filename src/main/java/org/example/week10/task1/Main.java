package org.example.week10.task1;
import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface CanSendMessage {}

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE, ElementType.METHOD})
@interface RequiresPermission {
    String level();
}

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
@interface UserPermission {
    String level();
}


abstract class User {
    private String username;

    public User(String username) {
        this.username = username;
    }

    public void sendMessage(String message) {
        System.out.println(message);
    }
}

@UserPermission(level = "REGULAR")
class RegularUser extends  User {
    public RegularUser(String username) {
        super(username);
    }
}

@UserPermission(level = "ADMIN")
class AdminUser extends User {
    public AdminUser(String username) {
        super(username);
    }
}

class MessagingSystem {

    @CanSendMessage
    @RequiresPermission(level = "ADMIN")
    public void sendMessage(User user) {

    }


    public static void main(String[] args) throws IllegalAccessException {
        RegularUser obicnilik = new RegularUser("obicnilik");
        AdminUser adminko = new AdminUser("babo");

        MessagingSystem system = new MessagingSystem();

        for (Method method : MessagingSystem.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(CanSendMessage.class)) {
                RequiresPermission requiredPermission = method.getAnnotation(RequiresPermission.class);
                

            }
        }
    }
}

class Main {
}