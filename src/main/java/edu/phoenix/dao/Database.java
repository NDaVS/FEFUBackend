package edu.phoenix.dao;

import edu.phoenix.Exceptions.MainException;
import edu.phoenix.model.User;

import java.util.ArrayList;
import java.util.List;

public class Database {
    public static List<User> dataBase = new ArrayList<>();

    public static void addUser(String name, String login, String password) throws MainException {
        // Реализуйте этот метод
        try{
            if (name == null || login == null || password == null) {
                throw new MainException("Неверные данные");
            }dataBase.add(new User(name, login, password));
        } catch (MainException e) {
            e.errorMessageAdd();
        }



    }

    public static User getUser(String login, String password) {
        // Реализуйте этот метод. Он должен вернуть пользователя, а не null

        for (User user : dataBase) {
            if (user.getLogin().equals(login) && user.getPassword().equals(password)) {
                return user;
            }
        }
        return null;
    }

    public static void deleteUser(String login) {
        for (User user : dataBase) {
            if (user.getLogin().equals(login)) {
                dataBase.remove(user);
                break;
            }
        }
        // Реализуйте этот метод
    }

    public static void updateUser(User user) {
        for (User bdUser : dataBase) {
            if (user.getName().equals(bdUser.getName())) {
                bdUser.setLogin(user.getLogin());
                bdUser.setPassword(user.getPassword());
                break;
            }
        }
        // Реализуйте этот метод
    }

}
