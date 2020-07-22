package isunique;
/**
 *
 * @author jmls9
 */
public class IsUnique {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String[] words = {"abcde", "hello", "apple", "kite", "padle"};
        String Word="abcde";
        
   /*case 1*/  System.out.println( IsUniqueChars(Word)); //using 1 word
       
   /*case 2*/  for(String word : words){
               System.out.println(word + " ; " +IsUniqueChars(word));  //using strings [] words         
             }   
    }
    
    public static boolean IsUniqueChars(String str){ //ASCII stands for American Standard Code for Information Interchange.
   
      if(str.length()>128){    //128-ASCII-simple / 256--ASCII-extended / 26-regular alphabet
        return false;
       }
      
      boolean answer=true;
      boolean[] char_set = new boolean[128];  //depends of the type of ASCII
         
       for (int i = 0; i < str.length(); i++) {                 
	  int val = str.charAt(i);
            if (char_set[val]){    // here we are cheking if it repeats
                 return answer=false;
            }
	       char_set[val] = true;	//else check this element	
        }
       
         return answer;
	}
    }

