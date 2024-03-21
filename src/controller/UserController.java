package controller;

import model.FilesModel;
import model.UserModel;
import repository.UserRepository;

import java.util.Scanner;

public class UserController {

    //CONSTRUCTOR
    public UserController() {

    }

    //CUSTOM METHODS
    public UserModel creatUserController(String name, String address, String email, int age, String gender, String password1, String password2) {
        UserModel user = new UserModel(name, address, email, gender, password1, password2, age);
        FilesModel file = new FilesModel("CityEvents_User.txt");
        UserRepository repository = new UserRepository(file);
        repository.createUser(user);
        return user;
    }//ok
    public static void loginVerification(String email, String password){
        String emailReaded="aqui vai o codigo de leitura do email cadastrado";
        String passwordReaded="aqui vai o codigo de leitura da senha cadastrada";
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