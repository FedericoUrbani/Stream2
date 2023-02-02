import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Date;



public class Tester {

    public static void main(String[] args) {

        String path= "Stream/src/file.txt";
        File obj= new File(path);
        if(obj.exists()){
            System.out.println("file already exist. Will be overwrite.");
        }else{
            System.out.println("the file.txt will be created");
        }
        Date date= new Date();
        date.getTime();
        try{

            FileWriter fw = new FileWriter(obj);
            System.out.println(obj.getAbsolutePath());
            fw.write(String.valueOf(date));
            fw.close();
        }catch(IOException e){
            e.printStackTrace();
        }

    }
}