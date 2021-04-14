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

    public Anfibio(){
        listado.add(this);
    }

    public static ArrayList<Anfibio> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Anfibio> listado) {
        Anfibio.listado = listado;
    }

    public String getColorPiel() {
        return colorPiel;
    }

    public void setColorPiel(String colorPiel) {
        this.colorPiel = colorPiel;
    }

    public boolean isVenenoso() {
        return venenoso;
    }

    public void setVenenoso(boolean venenoso) {
        this.venenoso = venenoso;
    }
    
    public Anfibio(String nombre, int edad, String habitat, String genero,String colorPiel, boolean venenoso) {
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
    }

    public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
        Anfibio salamandra = new Anfibio(nombre, edad, "selva", genero,"negro y amarillo", false);
        salamandras++;
        listado.add(salamandra);
        return salamandra;
    }

    public static Anfibio crearRana(String nombre, int edad, String genero) {
        Anfibio rana = new Anfibio(nombre, edad, "selva", genero,"rojo", true);
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
