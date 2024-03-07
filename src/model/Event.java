package model;

import java.util.Calendar;
import java.util.Scanner;

public class Event {
    
    //ATTRIBUTS
    private String name;
    private String adress;
    private String category;
    private Calendar eventHour;
    private String description;
    private Boolean done;
    private User guest;

    //CONSTRUCTOR
    public Event() {
    }
    
    //CUSTOM METHODS
    public void creatEvent(){
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter the event name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the event adress: ");
        this.setAdress(input.nextLine());
        this.categorization();
        this.dateEvent();
        
        
    }
    private void dateEvent(){
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
    }
    private void categorization(){
        Scanner input = new Scanner(System.in);
        while (this.getCategory().contentEquals(null)){
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
    }
    public void listEvents(){
        
    }
    public void sendNotification(){
        
    }
    public void orderEvents(){
        
    }
    public void finishEvent(){
        
    }
    
    //GETTERS AND SETTERS
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAdress() {
        return adress;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Calendar getEventHour() {
        return eventHour;
    }
    public void setEventHour(Calendar eventHour) {
        this.eventHour = eventHour;
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
    public User getGuest() {
        return guest;
    }
    public void setGuest(User guest) {
        this.guest = guest;
    }
}
