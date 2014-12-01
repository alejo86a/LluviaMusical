/**
 * 
 */
package controlador;

import modelo.Tiempo;
import vista.JpTiempo;
import vista.JpPrincipal;
import vista.GUIPrincipal;

/**
 * @author alejandro
 *
 */
public class CtrlPrincipal {

  Tiempo miTiempo;
  
  CtrlTiempo miCtrlTiempo;
  CtrlGUIPrincipal miCtrlVentanaPrincipal;
  
  JpTiempo miJpTiempo;
  JpPrincipal miJpPrincipal;
  GUIPrincipal miGUIPrincipal;
  
  public CtrlPrincipal(){
    miTiempo = new Tiempo(miCtrlTiempo);
    miCtrlVentanaPrincipal = new CtrlGUIPrincipal();
    miJpTiempo = new JpTiempo();
    miJpPrincipal = new JpPrincipal();
    miCtrlTiempo = new CtrlTiempo(miJpTiempo);
    miGUIPrincipal = new GUIPrincipal(miJpPrincipal, miJpTiempo);
  }
  
  public static void main ( String[] args){
    CtrlPrincipal miCtrlPrincipal = new CtrlPrincipal();
  }
}
