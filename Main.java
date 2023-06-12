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
        SortingAlgorithms sortingAlgorithms = new SortingAlgorithms();

        //File to be used (change path)
        Record[] Record = fp.readFile("C:\\Users\\Johan\\Documents\\JOHAN\\DLSU - College\\3rd Semester AY 2022-2023\\CCDSALG\\MCO1---DSALG\\data\\almostsorted.txt");

        //Type of sorting algorithm + valid parameters
        sortingAlgorithms.countingSort(Record, Record.length);
        for(int i = 0; i < 10000; i++)
            System.out.println(Record[i].getIdNumber() + "  " + Record[i].getName());
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

