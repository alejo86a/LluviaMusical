/**
 * 
 */
package modelo;

import java.util.Timer;
import java.util.TimerTask;
import controlador.CtrlTiempo;

/**
 * Clase que contiene los métodos para simular el temporizador del juego.
 * @author alejandro
 *
 */
public class Tiempo {
 
  /**
   * timer: Objeto de la clase Timer.
   * bandera: ---ALEXX COMENTA AQUI!!!!
   * bandera1: ---ALEXX COMENTA AQUI!!!!
   * controlParpadeo: ---ALEXX COMENTA AQUI!!!!
   * mm: ---ALEXX COMENTA AQUI!!!!
   * m: ---ALEXX COMENTA AQUI!!!!
   * ss: ---ALEXX COMENTA AQUI!!!!
   * s: ---ALEXX COMENTA AQUI!!!!
   * hora: ---ALEXX COMENTA AQUI!!!!
   * minuto: ---ALEXX COMENTA AQUI!!!!
   * segundo: ---ALEXX COMENTA AQUI!!!!
   * aux: ---ALEXX COMENTA AQUI!!!!
   * miCtrlTiempo: Instancia única del controlador del Tiempo. 
   *  
   */
  Timer timer;
  boolean bandera = false;
  boolean bandera1 = false;
  boolean controlParpadeo = true;  
  int mm = 8, m = 8, ss = 8, s = 8;
  int hora, minuto, segundo, aux;
  
  CtrlTiempo miCtrlTiempo;
 
  /**
   * Recibe la instancia única del controlador del tiempo y asigna el tiempo inicial del juego.
   * 
   * @param miCtrlTiempo
   * 
   */
  public Tiempo(CtrlTiempo miCtrlTiempo){
    this.miCtrlTiempo = miCtrlTiempo;
    asignarTiempo();
    
  }
  
  /**
   * ---ALEXX COMENTA AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   */
  public void contar() {
    timer = new Timer();
    
    TimerTask task = new TimerTask() {
      /**
       * ---ALEXX COMENTA AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       */
      public void run() {       
          miCtrlTiempo.setTiempo("/srcImg/img" + mm + ".jpg","/srcImg/img" + m + ".jpg",
              "/srcImg/img" + ss + ".jpg", "/srcImg/img" + s + ".jpg");
          System.out.println("segundo");
          operar();
      }
  };

  TimerTask task2 = new TimerTask() {
      /**
       * ---ALEXX COMENTA AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
       */
      public void run() {
          if(controlParpadeo == false){
              controlParpadeo = true;
              miCtrlTiempo.setPunto("/srcImg/parpadeo1.jpg");
          }else{
              controlParpadeo = false;
              miCtrlTiempo.setPunto("/srcImg/parpadeo2.jpg");
          }
      }
  };
  // Empezamos dentro de 10ms y luego lanzamos la tarea cada 1000ms
  timer.schedule(task, 10, 1000);
  timer.schedule(task2, 10, 500);
  }
  
  /**
   * ---ALEXX COMENTA AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   */
  private void operar(){
    if (bandera == false) {
        mm = m = ss = s = 0;
        bandera = true;
    }
    s ++;
    if(s == 10 ) {
        ss++;
        s = 0;
        if(ss == 6) {
            m++;
            ss = 0;
            if(m == 10){
                mm++;
                m = 0;
            }
        }
    }
}

  /**
   * ---ALEXX COMENTA AQUI!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
   */
  private void asignarTiempo(){
    minuto = 1;
    segundo = 00;

    if (bandera1 == false) {
        if (segundo < 10) {
            StringBuilder sb = new StringBuilder(Integer.toString(segundo));
            sb.insert(0, 0);
            ss = Integer.parseInt(sb.substring(0, 1));
            s = Integer.parseInt(sb.substring(1, 2));
        } else {
            StringBuilder sb = new StringBuilder(Integer.toString(segundo));
            ss = Integer.parseInt(sb.substring(0, 1));
            s = Integer.parseInt(sb.substring(1, 2));
        }
        if (minuto < 10) {
            StringBuilder sb = new StringBuilder(Integer.toString(minuto));
            sb.insert(0, 0);
            mm = Integer.parseInt(sb.substring(0, 1));
            m = Integer.parseInt(sb.substring(1, 2));
        } else {
            StringBuilder sb = new StringBuilder(Integer.toString(minuto));
            mm = Integer.parseInt(sb.substring(0, 1));
            m = Integer.parseInt(sb.substring(1, 2));
        }
        bandera = true;
    }
  }
}
