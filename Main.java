import java.io.FileWriter;
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Test sorting
        //Initial declaration
        FileReader fp = new FileReader();
        SortingAlgorithms algorithm = new SortingAlgorithms();
        Scanner sc = new Scanner(System.in);
        
        String folderLoc; 
        String fileToSort;

        long startTime = 0; 
        long endTime = 0; 

    
        int choice = -1; 
        while (choice != 0){
            System.out.println("Pick option:");
            System.out.println("[1] Insertion Sort\n[2] Selection Sort");
            System.out.println("[3] Merge Sort\n[4] Counting Sort\n[0] Exit");

            do{
                choice = sc.nextInt();
                if (choice < 0 || choice > 5)
                    System.out.println("Please enter a valid option!\n");
            } while (choice < 0 || choice > 5);
            
            //set record
            if (choice != 0)
            {
                for (int i = 1; i <= 7; i++){
                    Record[] record = null; 
                   //change depending kung saan nakastore yung local repo 
                    folderLoc = "C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG";
                    fileToSort = switch (i) {
                        case 1 -> "/data/almostsorted.txt";
                        case 2 -> "/data/random100.txt";
                        case 3 -> "/data/random25000.txt";
                        case 4 -> "/data/random50000.txt";
                        case 5 -> "/data/random75000.txt";
                        case 6 -> "/data/random100000.txt";
                        case 7 -> "/data/totallyreversed.txt";
                        default -> null;
                    };
                    record = fp.readFile(folderLoc+fileToSort);
                    System.out.print("(" + record.length + ") ");
                    
                    /* Plug this inside one of the cases below to test if ur algo works with a certain file
                    *  if (i == 1){ //change i depending on file you wanna test
                            for(int j = 0; j < record.length; j++)
                                System.out.println(record[j].getIdNumber());
                        }
                    */
                    switch(choice){
                        case 1: 
                            startTime = System.currentTimeMillis();
                            algorithm.insertionSort(record, record.length);
                            endTime = System.currentTimeMillis();
                            break;
                        case 2: 
                            startTime = System.currentTimeMillis();
                            algorithm.selectionSort(record, record.length);
                            endTime = System.currentTimeMillis();
                            break;
                        case 3: 
                            startTime = System.currentTimeMillis();
                            algorithm.mergeSort(record, 0, record.length-2);
                            endTime = System.currentTimeMillis();
                            break;
                        case 4: 
                            startTime = System.currentTimeMillis();
                            algorithm.countingSort(record, record.length);
                            endTime = System.currentTimeMillis();   
                            break;
                    }

                    try {
                        FileWriter writer = new FileWriter(fileToSort.substring(6,fileToSort.length()-4)+"-result.txt");
                        writer.write("");
                        for (int k = 0; k < record.length; ++k)
                            writer.write(record[k].getIdNumber() + " " + record[k].getName() + "\n");
                        writer.close();
                    } catch (Exception e) {
                        // TODO: handle exception
                        e.printStackTrace();
                    }
                    System.out.println(record[record.length-1].getIdNumber() + " " + record[record.length-1].getName());
                    long executionTime = endTime - startTime;
                    System.out.println(fileToSort.substring(6) + " : " + executionTime + "(ms)\n");
                    
                
                }
            }
            System.out.println("");
        }
        sc.close();


    }
}
