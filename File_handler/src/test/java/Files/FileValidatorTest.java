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
        filepath = "D:\\Users\\narag\\Environment.txt";
        file = new FileValidator(filepath);
    }

    @Test
    public void IfFilepathisEmpty() {
        assertFalse(filepath.isEmpty());
        }
    @Test
    public void IfFilepathvValid() {
        String path=file.getFilepath();
        assertEquals(path,filepath);
    }
     @Test
     public void IfFileExist(){
        File file1=file.getFile();
        assertTrue(file1.exists());
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
    @Test
    public void WordCheckIrrespectiveOfCase1() throws Exception {
        reader=new Utilities();
        boolean flag = reader.WordPresent(file,"Air");
        assertTrue(flag);
        }
    @Test
    public void WordCheckIrrespectiveOfCase2() throws Exception {
        reader=new Utilities();
        boolean flag = reader.WordPresent(file,"air");
        assertTrue(flag);
    }

    }






