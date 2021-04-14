/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import gestion.Zona;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Animal {

    private static int totalAnimales;
    private String nombre;
    private int edad;
    private String habitad;
    private String genero;
    private Zona zona;

    public Animal(){
    
    }
    
    public Animal(String nombre, int edad, String habitad, String genero, Zona zona) {
       
        this.nombre = nombre;
        this.edad = edad;
        this.habitad = habitad;
        this.genero = genero;
        this.zona = zona;
    }

    public Animal(String nombre, int edad, String habitad, String genero) {
        
        this.nombre = nombre;
        this.edad = edad;
        this.habitad = habitad;
        this.genero = genero;

    }

    public int getTotalAnimales() {
        return totalAnimales;
    }

    public void setTotalAnimales(int totalAnimales) {
        this.totalAnimales = totalAnimales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getHabitad() {
        return habitad;
    }

    public void setHabitad(String habitad) {
        this.habitad = habitad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    public static String totalPorTipo() {
		return "Mamiferos: "+ Mamifero.cantidadMamiferos() + "\nAves: " + Ave.cantidadAves() + "\nReptiles: " + 
                    Reptil.cantidadReptiles() + "\nPeces: " + Pez.cantidadPeces() + "\nAnfibios: " + Anfibio.cantidadAnfibios();
	}

    @Override
    public String toString() {

        if (zona != null) {
            return "Mi nombre es " + nombre + ", tengo una edad de" + edad
                    + ", y mi genero es " + genero + ", la zona en la que me ubico es "
                    + zona.getNombre() + ", en el " + zona.getZoo().getNombre();
        } else {
            return "Mi nombre es " + nombre + ", tengo una edad de " + edad
                    + ", y mi genero es " + genero;
        }
    }

    public String movimiento() {
        return "desplazarse";
    }

}
