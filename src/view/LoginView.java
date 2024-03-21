package view;

import controller.UserController;

import java.util.Scanner;

public class LoginView {
    public static boolean loginOn=false;
    public static void loginView(){

        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user email: ");
        String email = input.nextLine();
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        UserController.loginVerification(email, password);
        loginOn = true;
    }
}
