package controller;

import model.EventModel;
import model.FilesModel;
import repository.EventRepository;

public class EventController {

    //ATTRIBUTS


    //CONSTRUCTOR
    public EventController() {

    }
    //CUSTOM METHODS
    public EventModel creatEventController(String creator, String name, String address, String description, String category, int year, int month, int day, int hour, int min) {
        EventModel eventModel = new EventModel(creator,name, address, description, category, year, month, day, hour, min);
        String userDirectoryPath = System.getProperty("user.dir")+"/CityEvents_Event.txt";

        FilesModel file = new FilesModel(userDirectoryPath);
        EventRepository repository = new EventRepository(file);
        repository.createEvent(eventModel);
        return eventModel;
    }//ok
    public String creator(){
        String userDirectoryPath = System.getProperty("user.dir")+"/CityEvents_User.txt";
        FilesModel file = new FilesModel(userDirectoryPath);
        String fileContent = file.readerFile();
        String[] fileLines=fileContent.split(";");
        System.out.println("The event creator is: "+fileLines[1]);
        return fileLines[0];
    }
    public void listEvents (){
        EventModel event = new EventModel(null,null,null,null,null,0,0,0,0,0);
        event.listEvents();
    }


}