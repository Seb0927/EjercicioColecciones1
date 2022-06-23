/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicioempleadocolecciones;

import java.util.ArrayList;

/**
 *
 * @author invitado
 */
public class Empresa {
    
    ArrayList<Empleado> listadoEmpleados;

    public Empresa(ArrayList<Empleado> listadoEmpleados) {
        this.listadoEmpleados = listadoEmpleados;
    }
    
    public void promedioSalario(){
        double sumatoriaSalario = 0;
        double promedioSalario = 0;
        
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            sumatoriaSalario += listadoEmpleados.get(i).getSalario();
        }
        
        promedioSalario = sumatoriaSalario/(listadoEmpleados.size());
        System.out.println("El promedio del Salario de los empleados es: " + promedioSalario);
    }
    
    public void salarioAlto(){
        double salarioAlto = 0;
        String nombre = null;
        
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            //Evalua si tiene el salario mas alto el empleado actual del bucle
            if (listadoEmpleados.get(i).getSalario() > salarioAlto){
                salarioAlto = listadoEmpleados.get(i).getSalario();
                nombre = listadoEmpleados.get(i).getNombre();
            }    
        }
        
        System.out.println("El salario mas alto lo tiene: " + nombre + " con un salario de: " + salarioAlto);
        
    }
    
    public void empleadosMayorQuePromedio(){
        //Promedio
        double sumatoriaSalario = 0;
        double promedioSalario = 0;
        
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            sumatoriaSalario += listadoEmpleados.get(i).getSalario();
        }
        
        promedioSalario = sumatoriaSalario/(listadoEmpleados.size());
        
        //Retornar empleados mayor que el promedio
        ArrayList<Empleado> listadoMayorPromedio = new ArrayList<>();
        
        //Añade empleados
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            if (listadoEmpleados.get(i).getSalario() > promedioSalario){
                listadoMayorPromedio.add(listadoEmpleados.get(i));
            }
        }
        
        //Imprime empleados
        System.out.println("Los empleados con un salario mayor al promedio son los siguientes: ");
        for (int i = 0; i < listadoMayorPromedio.size(); i++){
            System.out.println("Empleado: " + listadoMayorPromedio.get(i).getNombre() + " - Salario: " + listadoMayorPromedio.get(i).getSalario());
        }
        
    }
    
    public void salariosSegunCargo(String cargo){
        
        ArrayList<Empleado> listadoCargo = new ArrayList<>();;
        
        //Añade empleados con el respectivo cargo
        for (int i = 0; i < listadoEmpleados.size(); i++) {
            if ((listadoEmpleados.get(i).getCargo()).equals(cargo)){
                listadoCargo.add(listadoEmpleados.get(i));
            }
        }
        
        //Demuestra sus salarios
        System.out.println("A continuación se demuestran los salarios del cargo: " + cargo);
        for (int i = 0; i < listadoCargo.size(); i++){
            System.out.println("Salario del empleado: " + listadoCargo.get(i).getSalario());
        }
    }
    
    
    
}
