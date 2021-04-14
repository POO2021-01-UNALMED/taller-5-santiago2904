/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gestion;

import java.util.ArrayList;
import zooAnimales.*;

/**
 *
 * @author santi
 */
public class Zoologico {
    
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList();
    
    public Zoologico(){
    
    }

    public Zoologico(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getUbicacion() {
        return ubicacion;
    }
    
    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
    
    public ArrayList<Zona> getZona() {
        return zonas;
    }
    
    public void setZonas(ArrayList<Zona> zonas) {
        this.zonas = zonas;
    }
    
    public Zoologico(String nombre, String ubicacion, ArrayList zonas) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.zonas = zonas;
    }
    
    public void agregarZonas(Zona zona) {
        zona.setZoo(this);
        zonas.add(zona);
    }
    
    public int cantidadTotalAnimales() {
        int suma = 0;
        for (int i = 0; i < zonas.size(); i++) {
            suma += zonas.get(i).cantidadAnimales();
        }
        
      
        return suma;
    }
    
    
    
}
