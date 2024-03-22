package model;

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
    public EventModel(String creator, String name, String address, String description,String category, int year, int month, int day, int hour, int min ) {
        this.setNameEvent(name);
        this.setAddress(address);
        this.setDescription(description);
        this.setCategory(category);
        this.setEventDate(year+";"+month+";"+day+";"+hour+";"+min+";");
        this.setDone(false);
        this.setCreator(creator);
    }
    
    //CUSTOM METHODS
    public void listEvents(){
        String userDirectoryPath = System.getProperty("user.dir")+"/CityEvents_Event.txt";
        FilesModel file = new FilesModel(userDirectoryPath);
        String text = file.readerFile();
        String creator = text.split(";")[0];
        String name = text.split(";")[1];
        String address = text.split(";")[2];
        String category = text.split(";")[3];
        String description = text.split(";")[4];
        String year = text.split(";")[5];
        String month = text.split(";")[6];
        String day = text.split(";")[7];
        String hour = text.split(";")[8];
        String min = text.split(";")[9];
        if (text.isEmpty()){
            System.out.println("Error");
        }else {
            System.out.println("Creator: " + creator + "\nName: " + name + "\nAddress: " + address + "\nCategory: " + category + "\nDescription: " + description + "\nDate: " + month + "/" + day + "/" + year + " - " + hour + "h" + min + "min." );
        }
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
