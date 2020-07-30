public static void main(String[] args) {  
    String[][] pairs = {{"apple", "pleap"}, {"waterbottle", "erbottlewat"}, {"camera", "macera"}};
      
           for (String[] pair : pairs) {					
           System.out.println(pair[0]+ ", " + pair[1] + ": " + String_Rotation(pair[0], pair[1]));
         }
  }
    public static boolean String_Rotation(String s1,String s2){ 
      if(s1.length() != s2.length() || s1.length()==0){
          return false;
      } 
       String s1x2=s1+s1;
       return isSubstring(s1x2 , s2);
    }    
    
    public static boolean isSubstring(String s1s1 , String s2){
      return s1s1.contains(s2);
    }