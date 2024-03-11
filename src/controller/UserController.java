package controller;

import java.util.Scanner;
import model.UserModel;

public class UserController {
    
    //ATTRIBUTES
    private String nameController;
    private String adressController;
    private String emailController;
    private String genderController;
    private String password1Controller;
    private String password2Controller;
    private int ageController;
    private UserModel userModel;
    
    
    
    //CONSTRUCTOR
    public UserController() {
    }
    
    //CUSTOM METHODS
    public void creatUser(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        this.setNameController(input.nextLine());
        System.out.print("Enter the adress: ");
        this.setAdressController(input.nextLine());
        System.out.print("Enter the email: ");
        this.setEmailController(input.nextLine());
        System.out.print("Enter the gender: ");
        this.setGenderController(input.nextLine());
        System.out.print("Enter the age: ");
        this.setAgeController(input.nextInt());
        System.out.print("Enter the password: ");
        this.setPassword1Controller(input.nextLine());
        System.out.print("Confirm the password: ");
        this.setPassword2Controller(input.nextLine());
        userModel = new UserModel(this.getNameController(), this.getAdressController(),this.getEmailController(),this.getGenderController(),this.getPassword1Controller(), this.getPassword2Controller(),this.getAgeController());
        this.passwordVerification();
        }
    public void passwordVerification(){
        boolean validPassword=userModel.initialPasswordVerification();
        if(!validPassword){
            System.out.println("Incompatible passwords.");
        }else{
        Scanner input = new Scanner(System.in);
            System.out.print("Enter the password: ");
            userModel.setPassword1(input.nextLine());
            this.setPassword1Controller(userModel.getPassword1());
            System.out.print("Confirm the password: ");
            userModel.setPassword2(input.nextLine());
            this.setPassword2Controller(userModel.getPassword2());
            validPassword = userModel.initialPasswordVerification();
        }    
    }
    public void editUser(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        this.setNameController(input.nextLine());
        System.out.print("Enter the adress: ");
        this.setAdressController(input.nextLine());
        System.out.print("Enter the email: ");
        this.setEmailController(input.nextLine());
        System.out.print("Enter the gender: ");
        this.setGenderController(input.nextLine());
        System.out.print("Enter the age: ");
        this.setAgeController(input.nextInt());
        System.out.print("Enter the password: ");
        this.setPassword1Controller(input.nextLine());
        System.out.print("Confirm the password: ");
        this.setPassword2Controller(input.nextLine());
        this.passwordVerification();
    }
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        this.setNameController(input.nextLine());
        System.out.print("Enter the password: ");
        this.setPassword1Controller(input.nextLine());
        while(!this.getPassword1Controller().equals(this.getPassword2Controller())){
            if(this.getPassword1Controller().equals(this.getPassword2Controller())){
                //codigo para inserir o novo usuario no arquivo txt de usuarios
                System.out.println("Successful login!");
            }else{
                Scanner input2 = new Scanner(System.in);
                System.out.println("Incorrect password.");
                System.out.print("Enter the password: ");
                this.setPassword1Controller(input2.nextLine());
                if (this.getPassword1Controller().equals(this.getPassword2Controller())){
                    System.out.println("Successful login!");
                }else{
                    System.out.println("Incompatible passwords.");
                }
            }
        }
    }
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
    public String getAdressController() {
        return adressController;
    }
    public void setAdressController(String adressController) {
        this.adressController = adressController;
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
    public String getPassword1Controller() {
        return password1Controller;
    }
    public void setPassword1Controller(String password1Controller) {
        this.password1Controller = password1Controller;
    }
    public String getPassword2Controller() {
        return password2Controller;
    }
    public void setPassword2Controller(String password2Controller) {
        this.password2Controller = password2Controller;
    }
    public int getAgeController() {
        return ageController;
    }
    public void setAgeController(int ageController) {
        this.ageController = ageController;
    }
}
