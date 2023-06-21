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
        for (int i = 1; i < n; ++i) {
            Record key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j].getIdNumber() > key.getIdNumber()) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }

    }

    public void selectionSort(Record[] arr, int n) {
            

    }
    public void merge(Record[] arr, int p, int q, int r) {
        int sizeL = q - p + 1, 
            sizeR = r - q + 1;
        Record[] arrL = new Record[sizeL];
        Record[] arrR = new Record[sizeR];

        // copies the 2 halves of the array into their respective sub-arrays
        for(int i = 0; i < sizeL; i++)
            arrL[i] = arr[p+i];
        for(int i = 0; i < sizeR; i++)
            arrR[i] = arr[q + 1 + i];
        
        // re-initializes the indices of arrL[], arrR[], and arr[]
        int i = 0, j = 0, k = p;

        // merges the sub-arrays
        while(i < sizeL && j < sizeR){
            if(arrL[i].getIdNumber() <= arrR[j].getIdNumber()) {
                arr[k] = arrL[i];
                i++;
            }
            else {
                arr[k] = arrR[j];
                j++;
            }
            k++;
        }

        // the remaining elements from arrL[] and arrR[] are put in arr[]
        while(i < sizeL) {
            arr[k] = arrL[i];
            i++;
            k++;
        }
        while(j < sizeR) {
            arr[k] = arrR[j];
            j++;
            k++;
        }
    }

    public void mergeSort(Record[] arr, int p, int r) {
        // TODO: Implement this sorting algorithm here.
        int q;
        if(p < r){
            q = (p + r)/2; // gets the midpoint index of the array

            // recursive call to the 2 halves of the record array
            mergeSort(arr, p, q);
            mergeSort(arr, q+1, r);

            // merges the 2 halves
            merge(arr, p, q, r);
        }
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
        for (i = 0; i < n; i++)
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
