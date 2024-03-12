package cityeventsproject;

import controller.UserController;
import model.EventModel;
import model.UserModel;

public class CityEventsProject {

    public static void main(String[] args) {
        UserModel userModel2 = new UserModel();
        UserController userController2 = new UserController();
        userController2.creatUserController(userModel2);
        userController2.login(userModel2);
    }
    
    
}
