package controller;

import model.FilesModel;

public class FilesController {
    public void writerFile (String text){
        EventController eventController = new EventController();
        //FilesModel filesModel = new FilesModel();

        String path = "CityEventsProject.txt";

        if(FilesModel.writerFile(path,text)){
            System.out.println("File saved successfully.");
        }else{
            System.out.println("Error.");
        }
    }
}
