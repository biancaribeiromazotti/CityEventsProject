package cityeventsproject;

import model.Event;
import model.User;

public class CityEventsProject {

    public static void main(String[] args) {
//        User eu = new User();
//        eu.creatUser();
//        eu.login();
        
        Event event1 = new Event();
        event1.creatEvent();
        System.out.println(event1.eventStatus());
    }
    
    
}
