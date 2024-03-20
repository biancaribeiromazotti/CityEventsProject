package repository;

import model.EventModel;
import model.FilesModel;
import model.UserModel;

public class UserRepository {

    private FilesModel filesModel;
    public UserRepository(FilesModel file){
        this.filesModel = file;
    }
    public void createUser(UserModel user){
        String text = user.getName()+";"+ user.getEmail() + ";"+user.getAge()+";"+user.getGender()+";"+user.getAddress()+";"+user.getPassword1();
        this.filesModel.writerFile(text);
    }
    public void createEvent(EventModel event){
        String text = event.getNameEvent()+";"+event.getAddress()+";"+event.getCategory()+";"+event.getDescription()+";"+event.getCreator()+";"+event.getEventDate();
        this.filesModel.writerFile(text);
    }
}
