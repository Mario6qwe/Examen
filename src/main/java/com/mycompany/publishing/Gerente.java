/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publishing;

/**
 *
 * @author aguil
 */
import java.util.List;

public class Gerente extends Empleado {
    private List<Empleado> empleadosDirigidos;

    public Gerente(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono, List<Empleado> empleadosDirigidos) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.empleadosDirigidos = empleadosDirigidos;
    }

    public List<Empleado> getEmpleadosDirigidos() {
        return empleadosDirigidos;
    }

    public void setEmpleadosDirigidos(List<Empleado> empleadosDirigidos) {
        this.empleadosDirigidos = empleadosDirigidos;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Empleados dirigidos: " + empleadosDirigidos);
    }
}

