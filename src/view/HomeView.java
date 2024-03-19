package view;

import java.util.Scanner;

public class HomeView {
    public HomeView(){
        int option=0;
        System.out.println("Bem vindo ");
        while (option!=3) {
            System.out.println("Escola a opcao desejada");
            System.out.println("1 - Login");
            System.out.println("2 - Cadastrar");
            System.out.println("3 - Encerrar");
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
