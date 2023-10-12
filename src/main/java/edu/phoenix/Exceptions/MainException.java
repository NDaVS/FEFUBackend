package edu.phoenix.Exceptions;

public class MainException extends Exception {
    public void errorMessage1(){System.out.println("Неверные данные");
    }
    public void errorMessageAdd(){System.out.println("Неверные данные при добавлении пользователя");
    }
    public MainException(String errorMessage) {
        super(errorMessage);
    }

}
