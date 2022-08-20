package jdbcexample;

import jdbcexample.manager.UserManager;
import jdbcexample.model.User;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        UserManager userManager = new UserManager();
        try {
//            User user = new User("poxos", "poxosyan", "poxos@mail.com", "poxos");
//            userManager.addUser(user);
//            System.out.println(user);
            List<User> userList = userManager.getAllUsers();
            for (User user : userList) {
                System.out.println(user);
            }

            userManager.deleteUserById(1);

            userList = userManager.getAllUsers();
            for (User user : userList) {
                System.out.println(user);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
