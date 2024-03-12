package model;

public class UserModel {
    
    //ATTRIBUTES
    private String name;
    private String address;
    private String email;
    private String gender;
    private String password1;
    private String password2;
    private int age;
    
    //CONSTRUCTOR
    public UserModel(){
        
    }
    
    //CUSTOM METHODS
    public void creatUser(String name,String address,String email,String gender,String password1,String password2,int  age){
        this.setName(name);
        this.setAddress(address);
        this.setEmail(email);
        this.setGender(gender);
        this.setPassword1(password1);
        this.setPassword2(password2);
        this.setAge(age);
    }//ok
    
    public boolean loginVerification(String email, String password){
        if (this.getPassword2().equals(password) && this.getEmail().equals(email)){
            return true;
        }else{
            return false;
        }
    }//ok
    
    public void confirmPresence(){
        
    }
    
    public void listConfirmedEvents(){
        
    }
    
    public void cancelPresence(){
        
    }
    
    public boolean passwordVerification(){
        if(this.getPassword1()==null || this.getPassword2()==null){
            return false;
        }else if(this.getPassword1().equals(this.getPassword2())){
            return true;
        }else{
            return false;
        }
    }//ok
    
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getEmail() {
        return email;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getGender() {
        return gender;
    }
    
    public void setGender(String gender) {
        this.gender = gender;
    }
    
    public int getAge() {
        return age;
    }
    
    public void setAge(int age) {
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
