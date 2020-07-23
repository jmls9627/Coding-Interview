public static void main(String[] args) {
    // TODO code application logic here  
     String word1=" madam ";
     
    System.out.println(PalindromeRecursive(word1)); 
}

  public static boolean Palindrome(String s){
     int cant=s.length()-1;
     for(int i=0;i<s.length();i++){
         if(s.charAt(i)!=s.charAt(cant))
             return false;
         cant--;
     }
     return true;
  }  
  
   public static boolean PalindromeRecursive(String s){
      if(s.length() == 0 || s.length() == 1)
        return true; 
     if(s.charAt(0) == s.charAt(s.length()-1))
      return  PalindromeRecursive(s.substring(1, s.length()-1));
  
    return false;
    
}  
}