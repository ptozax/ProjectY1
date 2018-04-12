
package projecty1;

import java.util.Scanner;
public class ProjectY1 {

    
    public static void main(String[] args) {
         engin e =new engin();
        e.login();
        
      
    }
    
}
class engin {

   public void login(){
   String id_in="aaa";
   String id;
   String pass_in="111";
   String pass;
   int count=3;
   
  Scanner kbw=new Scanner(System.in);     
       
       do{
       
       System.out.print("enter ID: ");
       id=kbw.nextLine();
       
       System.out.print("enter password: ");
       pass=kbw.nextLine();
       if(!id_in.equals(id)||!pass.equals(pass_in)){
           count--;
           
       System.out.println("-----WRONG-----");  
       }
       else if(id_in.equals(id)&&pass_in.equals(pass)){
       count=0;
       
       }
   
   
   
   }while(count>0);
   
   
   
   
   
   }
}  