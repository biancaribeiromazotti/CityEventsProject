package controller;


import model.EventModel;
import model.FilesModel;
import repository.UserRepository;

public class EventController {

    //CONSTRUCTOR
    public EventController() {

    }

    //CUSTOM METHODS
    public EventModel creatEventController(String name, String address, String description, String category, int year, int month, int day, int hour, int min) {
        EventModel eventModel = new EventModel(name, address, description, category, year, month, day, hour, min);
        FilesModel file = new FilesModel("CityEvents_Event.txt");
        UserRepository repository = new UserRepository(file);
        repository.createEvent(eventModel);
        return eventModel;
    }//ok
}