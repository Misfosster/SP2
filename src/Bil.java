public abstract class Bil {

    int regNr;
    String mærke;
    String model;
    int årgang;
    int antalDøre;

    public Bil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre) {
        this.regNr = _regNr;
        this.mærke = _mærke;
        this.model = _model;
        this.årgang = _årgang;
        this.antalDøre = _antalDøre;
    }

    public abstract double beregnGrønEjerafgift();

    public int getRegNr() {
        return regNr;
    }

    public void setRegNr(int regNr) {
        this.regNr = regNr;
    }

    public String getMærke() {
        return mærke;
    }

    public void setMærke(String mærke) {
        this.mærke = mærke;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getÅrgang() {
        return årgang;
    }

    public void setÅrgang(int årgang) {
        this.årgang = årgang;
    }

    public int getAntalDøre() {
        return antalDøre;
    }

    public void setAntalDøre(int antalDøre) {
        this.antalDøre = antalDøre;
    }
}
