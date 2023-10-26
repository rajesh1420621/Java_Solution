public class JavaSortingType {

//    We start with the first element and i=0 index and check if the element present at i+1 is greater then we swap the elements at index i and i+1.
//    If above is not the case, then no swapping will take place.
//    Now  “ i ” gets incremented and the above 2 steps happen again until the array is exhausted.
    public static int[] bubbleSort(int[] arr){
        for(int i=0; i<arr.length; i++){
            for(int j=i + 1; j<arr.length; j++){
                if(arr[j] < arr[i]){
//                    Swap 2 numbers using third variable
//                    int temp = arr[j];
//                    arr[j] = arr[i];
//                    arr[i] = temp;

//                    Swap 2 numbers without using third variable
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr;
    }

//     Find the largest element in the array and swap it with the last element of the array i.e. a[a.length - 1].
//     The elements left for sorting are n-1 so far. Find the largest element in the array from index 1 to n-1 i.e. a[1] to a[n-1] and swap it with a[a.length - 2].
//     Continue this process for all the elements in the array until we get a sorted list.
    public static int[] selectionSort(int[] arr){
        int[] sortedArray = new int[arr.length];
        int j = 0;
        int temp = 0;
        while (j < arr.length){
            temp = getMax(arr, temp);
            sortedArray[arr.length - (j + 1)] = temp;
            j ++;
        }
        return sortedArray;
    }

    private static int getMax(int[] intArr, int maxElement){
        int temp = 0;
        for (int i : intArr){
            if (i > temp && maxElement == 0) {
                temp = i;
            }else {
                if (i < maxElement && i > temp)
                    temp = i;
            }
        }
        return temp;
    }

//     If it is the first element, it is already sorted. return 1;
//     Pick next element
//    Compare with all elements in the sorted sub-list
//     Shift all the elements in the sorted sub-list that is greater than the
//    value to be sorted
//      Insert the value
//    Repeat until list is sorted
    public static int[] insertionSort(int[] arr){
        for (int i=1;i<arr.length; i++){
            int temp=arr[i];
            int j=i-1;
            while (j>=0 && temp<arr[j] ){
                arr[j+1] = arr[j];
                j--;
                }
                arr[j+1] = temp;
            }
        return arr;
    }

    public static void main(String[] args) {
        int[] data = { 5, 3, 4, 9, 6, 1, 2, 8,8};
//        for (int i : bubbleSort(data))
//            System.out.println(i);
//        for (int i : selectionSort(data))
//            System.out.println(i);
        for (int a : insertionSort(data))
              System.out.println(a);
    }
}
