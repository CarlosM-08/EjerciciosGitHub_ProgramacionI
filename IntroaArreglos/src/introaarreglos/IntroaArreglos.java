/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package introaarreglos;

import java.util.Scanner;

/**
 *
 * Crear un algoritmo que me permita registrar  5 personas diferentes
 * con sus caracteristicas: Nombre, genero, edad, peso y estatura.
 * Mostrar todos los datos en un formato de tabla. 
 */
public class IntroaArreglos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Scanner scan = new Scanner(System.in);
        /* 
        //Declarar arreglo
        String[] nombre;
        //Crear el arreglo
        nombre = new String[5];
        
        //Declarado y creado
        char[] genero = new char[5];
        
        //Declarado e inicializado
        int[] edad = {0,0,0,0,0};
         */

        String[] nombre = new String[5];
        char[] genero = new char[5];
        int[] edad = new int[5];
        double[] estatura = new double[5];
        double[] peso = new double[5];

        for (int i = 0; i < 5; i++) {
            System.out.printf("%d) Cuentame, como te llamas?: ", i + 1);
            nombre[i] = scan.nextLine();

            System.out.printf("%s... eres hombre o mujer?: ", nombre[i]);
            genero[i] = scan.next().charAt(0);

            System.out.printf("Cuantos anios tienes?: ", nombre[i]);
            edad[i] = scan.nextInt();

            System.out.printf("%s, Cuanto es tu peso?: ", nombre[i]);
            peso[i] = scan.nextDouble();

            System.out.printf("Estatura %s: ", nombre[i]);
            estatura[i] = scan.nextDouble();
            scan.nextLine();
            System.out.println("-----------------------\n");
        }//Fin de Ciclo FOR
        
         /*
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d) Nombre: %8s\t", i + 1, nombre[i]);
            System.out.printf("\nDatos Demograficos\tEdad: %d\tGenero:%c\n", edad[i], genero[i]);
            System.out.printf("Caracteristicas fisicas:\tPeso: %.2f\tEstatura: %.2f", peso[i], estatura[i]);
            System.out.println("\n-------------------------------------------------------------------------");
            System.out.println("");
        }//FIn Ciclo FOR
        */   
         System.out.println("Nombre: "+nombre);//Imprime direccion de memoria no el contenido  
         System.out.println("");
         ImpresionResultados(nombre, genero, edad);

    }//Fin Main
    
    public static void ImpresionResultados (String[] alias, char[] sexo, int[] edad){
        for (int i = 0; i < 5; i++) {
            System.out.printf("%d) Nombre: %8s\t", i + 1, alias[i]);
            System.out.printf("\nDatos Demograficos\tEdad: %d\tGenero:%c\n", edad[i], sexo[i]);
            System.out.println("");
        }//Fin FOR    
    }//Fin de funcion 
    
}//Fin Class
