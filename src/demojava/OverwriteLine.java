package demojava;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class OverwriteLine {
   public static void main(String args[]) throws IOException {
      //Instantiating the File class
	//   File nfff= new File("C:\\\\Users\\\\prate\\\\OneDrive\\\\Desktop\\\\newread.txt");
      String filePath = "C:\\Users\\prate\\OneDrive\\Desktop\\newread.txt";
      //Instantiating the Scanner class to read the file
      Scanner sc = new Scanner(new File(filePath));
      //instantiating the StringBuffer class
      StringBuffer buffer = new StringBuffer();
      //Reading lines of the file and appending them to StringBuffer
      while (sc.hasNextLine()) {
         buffer.append(sc.nextLine());
        		 //+System.lineSeparator());
      }
      String fileContents = buffer.toString();
      System.out.println("Contents of the file: "+fileContents);
      //closing the Scanner object
      sc.close();
     
      //Replacing the old line with new line
      fileContents = fileContents.replaceAll("[^a-zA-Z1-9]","r");
      try (//instantiating the FileWriter class
	FileWriter writer = new FileWriter(filePath)) {
		//System.out.println("");
		  System.out.println("new data: "+fileContents);
		  writer.append(fileContents);
		  writer.flush();
	}
   }
}