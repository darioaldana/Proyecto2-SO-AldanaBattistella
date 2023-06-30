package proyecto2.aldanabattistella;

import java.util.Random;

public class IA {
    
    public String winner(Vehiculo bu, Vehiculo la){
        int valor = resultado();
        System.out.println(valor);
        if(valor<=40){
            
            if(bu.hq == la.hq){
                if(ganador(50)){
                    return "bu";
                }
                return "la";
            }else if(bu.hq > la.hq){
                int diferencia = bu.hq-la.hq;
                if(defWinner(diferencia)){
                    return "bu";
                }
                return "la";
            }else{
                int diferencia = la.hq-bu.hq;
                if(defWinner(diferencia)){
                    return "la";
                }
                return "bu";
            }
            
        }else if(valor>40 && valor<=67){
            return "empate";
        }else{
            return "refuerzo";
        }
    }
    
    public int resultado(){
        Random rand = new Random(); 
        int int_random = rand.nextInt(100);
        return int_random;
    }
    
    public boolean ganador(int percentage){
        Random rand = new Random(); 
        int int_random = rand.nextInt(100);
        return int_random<percentage;
    }
    
    public boolean defWinner(int diferencia){
        if(diferencia==9){
            if(resultado()==7){
                return false;
            }
            return true;
        }else if(diferencia<9 && diferencia>=6){
            if(ganador(90)){
                return true;
            }
            return false;
        }else if(diferencia == 10){
            return true;
        }else if(diferencia<6 && diferencia>=3){
            if(ganador(70)){
                return true;
            }
            return false;
        }else{
            if(ganador(55)){
                return true;
            }
            return false;
        }
    }
}
