/*
 * PROGRAM BY: -ANA SOFIA LOPERA RIVEROS
 *             -JOHANN NICOLÁS NIETO CÁRDENAS
 *             -LAURA TATIANA RAMOS VILLANUEVA
 */
package model;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.WindowGame;


public class TextsGame extends JLabel implements MouseMotionListener,MouseListener{
	
        String textLabel;
	int points=0, newPoints;
        
        Files fi = new Files();
        
        
        public TextsGame(String text){
		super.setText(text);
                textLabel = super.getText();
		addMouseMotionListener(this);
                addMouseListener(this);        
	}


        @Override
        public void mouseDragged(MouseEvent mme) {
	  setLocation(this.getX() + mme.getX() - this.getWidth() / 2, this.getY() + mme.getY() - this.getHeight() / 2);    
        }

        
        @Override
        public void mouseReleased(MouseEvent me) {
 
                setLocation(this.getX() + me.getX() - this.getWidth() / 2, this.getY() + me.getY() - this.getHeight() / 2);
                
                
                //Label de San Andrés y providencia
                if (textLabel.equalsIgnoreCase("SAN ANDRÉS Y PROVIDENCIA")){
                   
                   if (getX()<50 && getY()<110){
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                   clip.play();   
                   
                   Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                   JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   
                   IPoints san= new Correct();
                   newPoints=san.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                   WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
               
                   } else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints san2= new Incorrect();
                   newPoints=san2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("AMAZONAS")){
                  
                    if ((getX()>300 && getX()<500)&& (getY()>500&&getY()<600)){
                        
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints ama= new Correct();
                      newPoints=ama.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                      
                        WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                        JPanel panel = (JPanel)getParent();
                        window.getScore().setText(""+ newPoints);
                        panel.repaint();
                        

                    }else{
                  
                        AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                        clip.play();
                        Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                        JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                        IPoints ama2= new Incorrect();
                        newPoints=ama2.contable(points);
                        newPoints=newPoints+fi.constant();
                        fi.fillFile(newPoints);
                         WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                        JPanel panel = (JPanel)getParent();
                        window.getScore().setText(""+ newPoints);
                        panel.repaint();
                        
                    }
                    
                }else if (textLabel.equalsIgnoreCase("ANTIOQUIA")){
                   
                    if ((getX()>100&& getX()<300)&& (getY()>200&&getY()<270)){
                      
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints ant= new Correct();
                      newPoints=ant.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                      
                    } else{
                    AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                    clip.play();
                    Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                    JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    IPoints ant2= new Incorrect();
                    newPoints=ant2.contable(points);
                    newPoints=newPoints+fi.constant();
                    fi.fillFile(newPoints);
                     WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                    JPanel panel = (JPanel)getParent();
                    window.getScore().setText(""+ newPoints);
                    panel.repaint();
                    }
                    
                }else if (textLabel.equalsIgnoreCase("Arauca")){
                    
                   if ((getX()>360&& getX()<470)&& (getY()>220&&getY()<250)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints ara= new Correct();
                      newPoints=ara.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                   
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints ara2= new Incorrect();
                   newPoints=ara2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("ATLÁNTICO")){
                    
                   if ((getX()>200&& getX()<250)&& (getY()>50&&getY()<80)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints atl= new Correct();
                      newPoints=atl.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   
                   }else{
                   
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints atl2= new Incorrect();
                   newPoints=atl2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("BOLÍVAR")){
                    
                   if ((getX()>250&& getX()<290)&& (getY()>140&&getY()<210)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints bol= new Correct();
                      newPoints=bol.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints bol2= new Incorrect();
                   newPoints=bol2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("BOYACÁ")){
                    
                   if ((getX()>280&& getX()<340)&& (getY()>250&&getY()<300)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints boy= new Correct();
                      newPoints=boy.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                     WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints boy2= new Incorrect();
                   newPoints=boy2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                   JPanel panel = (JPanel)getParent();
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("CALDAS")){
                    
                   if ((getX()>150&& getX()<250)&& (getY()>280&&getY()<300)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints cal= new Correct();
                      newPoints=cal.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                      JPanel panel = (JPanel)getParent();
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                    AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints cal2= new Incorrect();
                   newPoints=cal2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints); 
     
                   JPanel panel = (JPanel)getParent();
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("CAQUETÁ")){
                    
                   if ((getX()>150&& getX()<400)&& getY()>440&&getY()<520){
                      
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints caq= new Correct();
                      newPoints=caq.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                   
                      JPanel panel = (JPanel)getParent();
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);IPoints caq2= new Incorrect();
                   newPoints=caq2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints); 
                   WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("CASANARE")){
                    
                   if ((getX()>360&& getX()<450)&& (getY()>250&&getY()<320)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints cas= new Correct();
                      newPoints=cas.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
        
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                    JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    IPoints cas2= new Incorrect();
                   newPoints=cas2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                   WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Cauca")){
                    
                   if ((getX()>80&& getX()<150)&& (getY()>370&&getY()<460)){
                   
                     AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints cau= new Correct();
                      newPoints=cau.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                       JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints cau2= new Incorrect();
                   newPoints=cau2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("CESAR")){
                    
                   if ((getX()>280&& getX()<340)&& (getY()>60&&getY()<180)){
                  
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints ces= new Correct();
                      newPoints=ces.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints ces2= new Incorrect();
                   newPoints=ces2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Chocó")){
                    
                   if ((getX()>80&& getX()<130)&& (getY()>200&&getY()<340)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints cho= new Correct();
                      newPoints=cho.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints cho2= new Incorrect();
                   newPoints=cho2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }
                else if (textLabel.equalsIgnoreCase("Córdoba")){
                    
                   if ((getX()>150&& getX()<200)&& (getY()>120&&getY()<200)){
                    
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints cor= new Correct();
                      newPoints=cor.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                      WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                     window.getScore().setText(""+ newPoints);
                     panel.repaint();
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints cor2= new Incorrect();
                   newPoints=cor2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Cundinamarca")){
                   
                   if ((getX()>200&& getX()<300)&& (getY()>270&&getY()<340)){
                     
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                        IPoints cun= new Correct();
                        newPoints=cun.contable(points);
                        newPoints=newPoints+fi.constant();
                        fi.fillFile(newPoints);
                         WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints cun2= new Incorrect();
                   newPoints=cun2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Guainia")){
                  
                   if ((getX()>470&& getX()<620)&& (getY()>350&&getY()<440)){
                
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints gua= new Correct();
                      newPoints=gua.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints gua2= new Incorrect();
                   newPoints=gua2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }
                else if (textLabel.equalsIgnoreCase("GUAVIARE")){
                   
                    if ((getX()>300&& getX()<420)&& (getY()>390&&getY()<460)){
                     
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints guav= new Correct();
                      newPoints=guav.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                  
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints guav2= new Incorrect();
                   newPoints=guav2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                    
                }else if (textLabel.equalsIgnoreCase("HUILA")){
                    
                   if ((getX()>180&& getX()<220)&& (getY()>360&&getY()<460)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints hui= new Correct();
                      newPoints=hui.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints guav2= new Incorrect();
                   newPoints=guav2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("LA GUAJIRA")){
                   
                   if ((getX()>300&& getX()<400)&& (getY()<80)){
                     
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints laGua= new Correct();
                      newPoints=laGua.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints laGua2= new Incorrect();
                   newPoints=laGua2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
               
                }else if (textLabel.equalsIgnoreCase("MAGDALENA")){
                   
                   if ((getX()>200&& getX()<300)&& (getY()>50&&getY()<120)){
                   
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints mag= new Correct();
                      newPoints=mag.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints mag2= new Incorrect();
                   newPoints=mag2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("META")){
                   
                  if ((getX()>240&& getX()<410)&& (getY()>330&&getY()<400)){
                   
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints met= new Correct();
                      newPoints=met.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                      
                   
                   }else{
                      
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints met2= new Incorrect();
                   newPoints=met2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                    
                }else if (textLabel.equalsIgnoreCase("Nariño")){
                   
                    if ((getX()>30&& getX()<100)&& (getY()>400&&getY()<480)){
                  
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints nar= new Correct();
                      newPoints=nar.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                      WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                        
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints nar= new Incorrect();
                   newPoints=nar.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                    
                }else if (textLabel.equalsIgnoreCase("NORTE DE SANTANDER")){
                   
                   if ((getX()>320&& getX()<360)&& (getY()>130&&getY()<230)){
                   
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints norts= new Correct();
                      newPoints=norts.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints nort2= new Incorrect();
                   newPoints=nort2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Putumayo")){
                   
                   if  ((getX()>100&& getX()<230)&& (getY()>460&&getY()<520)){
                 
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints put= new Correct();
                      newPoints=put.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints put2= new Incorrect();
                   newPoints=put2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Quindío")){
                   
                    if ((getX()>190&& getX()<210)&& (getY()>320&&getY()<340)){
                  
                        AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints qui= new Correct();
                      newPoints=qui.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                      
                      
                   }else{
                        
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints qui2= new Incorrect();
                   newPoints=qui2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                    
                }else if (textLabel.equalsIgnoreCase("Risaralda")){
                   
                   if ((getX()>160&& getX()<200)&& (getY()>280&&getY()<320)){
                   
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints ris= new Correct();
                      newPoints=ris.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints ris2= new Incorrect();
                   newPoints=ris2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("SANTANDER")){
                   
                   if ((getX()>270&& getX()<320)&& (getY()>200&&getY()<270)){
              
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints sant= new Correct();
                      newPoints=sant.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                  
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints sant2= new Incorrect();
                   newPoints=sant2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Sucre")){
                    
                   if ((getX()>200&& getX()<240)&& (getY()>100&&getY()<160)){
                   
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints suc= new Correct();
                      newPoints=suc.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                      
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints suc2= new Incorrect();
                   newPoints=suc2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Tolima")){
                   
                   if  ((getX()>130&& getX()<230)&& (getY()>290&&getY()<370)){
                   
                       AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints tol= new Correct();
                      newPoints=tol.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints tol2= new Incorrect();
                   newPoints=tol2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   
                   }
                   
                }else if (textLabel.equalsIgnoreCase("Valle del Cauca")){
                   
                    if ((getX()>90&& getX()<180)&& (getY()>320&&getY()<380)){
                   
                        AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints val= new Correct();
                      newPoints=val.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                        
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints val2= new Incorrect();
                   newPoints=val2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                    
                }else if (textLabel.equalsIgnoreCase("Vaupés")){
                    
                   if ((getX()>400&& getX()<510)&& getY()>420&&getY()<530){
                 
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints vau= new Correct();
                      newPoints=vau.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                   
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints vau2= new Incorrect();
                   newPoints=vau2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                   
                }else if (textLabel.equalsIgnoreCase("VICHADA")){
                   
                   if ((getX()>440&& getX()<560)&& (getY()>270&&getY()<380)){
                  
                      AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/correcta.wav"));
                      clip.play();
                   
                      Icon image = new ImageIcon(getClass().getResource("correcto_1.png"));
                      JOptionPane.showMessageDialog(labelFor,"CORRECT\nVERY GOOD!!!","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                    
                      IPoints vic= new Correct();
                      newPoints=vic.contable(points);
                      newPoints=newPoints+fi.constant();
                      fi.fillFile(newPoints);
                       WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                      JPanel panel = (JPanel)getParent();
                      window.getScore().setText(""+ newPoints);
                      panel.repaint();
                   
                   }else{
                       
                   AudioClip clip = Applet.newAudioClip(getClass().getResource("/model/incorrecta.wav"));
                   clip.play();
                   Icon image = new ImageIcon(getClass().getResource("incorrecto.png"));
                   JOptionPane.showMessageDialog(labelFor,"INCORRECT\nKEEP TRYING","MESSAGE",JOptionPane.INFORMATION_MESSAGE,image);
                   IPoints vic2= new Correct();
                   newPoints=vic2.contable(points);
                   newPoints=newPoints+fi.constant();
                   fi.fillFile(newPoints);
                    WindowGame window = (WindowGame)(getParent().getParent().getParent().getParent());
                   JPanel panel = (JPanel)getParent();
                   window.getScore().setText(""+ newPoints);
                   panel.repaint();
                   }
                }
                
                   //System.out.println(""+newPoints);                
        }

    @Override
    public void mouseMoved(MouseEvent me) {
       
}
    @Override
    public void mouseClicked(MouseEvent me) {
    
}

    @Override
    public void mousePressed(MouseEvent me) {
        
    }

    @Override
    public void mouseEntered(MouseEvent me) {  
    }

    @Override
    public void mouseExited(MouseEvent me) {
         }
}
