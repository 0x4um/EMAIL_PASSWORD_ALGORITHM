
import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

class main{
    public static void main(String arg[]){
        int nonIntCount = 0;
        int intCount = 0;
        String locationData;
        
        try{
            File file = new File("file.txt");
            Scanner reader = new Scanner(file);
            while(reader.hasNextLine()) {
                String data = reader.nextLine();
                System.out.println(data);
                for(int i = 0; i < data.length(); i++){
                    if(data.charAt(i) == ' '){
                        locationData = i + "";
                        System.out.print(locationData + "\n");
                        System.out.print(locationData.charAt(0));
                        
                    }
                    try{
                        String parser = data.charAt(i) + "";
                        Integer.parseInt(parser);

                        
                        System.out.print(data.charAt(i));
                        
                        
                        intCount++;
                        
                    } catch (NumberFormatException e){
                        
                        nonIntCount++;
                    }
                    
                }
                System.out.println();
                System.out.println(intCount);
                System.out.println(nonIntCount);
            } 
            reader.close();
        } catch (FileNotFoundException e){
            System.out.print("error");
            e.printStackTrace();
        }
    }
}