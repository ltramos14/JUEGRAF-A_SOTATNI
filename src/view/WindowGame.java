/*
 * PROGRAM BY: -ANA SOFIA LOPERA RIVEROS
 *             -JOHANN NICOLÁS NIETO CÁRDENAS
 *             -LAURA TATIANA RAMOS VILLANUEVA
 */
package view;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import model.TextsGame;

public class WindowGame extends JFrame implements ActionListener{
    
    JLabel sc;
    JLabel score;
    Container container;

    public JLabel getScore() {
        return score;
    }
    
    
	public WindowGame(){
		
		super("JUEGRAFÍA SOTATNI");

		container = getContentPane();
		container.setLayout(null);
                getContentPane().setBackground(new java.awt.Color(0,155,155));

                JLabel etiqueta1 =new JLabel(); 
                ImageIcon imageMap = new ImageIcon("src/view/croquis-del-mapa-de-colombia.png");
                etiqueta1.setBounds(0,0,700,700);
                etiqueta1.setIcon(new ImageIcon(imageMap.getImage().getScaledInstance(700, 700, Image.SCALE_SMOOTH)));
                container.add(etiqueta1);
                
                JLabel etiqueta2 = new JLabel();
                ImageIcon nameCol = new ImageIcon("src/view/colombia-.png");
                etiqueta2.setBounds(450,70,303,150);
                etiqueta2.setIcon(new ImageIcon(nameCol.getImage().getScaledInstance(303, 150, Image.SCALE_SMOOTH)));
                container.add(etiqueta2);
                
                Font font1= new Font("Microsoft New Tai Lue", Font.BOLD,16);
                Font font2= new Font("Broadway", Font.BOLD,16);
                Font font3= new Font("Broadway", Font.BOLD,36);
                
                TextsGame am= new TextsGame("Amazonas");
                am.setFont(font1);
                am.setForeground(Color.yellow);
		container.add(am);
		am.setBounds(800, 20, 100, 20);
                
                TextsGame an= new TextsGame("Antioquia");
                an.setFont(font1);
                an.setForeground(Color.blue);
		container.add(an);
		an.setBounds(800, 60, 100, 20);
                
                TextsGame ara= new TextsGame("Arauca");
                ara.setFont(font1);
                ara.setForeground(Color.orange);
		container.add(ara);
		ara.setBounds(800,100, 80, 20);
                
                TextsGame at= new TextsGame("Atlántico");
                at.setFont(font1);
                at.setForeground(Color.blue);
		container.add(at);
		at.setBounds(800, 140, 100, 20);
                
                TextsGame bol= new TextsGame("Bolívar");
                bol.setFont(font1);
                bol.setForeground(Color.orange);
		container.add(bol);
		bol.setBounds(800, 180, 80, 20);
                
                TextsGame by= new TextsGame("Boyacá");
                by.setFont(font1);
                by.setForeground(Color.pink);
		container.add(by);
		by.setBounds(800, 220, 80, 20);
                
                TextsGame cal= new TextsGame("Caldas");
                cal.setFont(font1);
                cal.setForeground(Color.green);
		container.add(cal);
		cal.setBounds(800, 260,80, 20);
                
                TextsGame caq= new TextsGame("Caquetá");
                caq.setFont(font1);
                caq.setForeground(Color.green);
		container.add(caq);
		caq.setBounds(800, 300, 90, 20);
                
                TextsGame cas= new TextsGame("Casanare");
                cas.setFont(font1);
                cas.setForeground(Color.blue);
		container.add(cas);
		cas.setBounds(800, 340, 100, 20);
                
                TextsGame cau= new TextsGame("Cauca");
                cau.setFont(font1);
                cau.setForeground(Color.orange);
		container.add(cau);
		cau.setBounds(800, 380, 80, 20);
                
                TextsGame ces= new TextsGame("Cesar");
                ces.setFont(font1);
                ces.setForeground(Color.blue);
		container.add(ces);
		ces.setBounds(800, 420, 80, 20);
                
                TextsGame cho= new TextsGame("Chocó");
                cho.setFont(font1);
                cho.setForeground(Color.yellow);
		container.add(cho);
		cho.setBounds(800, 460, 80, 20);
                
                TextsGame cor= new TextsGame("Córdoba");
                cor.setFont(font1);
                cor.setForeground(Color.pink);
		container.add(cor);
		cor.setBounds(800, 500, 100, 20);
                
                TextsGame cun= new TextsGame("Cundinamarca");
                cun.setFont(font1);
                cun.setForeground(Color.orange);
		container.add(cun);
		cun.setBounds(800, 540, 150, 20);
                
                TextsGame gu= new TextsGame("Guainia");
                gu.setFont(font1);
                gu.setForeground(Color.pink);
		container.add(gu);
		gu.setBounds(800, 580, 80, 20);
                
                TextsGame guav= new TextsGame("Guaviare");
                guav.setFont(font1);
                guav.setForeground(Color.orange);
		container.add(guav);
		guav.setBounds(800, 620, 100, 20);
                
                TextsGame hu= new TextsGame("Huila");
                hu.setFont(font1);
                hu.setForeground(Color.blue);
		container.add(hu);
		hu.setBounds(1000, 20, 80, 20);
                
                TextsGame lag= new TextsGame("La Guajira");
                lag.setFont(font1);
                lag.setForeground(Color.pink);
		container.add(lag);
		lag.setBounds(1000, 60, 120, 20);
                
                
                TextsGame mag= new TextsGame("Magdalena");
                mag.setFont(font1);
                mag.setForeground(Color.green);
		container.add(mag);
		mag.setBounds(1000, 100, 120, 20);
                
                
                TextsGame meta= new TextsGame("Meta");
                meta.setFont(font1);
                meta.setForeground(Color.yellow);
		container.add(meta);
		meta.setBounds(1000, 140, 50, 20);
                
                TextsGame nar= new TextsGame("Nariño");
                nar.setFont(font1);
                nar.setForeground(Color.green);
		container.add(nar);
		nar.setBounds(1000, 180, 80, 20);
                
                
                TextsGame norS= new TextsGame("Norte de Santander");
		container.add(norS);
                norS.setFont(font1);
                norS.setForeground(Color.yellow);
		norS.setBounds(1000, 220, 180, 20);
                
                TextsGame puy= new TextsGame("Putumayo");
		container.add(puy);
                puy.setForeground(Color.pink);
                puy.setFont(font1);
		puy.setBounds(1000, 260, 100, 20);
                
                TextsGame quin= new TextsGame("Quindío");
		container.add(quin);
                quin.setFont(font1);
                quin.setForeground(Color.blue);
		quin.setBounds(1000, 300, 80, 20);
                
                TextsGame ris= new TextsGame("Risaralda");
		container.add(ris);
                ris.setFont(font1);
                ris.setForeground(Color.orange);
		ris.setBounds(1000, 340, 150, 20);
                
                
                TextsGame sa= new TextsGame("San Andrés y Providencia");
		container.add(sa);
                sa.setFont(font1);
                sa.setForeground(Color.green);
		sa.setBounds(1000, 380, 250, 20);
                
                
                TextsGame sant= new TextsGame("Santander");
		container.add(sant);
                sant.setFont(font1);
                sant.setForeground(Color.green);
		sant.setBounds(1000, 420, 150, 20);
                
                TextsGame suc= new TextsGame("Sucre");
		container.add(suc);
                suc.setFont(font1);
                suc.setForeground(Color.yellow);
		suc.setBounds(1000, 460, 80, 20);
                
                TextsGame tol= new TextsGame("Tolima");
                tol.setFont(font1);
		container.add(tol);
                tol.setForeground(Color.pink);
		tol.setBounds(1000, 500, 80, 20);
                
                TextsGame vall= new TextsGame("Valle del Cauca");
		container.add(vall);
                vall.setFont(font1);
                vall.setForeground(Color.green);
		vall.setBounds(1000, 540, 180, 20);
                
                TextsGame vaup= new TextsGame("Vaupés");
		container.add(vaup);
                vaup.setFont(font1);
                vaup.setForeground(Color.blue);
		vaup.setBounds(1000, 580, 80, 20);
                
                TextsGame vi= new TextsGame("Vichada");
		container.add(vi);
                vi.setFont(font1);
                vi.setForeground(Color.green);
		vi.setBounds(1000, 620, 80, 20);
               
                
               JButton buBack=new JButton("VOLVER AL INICIO");
               buBack.setBounds(10, 620, 230, 50);
               buBack.setBackground(Color.black);
               buBack.setFont(font2);
               buBack.setForeground(Color.white);
               add(buBack);
               buBack.addActionListener(this);
         
               JLabel et2 =new JLabel(); 
               ImageIcon imageMap2 = new ImageIcon("src/view/score.png");
               et2.setBounds(600,225,700,700);
               et2.setIcon(new ImageIcon(imageMap2.getImage().getScaledInstance(150, 150, Image.SCALE_SMOOTH)));
               container.add(et2);
                
               score= new JLabel("0");
               score.setFont(font3);
               score.setForeground(Color.black);
                container.add(score);
                getContentPane().setComponentZOrder(this.score, 0); // Arriba del todo
	      
	       score.setBounds(625, 580, 150, 60);
              
        }

    @Override
    public void actionPerformed(ActionEvent e) {
        String textButton;
        textButton=e.getActionCommand();
        if(textButton.equals("VOLVER AL INICIO")){
           this.setVisible(false);  
     
        } 
    }
 
        }

