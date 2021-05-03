package Files;
import java.io.*;
public class FileValidator {
    private File file;
    private String filepath;
    public FileValidator(String filepath) throws IllegalArgumentException{
        if(filepath.isEmpty()){
            throw new IllegalArgumentException("File path should not be empty");
        }
        this.filepath=filepath;
        file=new File(filepath);
    }
    public void setFilepath(String filepath) throws IllegalArgumentException{
       if(filepath.isEmpty()){ throw new IllegalArgumentException("File path should not be empty"); }
           this.filepath=filepath;
    }
    public void setFile(File file) throws IllegalArgumentException, FileNotFoundException {
        if(file.exists()){
            this.file=file;
        }
        else{
            throw new FileNotFoundException("File is not there");
        }

    }
    public String getFilepath(){
        return filepath;
    }
    public File getFile(){
        return file;
    }


}
