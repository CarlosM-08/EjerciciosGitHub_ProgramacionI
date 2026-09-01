/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introafunciones;

import java.util.Scanner;

/**
 * * @author cmu08_12mttuz
 * Objetivos
 * 1. Definir el concepto de funciones
 * 2. Analizar la estructura de una funcion
 * 3. Implementar una funcion
 * 
 * Caracteristuicas de las funciones
 * 1. Reutilizable
 * 2. Modular (permite fragmanter el codigo en varios segmeto)
 * 3. Mantenimiento del codigo
 * 
 * Estructura de una funcion
 * 1. El alcance de la funcion/metodo
 *      public
 *      private
 *      protected
 * 2. Tipo de dato de retorno
 *      int
 *      double
 *      String
 *      char
 *      boolean
 *      Array
 *      void (Sin Retorno)
 * 3. Nombre de la funcion/metodo
 * 4. parametros de trabajo
 *  `   Ninguno
 *      Uno
 *      Dos
 *      Muchos
 *      
 */
public class IntroaFunciones {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in);
        int nota1 = 0;
        int nota2 = 0;
        int nota3 = 0;
        double promedio = 0;
        String estadoMateria = "John Doe";
        String nombreMateria = "John Doe";
        String nombreEstudiante = "John Doe";
        
        //1ra Funcion
        MensajeBienvenida();//Llamado de la funcion
        
        
        //2da Funcion
        System.out.print("Nombre Estudiante: ");
        nombreEstudiante = CapitalizacionNombre(scan);
        
        System.out.print("Nombre Materia: ");
        nombreMateria = CapitalizacionNombre(scan);      
        
        //3ra Funcion
        System.out.printf("Materia: %s\tNota1: ",nombreMateria);
        nota1 = scan.nextInt();
        nota1 = ValidacionNota(nota1);//el dato dentro del parentesis es el valor se traslada a la funcion
        System.out.printf("Materia: %s\tNota2: ",nombreMateria);
        nota2 = scan.nextInt();
        nota2 = ValidacionNota(nota2);
        System.out.printf("Materia: %s\tNota3: ",nombreMateria);
        nota3 = scan.nextInt();
        nota3 = ValidacionNota(nota3);
        
        promedio = (nota1+nota2+nota3)/3.0;
        
        if(promedio>=65){
            estadoMateria = "Aprobado";
        }else
        {
            estadoMateria = "Reprobado";
        }
        
        System.out.printf("Resultados de %s",nombreEstudiante);
        System.out.printf("\nMateria: %s",nombreMateria);
        System.out.printf("\nNota1: %d",nota1);
        System.out.printf("\nNota2: %d",nota2);
        System.out.printf("\nNota3: %d",nota3);
        System.out.printf("\nPromedio: %.2f",promedio);
        System.out.printf("\nEstado: %s",estadoMateria);
    }//Fin de Main

/*
Funcion de Bienvenida al Algoritmo
Sin parametros de trabajo
Sin datos de retorno
*/
public static void MensajeBienvenida(){
System.out.println("Boleta de Calificaciones");
}//FIn Funcion MensajeBienvenida

public static String CapitalizacionNombre(Scanner sc){
    String nombreTratado = "JohnDoe";
    
    nombreTratado = sc.next().toUpperCase();
        
    return nombreTratado;
}//Fin Funcion CapitalizacionNombre

public static int ValidacionNota (int resultadoNota){// la variable resultadoNota captura la referencia que se le en el parentesis de arriba en el primer caso nota 1 porque esta dentro del parentesis
    int notaValida = resultadoNota;
    final int LIM_INF = 0;
    final int LIM_SUP = 100;
    Scanner input = new Scanner(System.in);
    
    do {
        if (notaValida < LIM_INF || notaValida > LIM_SUP) {
            System.out.println("Nota no valida");
            System.out.println("Tiene que estar entre 0 y 100");
            System.out.println("Ingrese nuevamente");
            notaValida = input.nextInt();
            
        }else{
            System.out.println("Nota Valida para Sistema");        
        }
        
    } while (notaValida < LIM_INF || notaValida >LIM_SUP);

    return notaValida;
}//Fin de Funcion ValidacionNota
    
}//Fin Class
