/*
 * PROGRAM BY: -ANA SOFIA LOPERA RIVEROS
 *             -JOHANN NICOLÁS NIETO CÁRDENAS
 *             -LAURA TATIANA RAMOS VILLANUEVA
 */
package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

/**
 *
 * @author nicolasnieto
 */
public class Files {
    
   public void fillFile (int points){
       
        String data; 
        String chain; 
        String chain2="";
        FileWriter archive = null; 
        PrintWriter line = null;  
        
        try{
            archive = new FileWriter("src//model//score.txt",false); //Create the file
            line = new PrintWriter(archive); 
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            chain = points+ ";";
            
            line.println(chain); //Writing in the file
            
      }catch(IOException e){
           System.out.print("ERROR CREATING FILE...");
        }
        finally{
            try{
                if(archive != null){
                    archive.close();
                }
            }catch(IOException e1){
                System.out.print("ERROR CLOSING FILE...");
            }
        }
    }
    public int constant(){
        
        int totalpoints=0;
        File archive = null;  //apuntar al archivo almancenado DD
        FileReader content = null;  //acceder a todo el contenido del archivo
        BufferedReader line = null; //accede linea a linea al contenido

        try {
            archive = new File("src//model//score.txt");
            content = new FileReader(archive);
            line = new BufferedReader(content);
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String chain = ""; //variable captura los datos del archivo
            while ((chain = line.readLine()) != null) { //recorre todo el archivo
            String pts[] = chain.split(";");
               
            totalpoints=Integer.parseInt(pts[0])  ;  
            
            }

        } catch (IOException e) {
            System.out.print("ERROR CREATING FILE...");
            
        } finally {
            try {
                if (content != null) {
                    content.close();
                }
            } catch (IOException e1) {
                System.out.print("ERROR CLOSING FILE...");
            }

        }
        return totalpoints;
    }
}
