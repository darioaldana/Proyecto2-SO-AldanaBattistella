package proyecto2.aldanabattistella;

public class Admin {
    public Cola lambo1, lambo2, lambo3, lambo4, bugatti1, bugatti2, bugatti3, bugatti4;
    public int counterBugatti, counterLambo, cicloCounter;
    
    public Admin(){
        this.lambo1 = new Cola();
        this.lambo2 = new Cola();
        this.lambo3 = new Cola();
        this.lambo4 = new Cola();
        this.bugatti1 = new Cola();
        this.bugatti2 = new Cola();
        this.bugatti3 = new Cola();
        this.bugatti4 = new Cola();
        
        this.cicloCounter = 2;
        this.counterBugatti = 0;
        this.counterLambo = 0;
    }
    
    public void createCars(String empresa){
        if(empresa.equals("Lamborghini")){
            Vehiculo car = new Vehiculo("Lamborghini", this.counterLambo);
            this.counterLambo++;
            queue(car);
        }else{
            Vehiculo car = new Vehiculo("Bugatti", this.counterBugatti);
            this.counterBugatti++;
            queue(car);
        }
        
    }
    
    public void queue(Vehiculo vehiculo){
        if (vehiculo.empresa.equals("Lamborghini")){
            if (vehiculo.qualityLevel==1){
                this.lambo1.agregar(vehiculo);     
            } else if (vehiculo.qualityLevel==2){
                this.lambo2.agregar(vehiculo);
            } else if (vehiculo.qualityLevel==3){
                this.lambo3.agregar(vehiculo);   
            }
        } else {
            if (vehiculo.qualityLevel==1){
                this.bugatti1.agregar(vehiculo);
            } else if (vehiculo.qualityLevel==2){
                this.bugatti2.agregar(vehiculo); 
            } else if (vehiculo.qualityLevel==3){
                this.bugatti3.agregar(vehiculo); 
            }
        }
    }
    
}
