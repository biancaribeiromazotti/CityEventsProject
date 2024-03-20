package controller;

import java.security.InvalidParameterException;
import java.util.Scanner;

import model.FilesModel;
import model.UserModel;
import repository.UserRepository;

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
}