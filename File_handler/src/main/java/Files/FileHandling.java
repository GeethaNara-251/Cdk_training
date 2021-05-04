package Files;

public class FileHandling {
    private FileValidator validator;
    private final Utilities reader = new Utilities();
    private String filepath;
    public void setFilePath(String filepath) {
        this.filepath = filepath;
    }
    public void setdata() {
        setFilePath("D:\\Users\\narag\\Environment.txt");
    }

    public void setFile() {
        try {
            validator = new FileValidator(filepath);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void readFile() {
        try {
            reader.readingFile(validator);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public void fileReverse() {
        try {
            reader.reverseFile(validator);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void Research() {
        try {
            boolean flag = reader.WordPresent(validator, "save");
            System.out.println(".........."+flag+"..........");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public static void main(String[] args) {
        FileHandling handle= new FileHandling();
        handle.setdata();
        handle.setFile();
        handle.readFile();
        handle.fileReverse();
        handle.Research();

    }
}

