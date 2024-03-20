package view;

import controller.UserController;
import model.UserModel;
import java.util.Scanner;

public class LoginView {
    public static boolean loginOn=false;
    public static void loginView(){
        String emailReaded="aqui vai o codigo de leitura do email cadastrado";
        String passwordReaded="aqui vai o codigo de leitura da senha cadastrada";
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user email: ");
        String email = input.nextLine();
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        loginVerification(emailReaded, passwordReaded,email, password);
        loginOn = true;
    }

    public static void loginVerification(String emailReaded, String passwordReaded,String email, String password){
        while((passwordReaded.equals(password) && emailReaded.equals(email))){
            Scanner input = new Scanner(System.in);
            System.out.println("Incorrect login or password.");
            System.out.print("Enter the user email: ");
            email = input.nextLine();
            System.out.print("Enter the password: ");
            password = input.nextLine();
        }
    }
}
