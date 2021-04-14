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
public class Reptil extends Animal {

    private static ArrayList<Reptil> listado = new ArrayList();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;

    public Reptil() {
    }

    public Reptil(String colorEscamas, int largoCola, String nombre, int edad, String habitad, String genero) {
        super(nombre, edad, habitad, genero);
        this.listado = listado;
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
    }

    public static Reptil crearIguana(String nombre, int edad, String genero) {
        Reptil iguana = new Reptil("verde", 3, nombre, edad, "humedal", genero);
        iguanas++;
        listado.add(iguana);
        return iguana;
    }

    public static Reptil crearSerpiente(String nombre, int edad, String genero) {
        Reptil serpiente = new Reptil("blanco", 1, nombre, edad, "jungla", genero);
        serpientes++;
        listado.add(serpiente);
        return serpiente;
    }

    public static int cantidadReptiles() {
        return listado.size();
    }

    public String movimiento() {
        return "reptar";
    }

}
