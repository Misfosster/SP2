public class Dieselbil extends Bil {

    boolean harPartikelfilter;
    int kmPrL;

    public Dieselbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, boolean _harPartikelfilter, int _kmPrL) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.harPartikelfilter = _harPartikelfilter;
        this.kmPrL = _kmPrL;
    }

    public boolean isHarPartikelfilter() {
        return harPartikelfilter;
    }

    public void setHarPartikelfilter(boolean harPartikelfilter) {
        this.harPartikelfilter = harPartikelfilter;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Dieselbil{" +
                "harPartikelfilter=" + harPartikelfilter +
                ", kmPrl=" + kmPrL +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønEjerafgift() {
        double grønEjerafgift = 0;
        if (kmPrL > 20 && kmPrL < 50) {
            grønEjerafgift = 330 + 130;
        } else if (kmPrL > 15 && kmPrL < 20) {
            grønEjerafgift = 1050 + 1390;
        } else if (kmPrL > 10 && kmPrL < 15) {
            grønEjerafgift = 2340 + 1850;
        } else if (kmPrL > 5 & kmPrL < 10) {
            grønEjerafgift = 5500 + 2770;
        } else if (kmPrL > 5) {
            grønEjerafgift = 10470 + 15260;
        }
        if (harPartikelfilter == false) {
            grønEjerafgift = grønEjerafgift + 1000;
        }
        return grønEjerafgift;
    }
}
