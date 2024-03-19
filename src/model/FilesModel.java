package model;

import java.io.*;

public class FilesModel {

    public static boolean writerFile (String path, String text){
        try {
            FileWriter file = new FileWriter(path);
            PrintWriter writeFile = new PrintWriter(file);
            writeFile.println(text);
            writeFile.close();
            return true;
        }catch (IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }

    public static String readerFile (String pathFile) {
        String fileContent = "";
        try {
            FileReader file = new FileReader(pathFile);
            BufferedReader readerFile = new BufferedReader(file);
            String line = "";
            try {
                line = readerFile.readLine();
                while (line != null) {
                    fileContent += line = "\n";
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
