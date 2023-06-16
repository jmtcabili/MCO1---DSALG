import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors


public class WriteToFile {
  public WriteToFile(String filename, Record[] record) {
    try {
      FileWriter myWriter = new FileWriter("filename.txt");
      for (int i = 0; i < record.length; i++){
        myWriter.write(record[i].getIdNumber() + " " + record[i].getName());
      }
      myWriter.close();
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}