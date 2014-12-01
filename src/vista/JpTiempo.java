package vista;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class JpTiempo extends JPanel {

  
  public static JLabel imgPos1, imgPos2, imgPos3, imgPos4, imgPunto;
  public static ImageIcon parpadeo1, parpadeo2;
  public static ImageIcon ic0, ic1, ic2, ic3, ic4, ic5, ic6, ic7, ic8, ic9;
  /**
   * Create the panel.
   */
  public JpTiempo() {
    super();
    setBounds(1000, 20, 300, 110);
    setLayout(null);
    
    parpadeo1 = new ImageIcon(getClass().getResource("/recursos/parpadeo1.jpg"));
    parpadeo2 = new ImageIcon(getClass().getResource("/recursos/parpadeo2.jpg"));
    
    ic0 = new ImageIcon(getClass().getResource("/recursos/0.jpg"));
    ic1 = new ImageIcon(getClass().getResource("/recursos/1.jpg"));
    ic2 = new ImageIcon(getClass().getResource("/recursos/2.jpg"));
    ic3 = new ImageIcon(getClass().getResource("/recursos/3.jpg"));
    ic4 = new ImageIcon(getClass().getResource("/recursos/4.jpg"));
    ic5 = new ImageIcon(getClass().getResource("/recursos/5.jpg"));
    ic6 = new ImageIcon(getClass().getResource("/recursos/6.jpg"));
    ic7 = new ImageIcon(getClass().getResource("/recursos/7.jpg"));
    ic8 = new ImageIcon(getClass().getResource("/recursos/8.jpg"));
    ic9 = new ImageIcon(getClass().getResource("/recursos/9.jpg"));

    imgPunto = new JLabel();
    imgPunto.setBounds(206, 40, 14, 30);
    imgPunto.setIcon(parpadeo2);

    imgPos1 = new JLabel();
    imgPos1.setBounds(140, 32, 23, 38);
    imgPos1.setIcon(ic8);

    imgPos2 = new JLabel();
    imgPos2.setBounds(173, 32, 23, 38);
    imgPos2.setIcon(ic8);

    imgPos3 = new JLabel();
    imgPos3.setBounds(230, 32, 23, 38);
    imgPos3.setIcon(ic8);

    imgPos4 = new JLabel();
    imgPos4.setBounds(263, 32, 23, 38);
    imgPos4.setIcon(ic8);

    this.add(imgPunto);
    this.add(imgPos1);
    this.add(imgPos2);
    this.add(imgPos3);
    this.add(imgPos4);
  }
  
  public void setTiempo(String stringMM, String stringM,
      String stringSS, String stringS){
    imgPos1.setIcon(new ImageIcon(getClass().getResource(stringMM)));
    imgPos2.setIcon(new ImageIcon(getClass().getResource(stringM)));
    imgPos3.setIcon(new ImageIcon(getClass().getResource(stringSS)));
    imgPos4.setIcon(new ImageIcon(getClass().getResource(stringS)));
  }

  public void setPunto(String stringPunto) {
    // TODO Auto-generated method stub
    imgPunto.setIcon(new ImageIcon(getClass().getResource(stringPunto)));
  }

}
