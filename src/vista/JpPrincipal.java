package vista;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JPanel;


/**
 * Panel principal de la aplicación.
 * 
 * @author alejandro
 *
 */
public class JpPrincipal extends JPanel{
  

  /**
   * Background: Atributo que guardara la imagen de Background que le pasemos.
   */
  private ImageIcon background = new ImageIcon(getClass().getResource("/recursos/fondo.png"));
 
  /**
   *  Metodo que es llamado automaticamente por la maquina virtual Java cada vez que repinta
   * 
   * @param g
   * Gráfico que dibuja componentes en el panel.   * 
   */  
 
  public void paintComponent(Graphics g) {
 
    // Obtenemos el tamaño del panel para hacer que se ajuste a este
    //cada vez que redimensionemos la ventana y se lo pasamos al drawImage
    int width = this.getSize().width;
    int height = this.getSize().height;
 
    // Mandamos que pinte la imagen en el panel
    if (this.background != null) {
      g.drawImage(this.background.getImage(), 0, 0, width, height, null);
    } 
    super.paintComponent(g);
  }
 
  /** 
   * Metodo donde le pasaremos la dirección de la imagen a cargar.
   * 
   * @param imagePath
   * Ruta del recurso utilizado.
   */
  public void setBackground(String imagePath) {
    // Construimos la imagen y se la asignamos al atributo background.
    this.background = new ImageIcon(imagePath);
    repaint();
  }
}
