import java.util.*;
class Main1 implements Runnable{  
public void run()
{  
System.out.println("thread is running...");  
}  
  
public static void main(String args[]){  
Main1 m1=new Main1();  
Thread t1 =new Thread(m1);     
t1.start();  
 }  
}  
