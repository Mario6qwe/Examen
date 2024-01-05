/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.publishing;

/**
 *
 * @author aguil
 */

import java.util.List;

public class Publishing {
    
    public static void main(String[] args) {
        // Crear un programador
        Programador programador = new Programador("Juan", "Programador", "12345", 30, "juan@email.com", "1234567890", List.of("Java", "Python"));
        programador.mostrarInformacion();
        System.out.println("---------");

        IlustradorGrafico ilustrador = new IlustradorGrafico("Ana", "Ilustrador Grafico", "54321", 28, "ana@email.com", "9876543210", List.of("Adobe Illustrator", "Photoshop"));
        ilustrador.mostrarInformacion();
        System.out.println("---------");

        Gerente gerente = new Gerente("Maria", "Gerente", "67890", 40, "maria@email.com", "0987654321", List.of(programador, ilustrador));
        gerente.mostrarInformacion();
        System.out.println("---------");

        Editor editor = new Editor("Carlos", "Editor", "112233", 35, "carlos@email.com", "1122334455", "ElectrÃ³nica");
        editor.mostrarInformacion();
        System.out.println("---------");
   }
}