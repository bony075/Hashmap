/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hashmap;
import java.util.*;
/**
 *
 * @author bony
 */
public class Hashmap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> h1=new HashMap<Integer,String>();        
        HashMap<Integer,String> h2=new HashMap<Integer,String>();

        h1.put(1,"bony");
        h1.put(2,"bony");
        h1.put(4,"bony");
        h1.put(5,"bony");
        h1.put(3,"bony");
        h2.put(6,"bony");
        //Collections.sort(h) ;
        //for(Map.Entry key:h1.entrySet())
        System.out.println(h1);
        System.out.println(h1.size());
        h2.putAll(h1);
        System.out.println(h2);
        boolean res=h1.isEmpty();
        System.out.println(res);
        h1.clear();
        res=h1.isEmpty();
        System.out.println("clear:=  "+res);

        
       
          
        }
        

    }
    

