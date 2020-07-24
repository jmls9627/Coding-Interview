public static void main(String[] args) {
    // TODO code application logic here  
     String word1="tact coa";
     
    System.out.println(PalindromePermutation(word1)); 
}

  public static boolean PalindromePermutation(String s){
     int cont=0;
    int val=0;
    int [] arr=new int [26];
     for(int i=0; i<s.length();i++){//Counting how many repetitions I have of the elements
        if(s.charAt(i)!=' '){
           val=s.charAt(i)-'a';
           arr[val]+=1;  
        }
    }
      for(int i=0; i<arr.length;i++){ //validating that exist an odd number
       if( arr[i]>1 && arr[i]%2!=0) return false;
       if(arr[i]==1) cont++;
       if (cont>1) return false;          
   }         
     return true;
  }