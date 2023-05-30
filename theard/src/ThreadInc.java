import  java.io.*;
import  java.lang.Thread;
public class Theard  extends Thread{
    private  int cpt;
    private int inc;
    private Integer var;
    
    public Theard(int cpt, int inc,Integer var){
        this.cpt = cpt;
        this.inc = inc;
        this.var = var;
    }
    public void run(){
        for (int i = 0;i<cpt;i++){
            var+= cpt;
        }
        System.out.println(inc+":"+var);
    }
    
   
     
}
