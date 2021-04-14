/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Anfibio extends Animal {

    private static ArrayList<Anfibio> listado = new ArrayList();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;

    public Anfibio(){}
    
    public Anfibio(String colorPiel, boolean venenoso, String nombre, int edad, String habitad, String genero) {
        super(nombre, edad, habitad, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio("negro y amarillo", false, nombre, edad, "selva", genero);
        salamandras++;
        listado.add(salamandra);
        return salamandra;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio("rojo", true, nombre, edad, "selva", genero);
        ranas++;
        listado.add(rana);
        return rana;
    }

    public static int cantidadAnfibios() {
        return listado.size();
    }

    public String movimiento() {
        return "saltar";
    }
}
