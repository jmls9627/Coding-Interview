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