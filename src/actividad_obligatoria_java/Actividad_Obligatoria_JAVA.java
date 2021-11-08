/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_obligatoria_java;
import java.util.Scanner;
/**
 *
 * @author i7Lenovo
 */
public class Actividad_Obligatoria_JAVA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Scanner teclado = new Scanner(System.in);
        
        String nombre;
        String apellido;
        int edad; 
        String hobbie;
        String editorCodigo;
        String sistemaOperativo;
        
        System.out.println("Introduce su nombre: ");
        nombre=teclado.nextLine();
        
        System.out.println("Introduce su apellido: ");
        apellido=teclado.nextLine();
        
        System.out.println("Introduce su edad: ");
        edad=teclado.nextInt();
        teclado.nextLine();
       
        System.out.println("Introduce su hobbie: ");
        hobbie=teclado.nextLine();
        
        System.out.println("Introduce su editor de codigo preferido: ");
        editorCodigo=teclado.nextLine();
        
        System.out.println("Introduce el sistema operativo que utiliza: ");
        sistemaOperativo=teclado.nextLine();
       
           
        System.out.println("Nombre: " + nombre + '\n' +
                "Apellido: " + apellido + '\n' +
                "Edad: " + edad + '\n' +
                "Hobbie: " + hobbie + '\n' +
                "Editor de codigo preferido: " + editorCodigo + '\n' +
                "Sitema operativo utilizado: " + sistemaOperativo );
    }
    
}
