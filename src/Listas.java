
import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jose.zapatagom
 */
public class Listas {
    
   public static void main(String [] args){
   
   
   List<Integer> Numeros;
   
   Numeros= new ArrayList<>();
   
   
   Numeros.add(1);
   Numeros.add(15);
   Numeros.add(25);
   
       System.out.println(Numeros.get(0));
       
       
   Numeros.remove(0);
   
       System.out.println(Numeros.get(0));
       
       
       
   List<String> Nombres= new ArrayList<>();
   
   Nombres.add("Peru");
   Nombres.add("Colombia");
   Nombres.add("Argentina");
   
       System.out.println(Nombres.size());
       
       System.out.println(Nombres.contains("Peru"));
       
       Numeros.get(0);
   
   
   
       
       
   }
    
    
    
}
