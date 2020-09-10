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
    }    