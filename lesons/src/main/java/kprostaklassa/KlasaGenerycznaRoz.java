package kprostaklassa;

public class KlasaGenerycznaRoz<T extends Chanel> {
    T pole;

    public KlasaGenerycznaRoz(T pole) {
        this.pole = pole;

    }
    public void  metoda(){
        pole.getNumber();


    }


}
