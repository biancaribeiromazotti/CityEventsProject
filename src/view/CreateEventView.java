package view;

import controller.EventController;
import model.FilesModel;

import java.util.ArrayList;
import java.util.List;
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
            String creator = event.creator();
            event.creatEventController(creator, name,address, description,category,year,month,day,hour,min);
            System.out.println("Event created successfully.");
        }
        private static String categorization(){
            Scanner input = new Scanner(System.in);
            List<String> categories = new ArrayList<String>(4);
            categories.add("Party");
            categories.add("Concert");
            categories.add("Sport");
            categories.add("Conference");
            categories.add("Cultural");
            System.out.println("Inform the event category: \nParty\nConcert\nSport\nConference\nCultural");
            String category = input.nextLine();
            while (!categories.contains(category)) {
                System.out.println("Invalid Category! Inform the event category: \nParty\nConcert\nSport\nConference\nCultural");
                category = input.nextLine();
            }
            return category;
        }//ok

}
