package model;

//LIBRARIES
import java.util.Scanner;

public class UserModel {
    
    //ATTRIBUTES
    private String name;
    private String adress;
    private String email;
    private String gender;
    private String password1;
    private String password2;
    private int age;
    
    //CONSTRUCTOR
    public UserModel(String name,String adress,String email,String gender,String password1,String password2,int  age){
        this.setName(name);
        this.setAdress(adress);
        this.setEmail(email);
        this.setGender(gender);
        this.setPassword1(password1);
        this.setPassword2(password2);
        this.setAge(age);
        if(!this.initialPasswordVerification()){
            throw new IllegalArgumentException("Incompatible passwords.");
        }
    }
    
    //CUSTOM METHODS
    public void login(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the user name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the password: ");
        this.setPassword1(input.nextLine());
        while(!this.getPassword1().equals(this.getPassword2())){
            if(this.getPassword1().equals(this.getPassword2())){
                //codigo para inserir o novo usuario no arquivo txt de usuarios
                System.out.println("Successful login!");
            }else{
                Scanner input2 = new Scanner(System.in);
                System.out.println("Incorrect password.");
                System.out.print("Enter the password: ");
                this.setPassword1(input2.nextLine());
                if (this.getPassword1().equals(this.getPassword2())){
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
    public boolean initialPasswordVerification(){
        if(this.getPassword1()==null || this.getPassword2()==null){
            return false;
        }else if(this.getPassword1().equals(this.getPassword2())){
            return true;
        }else{
            return false;
        }
    }
    
    //GETTERS AND SETTERS
    private String getName() {
        return name;
    }
    private void setName(String name) {
        this.name = name;
    }
    private String getAdress() {
        return adress;
    }
    private void setAdress(String adress) {
        this.adress = adress;
    }
    private String getEmail() {
        return email;
    }
    private void setEmail(String email) {
        this.email = email;
    }
    private String getGender() {
        return gender;
    }
    private void setGender(String gender) {
        this.gender = gender;
    }
    private int getAge() {
        return age;
    }
    private void setAge(int age) {
        this.age = age;
    }
    public String getPassword1() {
        return password1;
    }
    public void setPassword1(String password1) {
        this.password1 = password1;
    }
    public String getPassword2() {
        return password2;
    }
    public void setPassword2(String password2) {
        this.password2 = password2;
    }
}
