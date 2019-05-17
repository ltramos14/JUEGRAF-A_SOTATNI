/*
 * PROGRAM BY: -ANA SOFIA LOPERA RIVEROS
 *             -JOHANN NICOLÁS NIETO CÁRDENAS
 *             -LAURA TATIANA RAMOS VILLANUEVA
 */
package model;


public class Gamer implements Comparable<Gamer>{
    
    private String name;
    private String  lastName;
    private int points;

    public Gamer(String name, String lastName, int points) {
        this.name = name;
        this.lastName = lastName;
        this.points = points;
    }
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }

    @Override
    public String toString() {
        return "\nPuntos="+points+"\nNombre=" + name + "\nApellido=" + lastName + "\n";
    }
    public String toString2() {
        return ""+points;
    }

    @Override
    public int compareTo(Gamer t) {
       if(points<t.points){
           return 1;
       }
       if(points>t.points){
           return -1;
       }
       return 0;
    }

    
    
}
