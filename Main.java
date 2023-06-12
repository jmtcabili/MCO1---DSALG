import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        De-comment once sorting algorithms are finished 
        System.out.println("Insertion Sort:");
        insertionRuntime();
        System.out.println("\nSelection Sort");
        selectionRuntime();
        System.out.println("\nMerge Sort");
        mergeRuntime();
        System.out.println("\nCounting Sort");
        countingRuntime();
        */

        //Test sorting
        //Initial declaration
        FileReader fp = new FileReader();
        SortingAlgorithms algorithm = new SortingAlgorithms();
        Scanner sc = new Scanner(System.in);

    
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
            for (int i = 1; i <= 7; i++){
                Record[] record = switch (i) {
                    case 1 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/almostsorted.txt");
                    case 2 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/random100.txt");
                    case 3 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/random25000.txt");
                    case 4 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/random50000.txt");
                    case 5 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/random75000.txt");
                    case 6 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/random100000.txt");
                    case 7 -> fp.readFile("C:/Users/Johan/Documents/JOHAN/DLSU - College/3rd Semester AY 2022-2023/CCDSALG/MCO1---DSALG/data/totallyreversed.txt");
                    default -> null;
                }
                long startTime = System.currentTimeMillis();
                switch(choice){
                    case 1: algorithm.insertionSort(record, i);
                }
                long endTime = System.currentTimeMillis();
                long executionTime = endTime - startTime;
                System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + record.length);
            
            }

            
            switch(choice){
                case 1: 

            }


        }
        sc.close();


        //Print
        for (int i = 0; i < Record.length; i++) {
            System.out.println(Record[i].getIdNumber() + Record[i].getName());
        }
    }
        /* 
        De-comment once sorting algorithms are finished

        private static void insertionRuntime() {
            FileReader fp = new FileReader();
            SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

            //almost sorted
            File f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");  
            Record[] Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");
            String fn = f.getName();

            long startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 25,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 50,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 75,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of " + fn + " in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //totally reversed
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.insertionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);
            
    }

        private static void selectionRuntime() {
            FileReader fp = new FileReader();
            SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

            //almost sorted
            File f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");  
            Record[] Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");
            String fn = f.getName();

            long startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 25,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 50,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 75,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of " + fn + " in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //totally reversed
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.selectionSort(Record, Record.length);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);
            
    }

        private static void mergeRuntime() {
            FileReader fp = new FileReader();
            SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

            //almost sorted
            File f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");  
            Record[] Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");
            String fn = f.getName();

            long startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 25,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 50,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 75,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of " + fn + " in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //totally reversed
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.mergeSort(Record, 0, Record.length - 1);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);
            
    }

        private static void countingRuntime() {
            FileReader fp = new FileReader();
            SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

            //almost sorted
            File f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");  
            Record[] Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\almostsorted.txt");
            String fn = f.getName();

            long startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            long endTime = System.currentTimeMillis();
            long executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 25,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random25000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 50,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random50000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 75,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random75000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of " + fn + " in (MS): " + executionTime + ". Size of File: " + Record.length);

            //Random 100,000
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\random100000.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);

            //totally reversed
            f = new File("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            Record = fp.readFile("C:\\Personal\\College\\Codes\\CCDSALG\\MCO1\\totallyreversed.txt");
            fn = f.getName();

            startTime = System.currentTimeMillis();
            sortingAlgorithms.countingSort(Record);
            endTime = System.currentTimeMillis();
            executionTime = endTime - startTime;
            System.out.println("Runtime of \"" + fn + "\" in (MS): " + executionTime + ". Size of File: " + Record.length);
        }
        
        */
    
}

