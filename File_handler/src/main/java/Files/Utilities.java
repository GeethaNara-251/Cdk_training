package Files;
import java.io.File;
import java.util.*;


public class Utilities {
    public void readingFile(FileValidator fileValidator) throws Exception {
        File file = fileValidator.getFile();
        try {
            if (file.canRead()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } else {
                throw new Exception("This is not a readable file");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public void reverseFile(FileValidator fileValidator) throws Exception {
        File file = fileValidator.getFile();
        try {
            if (file.canRead()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    StringBuffer word = new StringBuffer(sc.nextLine());
                    word.reverse();
                    System.out.println(word);
                }
            } else {
                throw new Exception("This is not a readable file");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean WordPresent(FileValidator fileValidator, String word) throws Exception {
        File file = fileValidator.getFile();

            if (file.canRead()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNext()) {
                    if (sc.next().equals(word)) {
                        return true;
                    }
                }
                return false;
            } else {
                throw new Exception("This is not a readable file");
            }


    }
}








