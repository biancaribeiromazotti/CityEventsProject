package controller;

import java.util.Calendar;
import java.util.Scanner;
import model.EventModel;
import model.UserModel;

public class EventController {
    
    //ATTRIBUTS
    private EventModel event;
    private String nameEvent;
    private String address;
    private String category;
    private Calendar eventHour;
    private String description;
    private UserModel guest;
    private String creator;
    private String eventDate;
    
    //CONSTRUCTOR
    public EventController() {
        this.setCategory("");
    }
    
    //CUSTOM METHODS
    public void creatEventController(UserModel user,EventModel event){
        Scanner input = new Scanner(System.in);
        this.setGuest(user);
        this.setEvent(event);
        
        this.setCreator(this.getGuest().getName());
        
        System.out.print("Enter the event name: ");
        this.setNameEvent(input.nextLine());
        System.out.print("Enter the event adress: ");
        this.setAddress(input.nextLine());
        System.out.print("Enter the event description: ");
        this.setDescription(input.nextLine());
        this.categorization(event);
        this.dateEvent(event);
        this.getEvent().creatEventModel(this.getCreator(), this.getNameEvent(),this.getAddress(), this.getDescription());
    }//ok
    
    public void editEvent(){
        
    }
    
    private void dateEvent(EventModel event){
        Scanner input = new Scanner(System.in);
        Calendar date = Calendar.getInstance();
        System.out.println("Enter the event year : ");
        int year = input.nextInt();
        System.out.println("Enter the event month: ");
        int month = input.nextInt();
        System.out.println("Enter the event day: ");
        int day = input.nextInt();
        System.out.println("Enter the event hour: ");
        int hour = input.nextInt();
        System.out.println("Enter the event minute: ");
        int min = input.nextInt();
        date.set(year, month,day,hour,min,0);
        this.setEventHour(date);
        this.setEvent(event);
        this.getEvent().dateEvent(year, month, day, hour, min);
        this.setEventDate(this.getEvent().getEventDate());
    }//ok
    
    private void categorization(EventModel event){
        Scanner input = new Scanner(System.in);
        while (this.getCategory().equals("")){
            System.out.println("Inform the event category: \nParty\nConcert\nSport\nConference\nCultural");
            switch (input.nextLine()){
                case "Party":
                    this.setCategory("Party");
                    break;
                case "Concert":
                    this.setCategory("Concert");
                    break;
                case "Sport":
                    this.setCategory("Sport");
                    break;
                case "Conference":
                    this.setCategory("Conference");
                    break;
                case "Cutural":
                    this.setCategory("Cutural");
                    break;
                default: System.out.println("Invalid Category");
            }
        }
        this.setEvent(event);
        this.getEvent().categorization(category);
    }//ok

    public String eventStatus() {
        String text =this.getNameEvent() + ";" + this.getAddress() + ";" + this.getCategory() + ";" + this.getDescription() + ";" + this.getCreator() + ";" + this.getEventDate() ;
        return text;
    }//ok
    
    public void listEvents(){
        
    }
    
    public void sendNotification(){
        
    }
    
    public void orderEvents(){
        
    }
    
    public void finishEvent(EventModel event){
        this.setEvent(event);
        this.getEvent().finishEvent();
    }//ok
    
    //GETTERS AND SETTERS
    private String getNameEvent() {
        return nameEvent;
    }
    
    private void setNameEvent(String nameEvent) {
        this.nameEvent = nameEvent;
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
    
    public EventModel getEvent() {
        return event;
    }
    
    public void setEvent(EventModel event) {
        this.event = event;
    }
}
