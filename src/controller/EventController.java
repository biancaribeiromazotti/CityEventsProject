package controller;

import model.EventModel;
import model.FilesModel;
import repository.EventRepository;

public class EventController {

    //ATTRIBUTS
    public EventModel event;

    //CONSTRUCTOR
    public EventController() {

    }
    //CUSTOM METHODS
    public EventModel creatEventController(String name, String address, String description, String category, int year, int month, int day, int hour, int min) {
        EventModel eventModel = new EventModel(name, address, description, category, year, month, day, hour, min);
        FilesModel file = new FilesModel("CityEvents_Event.txt");
        EventRepository repository = new EventRepository(file);
        repository.createEvent(eventModel);
        return eventModel;
    }//ok
    public void listEvents (){
        event.listEvents();
    }
}