/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package asentamientomarciano;

import java.util.Scanner;

/**
 *
 * El año es 2045, Eres el Ingeniero en Jefe de Software de la colonia marciana
 * "Ares V". Una reciente tormenta de arena ha dañado los sistemas principales
 * y el comandante te ha encomendado escribir un programa de emergencia en Java 
 * para estabilizar la base. 
 * 
 * Tu misión se divide en dos fases críticas que determinarán la supervivencia
 * de la tripulación.
 * 
 * Fase 1: El Sistema de Energía
 * Los paneles solares principales están funcionando de manera irregular. 
 * Tienes que analizar la energía generada durante los últimos 7 días.
 * 
 * Tu tarea:
 * Crear un arreglo unidimensional que almacene la energía generada (en Megavatios)
 * durante los últimos 7 días. 
 * 
 * El sistema debe calcular y mostrar en pantalla:
 *  El total de energía generada en la semana.
 *  El promedio diario de energía.
 *  El día en el que se generó la menor cantidad de energía, 
 *  para emitir una alerta de revisión de ese panel.
 * 
 * Fase 2: El Invernadero Hidropónico
 * 
 * El suministro de comida depende del invernadero central, el 
 * cual está dividido en una cuadrícula (matriz) de 3x3 sectores. 
 * Los sensores han enviado las lecturas de humedad de cada sector, 
 * pero algunas tuberías se rompieron durante la tormenta.
 * 
 * Tu tarea:
 * Crear un arreglo bidimensional de 3x3 que represente los niveles de humedad 
 * (en porcentaje) de cada sector del invernadero. 

* El programa debe escanear toda la matriz y:
* Mostrar el mapa actual de humedad en formato de cuadrícula.
* Identificar qué sectores tienen un nivel de humedad crítico (menor al 50%) 
* y mostrar sus coordenadas para enviar a los drones de reparación automáticamente.
 */
public class AsentamientoMarciano {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        final int DIAS = 7;// CONSTANTE
        final int FILA = 3;
        final int COLU = 3;
        int energiaTotal = 0;
        double promedioEnergiaSemanal = 0;
        int menosEnergia = 0;
        
        int[] energiaAlmacenada = new int[DIAS];// el dato dentro del arreglo no se debe modificar por eso se declara una CONSTANTE
        double[][] humedadSectorial = new double[FILA][COLU];
        
        for (int i = 0; i < DIAS; i++) {
            System.out.printf("Ingresar energia #%d\n", i+1);
            energiaAlmacenada[i] = ValidacionNumeroPositivo(scan);            
        }
        
        energiaTotal = TotalEnergiaSemana(energiaAlmacenada);
        promedioEnergiaSemanal = CalculoPromedioEnergia(energiaTotal, DIAS);
        menosEnergia = EnergiaMenor(energiaAlmacenada);
        
        System.out.println("----------------");
        System.out.println("--Resultados--");
        System.out.println("--------------");
        System.out.printf("Total Energia: %d\n",energiaTotal);
        System.out.printf("Promedio: %.2f\n", promedioEnergiaSemanal);
        System.out.printf("Dia con menos Energia: %d\n", menosEnergia+1);
        System.out.printf("La cantidad de energia para el dia %d es: %d\n", menosEnergia+1, energiaAlmacenada[menosEnergia]); 
       
        //ARREGLOS BIDIMENCIONALES
        
        System.out.println("----------------------------");
        System.out.println("FASE DOS");
        humedadSectorial = IngresoMedicionesSesorHumedad(scan, FILA, COLU);
        MostrarMapaSectorial(humedadSectorial);
        System.out.println("");
        SectoresCriticos(humedadSectorial);
                
    }//Fin Main    
    public static int ValidacionNumeroPositivo (Scanner sc){
        
        int numeroTemp = 0;

        do {
            System.out.println("Ingresa el dato de la lectura echa");
            System.out.print("Lectura: ");
            numeroTemp = sc.nextInt();
            
            if (numeroTemp<0) {
                System.out.println("Lectura Erronea");
                System.out.println("No puede ser negativo");
                System.out.println("Ingresarlo nuevamente");
                System.out.println("\n");                
            }
            
        } while (numeroTemp<0);
        
        return numeroTemp;
    
    }//Fin de Funcion ValidacionNumeroPositivo
    
    public static int TotalEnergiaSemana (int[] arreglo){
        int energiaAcumulada = 0;
        
        for (int i = 0; i < arreglo.length; i++) {
            energiaAcumulada += arreglo[i];            
        }
        
        return energiaAcumulada;      
    }//Fin de funcion;
    
    public static double CalculoPromedioEnergia (int sumaTotal, int numDias ){
        double promedio = 0;
        
        promedio = sumaTotal / numDias;
                
        return promedio;  
    
    }//Fin de funcion CalculoPromedioEnergia
    
    public static int EnergiaMenor (int[] energias){
    int valorEnergiasTem  = energias[0]; 
    int indice = 0;
    
        for (int i = 1; i < energias.length; i++) {//comienza en el i = 1 porque se le asigno el i = 0 a la primera valorEnergiasTem
            if (energias[i] < valorEnergiasTem){
            valorEnergiasTem = energias[i]; 
            indice = i;
        }//Fin If           
        }//Fin For
        return indice; 
    
    }//Fin funcion EnergiaMenor
    
    public static double[][] IngresoMedicionesSesorHumedad(Scanner sc, int fila, int colu){
        double[][] arregloTem = new double[fila][colu];
        
        for (int i = 0; i < fila; i++) {
            for (int j = 0; j < colu; j++) {
                System.out.println("ingresa los datos de cada sector");
                System.out.printf("Sector %d, %d: ",i+1,j+1);
                arregloTem[i][j] = sc.nextDouble();                
            }//Fin ciclo FOR COLUMNAS            
        }//fin ciclo FOR FILAS
        
        return arregloTem;   
    
    }//Fin funcion IngresoMedicionesSesorHumedad
    
    public static void MostrarMapaSectorial (double[][] arreglo){
        System.out.println("\n-------------------");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                System.out.println(arreglo[i][j]+"\t");                
            }//Fin ciclo FOR COLUMNAS
            System.out.println("\n---------------");
        }//Fin cliclo FOR FILAS
    
    }//Fin funcion MostrarMapaSectorial
    
    public static void SectoresCriticos(double[][] arreglo) {
        System.out.println("\n-------------------");
        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if (arreglo[i][j] < 50) {
                    System.out.println("Valor Critico");
                    System.out.printf("Sector: %d, %d\n", i, j);
                    System.out.printf("Valor: %.2f", arreglo[i][j]);
                }
                }//Fin ciclo FOR COLUMNAS
            }//Fin ciclo FOR FILAS
        }//Fin funcion SectoresCriticos
    
}//Fin Class
