public static void main(String[] args) {
    // TODO code application logic here
    int [] nums={6,3,4,1,2,7,0,9,10,8,5};
    BubbleSort(nums);
    
    for(int i=0;i<nums.length;i++){
        System.out.println( nums[i]);
    }
}

///// Best Case O(n)//////// Average Case O(n2)//////// Worst Case O(n2)///// 

public static void BubbleSort(int [] a){                  
    for(int i=1;i<a.length;i++){
        for(int j=0;j<a.length-i;j++){
            if(a[j]>a[j+1]){
                int aux=a[j];
                a[j]=a[j+1];
                a[j+1]=aux;
            }
        }
    }
}

///// Best Case O(n)//////// Average Case O(n2)//////// Worst Case O(n2)///// 

public static void InsertionSort(int [] a){       
    for(int i=1;i<a.length;i++){
        int aux=a[i];
        int j=i-1;
        while(j>=0 && aux < a[j]){
           a[j+1]=a[j];
           j--;
        }    
           a[j+1]=aux;
            
        }
    }

///// Best Case O(n2)//////// Average Case O(n2)//////// Worst Case O(n2)/////

public static void SelectionSort(int [] a){       
    for(int i=0;i<a.length-1;i++){
        int menor=a[i];
        int pos=i;
        for(int j=i+1;j<a.length;j++){
           if(a[j] < menor){
               menor=a[j];
               pos=j;
           }
        }
           a[pos]=a[i];
           a[i]=menor;
        } 


 /// Best Case O(n logn)//////// Average Case  O(n logn)//////// Worst Case  O(n logn)/////
 
 public static void mergesort(int[] array) {
    int[] helper = new int[array.length];
    mergesort(array, helper, 0, array.length - 1);
}

public static void mergesort(int[] array, int[] helper, int low, int high) {
    if (low < high) {
        int middle = low + (high - low) / 2;
        mergesort(array, helper, low, middle); // Sort left half
        mergesort(array, helper, middle+1, high); // Sort right half
        merge(array, helper, low, middle, high); // Merge them
    }
}

public static void merge(int[] array, int[] helper, int low, int middle, int high) {
    /* Copy both halves into a helper array */
    for (int i = low; i <= high; i++) {
        helper[i] = array[i];
    }

    int helperLeft = low;
    int helperRight = middle + 1;
    int current = low;

    /* Iterate through helper array. Compare the left and right
     * half, copying back the smaller element from the two halves
     * into the original array. */
    while (helperLeft <= middle && helperRight <= high) {
        if (helper[helperLeft] <= helper[helperRight]) {
            array[current] = helper[helperLeft];
            helperLeft++;
        } else { // If right element is smaller than left element
            array[current] = helper[helperRight];
            helperRight++;
        }
        current++;
    }

    /* Copy the rest of the left side of the array into the
     * target array */
    int remaining = middle - helperLeft;
    for (int i = 0; i <= remaining; i++) {
        array[current + i] = helper[helperLeft + i];
    }
}
    
    }   
     
/// Best Case O(n logn)//////// Average Case  O(n logn)//////// Worst Case  O(n2)//

public static void quickSort(int[] arr, int left, int right) {
    int index = partition(arr, left, right); 
    if (left < index - 1) { // Sort left half
        quickSort(arr, left, index - 1);
    }
    if (index < right) { // Sort right half
        quickSort(arr, index, right);
    }
}

public static int partition(int[] arr, int left, int right) {
    int pivot = arr[left + (right - left) / 2]; // Pick a pivot point. Can be an element		
    
    while (left <= right) { // Until we've gone through the whole array
        // Find element on left that should be on right
        while (arr[left] < pivot) { 
            left++;
        }
        
        // Find element on right that should be on left
        while (arr[right] > pivot) {
            right--;
        }
        
        // Swap elements, and move left and right indices
        if (left <= right) {
            swap(arr, left, right);
            left++;
            right--;
        }
    }
    return left; 
}

public static void swap(int[] array, int i, int j) {
    int tmp = array[i];
    array[i] = array[j];
    array[j] = tmp;
}