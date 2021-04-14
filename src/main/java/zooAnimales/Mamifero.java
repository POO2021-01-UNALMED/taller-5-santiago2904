/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zooAnimales;

import gestion.Zona;
import gestion.Zoologico;
import java.util.ArrayList;

/**
 *
 * @author santi
 */
public class Mamifero extends Animal {

    private static ArrayList<Mamifero> listado = new ArrayList();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;

    public Mamifero() {

    }

    public static ArrayList<Mamifero> getListado() {
        return listado;
    }

    public static void setListado(ArrayList<Mamifero> listado) {
        Mamifero.listado = listado;
    }

    public boolean isPelaje() {
        return pelaje;
    }

    public void setPelaje(boolean pelaje) {
        this.pelaje = pelaje;
    }

    public int getPatas() {
        return patas;
    }

    public void setPatas(int patas) {
        this.patas = patas;
    }
    
    public Mamifero( String nombre, int edad, String habitat, String genero,boolean pelaje, int patas) {
        super(nombre, edad, habitat, genero);
        this.caballos = caballos;
        this.leones = leones;
        this.pelaje = pelaje;
        this.patas = patas;

    }

    public static Mamifero crearCaballo(String nombre, int edad, String genero) {
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero,true, 4);
        listado.add(caballo);
        caballos++;
        return caballo;
    }

    public static Mamifero crearLeon(String nombre, int edad, String genero) {
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero,true, 4);
        listado.add(leon);
        leones++;
        return leon;
    }

    public static int cantidadMamiferos() {
        return listado.size();
    }

    public static void main(String[] args) {
         
        
        Anfibio an1 = new Anfibio();
		Anfibio an2 = new Anfibio("rana", 5, "pradera", "F","verde", false);
		
		boolean ok = false;
		if(an2.getNombre().equals("rana") && an2.getEdad() == 5
				&& an2.getHabitat().equals("pradera") && an2.getGenero().equals("F")
				&& an2.getColorPiel().equals("verde") && an2.isVenenoso() == false) {
			ok = true;
		}
                
               
    }

}
