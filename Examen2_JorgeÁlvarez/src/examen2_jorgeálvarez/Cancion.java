/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jorgeálvarez;

import java.io.Serializable;

/**
 *
 * @author ofici
 */
public class Cancion implements Serializable {

    String Nombre;
    String Artista;
    int Duracion;
    String Genero;

    public Cancion() {
    }

    public Cancion(String Nombre, String Artista, int Duracion, String Genero) {
        this.Nombre = Nombre;
        this.Artista = Artista;
        this.Duracion = Duracion;
        this.Genero = Genero;
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

    public int getDuracion() {
        return Duracion;
    }

    public void setDuracion(int Duracion) {
        this.Duracion = Duracion;
    }

    public String getGenero() {
        return Genero;
    }

    public void setGenero(String Genero) {
        this.Genero = Genero;
    }

    @Override
    public String toString() {
        return "Nombre=" + Nombre + ", Artista=" + Artista; 
    }

}
