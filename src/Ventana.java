import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;


public class Ventana extends JFrame {

  private JPanel contentPane;


	/**
	 * Creación del frame.
	 */
	public Ventana() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		pack();
	}//fin del metodo

	/**
	 * inicialización de las variables globales.
	 */
	public void iniComponents(){
	  new ImageIcon("Recursos/fondo.bpm").getImage();
	  contentPane = new JPanel();
    contentPane = new JPanel();
    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
    contentPane.setLayout(null);
    setContentPane(contentPane);
	}//fin del metodo
	
}
