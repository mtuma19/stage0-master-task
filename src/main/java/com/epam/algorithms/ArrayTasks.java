package com.epam.algorithms;


/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        String[] seasons = {"winter", "spring", "summer", "autumn"};
        return seasons;
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] arr= new int[length];
        for(int i=0; i<length; i++){
            arr[i]= i+1;
        }
        return arr;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum=0;
        for (int i=0; i<arr.length; i++){
            sum+=arr[i];
        }
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        for(int i=0; i<arr.length; i++){
            if(arr[i]==number){
                return i;
            }
        }
        return -1;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {
        String[] arr1=new String[arr.length];
        for(int i=0; i<arr.length; i++){
            arr1[i]=arr[arr.length-1-i];
        }
        return arr1;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {

        int count=0;
        for(int i=0; i<arr.length; i++){
           if(arr[i]>0){
               count++;
           }
        }
        int[] arr1= new int[count];
        int k=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>0) {
                arr1[k] = arr[i];
                k++;
            }
        }
        return arr1;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public int[][] sortRaggedArray(int[][] arr) {
//        int[] arr1= {1, 3, 5, 6, 2, 4};
//        sort(arr1, 0, arr1.length-1 );
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) {
                System.out.print(arr[i][j]+"/");
            }
            System.out.println("///");
        }
//        for(int i=0; i<arr.length; i++){
//            for(int j=0; j<arr[i].length; j++){
//                System.out.print(arr[i][j]);
//                System.out.print('*');
//            }
//            System.out.println('/');
//        }
//        int[] ab= {5, 1, 4, 3};
//        int[] abSorted = sortArray(ab);
//        for(int i=0; i<abSorted.length; i++){
//            System.out.print(abSorted[i]);
//        }
//        System.out.println(abSorted[3]);
//        System.out.println("rows: " +arr.length);
//        for(int i=0; i< arr.length; i++){
//            System.out.println(arr[i].length);
//        }
//        int[][] newArr1= new int[4][];
//        newArr1[0]= new int[]{5, 1, 4, 3};
//        newArr1[1]= new int[]{1, 1};
//        newArr1[2]= new int[]{5};
//        newArr1[3]= new int[0];
//        System.out.println("rows: " +newArr1.length);
//        for(int i=0; i< newArr1.length; i++){
//            System.out.println(newArr1[i].length);
//        }
        //System.out.print(findMinLengthArrayIndex(newArr1));

        int[][] newArr= new int[arr.length][];
        for(int i=0; i<arr.length; i++){
            int index=findMinLengthArrayIndex(arr);
            System.out.println(index);

            int[] a= arr[index];
            sort(a, 0, a.length-1);
            newArr[i]=a;
            arr[index] = new int[0];
        }
//        System.out.println("-------");
//        for(int i=0; i< newArr.length-1; i++){
//            System.out.println(newArr[i].length);
//        }
//        System.out.println("---------------");
//        for(int i=0; i<newArr.length; i++){
//            for(int j=0; j<newArr[i].length; j++){
//                System.out.print(newArr[i][j]);
//                System.out.print('*');
//            }
//            System.out.println('/');
//        }
        return newArr;
    }
    int partition(int arr[], int low, int high)
    {
        int pivot = arr[high];
        int i = (low-1); // index of smaller element
        for (int j=low; j<high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j] <= pivot)
            {
                i++;

                // swap arr[i] and arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high] (or pivot)
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;

        return i+1;
    }
    void sort(int arr[], int low, int high)
    {
        if (low < high)
        {
            /* pi is partitioning index, arr[pi] is
              now at right place */
            int pi = partition(arr, low, high);

            // Recursively sort elements before
            // partition and after partition
            sort(arr, low, pi-1);
            sort(arr, pi+1, high);
        }
    }
    private int[] sortArray(int[] arr) {
        int[] res= new int[arr.length];
        int minElemIndex=findMinElemIndex(arr);
        res[0]=arr[minElemIndex];
        int minElem= arr[minElemIndex];
        int nextMinIndex=0;
        for(int i=1;i<arr.length; i++){
            nextMinIndex= findNextMinIndex(arr, minElem);
            res[i]=arr[nextMinIndex];
            arr[nextMinIndex]=minElem;
        }
        return res;
    }

    private int findNextMinIndex(int[] arr, int minElem) {
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]<arr[index]&&arr[i]!=minElem){
                index=i;
            }
        }
        return index;
    }

    private int findMinElemIndex(int[] arr) {
        int index=0;
        for(int i=0;i<arr.length; i++){
            if(arr[i]<arr[index]){
                index=i;
            }
        }
        return index;
    }
    private int findMinLengthArrayIndex(int[][] arr) {
        int minElemIndex=-1;
        for(int i=0; i<arr.length; i++){
            if(arr[i].length>0){
                if(minElemIndex==-1||arr[i].length<arr[minElemIndex].length){
                    minElemIndex = i;
                }
            }
        }
        return minElemIndex;
    }




}
