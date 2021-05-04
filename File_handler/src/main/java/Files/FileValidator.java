package Files;
import java.io.*;
public class FileValidator {
    private final File file;
    private final String filepath;
    public FileValidator(String filepath) throws IllegalArgumentException{
        if(filepath.isEmpty()){
            throw new IllegalArgumentException("File path should not be empty");
        }
        this.filepath=filepath;
        file=new File(filepath);
    }

    public String getFilepath(){
        return filepath;
    }
    public File getFile(){
        return file;
    }


}
