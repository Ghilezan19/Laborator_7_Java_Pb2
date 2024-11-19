package Pb1;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.CLASS)
public abstract class InstrumentMuzical {
    protected String producator;
    protected int pret;

    public InstrumentMuzical(String producator, int pret) {
        this.producator = producator;
        this.pret = pret;
    }

    public InstrumentMuzical() {}
    public String getProducator() {
        return producator;
    }

    public int getPret() {
        return pret;
    }

    @Override
    public String toString() {
        return "Producator: " + producator + ", Pret: " + pret;
    }
}
