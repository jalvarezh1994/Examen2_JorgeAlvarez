/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jorgeálvarez;

import java.io.Serializable;
import java.util.ArrayList;

/**
 *
 * @author ofici
 */
public class Playlist implements Serializable {

    private String Nombre;
    private ArrayList<Cancion> Cancionest = new ArrayList();

    public Playlist() {
    }

    public Playlist(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public ArrayList<Cancion> getCancionest() {
        return Cancionest;
    }

    public void setCancionest(ArrayList<Cancion> Cancionest) {
        this.Cancionest = Cancionest;
    }

    @Override
    public String toString() {
        return "Playlist{" + "Nombre=" + Nombre + ", Cancionest=" + Cancionest + '}';
    }

}
