public static int BinarySearch(int[]arr, int data){
    int ini=0;
    int end=arr.length-1;
    int pos=0;
    while(ini<=end){
        pos=(ini+end)/2;
        if(arr[pos]==data)
            return pos;
        else{
            if(arr[pos]<data)
                ini=pos+1;
            else
                end=pos-1;
        }
    }
    return -1;
}
//////////////////////////////////////////////////////

public static int binarySearch(int[] a, int x) {
    int low = 0;
    int high = a.length - 1;
    int mid;
    
    while (low <= high) {
        mid = low + (high - low) / 2;
        if (a[mid] < x) {
            low = mid + 1;
        } else if (a[mid] > x) {
            high = mid - 1;
        } else {
            return mid;
        }
    }
    return -1;
}