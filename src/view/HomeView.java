package view;

import controller.UserController;

import java.util.Scanner;

public class HomeView {
    public HomeView(){
        int option=0;
        System.out.println("Welcome to City Events! ");
        while (option!=3 && !LoginView.loginOn) {
            System.out.println("Select:");
            System.out.println("1 - Login");
            System.out.println("2 - Register");
            System.out.println("3 - Close");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    LoginView.loginView();
                    break;
                case 2:
                    CreateUserView.createUserView();
                    break;
            }
        }
    }

}
