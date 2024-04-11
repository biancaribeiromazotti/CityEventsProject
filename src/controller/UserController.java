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
    public UserModel createUserController(String name, String address, String email, int age, String gender, String password1, String password2) {
        UserModel user = new UserModel(name, address, email, gender, password1, password2, age);
        String userDirectoryPath = System.getProperty("user.dir")+"/CityEvents_User.txt";
        FilesModel file = new FilesModel(userDirectoryPath);
        UserRepository repository = new UserRepository(file);
        repository.createUser(user);
        return user;
    }//ok
    public static boolean loginVerification(String email, String password){
        String userDirectoryPath = System.getProperty("user.dir")+"/CityEvents_User.txt";
        FilesModel file = new FilesModel(userDirectoryPath);
        String fileContent = file.readerFile();
        String[] fileLines=fileContent.split(";");
        String emailRead= fileLines[1];
        String passwordRead= fileLines[5];
        return ((password.trim().equals(passwordRead.trim()) && email.trim().equals(emailRead.trim())));
    }
    public void confirmPresence(String nameEvent){

    }
}