/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.publishing;

/**
 *
 * @author aguil
 */
public class Editor extends Empleado {
    private String preferenciaEdicion;

    public Editor(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono, String preferenciaEdicion) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.preferenciaEdicion = preferenciaEdicion;
    }

    public String getPreferenciaEdicion() {
        return preferenciaEdicion;
    }

    public void setPreferenciaEdicion(String preferenciaEdicion) {
        this.preferenciaEdicion = preferenciaEdicion;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Preferencia de edicion: " + preferenciaEdicion);
    }
}
