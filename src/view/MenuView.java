package view;

import controller.EventController;
import controller.UserController;

import java.util.Scanner;

public class MenuView {

    public MenuView() {
        EventController event = new EventController();
        UserController user = new UserController();
        int option = 0;
        while (option != 4) {
            System.out.println("MENU");
            System.out.println("1 - Events");
            System.out.println("2 - Confirm Presence");
            System.out.println("3 - Register new event");
            System.out.println("4 - Close");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    event.listEvents();
                    break;
                case 2:
                    event.listEvents();
                    System.out.println("Enter the name of the event: ");
                    String nameEvent = input.nextLine();
                    user.confirmPresence(nameEvent);
                    break;
                case 3:
                    CreateEventView.createEventView();
                    break;
            }
        }
    }
}
