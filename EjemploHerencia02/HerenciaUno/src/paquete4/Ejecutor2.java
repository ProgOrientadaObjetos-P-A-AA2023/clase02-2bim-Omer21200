/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete4;

/**
 *
 * @author reroes
 */
public class Ejecutor2 {
    public static void main(String[] args) {
        // 1. Crear y presentar un obj de tipo Estudiante Presencial
        String nombre = "Omer";
        String apellido = "Benitez";
        String identificacion = "1150460259";
        int edad = 23;
        EstudiantePresencial estuPre=new EstudiantePresencial(nombre, 
                apellido, identificacion, edad);
        estuPre.establecerCostoCredito(20);
        estuPre.establecerNumeroCreditos(10);
        estuPre.calcularMatriculaPresencial();
        System.out.println(estuPre);
    }
}
