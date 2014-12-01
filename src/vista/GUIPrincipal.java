package vista;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import sun.java2d.pipe.DrawImage;

/**
 * Frame principal que contiene los paneles de la aplicación.
 * 
 * @author alejandro
 *
 */

public class GUIPrincipal extends JFrame {

  /**
   * contentPane: Atributo que sirve como referencia al panel principal.
   * miJpTiempo: Atributo que sirve como referencia al panel tiempo.
   */
  private JpPrincipal contentPane;
  private JpTiempo miJpTiempo;


	/**
	 * Creación del frame y llama al metodo inicializar componentes.
	 * 
	 * @param miJpPrincipal
	 * Recibe la única instancia del panel principal.
	 * 
	 * @param miJpTiempo
	 * Recibe una única instancia del panel tiempo.
	 * 
	 */
	public GUIPrincipal(JpPrincipal miJpPrincipal,JpTiempo miJpTiempo) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(0, 0, this.getWidth()-20 , this.getHeight()-20);
		setVisible(true);
		setLayout(null);
		pack();
		
		contentPane = miJpPrincipal;
		this.miJpTiempo = miJpTiempo;
		iniComponents();
		
		add(contentPane);
		add(miJpTiempo);
	}//fin del metodo

	/**
	 * Inicialización de las variables globales.
	 */
	public void iniComponents(){
    contentPane = new JpPrincipal();
    contentPane.setVisible(true);
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(null);
    contentPane.setBackground("/recursos/fondo.png");
    contentPane.setBounds(0,0,1000,500);
    //contentPane.setBackground(new ImageIcon(getClass().getResource("/recursos/fondo.bmp")).getImage());
    miJpTiempo = new JpTiempo();
    //setContentPane(contentPane);
	}//fin del metodo
	
}
