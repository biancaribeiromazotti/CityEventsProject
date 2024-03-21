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
        FilesModel file = new FilesModel("C:\\Users\\bianc\\Documents\\TECNOLOGIA\\Meus Projetos\\Repositórios\\CityEventsProject\\CityEvents_User.txt");
        String fileContent = file.readerFile();
        String[] fileLines=fileContent.split(";");

        String emailReaded= fileLines[1];
        String passwordReaded= fileLines[5];

        String email1 = email;
        String password1 = password;

        while(!((password1.trim().equals(passwordReaded.trim()) && email1.trim().equals(emailReaded.trim())))){

            Scanner input = new Scanner(System.in);
            System.out.println("Incorrect login or password.\n");
            System.out.print("Enter the user email: ");
            email1 = input.nextLine();
            System.out.print("Enter the password: ");
            password1 = input.nextLine();
            System.out.println("emailReaded: " + emailReaded + ". PassReaded: " + passwordReaded + "email: " + email1 + ". Pass: " + password1);
        }
        System.out.println("Login Successfully.\n");
    }
}