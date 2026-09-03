/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package intropoo;

/**
 *
 * @author cmu08_12mttuz
 */
public class IntroPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona Jesus = new Persona();
        Persona Alejandra = new Persona();
        VentanaPrincipal VP = new VentanaPrincipal();
        
        VP.setVisible(true);//mostrar el Formulario
        VP.setLocationRelativeTo(null);//se ve visible en la pantalla
         
        Jesus.edad = 33;
        Alejandra.edad = 20;
        Jesus.nombre = "Eduardo";
        Alejandra.nombre = "Patricia";
        Jesus.estatura = 1.90;
        Alejandra.estatura = 1.65;
        
        Jesus.ImpresionNombre();        
        Jesus.DetallesPersona();
        Jesus.SetGenero('M');
        System.out.printf("Genero de %s es: %c\n",Jesus.nombre,Jesus.GetGenero());
        System.out.println("");
        Alejandra.ImpresionNombre();
        Alejandra.DetallesPersona();
        Alejandra.SetGenero('F');
        System.out.printf("Genero de %s es: %c\n",Alejandra.nombre,Alejandra.GetGenero()); 
        
    }//Fin Main
    
}//Fin Class
