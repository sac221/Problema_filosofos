import java.util.logging.Level;
import java.util.logging.Logger;

public class Filosofo extends Thread{
    private int id_filosofo;
    private Palillo izda, dcha;

    public Filosofo (int id_filosofo, Palillo izda,Palillo dcha){
        this. id_filosofo=id_filosofo;
        this.izda=izda;
        this.dcha=dcha;
    }

    public void run(){
        while(true){
            try{
            izda.agarrarPalillo(id_filosofo);
            dcha.agarrarPalillo(id_filosofo);
            //comer
            dcha.dejarPalillo(id_filosofo);
            izda.dejarPalillo(id_filosofo);
            }catch (InterruptedException exception){
                Logger.getLogger(Filosofo.class.getName()).log(Level.SEVERE, null, exception);
            }
        }
    }
}
