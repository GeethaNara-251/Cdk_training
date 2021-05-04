package Files;
import java.io.File;
import java.util.Scanner;


public class Utilities {
    public void readingFile(FileValidator fileValidator) {
        File file = fileValidator.getFile();
        try {
            if (file.canRead()) {
                Scanner sc = new Scanner(file);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
                System.out.println();
                System.out.println();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void reverseFile(FileValidator filevalidator){
        File file=filevalidator.getFile();
        try{
                if(file.canRead()){
                    Scanner s1=new Scanner(file);
                    while(s1.hasNextLine()) {
                        Scanner s2 = new Scanner(s1.nextLine());
                        while (s2.hasNext()) {
                            String s = s2.next();
                            StringBuilder word = new StringBuilder(s);
                            word.reverse();
                            System.out.print(word+" ");
                        }
                        System.out.println();
                    }

               } else {
               throw new Exception("This is not a readable file");
           }
       } catch(Exception e){
                e.printStackTrace();
           }
        }
        public boolean WordPresent(FileValidator fileValidator, String word) throws Exception {
            File file = fileValidator.getFile();
            if(file.canRead()) {
                Scanner myReader = new Scanner(file);
                while (myReader.hasNext()) {
                    if(myReader.next().equalsIgnoreCase(word)) {
                        return true;
                    }
                }
                return false;
            }
            else {
                throw new Exception("File Is Not Readable");
            }
        }

    }









