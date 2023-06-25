/* This file contains implementations of sorting algorithms.
 * You are NOT allowed to modify any of the given method headers.
 */
public class SortingAlgorithms {

    /*
     * You may define additional helper functions here if you need to.
     * Make sure the helper functions have the private access modifier, as
     * they will only be used in this class.
     */

    
    public void insertionSort(Record[] arr, int n) {

        long ctr = 0; 
        for (int i = 1; i < n; ++i) {
            Record key = arr[i]; ctr+=1;
            int j = i - 1; ctr++;

            while (j >= 0 && arr[j].getIdNumber() > key.getIdNumber()) {
                arr[j + 1] = arr[j]; ctr++;
                j = j - 1; ctr++;
            }
            arr[j + 1] = key; ctr++;
        }
        System.out.println(ctr);

    }

    public void selectionSort(Record[] arr, int n) {

        long ctr = 0;

        for (int j = 0; j < n-1 ; j++){
            int minIndex = j; ctr++;
            for (int k = j+ 1; k < n; k++){ 
                if(arr[minIndex].getIdNumber() > arr[k].getIdNumber())
                    minIndex = k; ctr++;
            }
            if (minIndex != j){ 
                Record temp = arr[j]; ctr++;
                arr[j] = arr[minIndex]; ctr++;
                arr[minIndex] = temp; ctr++;
            }
        }
        System.out.println(ctr);
    }

    private long merge(Record[] arr, int p, int q, int r) {
        long ctr = 0; 
        int sizeL = q - p + 1,
            sizeR = r - q;
        ctr+=2; 
        Record[] arrL = new Record[sizeL]; ctr++;
        Record[] arrR = new Record[sizeR]; ctr++;

        // copies the 2 halves of the array into their respective sub-arrays
        for(int i = 0; i < sizeL; i++){
            arrL[i] = arr[p+i]; 
            ctr++;
        }
        for(int i = 0; i < sizeR; i++){
            arrR[i] = arr[q + 1 + i];
            ctr++;
        }
        
        // re-initializes the indices of arrL[], arrR[], and arr[]
        int i = 0, j = 0, k = p; ctr+=3;

        // merges the sub-arrays
        while(i < sizeL && j < sizeR){
            if(arrL[i].getIdNumber() <= arrR[j].getIdNumber()) {
                arr[k] = arrL[i]; ctr++; 
                i++; ctr++;
            }
            else {
                arr[k] = arrR[j]; ctr++;
                j++;ctr++;
            }
            k++; ctr++;
        }

        // the remaining elements from arrL[] and arrR[] are put in arr[]
        while(i < sizeL) {
            arr[k] = arrL[i]; ctr++;
            i++; ctr++;
            k++; ctr++;
        }
        while(j < sizeR) {
            arr[k] = arrR[j]; ctr++;
            j++; ctr++;
            k++; ctr++;
        }
        return ctr; 
    }

    public long mergeSort(Record[] arr, int p, int r) {
        long ctr = 0; 
        int q; ctr++; 
        if(p < r){
            q = (p + r)/2; // gets the midpoint index of the array
            ctr++;
            // recursive call to the 2 halves of the record array
            ctr += mergeSort(arr, p, q);
            ctr += mergeSort(arr, q+1, r);

            // merges the 2 halves
            ctr += merge(arr, p, q, r);
        }

        //for printing empirical count
        int j = 0; boolean isSorted = true; 
        while (j < arr.length-1 && isSorted){
                        if (arr[j].getIdNumber() > arr[j+1].getIdNumber())
                            isSorted = false;
                        j++;
                    }
        if (isSorted)
            System.out.println(ctr);
        
    
        return ctr; 
    }
    /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */
    public void countingSort(Record[] arr, int n){
        
        long ctr = 0; 
        Record[] arrSorted = new Record[n+1]; ctr++;

        //finding largest element
        int i; ctr++;
        int max = 0; ctr++;
        for (i = 0; i < n; i++)
            if (arr[i].getIdNumber() > max){
                max = arr[i].getIdNumber(); ctr++;
            }
                
        //counting occurences of id numbers
        int[] arrOccurence = new int[max+1]; ctr++;
        for (i = 0; i < n; ++i) {
            arrOccurence[arr[i].getIdNumber()]+=1; 
            ctr++;
        }
            

        //setting up cumulative count
        for (i = 1; i <= max; i++){
            arrOccurence[i] += arrOccurence[i-1]; ctr++;
        }
            
        
        //use count of number as placement for that number in sorted array
        for (i = n-1; i >= 0; i--){
            arrSorted[arrOccurence[arr[i].getIdNumber()]-1] = arr[i]; ctr++;
            arrOccurence[arr[i].getIdNumber()]--; ctr++;
        }

        //copy contents of sorted array to unsorted record
        for(i = 0; i < n; i++){
            arr[i] = arrSorted[i]; ctr++;
        }       

        System.out.println(ctr);
    }
}
