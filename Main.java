import java.util.Scanner;

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
                    folderLoc = "C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/";
                    fileToSort = switch (i) {
                        case 1 -> "MCO1---DSALG/data/almostsorted.txt";
                        case 2 -> "MCO1---DSALG/data/random100.txt";
                        case 3 -> "MCO1---DSALG/data/random25000.txt";
                        case 4 -> "MCO1---DSALG/data/random50000.txt";
                        case 5 -> "MCO1---DSALG/data/random75000.txt";
                        case 6 -> "MCO1---DSALG/data/random100000.txt";
                        case 7 -> "MCO1---DSALG/data/totallyreversed.txt";
                        default -> null;
                    };
                    record = fp.readFile(folderLoc+fileToSort);

                    
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
                            //algorithm.mergeSort(record, //p, //r);
                            endTime = System.currentTimeMillis();
                            break;
                        case 4: 
                            startTime = System.currentTimeMillis();
                            algorithm.countingSort(record, record.length);
                            endTime = System.currentTimeMillis();
                            break;
                    }
                    
                    long executionTime = endTime - startTime;
                    System.out.println(fileToSort + " : " + executionTime + "(ms)");
                    
                
                }
            }

        }
        sc.close();


    }
}
       