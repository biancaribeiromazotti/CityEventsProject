package controller;

import java.security.InvalidParameterException;
import java.util.Scanner;

import model.FilesModel;
import model.UserModel;
import repository.UserRepository;

public class UserController {
    
    //ATTRIBUTES
    private String nameController;
    private String addressController;
    private String emailController;
    private String genderController;
    private String passwordOneController;
    private String passwordTwoController;
    private int ageController;
    private UserModel userModel1;
    
    //CONSTRUCTOR
    public UserController() {
        
    }
    
    //CUSTOM METHODS
    public UserModel creatUserController(String name, String address, String email, int age, String gender, String password1, String password2){
        UserModel user = new UserModel(name, address, email, gender, password1, password2, age);
        FilesModel file = new FilesModel("CityEvents_User.txt" );
        UserRepository repository = new UserRepository(file);
        repository.createUser(user);
        return user;
        }//ok
    

    
    public void editUser(){

    }
    
    public void login(UserModel user){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user email: ");
        String email = input.nextLine();
        System.out.print("Enter the password: ");
        String password = input.nextLine();
        
        this.setUserModel1(user);
        boolean validPassLogin = this.getUserModel1().loginVerification(email, password);
        while(!validPassLogin){
                System.out.println("Incorrect login or password.");
                System.out.print("Enter the user email: ");
                email = input.nextLine();
                System.out.print("Enter the password: ");
                password = input.nextLine();
                validPassLogin = this.getUserModel1().loginVerification(email, password);
        }    
        System.out.println("Login successful.");
    }//ok
    
    public void confirmPresence(){
        
    }
    
    public void listConfirmedEvents(){
        
    }
    
    public void cancelPresence(){
        
    }
    
    //GETTERS AND SETTERS
    public String getNameController() {
        return nameController;
    }
    
    public void setNameController(String nameController) {
        this.nameController = nameController;
    }
    
    public String getAddressController() {
        return addressController;
    }
    
    public void setAddressController(String addressController) {
        this.addressController = addressController;
    }
    
    public String getEmailController() {
        return emailController;
    }
    
    public void setEmailController(String emailController) {
        this.emailController = emailController;
    }
    
    public String getGenderController() {
        return genderController;
    }
    
    public void setGenderController(String genderController) {
        this.genderController = genderController;
    }
    
    public String getPasswordOneController() {
        return passwordOneController;
    }
    
    public void setPasswordOneController(String passwordOneController) {
        this.passwordOneController = passwordOneController;
    }
    
    public String getPasswordTwoController() {
        return passwordTwoController;
    }
    
    public void setPasswordTwoController(String passwordTwoController) {
        this.passwordTwoController = passwordTwoController;
    }
    
    public int getAgeController() {
        return ageController;
    }
    
    public void setAgeController(int ageController) {
        this.ageController = ageController;
    }

    public UserModel getUserModel1() {
        return userModel1;
    }

    public void setUserModel1(UserModel userModel1) {
        this.userModel1 = userModel1;
    }
}
