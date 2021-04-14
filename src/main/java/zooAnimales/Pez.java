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
public class Pez extends Animal {

    private static ArrayList<Pez> listado = new ArrayList();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;

    public Pez() {
    }

    public static ArrayList<Pez> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Pez> listado) {
        Pez.listado = listado;
    }

    public String getColorEscamas() {
        return colorEscamas;
    }

    public void setColorEscamas(String colorEscamas) {
        this.colorEscamas = colorEscamas;
    }

    public int getCantidadAletas() {
        return cantidadAletas;
    }

    public void setCantidadAletas(int cantidadAletas) {
        this.cantidadAletas = cantidadAletas;
    }

    public Pez(String nombre, int edad, String habitat, String genero,String colorEscamas, int cantidadAletas) {
        super(nombre, edad, habitat, genero);
        this.listado = listado;
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
    }

    public static Pez crearSalmon(String nombre, int edad, String genero) {
        Pez salmon = new Pez( nombre, edad, "oceano", genero,"rojo", 6);
        salmones++;
        listado.add(salmon);
        return salmon;
    }

    public static Pez crearBacalao(String nombre, int edad, String genero) {
        Pez bacalao = new Pez(nombre, edad, "oceano", genero,"gris", 6);
        bacalaos++;
        listado.add(bacalao);
        return bacalao;
    }

    public static int cantidadPeces() {
        return listado.size();
    }

    public String movimiento() {
        return "nadar";
    }

}
