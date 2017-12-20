
import java.util.ArrayList;
import java.util.Iterator;
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
public class ClaseIterator {
    
    
    /*
    public float xxx(Curso c){
    
    float yyy=0;
    
    for(Iterator<Curso> iterator= cursos.iterator(); iterator.hasNext()){
    
    Curso curso = iterator.next();
    
    if((curso.getNombreCurso().equals(c.getNombre()))){
    
    List <Inscripcion> inscriptos = curso.getInscripciones();
    
    for(Iterator<Inscripcion> iterator= inscriptos.iterator(); iterator.hasNext()){
    
        Inscripcion inscripcion= iterator.next();
        if(inscripcion.getNota()>=curso.getNotaAprobacion()){
        
        yyy+++;
        }
        
    }
        
    }
    if(c.getInscripciones().size()>0)
    return(yyy/c.getInscripciones().size())*100;
    else return 0;
    
    
    
    }
    
    
    
    
    }
    */
    
    public static void main(String[] args){
    
    
        Persona p1=new Persona("gabriel","mendez");
        Persona p2=new Persona("Esteban","quito");
        Persona p3=new Persona("Cristian","gonzales");
        
        List <Persona> lista = new ArrayList();
        
        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        
        Iterator<Persona> iterador = lista.iterator();
        while(iterador.hasNext()){
        
            System.out.println(iterador.next().getNombre());
        }
    
    
    }
    
    
}
