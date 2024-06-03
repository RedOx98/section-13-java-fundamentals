import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
//        /Users/olaidehammed/Documents/olahammed/
        File file = new File("studyeasy/test.txt");
        BufferedReader br = null;
        try{
            br = new BufferedReader(new FileReader(file));
//            bw.write("Hello Olahammed!");

            String line;

            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

            System.out.println("File operation was successful");
        }catch (IOException e){
            e.printStackTrace();
            System.out.println("Something went wrong!");
        } finally {
            try{
                br.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}