package model;

import java.io.*;

public class FilesModel {
    private String path;
    public FilesModel(String path){
        this.path = path;
    }


    public boolean writerFile ( String text){
        try {
            FileWriter file = new FileWriter(this.path,true);
            BufferedWriter buffer = new BufferedWriter(file);
            PrintWriter writeFile = new PrintWriter(buffer);
            writeFile.println(text);
            writeFile.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public String readerFile () {
        String fileContent = "";
        try {
            FileReader file = new FileReader(this.path);
            BufferedReader readerFile = new BufferedReader(file);
            String line = "";
            try {
                line = readerFile.readLine();
                while (line != null) {
                    fileContent += line + "\n";
                    line = readerFile.readLine();
                }
                file.close();
                return fileContent;
            } catch (IOException e) {
                System.out.println("Unable to read the file.");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
            return "";
        }

    }

}
