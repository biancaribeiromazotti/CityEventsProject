package cityeventsproject;

import controller.EventController;
import controller.FilesController;
import controller.UserController;
import model.EventModel;
import model.UserModel;

public class CityEventsProject {

    public static void main(String[] args) {
        
        
        UserModel userModel2 = new UserModel();
        EventModel eventModel2 = new EventModel();
        FilesController filesController = new FilesController();
        UserController userController2 = new UserController();
        EventController eventController2 = new EventController();
        
        userController2.creatUserController(userModel2);
        userController2.login(userModel2);

        eventController2.creatEventController(userModel2, eventModel2);
        System.out.println(eventController2.eventStatus());

        filesController.writerFile(eventController2.eventStatus());

        
    }
    
    
}
