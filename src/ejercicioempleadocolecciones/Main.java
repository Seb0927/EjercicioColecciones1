/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejercicioempleadocolecciones;

import java.util.ArrayList;

/**
 *
 * @author Sebastián Idrobo Avirama
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Se crean a los empleados
        Empleado empleado1 = new Empleado("Pepe1", "Doctor", 4500);
        Empleado empleado2 = new Empleado("Pepe2", "Ingeniero", 1000);
        Empleado empleado3 = new Empleado("Pepe3", "Ingeniero", 2000);
        Empleado empleado4 = new Empleado("Pepe4", "Veterinario", 500);
        Empleado empleado5 = new Empleado("Pepe5", "Licenciado", 1080);
        Empleado empleado6 = new Empleado("Pepe6", "Doctor", 6000);
        Empleado empleado7 = new Empleado("Pepe7", "Licenciado", 8340);
        Empleado empleado8 = new Empleado("Pepe8", "Doctor", 100);
        Empleado empleado9 = new Empleado("Pepe9", "Auxiliar", 1000);
        Empleado empleado10 = new Empleado("Daniela", "Ingeniero", 2000);
        
        //Se añaden a un array
        ArrayList<Empleado> listado = new ArrayList<Empleado>();
        listado.add(empleado1);
        listado.add(empleado2);
        listado.add(empleado3);
        listado.add(empleado4);
        listado.add(empleado5);
        listado.add(empleado6);
        listado.add(empleado7);
        listado.add(empleado8);
        listado.add(empleado9);
        listado.add(empleado10);
        
        //Se crea la empresa y se le ingresa el listado
        Empresa miEmpresa = new Empresa(listado);
        
        //Calcular el promedio del salario
        miEmpresa.promedioSalario();
        
        //Calcular el salario mas alto y quién lo tiene
        miEmpresa.salarioAlto();
        
        //Imprimir el nombre de los empleados que gana mas del promedio
        miEmpresa.empleadosMayorQuePromedio();
        
        //Imprimir el salario de los empleados cuyo cargo es "Auxiliar"
        miEmpresa.salariosSegunCargo("Auxiliar");
        
        
        
    }
    
}
