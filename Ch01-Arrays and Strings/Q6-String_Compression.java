public static void main(String[] args) {  
       
    String word1="aabcccccaaa";
    System.out.print(String_Compression(word1));
}

 public static String String_Compression(String s1){ 
    
     char val=s1.charAt(0);  //fix a variable to compare
      int cont=0;
      String s="";
      String cant="";
   
      for(int i=0;i<s1.length();i++){
          if(val==s1.charAt(i)){ //count how many times repeats
          cont++;
         } 
         else{                                  //if its a different character add to the String (s) => reset val and cont
             cant=Integer.toString(cont);         //never shows or print the last one element
             s+=val+cant;
             val=s1.charAt(i);
             cont=1;      
         }  
         if(i==s1.length()-1){              //when i is ==length-1  it save that element
             cant=Integer.toString(cont);
             s+=val+cant;
         }
      }
      
       if(s1.length()<=s.length()) //if the length of the new String is bigger or equals to s1 Im going to return s1
           return s1;
       
       return s;    //else

 }    
}
