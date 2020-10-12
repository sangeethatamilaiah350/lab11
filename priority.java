/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANGEETHA
 */
public class priority {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        // TODO code application logic here
        one obj1=new one();
        two obj2=new two();
        obj2.setPriority(10);
        obj1.setPriority(1);
                
        
        
        obj1.start();
        obj2.start();
        
    }
    
}
class one extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("#####first thread######");
        try{
             Thread.sleep(1000);
         }//half min
         catch(InterruptedException e){
             System.out.println(e);
         }
        
    }
}
class two extends Thread{
    public void run(){
        for(int i=0;i<5;i++)
        System.out.println("#####second thread#####");
        try{
             Thread.sleep(1000);
         }//half min
         catch(InterruptedException e){
             System.out.println(e);
         }
    }
}