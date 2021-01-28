public class AoCDay_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      List<String> Input= FileUtil.loadFile("src/day1.txt");
      HashSet<Integer>set=new HashSet<Integer>();
      
       ArrayList<Integer> arrayList = new ArrayList<Integer>();
       int cont=0;
       int poscont=1;
       for(int i=0;i<Input.size();i++){
           for(int j=i+1;j<Input.size();j++){
             int x1=Integer.parseInt(Input.get(i));
             int x2=Integer.parseInt(Input.get(j));
             int sum= x1 + x2;
             if(sum<2000){
                 arrayList.add(x1);
                 arrayList.add(x2);
             }          
          }        
       }
      
       for(int i=0;i<arrayList.size();i+=2){
          for(String y:Input){
               int pos0=arrayList.get(i);
               int pos1=arrayList.get(i+1);  
               int val=Integer.parseInt(y);
               int sum=pos0+pos1+val;
               if(pos0+pos1+val==2020){
                  // System.out.println(pos0+"+"+pos1+"+"+val+"="+sum);
                   sum=pos0*pos1*val;
                   System.out.println(pos0+"*"+pos1+"*"+val+"="+sum);      
               }
           }
       }
    }  
    }  
//}
/* for(String i:Input){    //a
         for(int y=cont;y<Input.size();y++){
             int sum= Integer.parseInt(i)+Integer.parseInt(Input.get(y));               
             if(sum==2020){
                 System.out.println(Integer.parseInt(i)+" + "+Integer.parseInt(Input.get(y))+" = "+ sum);
                 sum=Integer.parseInt(i)*Integer.parseInt(Input.get(y));
                 System.out.println(Integer.parseInt(i)+" * "+Integer.parseInt(Input.get(y))+" = "+ sum);  
             }
           }
         cont++;
  
       }*/