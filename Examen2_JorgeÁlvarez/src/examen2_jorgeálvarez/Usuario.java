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
public class Usuario implements Serializable{

    private String Nombre;
    private int Edad;
    private String Username;
    private String Password;
    private ArrayList<Playlist> Playlists = new ArrayList();
    private ArrayList<Cancion> Favoritas = new ArrayList();

    public Usuario() {
    }

    public Usuario(String Nombre, int Edad, String Username, String Password) {
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Username = Username;
        this.Password = Password;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public ArrayList<Playlist> getPlaylists() {
        return Playlists;
    }

    public void setPlaylists(ArrayList<Playlist> Playlists) {
        this.Playlists = Playlists;
    }

    public ArrayList<Cancion> getFavoritas() {
        return Favoritas;
    }

    public void setFavoritas(ArrayList<Cancion> Favoritas) {
        this.Favoritas = Favoritas;
    }

    @Override
    public String toString() {
        return "Usuario{" + "Nombre=" + Nombre + ", Edad=" + Edad + ", Username=" + Username + ", Password=" + Password + ", Playlists=" + Playlists + ", Favoritas=" + Favoritas + '}';
    }

}
