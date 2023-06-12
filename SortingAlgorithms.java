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
        // TODO: Implement this sorting algorithm here.

    }

    public void selectionSort(Record[] arr, int n) {
        // TODO: Implement this sorting algorithm here.

    }

    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.

    }
     /*
     * Define AT LEAST ONE more sorting algorithm here, apart from the
     * ones given above. Make sure that the method accepts an array of
     * records
     */
    public void countingSort(Record[] arr, int n){
        
        Record[] arrSorted = new Record[n+1];

        //finding largest element
        int i;
        int max = 0;
        for (i = 1; i < n; i++)
            if (arr[i].getIdNumber() > max)
                max = arr[i].getIdNumber();

        //counting occurences of id numbers
        int[] arrOccurence = new int[max+1];
        for (i = 0; i < n; ++i)
            arrOccurence[arr[i].getIdNumber()]+=1;

        //setting up cumulative count
        for (i = 1; i <= max; i++)
            arrOccurence[i] += arrOccurence[i-1];
        
        for (i = n-1; i >= 0; i--){
            arrSorted[arrOccurence[arr[i].getIdNumber()]-1] = arr[i];
            arrOccurence[arr[i].getIdNumber()]--; 
        }
        for(i = 0; i < n; i++){
            arr[i] = arrSorted[i];
        }
        
        




        
    }
}