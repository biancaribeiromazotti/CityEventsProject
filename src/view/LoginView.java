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
        loginVerification(email, password);
        loginOn = true;
    }
    public static void loginVerification(String email, String password){
        while(!UserController.loginVerification(email,password)){
                Scanner input = new Scanner(System.in);
                System.out.println("Incorrect login or password.\n");
                System.out.print("Enter the user email: ");
                email = input.nextLine();
                System.out.print("Enter the password: ");
                password = input.nextLine();
        }
        System.out.println("Login Successfully.\n");
    }

}
