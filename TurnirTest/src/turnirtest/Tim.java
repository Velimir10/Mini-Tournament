
package turnirtest;

import java.util.Arrays;

public class Tim {
    private String ime; // Ime tima
    private Igrac[] igraci; // Igraci u timu

    
    // Konstruktor
    public Tim(String ime){
        this.ime = ime;
        igraci = new Igrac[5];
        
    }
    
    
    //Dodaj igraca u tim
    public void addIgraca(Igrac igrac){
        
         for(int i =0; i<igraci.length; i++){
             if(igraci[i] == null){
                 igraci[i] = igrac;
                 break;
             }
        }
   }
    
    
    // Prikazi sve igrace u timu
    public void prikaziTim(){
        System.out.println(ime);
        for (Igrac igraci1 : igraci) {
            System.out.println(igraci1);
        }
    }
    
    
    // Zameni igraca u timu
    public void zameniIgraca(Igrac izbaci, Igrac ubaci){
       for(int i=0; i<igraci.length; i++){
           if(igraci[i].getNickName() == izbaci.getNickName()){
               igraci[i] = ubaci;
               break;
           }
       }
        
    }
    
    // Metod za dobijanje imena tima
    public String getImeTima(){
        return ime;
    }
    
    // String reprezentacija objekta
    @Override
    public String toString(){
        return ime + Arrays.toString(igraci);
       
    }

      
    
}
