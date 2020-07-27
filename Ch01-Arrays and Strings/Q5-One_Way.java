public static void main(String[] args) {
        
    String [] word1={"pale","pales","pale","pale"};
    String [] word2={"ple","pale","bale","bae"};
   
     for(int i=0;i<word1.length;i++){
      System.out.println(OneWay(word1[i], word2[i])); 
    }
}

 public static boolean OneWay(String s1, String s2){         
   char elem=s2.charAt(0);
   int cant=0;  
   int pos=0;

if(s1.length()==s2.length()){    //if these are equals cant+1 
     for(int i=0;i<s1.length();i++){
       if(s1.charAt(i)!=s2.charAt(i)){ //compare each element between then
           cant++;
          if(cant>1) 
              return false; 
       }         
     }
     System.out.print(s1+" , ");
    System.out.print(s2+" , ");
}
     else{  
    for(int i=0;i<s1.length();i++){
         if(elem!=s1.charAt(i)){ //if these are differents cant+1
             cant++;
         } 
        if(elem==s1.charAt(i)){
            if(pos<s2.length()-1){//always that pos be in the size
                pos++;
                 } 
                elem=s2.charAt(pos);                
         } 
    }  
    System.out.print(s1+" , ");
    System.out.print(s2+" , ");
   
    if(cant>1) return false; 
 }  

return true;
 }    
}