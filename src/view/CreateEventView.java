package view;

import controller.EventController;
import java.util.Scanner;

    public class CreateEventView {
        public static void createEventView(){
            Scanner input = new Scanner(System.in);
            System.out.print("Enter the event name: ");
            String name = input.nextLine();
            System.out.print("Enter the event address: ");
            String address = input.nextLine();
            System.out.print("Enter the event description: ");
            String description = input.nextLine();
            String category = categorization();
            System.out.println("Enter the event year : ");
            int year = input.nextInt();
            System.out.println("Enter the event month: ");
            int month = input.nextInt();
            System.out.println("Enter the event day: ");
            int day = input.nextInt();
            System.out.println("Enter the event hour: ");
            int hour = input.nextInt();
            System.out.println("Enter the event minute: ");
            int min = input.nextInt();

            EventController event = new EventController();
            event.creatEventController(name,address, description,category,year,month,day,hour,min);

            System.out.println("Event created successfully.");
        }
        private static String categorization(){
            Scanner input = new Scanner(System.in);
            String category="";
            while (category.isEmpty()){
                System.out.println("Inform the event category: \nParty\nConcert\nSport\nConference\nCultural");
                switch (input.nextLine()){
                    case "Party":
                        category="Party";
                        break;
                    case "Concert":
                        category="Concert";
                        break;
                    case "Sport":
                        category="Sport";
                        break;
                    case "Conference":
                        category = "Conference";
                        break;
                    case "Cutural":
                        category = "Cutural";
                        break;
                    default: System.out.println("Invalid Category");
                }
            }
            return category;
        }//ok

}
