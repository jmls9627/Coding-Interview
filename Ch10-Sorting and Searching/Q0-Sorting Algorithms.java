public static void main(String[] args) {
    // TODO code application logic here
    int [] nums={6,3,4,1,2,7,0,9,10,8,5};
    BubbleSort(nums);
    
    for(int i=0;i<nums.length;i++){
        System.out.println( nums[i]);
    }
}

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