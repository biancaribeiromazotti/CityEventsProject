package model;

import java.util.Calendar;
import java.util.Scanner;

public class EventModel {
    
    //ATTRIBUTES
    private String nameEvent;
    private String address;
    private String category;
    private String description;
    private Boolean done;
    private String creator;
    private String eventDate;

    //CONSTRUCTOR
    public EventModel(String name, String address, String description,String category, int year, int month, int day, int hour, int min ) {
        this.setNameEvent(name);
        this.setAddress(address);
        this.setDescription(description);
        this.setCategory(category);
        this.setEventDate(year+";"+month+";"+day+";"+hour+";"+min);
        this.setDone(false);
    }
    
    //CUSTOM METHODS
    public void categorization(String category){
        this.setCategory(category);
    }//ok
    
    public void listEvents(){
        
    }
    public void saveEvent (){

    }
    public void sendNotification(){
        
    }
    
    public void orderEvents(){
        
    }
    
    //GETTERS AND SETTERS
    public String getNameEvent() {
        return nameEvent;
    }
    
    public void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
    }
    
    public String getAddress() {
        return address;
    }
    
    public void setAddress(String address) {
        this.address = address;
    }
    
    public String getCategory() {
        return category;
    }
    
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String getDescription() {
        return description;
    }
    
    public void setDescription(String description) {
        this.description = description;
    }
    
    public Boolean getDone() {
        return done;
    }
    
    public void setDone(Boolean done) {
        this.done = done;
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
