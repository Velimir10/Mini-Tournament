package turnirtest;



public class TurnirTest {

    

    public static void main(String[] args) {
  
        Tim bgdonline = new Tim("BGDonLINE");
        bgdonline.addIgraca(new Igrac("Nebojsa", "'shok1ca'", "Ocokoljic"));
        bgdonline.addIgraca(new Igrac("Velimir", "'egzekut0r'", "Atanasovski"));
        bgdonline.addIgraca(new Igrac("Filip", "'philip'", "Jovanovic"));
        bgdonline.addIgraca(new Igrac("Bogdan", "'MASiNA'", "Bogdanovic"));
        bgdonline.addIgraca(new Igrac("Vladimir", "'Zeus'", "Radosavljevic"));
        
        Turnir wcg = new Turnir();
        
        wcg.addTim(bgdonline);
        wcg.addTim(new Tim("fnatic"));
        wcg.addTim(new Tim("SK"));
        wcg.addTim(new Tim("NA/VI"));
        wcg.addTim(new Tim("Virtus.pro"));
        wcg.addTim(new Tim("HSBG"));
        wcg.addTim(new Tim("TEG"));
        wcg.addTim(new Tim("Moscow FIve"));
        wcg.addTim(new Tim("WeMadeFox"));
        wcg.addTim(new Tim("MTW"));
        wcg.addTim(new Tim("Tyloo"));
        wcg.addTim(new Tim("ENTITY"));
        wcg.addTim(new Tim("EvilGeniuses"));
        wcg.addTim(new Tim("HellRaisers"));
        wcg.addTim(new Tim("H2k"));
        wcg.addTim(new Tim("MIBR"));
        
        
        wcg.popuniGrupe();
        wcg.prikaziGrupe();
        
        
       

        
        


       

    }

}
