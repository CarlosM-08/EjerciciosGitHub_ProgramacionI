/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package listaarreglos;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cmu08_12mttuz
 */
public class ListaArreglos {

    /**
     * int[] arreglos = new int[5];// Arregglo unidimencional, estatico
       arreglos = new int[10];// redimencionar el arreglo OJO, borra el contenido que ya tenia almacenado cuando el tamaño era 5
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList<Integer> numeros = new ArrayList<Integer>();//Arreglo de enteros (int)
        ArrayList<Double> velocidad = new ArrayList<Double>();// Agrreglo de decimales (double)
        ArrayList<Character> letras = new ArrayList<Character>();// Arreglo de caracteres (char)
        ArrayList<String> nombres = new ArrayList<String>();//Arreglo de cadenas (String)
        ArrayList<Boolean> estados = new ArrayList<Boolean>();//Arreglo de booleanos (boolean) 
        
        int dimension = 0;
        dimension = DimensionArrayList(numeros);
        System.out.printf("Dimension de ArrayList: %d", dimension);
        
        numeros.add(15);
        numeros.add(100);
        numeros.add(-200);
        
        dimension = DimensionArrayList(numeros);
        System.out.printf("\nDimension de ArrayList: %d", dimension);
        System.out.println("");
        VisualizarContenidoArrayList(numeros);
        System.out.println("----------------------");        
        numeros.add(400);
        VisualizarContenidoArrayList(numeros);
        
        System.out.println("----------------------");
        System.out.println("Modificando Elemento");
        numeros.set(1, 900);//set es para modificar elementos
        System.out.println("----------------------");          
        VisualizarContenidoArrayList(numeros);
        
        System.out.println("----------------------"); 
        System.out.println("Quitando elementos de ArrayList");
        
        VisualizacionDatoEliminado(numeros);
        numeros.remove(0);//Elimina un dato del arreglo
        VisualizacionDatoEliminado(numeros);
        
        System.out.println("----------------------"); 
        System.out.println("Eliminando contenido completo de ArrayList");
        numeros.clear();
        VisualizarContenidoArrayList(numeros);
        
        numeros.add(400);
        numeros.add(200);
        numeros.add(100);
        numeros.add(150);
        numeros.add(250);
        
        //For Each
        
        for (int dato: numeros) {
            System.out.printf("Valores: %d\n", dato);            
        }//Fin Foreach
        
        //usando Scanner
        
        Scanner scan = new Scanner(System.in);
        System.out.println("\nAgrega un numero: ");
        
        int tempo = 0;
        
        tempo = scan.nextInt();
        numeros.add(tempo);
        VisualizarContenidoArrayList(numeros);
        
        
    }//Fin Main
    
    public static int DimensionArrayList(ArrayList<Integer> arreglo){
    int valorTem = 0;
    
    valorTem = arreglo.size();
    
    return valorTem;
    }
    
    public static void VisualizarContenidoArrayList(ArrayList<Integer> arreglo){
        int valorTem = 0;
        for (int i = 0; i < arreglo.size(); i++) {
        System.out.printf("Posicion: %d\t",i);
        
        valorTem = arreglo.get(i);//get obtiene el valor que se le asigno al arreglo
        System.out.printf("Valor: %d\n",valorTem);
            
        }//Fin ciclo FOR
    }
    
    public static void VisualizacionDatoEliminado(ArrayList<Integer> arreglo){
        int dimensionTem = 0;
        dimensionTem = DimensionArrayList(arreglo);
        System.out.printf("Dimension Inicial: %d\n",dimensionTem);
        VisualizarContenidoArrayList(arreglo);    
    }
    
    
}//Fin Class
