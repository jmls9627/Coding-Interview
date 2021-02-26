public class AoCDay_3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
       // Random();
      List<String> Input= FileUtil.loadFile("src/day3.txt");
       // System.out.println(Input.get(0).charAt(1));
      String val="";
      int contrees=0;
      int cont=0;
        System.out.println(Input.get(0));
      for(int i=0;i<Input.size();i+=2){
         // if(i==0)
          //System.out.println(Input.get(i));
          if(i>0){
          if(Input.get(i).charAt(cont)=='.'){
            val=Input.get(i);
             // System.out.println(val);
            char[] temp=val.toCharArray();
            temp[cont]='O';
            val=new String(temp);
              System.out.println(val);
            Input.set(i, val);
          }
          
           if(Input.get(i).charAt(cont)=='#'){
            val=Input.get(i);
            // System.out.println(val);
            char[] temp=val.toCharArray();
            temp[cont]='X';
            val=new String(temp);
             System.out.println(val);
            Input.set(i, val);
            contrees++;
          }    
      } 
          //A
         /* if(Input.get(i).length()-2==cont){
              cont=5;
          }else
            if(Input.get(i).length()-3==cont){
              cont=4;
          }else
            if(Input.get(i).length()-4==cont){
              cont=3;
          }else
            if(Input.get(i).length()-5==cont){
              cont=2;
          }else
            if(Input.get(i).length()-6==cont){
              cont=1;
          }else 
              if(Input.get(i).length()-7==cont){
              cont=0;
          }
            else*/
             if(cont==Input.get(i).length()-1){
              cont=0;
          }else
          cont++;
           
     }
      
        System.out.println(contrees);//B
    } 
       }  
