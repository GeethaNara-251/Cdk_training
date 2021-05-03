package Files;
import org.junit.*;
import java.lang.*;
import java.io.*;

import static org.junit.Assert.*;


public class FileValidatorTest {

    private String filepath;
    private FileValidator file;
    private Utilities reader;

    @Before
    public void setData() {
        filepath = new String("D:\\Users\\narag\\Environment.txt");
        file = new FileValidator(filepath);
    }

    @Test
    public void IfFilepathisEmpty() {
           assertTrue(!(filepath.isEmpty()));
        }
    @Test
    public void IfFilepathEqual() {
        String path=file.getFilepath();
        assertEquals(path,filepath);
    }

    @Test
     public void FileIsReadable(){
        File file1 = file.getFile();
        assertTrue(file1.canRead());
    }
    @Test
    public void WordCheck() throws Exception {
        reader=new Utilities();
        boolean flag = reader.WordPresent(file,"Geetha");
        assertFalse(flag);
    }

}




