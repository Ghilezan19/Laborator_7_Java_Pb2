package Pb1;

public class SetTobe extends InstrumentMuzical
{
    private TipTobe tip_tobe;
    private int nr_tobe;
    private int nr_cinele;

    public SetTobe(String producator, int pret, TipTobe tip_tobe, int nr_tobe, int nr_cinele) {
        super(producator, pret);
        this.tip_tobe = tip_tobe;
        this.nr_tobe = nr_tobe;
        this.nr_cinele = nr_cinele;
    }
    public SetTobe()
    {

    }


    public TipTobe getTip_tobe() {
        return tip_tobe;
    }

    public int getNr_tobe() {
        return nr_tobe;
    }

    public int getNr_cinele() {
        return nr_cinele;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip Tobe: " + tip_tobe + ", Nr Tobe: " + nr_tobe + ", Nr Cinele: " + nr_cinele;
    }
}
