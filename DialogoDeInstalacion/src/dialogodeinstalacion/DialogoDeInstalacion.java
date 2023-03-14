package dialogodeinstalacion;

import javax.swing.JOptionPane;

/**
 *
 * @author maryse
 *
 * JOptionPane Este programa ilustra el cuadro de diálogo del objeto
 * JOptionPane.
 *
 */
public class DialogoDeInstalacion {
    
    public void Cuadro (){
          JOptionPane.showMessageDialog(null, "Antes de comenzar la instalación, " + "cierre todas las aplicaciones.");
    }
    public static void main(String[] args) {
        DialogoDeInstalacion CT = new  DialogoDeInstalacion();
        CT.Cuadro();

      
    }

}
