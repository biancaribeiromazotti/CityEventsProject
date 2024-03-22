package view;

import controller.UserController;
import model.UserModel;
import java.util.Scanner;

public class CreateUserView {


    public static void createUserView(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        String name = input.nextLine();
        System.out.print("Enter the address: ");
        String address = input.nextLine();
        System.out.print("Enter the email: ");
        String email = input.nextLine();
        System.out.print("Enter the age: ");
        int age = Integer.parseInt(input.nextLine());
        System.out.print("Enter the gender: ");
        String gender = input.nextLine();
        System.out.print("Enter the password: ");
        String password1 = input.nextLine();
        System.out.print("Confirm the password: ");
        String password2 = input.nextLine();

        UserController userController = new UserController();
        UserModel user = userController.createUserController(name,address, email, age, gender, password1, password2);

        passwordVerification(user);

        System.out.println("Usuario criado com seucesso.");
    }

    public static void passwordVerification(UserModel user){

        while(!user.passwordVerification()){
            System.out.println("Incompatible passwords.");
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the password: ");
            user.setPassword1(input.nextLine());
            System.out.print("Confirm the password: ");
            user.setPassword2(input.nextLine());
        }
    }//ok

}
