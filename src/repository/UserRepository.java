package repository;

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

}
