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

public class Programador extends Empleado {
    private List<String> habilidades;

    public Programador(String nombre, String cargo, String idEmpleado, int edad, String email, String telefono, List<String> habilidades) {
        super(nombre, cargo, idEmpleado, edad, email, telefono);
        this.habilidades = habilidades;
    }

    public List<String> getHabilidades() {
        return habilidades;
    }

    public void setHabilidades(List<String> habilidades) {
        this.habilidades = habilidades;
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Habilidades: " + habilidades);
    }
}