
package turnirtest;


public class Igrac {
    private String ime;
    private String prezime;
    private String nickname;
    private boolean raspolozenje;
    
    
    //Constructor
    public Igrac(String ime, String nickname, String prezime){
        this.ime = ime;
        this.nickname = nickname;
        this.prezime = prezime;
    }
    
    // Igrac ume da puca
    public void pucaj(){
        System.out.println(this.nickname+ " puca!!!");
    }
    
    // Igrac ume da skace
    public void skoci(){
        System.out.println(this.nickname+ " je skocio!");
    }
    
    // Igrac ume da trci
    public void trci(){
        System.out.println(this.nickname+ " trci!");
    }
    
    // Raspolozenje igraca
    public void prikaziRaspolozenje(){
        int random = (int)(Math.random() * 2);
        switch(random){
            case 0:
                this.raspolozenje = false;
                System.out.println(this.nickname+ " nije raspolozen. :(");
                break;
            case 1:
                this.raspolozenje = true;
                System.out.println(this.nickname+ " je raspolozen!!! WATCH OUT! :)");
                break;
        }
    }
    
    // Getters
    public String getIme(){
        return this.ime;
    }
    
    public String getNickName(){
        return this.nickname;
    }
    
    public String getPrezime(){
        return this.prezime;
    }
    
    // reprezentacija objekta u String formatu
    @Override
    public String toString(){
        return this.ime + " "+ this.nickname +" "+ this.prezime;
    }
}
