/**
 * 
 */
package controlador;

import javax.swing.ImageIcon;

import vista.JpTiempo;

/**
 * Realiza la conexi�n entre la clase Tiempo y JpTiempo
 * @author alejandro
 *
 */
public class CtrlTiempo {
  /**
   * miJpTiempo: Hace referencia a la instancia �nica del panel JpTiempo.
   */
  JpTiempo miJpTiempo;
  
  /**
   * Constructor que recibe la instancia �nica del panel JpTiempo
   * 
   * @param miJpTiempo
   * Recibe la instancia �nica del panel JpTiempo.
   */
  public CtrlTiempo(JpTiempo miJpTiempo){
    this.miJpTiempo = miJpTiempo;
  }

  /**
   * 
   * @param stringMM
   * @param stringM
   * @param stringSS
   * @param stringS
   */
  public void setTiempo(String stringMM, String stringM,
      String stringSS, String stringS) {
    // TODO Auto-generated method stub
    miJpTiempo.setTiempo(stringMM, stringM, stringSS, stringS);
  }

  public void setPunto(String stringPunto) {
    // TODO Auto-generated method stub
    miJpTiempo.setPunto(stringPunto);
  }
}
