/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jorgeálvarez;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ofici
 */
public class AdminUsuarios {

    File archivo;
    ArrayList<Usuario> Usuarios = new ArrayList();

    public AdminUsuarios() {
    }

    public AdminUsuarios(File archivo) {
        this.archivo = archivo;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<Usuario> getUsuarios() {
        return Usuarios;
    }

    public void setUsuarios(ArrayList<Usuario> Usuarios) {
        this.Usuarios = Usuarios;
    }

    public void escribirArchivo() throws IOException {
        archivo.delete();
        try {
            FileOutputStream fos = new FileOutputStream(archivo, true);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            for (Usuario c : Usuarios) {
                oos.writeObject(c);
            }
            oos.flush();

            oos.close();
            fos.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(AdminUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void leerArchivo() {
        Usuarios.clear();
        Usuario c;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois = new ObjectInputStream(fis);

            while ((c = (Usuario) ois.readObject()) != null) {
                Usuarios.add(c);
            }

        } catch (Exception e) {
        }
    }

}
