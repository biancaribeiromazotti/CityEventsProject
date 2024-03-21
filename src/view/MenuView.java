package view;

import controller.EventController;

import java.util.Scanner;

public class MenuView {

    public MenuView() {
        EventController event = new EventController();
        int option = 0;
        while (option != 3) {
            System.out.println("MENU");
            System.out.println("1 - Events");
            System.out.println("2 - Register new event");
            System.out.println("3 - Close");
            Scanner input = new Scanner(System.in);
            option = input.nextInt();

            switch (option) {
                case 1:
                    event.listEvents();
                    break;
                case 2:
                    CreateEventView.createEventView();
                    break;
            }
        }
    }
}
