package repository;

import model.EventModel;
import model.FilesModel;

public class EventRepository {
    private FilesModel filesModel;
    public EventRepository(FilesModel file){
        this.filesModel = file;
    }
    public void createEvent(EventModel event){
        String text = event.getNameEvent()+";"+event.getAddress()+";"+event.getCategory()+";"+event.getDescription()+";"+event.getCreator()+";"+event.getEventDate();
        this.filesModel.writerFile(text);
    }
}
