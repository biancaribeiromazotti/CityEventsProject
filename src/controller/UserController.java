package controller;

import java.util.Scanner;
import model.UserModel;

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
    public void creatUserController(UserModel user){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        this.setNameController(input.nextLine());
        System.out.print("Enter the address: ");
        this.setAddressController(input.nextLine());
        System.out.print("Enter the email: ");
        this.setEmailController(input.nextLine());
        System.out.print("Enter the age: ");
        this.setAgeController(Integer.parseInt(input.nextLine()));
        System.out.print("Enter the gender: ");
        this.setGenderController(input.nextLine());
        
        System.out.print("Enter the password: ");
        this.setPasswordOneController(input.nextLine());
        System.out.print("Confirm the password: ");
        this.setPasswordTwoController(input.nextLine());
        this.setUserModel1(user);
        this.getUserModel1().creatUser(this.getNameController(), this.getAddressController(), this.getEmailController(), this.getGenderController(), this.getPasswordOneController(), this.getPasswordTwoController(), this.getAgeController());
        this.passwordVerification(user);
        System.out.println("Registration completed successfully.");
        }//ok
    
    public void passwordVerification(UserModel user){
        this.setUserModel1(user);
        boolean validPassword=this.getUserModel1().passwordVerification();
        while(!validPassword){
                System.out.println("Incompatible passwords.");
                Scanner input = new Scanner(System.in);
                System.out.print("Enter the password: ");
                this.getUserModel1().setPassword1(input.nextLine());
                this.setPasswordOneController(this.getUserModel1().getPassword1());
                System.out.print("Confirm the password: ");
                this.getUserModel1().setPassword2(input.nextLine());
                this.setPasswordTwoController(this.getUserModel1().getPassword2());
                validPassword = this.getUserModel1().passwordVerification();
        }
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
