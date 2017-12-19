
import java.util.ArrayList;//necesita un impor de la clase array list


public class ArrayListEjemplo {
    
    
    public static void main(String [] args){
    
    
    ArrayList <String> nombrearray= new ArrayList<String>();
    
    nombrearray.add("rojo");
    nombrearray.add("azul");
    nombrearray.add("amarillo");
    
    //limpia el array list
    //nombrearray.clear();

    for(String elemento: nombrearray){
        
            System.out.println("Valor For Each: "+elemento);

    }
    
    //Contains verifica si esta un elemento
    if(nombrearray.contains("rojo")){
    
        System.out.println("Contiene el rojo");
    }
    
        System.out.println("El arraylist esta vacio?: "+nombrearray.isEmpty());
    
        nombrearray.clear();
        
        System.out.println("El arraylist esta vacio?: "+nombrearray.isEmpty());
        
        System.out.println("--------------------------------------");
        System.out.println("******Array List con Objetos*******");
        
        ArrayList <Persona> objetospersonas = new ArrayList<Persona>();
        
        objetospersonas.ensureCapacity(7);
        objetospersonas.add(new Persona("miguel","nefle"));
        objetospersonas.add(new Persona("ariel","martinez"));
        objetospersonas.add(new Persona("jose","cuevas"));
        objetospersonas.add(new Persona("pepe","cuevas"));
        
        System.out.println(objetospersonas.size());
        
        
        objetospersonas.set(1, new Persona("paulo","castro"));
        
        //objetospersonas.trimToSize();
        
        System.out.println(objetospersonas.size());
        
        for(Persona e: objetospersonas){
        
            System.out.println(e);
        }
        
        System.out.println(objetospersonas.get(0));
        
    }
    
   
    
}
