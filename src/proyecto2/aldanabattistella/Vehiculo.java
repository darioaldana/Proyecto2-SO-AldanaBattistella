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
    public String id;
    public int qualityLevel; //1, 2, 3 y 4 para refuerzo
    public boolean carroceriaHQ, chasisHQ, motorHQ, ruedasHQ;
    public String empresa;
    public int hq;
    private Vehiculo next;
    public int counter;
    
    public Vehiculo(String empresa, int counter) {
        this.carroceriaHQ = (setQuality(60));
        this.chasisHQ = (setQuality(70));
        this.motorHQ = (setQuality(50));
        this.ruedasHQ = (setQuality(40));
        this.empresa = empresa;
        this.hq = 0;
        this.counter = 0;
        
        this.id = create_id(empresa, counter);
                
        this.qualityLevel = setQualityFinal(carroceriaHQ, chasisHQ, motorHQ, ruedasHQ);
        
//        System.out.println("Carrocería:  " + carroceriaHQ);
//        System.out.println("Chasis:  " + chasisHQ);
//        System.out.println("Motor:  " + motorHQ);
//        System.out.println("Rueda:  " + ruedasHQ);
//        System.out.println("CALIDAD: " + qualityLevel);
//        System.out.println("ID: " + id);
//        System.out.println("");
        
        //PROBANDo
    }
    
    public boolean setQuality(int percentage){
        Random rand = new Random(); 
        int int_random = rand.nextInt(100);
        return int_random<percentage;
    }
    
    public int setQualityFinal(boolean carroceriaHQ, boolean chasisHQ, boolean motorHQ, boolean ruedasHQ){

        if (carroceriaHQ){hq+=2;}
        if (chasisHQ){hq++;}
        if (motorHQ){hq+=3;}
        if (ruedasHQ){hq+=4;}
        
        if (hq >= 8){return 1;} 
        if (hq >= 4 && hq <= 7){return 2;}
        return 3; 
    }
    
    public Vehiculo getNext(){
        return next;
    }
    
    public void setNext(Vehiculo next){
        this.next = next;
    }
    
    public String create_id(String empresa, int counter){
        String id;
        if(empresa.equals("Bugatti")){
            id = "BU";
        }else{
            id="LA";
        }

        String n = Integer.toString(counter+1);
        if (n.length()==1){n="0"+n;}
        id+=n;
        return id; 
        
    }
}
