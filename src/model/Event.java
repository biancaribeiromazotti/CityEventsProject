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
    private String creator;
    private String eventDate;

    //CONSTRUCTOR
    public Event() {
        this.setDone(false);
        this.setCategory("");
    }
    
    //CUSTOM METHODS
    public void creatEvent(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the name of the event creator: ");
        this.setCreator(input.nextLine());
        System.out.print("Enter the event name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the event adress: ");
        this.setAdress(input.nextLine());
        this.categorization();
        this.dateEvent();
        System.out.print("Enter the event description: ");
        this.setDescription(input.nextLine());
    }
    public void editEvent(){
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the name of the event creator: ");
        this.setCreator(input.nextLine());
        System.out.print("Enter the event name: ");
        this.setName(input.nextLine());
        System.out.print("Enter the event adress: ");
        this.setAdress(input.nextLine());
        this.categorization();
        this.dateEvent();
        System.out.print("Enter the event description: ");
        this.setDescription(input.nextLine());
    }
    public void dateEvent(){
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
        this.setEventDate("Evente Date: " + month + "/" + day + "/"+year + "\nHour: "+hour+"h"+min+"min");
        
    }
    public void categorization(){
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
    }
    public String eventStatus() {
        System.out.println("------------STATUS------------");
        return "Event: " + this.getName()+ "\nAdress: "+ this.getAdress()+"\nCategory: " + this.getCategory() + "\n"+ this.getEventDate()+"\nDescription: "+ this.getDescription();
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
    private User getGuest() {
        return guest;
    }
    private void setGuest(User guest) {
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
