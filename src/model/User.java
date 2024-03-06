package model;

//LIBRARIES
import java.util.Scanner;

public class User {
    
    //ATTRIBUTES
    private String name;
    private String adress;
    private String email;
    private String gender;
    private String password1 = "password1";
    private String password2 = "password2";
    private int age;
    
    //CONSTRUCTOR
    public User(){
        
    }
    
    //CUSTOM METHODS
    public void creatUser(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the user name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the adress: ");
        this.setAdress(input.nextLine());
        System.out.print("Enter the email: ");
        this.setEmail(input.nextLine());
        System.out.print("Enter the gender: ");
        this.setGender(input.nextLine());
        System.out.print("Enter the age: ");
        this.setAge(input.nextInt());
        this.initialPasswordVerification();
        }
    public void editUser(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the new user name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the new adress: ");
        this.setAdress(input.nextLine());
        System.out.print("Enter the new email: ");
        this.setEmail(input.nextLine());
        System.out.print("Enter the new gender: ");
        this.setGender(input.nextLine());
        System.out.print("Enter the new age: ");
        this.setAge(input.nextInt());
        this.initialPasswordVerification();
    }
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
    private void initialPasswordVerification(){
        while(!this.getPassword1().equals(this.getPassword2())){
            if(this.getPassword1().equals(this.getPassword2())){
                //codigo para inserir o novo usuario no arquivo txt de usuarios
                System.out.println("Successful registration!");
            }else{
                Scanner input2 = new Scanner(System.in);
                System.out.print("Enter the password: ");
                this.setPassword1(input2.nextLine());
                System.out.print("Confirm the password: ");
                this.setPassword2(input2.nextLine());
                if (this.getPassword1().equals(this.getPassword2())){
                    System.out.println("Successful registration!");
                }else{
                    System.out.println("Incompatible passwords.");
                }
            }
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
    private String getPassword1() {
        return password1;
    }
    private void setPassword1(String password1) {
        this.password1 = password1;
    }
    private String getPassword2() {
        return password2;
    }
    private void setPassword2(String password2) {
        this.password2 = password2;
    }
}
