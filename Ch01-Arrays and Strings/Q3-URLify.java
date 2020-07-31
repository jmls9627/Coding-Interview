public static void main(String[] args) {
    // TODO code application logic here  
     String word1="Mr Jhon Wick El Durako";
   
     URLify(word1); 
     URLify2(word1);
}

  public static void URLify(String s){

       int x=0;
       for(int i=0;i<s.length();i++){  //counting empty positions
           if(s.charAt(i) == ' ')
            x++;
           }
         x=x*3;//  I multiply by 3 because there are 3 new characters that I am going to add
        char[] s1= new char[s.length() + x];
        int cont=0;
     for(int i=0;i<s.length();i++){// go through the char array and I am adding to my new array (s1)
         if(s.charAt(i)!=' ' ){
             s1[cont]=s.charAt(i);
             cont++;
         }
         if(s.charAt(i)==' '){
         s1[cont]='%';
         s1[cont+1]='2';
         s1[cont+2]='0';
         cont+=3;
      }
         
     }    
     System.out.print(s1);
  } 
  
  ////////////////////////////////////////////////////////////////////////////////////
  
  public static void URLify2(String s){
    String word="";
    String concat="%20";
     
   for(int i=0;i<s.length();i++){
       if(s.charAt(i)==' ')
         word+=concat;
    
       else word+=s.charAt(i);  
   }    
   System.out.print(word);
}  
}