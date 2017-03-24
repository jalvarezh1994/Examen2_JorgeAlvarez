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
public class Album implements Serializable {

    private String Nombre;
    private String Artista;
    ArrayList<Cancion> Canciones = new ArrayList();

    public Album() {
    }

    public Album(String Nombre, String Artista) {
        this.Nombre = Nombre;
        this.Artista = Artista;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getArtista() {
        return Artista;
    }

    public void setArtista(String Artista) {
        this.Artista = Artista;
    }

    public ArrayList<Cancion> getCanciones() {
        return Canciones;
    }

    public void setCanciones(ArrayList<Cancion> Canciones) {
        this.Canciones = Canciones;
    }

    @Override
    public String toString() {
        return "Album{" + "Nombre=" + Nombre + ", Artista=" + Artista + ", Canciones=" + Canciones + '}';
    }

}
