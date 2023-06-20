/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2.aldanabattistella;
import java.util.Random;

/**
 *
 * @author dario
 */
public class Vehiculo {
    public int id; 
    public boolean carroceriaHQ, chasisHQ, motorHQ, ruedasHQ; 
    
    public Vehiculo() {
        
        System.out.println("Carrocería:  " + (setQuality(60)));
        System.out.println("Chasis:  " + (setQuality(60)));
        System.out.println("Motor:  " + (setQuality(60)));
        System.out.println("Rueda:  " + (setQuality(60)));
        
        
    }
    
    public boolean setQuality(int percentage){
        Random rand = new Random(); 
        int int_random = rand.nextInt(100); 
        System.out.println(int_random);
        return int_random<percentage;
    }
    
    
}
