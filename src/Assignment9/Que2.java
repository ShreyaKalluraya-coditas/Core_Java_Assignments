package Assignment9;

abstract class Instrument{
    abstract public void play();
}

class Piano extends Instrument{
    public void play(){
        System.out.println("Piano is playing tan tan tan");
    }
}
class Flute extends Instrument{
    public void play(){
        System.out.println("Flute is playing toot toot toot");
    }
}
class Guitar extends Instrument{
    public void play(){
        System.out.println("Guitar is playing tin tin tin");
    }
}


public class Que2 {
    public static void main(String[] args){
        Guitar g = new Guitar();
        Piano p = new Piano();
        Flute f = new Flute();
        g.play();
        p.play();
        f.play();

        Instrument[]  arrInstruments  = new Instrument[9] ;

        arrInstruments[0]= new Guitar() ;
        arrInstruments[1]= new Guitar() ;
        arrInstruments[2]= new Guitar() ;

        arrInstruments[3]= new Piano() ;
        arrInstruments[4]= new Piano() ;
        arrInstruments[5]= new Piano() ;

        arrInstruments[6] = new Flute();
        arrInstruments[7] = new Flute();
        arrInstruments[8] = new Flute();
        for (int i=0;i<9;i++) {
            arrInstruments[i].play();
        }
    }
}
