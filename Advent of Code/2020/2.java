public class AoCDay_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       List<String> Input= FileUtil.loadFile("src/day2.txt");
       int tope=0;
       char min=' ';
       String min2="";
       char max=' ';
       String max2="";
       char val=' ';
       int cont=0;
       int contwords=0;
       char Type=' ';
       int validwords=0;
       int contvalid=0;
       String word="";
       int minnum,maxnum=0;
      
       for(String i:Input){
           if(i.charAt(1)=='-' && i.charAt(3)==' '){
                 min=i.charAt(0);
                 max=i.charAt(2);
                 val=i.charAt(4);
                 tope=6;
                 Type='a';
                 word=i.substring(6, i.length());
               //  System.out.println("palabra:"+ word);
                // System.out.println("1If   "+i+ "  min="+min +" max="+max);
             } else
            if(i.charAt(2)=='-' && i.charAt(5)==' '){
                 min2=i.substring(0,2);
                 max2=i.substring(3,5);
                 val=i.charAt(6);
                 tope=8;
                 Type='b';
                 word=i.substring(8, i.length());
                // System.out.println("palabra:"+ word);
                 // System.out.println("2If   "+i+ "  min2="+min2 +" max2="+max2);
             }else
           if(i.charAt(1)=='-' && i.charAt(4)==' '){
                 min=i.charAt(0);
                 max2=i.substring(2,4);
                 val=i.charAt(5);
                 tope=7;
                 Type='c';
                 word=i.substring(7, i.length());
               //  System.out.println("palabra:"+ word);
                //  System.out.println("3If    "+i+ "  min="+min +" max2="+max2);
             } 

          for(int x=i.length()-1;x>tope;x--){
             if(val==i.charAt(x)){
                cont++;
             } 
          }
        //   System.out.println("cont="+cont);
          
        if(Type=='a'){
              minnum=Integer.parseInt(String.valueOf(min));
               maxnum=Integer.parseInt(String.valueOf(max));
              if(word.charAt(minnum)==val)
                  contvalid++;
               if(word.charAt(maxnum)==val)
                   contvalid++;
               if(contvalid==2||contvalid==0)
                   System.out.println("No se puede 2 o 0"+ word);
               if(contvalid==1){
                   validwords++;
                   System.out.println(word+" en "+minnum+ " = "+val +" ||"+ 
                                      word+" en "+maxnum+ " = "+val +"  cont= "+validwords      );
              }
                contvalid=0;
          if((cont<=Integer.parseInt(String.valueOf(max))&& cont>=Integer.parseInt(String.valueOf(min)))){
              contwords++;
             // System.out.println(" "+cont+" <= "+Integer.parseInt(String.valueOf(max))+" && "+ cont+" >= "+Integer.parseInt(String.valueOf(min)));
          }
          } 
        else  if(Type=='c'){
             minnum=Integer.parseInt(String.valueOf(min));
               maxnum=Integer.parseInt(max2);
               if(word.charAt(minnum)==val)
                  contvalid++;
               if(word.charAt(maxnum)==val)
                   contvalid++;
               if(contvalid==2||contvalid==0)
                   System.out.println("No se puede 2 o 0"+ word);
               if(contvalid==1){
                   validwords++;
                   System.out.println(word+" en "+minnum+ " = "+val +" ||"+ 
                                      word+" en "+maxnum+ " = "+val +"  cont= "+validwords      );
              }
                contvalid=0;
              if((cont<=Integer.parseInt(max2) && cont>=Integer.parseInt(String.valueOf(min)))){
              contwords++;
              
              }     
          } 
        else if(Type=='b'){
             minnum=Integer.parseInt(min2);
               maxnum=Integer.parseInt(max2);
               if(word.charAt(minnum)==val)
                  contvalid++;
               if(word.charAt(maxnum)==val)
                   contvalid++;
               if(contvalid==2||contvalid==0)
                   System.out.println("No se puede 2 o 0"+ word);
               if(contvalid==1){
                   validwords++;
                   System.out.println(word+" en "+minnum+ " = "+val +" ||"+ 
                                      word+" en "+maxnum+ " = "+val +"  cont= "+validwords      );
              }
                contvalid=0;
              if( cont<=Integer.parseInt(max2)&&
                  cont>=Integer.parseInt(min2)){
              contwords++;   
          } 
        }
        cont=0; 
}
        System.out.println(contwords);  //a
        System.out.println(validwords);  //b


 }
}