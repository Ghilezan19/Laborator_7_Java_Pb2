package Pb1;

public class Chitara extends InstrumentMuzical
{
    private TipChitara tip_chitara;
    private int nr_corzi;

    public Chitara(String producator, int pret, TipChitara tip_chitara, int nr_corzi) {
        super(producator, pret);
        this.tip_chitara = tip_chitara;
        this.nr_corzi = nr_corzi;
    }
    public Chitara(){}

    public TipChitara getTip_chitara() {
        return tip_chitara;
    }

    public int getNr_corzi() {
        return nr_corzi;
    }

    @Override
    public String toString() {
        return super.toString() + ", Tip Chitara: " + tip_chitara + ", Nr Corzi: " + nr_corzi;
    }
}
