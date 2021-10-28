public class Benzinbil extends Bil {

    int oktanTal;
    int kmPrL;

    public Benzinbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, int _oktanTal, int _kmPrL) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.oktanTal = _oktanTal;
        this.kmPrL = _kmPrL;
    }

    public int getOktanTal() {
        return oktanTal;
    }

    public void setOktanTal(int oktanTal) {
        this.oktanTal = oktanTal;
    }

    public int getKmPrL() {
        return kmPrL;
    }

    public void setKmPrL(int kmPrL) {
        this.kmPrL = kmPrL;
    }

    @Override
    public String toString() {
        return "Benzinbil{" +
                "oktantal=" + oktanTal +
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
            grønEjerafgift = 330;
        } else if (kmPrL > 15 && kmPrL < 20) {
            grønEjerafgift = 1050;
        } else if (kmPrL > 10 && kmPrL < 15) {
            grønEjerafgift = 2340;
        } else if (kmPrL > 5 & kmPrL < 10) {
            grønEjerafgift = 5500;
        } else if (kmPrL > 5) {
            grønEjerafgift = 10470;
        }
        return grønEjerafgift;
    }
}
