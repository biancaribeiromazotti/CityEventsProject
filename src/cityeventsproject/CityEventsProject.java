package cityeventsproject;

import controller.UserController;
import model.EventModel;
import model.UserModel;

public class CityEventsProject {

    public static void main(String[] args) {
        UserController eu = new UserController();
        eu.creatUser();
        eu.login();
        
//        EventModel event1 = new EventModel();
//        event1.creatEvent();
//        System.out.println(event1.eventStatus());
    }
    
    
}
