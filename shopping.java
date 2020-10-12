/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SANGEETHA
 */
class flipkart
{
    int n;
    boolean value=false;
    synchronized void paid()
    {
        while(!value)
        try
        {
            wait();
        }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        
        System.out.println("paid");
        value=false;
        notify();
        
    }
    synchronized void selection(int n)
    {
        while(value)
            try{
                wait();
            }
        catch(InterruptedException e)
        {
            System.out.println(e);
        }
        this.n=n;
        value=true;
        System.out.println("customer: "+(n+1));
        System.out.println("product selected");
        notify();
        
    }
}
class product implements Runnable
{
    flipkart p;
    product(flipkart p)
    {
        this.p =p;
    }
    public void run()
    {
        int i=0;int k=0;
        while(k<3)//let number of customers be three
        {
            p.selection(i++);
            k++;
        }
    }
}
class payment implements Runnable
{
    flipkart p;
    payment(flipkart p)
    {
        this.p =p;
        
    }
    public void run()
    {
        int i=0;
        while(i<3)
        {
            p.paid();
            i++;
        }
    }
}
public class shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        flipkart p=new flipkart();
        
        payment obj=new payment(p);//thread one
        Thread t1=new Thread(obj);
        t1.start();
        
        product obj1=new product(p);//thread two
        Thread t2=new Thread(obj1);
        t2.start();
        
        
      
    }
    
}
