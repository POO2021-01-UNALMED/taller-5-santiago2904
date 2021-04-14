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
public class Ave extends Animal {

    private static ArrayList<Ave> listado = new ArrayList();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;

    public static ArrayList<Ave> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Ave> listado) {
        Ave.listado = listado;
    }

    public String getColorPlumas() {
        return colorPlumas;
    }

    public void setColorPlumas(String colorPlumas) {
        this.colorPlumas = colorPlumas;
    }

    public Ave() {

    }

    public Ave(String colorPlumas, String nombre, int edad, String habitad, String genero) {
        super(nombre, edad, habitad, genero);
        this.colorPlumas = colorPlumas;
    }

    public static Ave crearHalcon(String nombre, int edad, String genero) {
        Ave halcon = new Ave("cafe glorioso", nombre, edad, "montanas", genero);
        halcones++;
        listado.add(halcon);
        return halcon;
    }

    public static Ave crearAguila(String nombre, int edad, String genero) {
        Ave aguila = new Ave("blanco y amarillo", nombre, edad, "montanas", genero);
        aguilas++;
        listado.add(aguila);
        return aguila;

    }

    public static int cantidadAves() {
        return listado.size();
    }

    public String movimiento() {
        return "volar";
    }

}
