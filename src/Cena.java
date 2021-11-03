public class Cena {
    public static void main(String [] args){
        //creamos los palillos
        Palillo[] palillos = new Palillo[5];

        for (int i=0; i<palillos.length; i++){
            palillos[i]=new Palillo(i);
        }
        //Creamos los filosofos
        Filosofo[] filosofos = new Filosofo[5];
        for(int i=0; i<filosofos.length; i++){
            filosofos[i]=new Filosofo(i, palillos[i],palillos[(i+1)%5]);
        }
        //Hacemos comer a los filosofos
        for(int i=0;i<filosofos.length;i++){
            filosofos[i].start();
        }
    }
}
