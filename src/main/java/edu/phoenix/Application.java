package edu.phoenix;

import edu.phoenix.Exceptions.MainException;
import edu.phoenix.dao.Database;

public class Application {
  private static String name = null;

  public static void main(String[] args) throws MainException {
    Database database = new Database();
    try{
      Database.addUser(name, "Login", "Password");
      throw new MainException("Неверные данные");
    } catch (MainException e) {
      e.errorMessage1();
    }


  }
}
