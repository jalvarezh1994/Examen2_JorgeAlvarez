/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2_jorgeálvarez;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JProgressBar;

/**
 *
 * @author ofici
 */
public class HiloReproducir extends Thread {

    JLabel jl;
    JProgressBar pb;
    Cancion cancion;

    @Override
    public void run() {
        int tiempo = 0;

        do {

            try {
                jl.setText(""+tiempo);
                pb.setValue(tiempo);
                tiempo++;
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloReproducir.class.getName()).log(Level.SEVERE, null, ex);
            }
        } while (tiempo <= cancion.getDuracion());
    }

    public HiloReproducir(JLabel jl, JProgressBar pb, Cancion cancion) {
        this.jl = jl;
        this.pb = pb;
        this.cancion = cancion;
    }

}
