
  public static void main(String[] args) { 
         String word1="dog";
         String word2="gdo";
      System.out.println(CheckPermutaction(word1, word2)); 
    }
      public static boolean CheckPermutaction(String s1, String s2){
     /*   char [] arr1= s1.toCharArray();
          char [] arr2= s2.toCharArray();
          java.util.Arrays.sort(arr1);
          java.util.Arrays.sort(arr2);
          String x= new String(arr1);
          String y= new String(arr2);
     */
          if(s1.length() != s2.length()){ // if their sizes are different they are not the same
              return false;
          }
             return Sort(s1).equals(Sort(s2));  //will return true or false if they are equal
      }
     
      public static String Sort(String s){ 
          char [] arr=s.toCharArray();   //we convert the string into a char array
          java.util.Arrays.sort(arr);   // sorts the array alphabetically
          return new String(arr);       // return the new word
      }
}