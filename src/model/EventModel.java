package model;

import java.util.Calendar;
import java.util.Scanner;

public class EventModel {
    
    //ATTRIBUTS
    private String name;
    private String address;
    private String category;
    private Calendar eventHour;
    private String description;
    private Boolean done;
    private UserModel guest;
    private String creator;
    private String eventDate;

    //CONSTRUCTOR
    public EventModel() {
        this.setDone(false);
        this.setCategory("");
    }
    
    //CUSTOM METHODS
    public void creatEventModel(String creator,String eventName, String address, String description){
        Scanner input = new Scanner(System.in);
        
        this.setCreator(creator);
        this.setName(eventName);
        this.setAddress(address);
        this.setDescription(description);
    }//ok
    
    public void dateEvent(int year, int month, int day,int  hour, int min){
        this.setEventDate("Evente Date: " + month + "/" + day + "/"+year + "\nHour: "+hour+"h"+min+"min");
    }//ok
    
    public void categorization(String category){
        this.setCategory(category);
    }//ok
    
    public String eventStatus() {
        System.out.println("------------STATUS------------");
        return "Event: " + this.getName()+ "\nAddress: "+ this.getAddress()+"\nCategory: " + this.getCategory() + "\n"+ this.getEventDate()+"\nDescription: "+ this.getDescription();
    }//ok
    
    public void listEvents(){
        
    }
    
    public void sendNotification(){
        
    }
    
    public void orderEvents(){
        
    }
    
    public void finishEvent(){
        Calendar userDate  = Calendar.getInstance();
        userDate.getTime();
        if(userDate.after(this.getEventHour())){
        this.setDone(true);
        }
    }//ok
    
    //GETTERS AND SETTERS
    private String getName() {
        return name;
    }
    
    private void setName(String name) {
        this.name = name;
    }
    
    private String getAddress() {
        return address;
    }
    
    private void setAddress(String address) {
        this.address = address;
    }
    
    private String getCategory() {
        return category;
    }
    
    private void setCategory(String category) {
        this.category = category;
    }
    
    private Calendar getEventHour() {
        return eventHour;
    }
    
    private void setEventHour(Calendar eventHour) {
        this.eventHour = eventHour;
    }
    
    private String getDescription() {
        return description;
    }
    
    private void setDescription(String description) {
        this.description = description;
    }
    
    private Boolean getDone() {
        return done;
    }
    
    private void setDone(Boolean done) {
        this.done = done;
    }
    
    private UserModel getGuest() {
        return guest;
    }
    
    private void setGuest(UserModel guest) {
        this.guest = guest;
    }
    
    public String getCreator() {
        return creator;
    }
    
    public void setCreator(String creator) {
        this.creator = creator;
    }
    
    public String getEventDate() {
        return eventDate;
    }
    
    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }
}
