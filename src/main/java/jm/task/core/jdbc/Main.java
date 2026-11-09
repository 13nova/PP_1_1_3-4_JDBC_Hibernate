package jm.task.core.jdbc;

import jm.task.core.jdbc.model.User;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        userService.saveUser("Ivan", "Ivanov", (byte) 25);
        System.out.println("User с именем - Ivan добавлен в базу данных");

        userService.saveUser("Petr", "Petrov", (byte) 30);
        System.out.println("User с именем - Petr добавлен в базу данных");

        userService.saveUser("Anna", "Sidorova", (byte) 22);
        System.out.println("User с именем - Anna добавлен в базу данных");

        userService.saveUser("Elena", "Smirnova", (byte) 28);
        System.out.println("User с именем - Elena добавлен в базу данных");

        System.out.println("\n -- Список всех пользователей --");
        for (User user : userService.getAllUsers()) {
            System.out.println(user);
        }

        userService.cleanUsersTable();
        System.out.println("\nТаблица очищена.");

        userService.dropUsersTable();
        System.out.println("Таблица удалена.");
    }
}
