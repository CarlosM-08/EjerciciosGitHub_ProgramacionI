/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package intropoo;

/**
 *
 * @author cmu08_12mttuz
 */
public class Persona {
    
    //Variables - Atributos
    public String nombre;
    public int edad;
    public double estatura;
    private char genero;
    
    //Funciones - Metodos
    public void ImpresionNombre(){
        System.out.println("Tu nombre es: " + nombre);    
    }//Fin ImpresionNombre
    
    public void DetallesPersona(){
            System.out.println("La edad es: " + edad);
            System.out.printf("Con una altura de: %.2f cm \n", estatura);
}//Fin DetallesPersona
    
    public void SetGenero (char gen){
        this.genero = gen;    
    }
    
    public char GetGenero(){
        return this.genero;
    }
}//Fin Class Persona
