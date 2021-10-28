public class Elbil extends Bil {

    int batterikapacitetKWh;
    int maxKm;
    int whPrKm;

    public Elbil(int _regNr, String _mærke, String _model, int _årgang, int _antalDøre, int _batterikapacitetKWh, int _maxKm, int _whPrKm) {
        super(_regNr, _mærke, _model, _årgang, _antalDøre);
        this.batterikapacitetKWh = _batterikapacitetKWh;
        this.maxKm = _maxKm;
        this.whPrKm = _whPrKm;
    }

    public int getBatterikapacitetKWh() {
        return batterikapacitetKWh;
    }

    public void setBatterikapacitetKWh(int batterikapacitetKWh) {
        this.batterikapacitetKWh = batterikapacitetKWh;
    }

    public int getMaxKm() {
        return maxKm;
    }

    public void setMaxKm(int _maxKm) {
        this.maxKm = maxKm;
    }

    public int getWhPrKm() {
        return whPrKm;
    }

    public void setWhPrKm(int whPrKm) {
        this.whPrKm = whPrKm;
    }

    @Override
    public String toString() {
        return "Elbil{" +
                "batterikapacitetKWh=" + batterikapacitetKWh +
                ", maxKm=" + maxKm +
                ", whPrKm=" + whPrKm +
                ", regNr=" + getRegNr() +
                ", mærke='" + getMærke() + '\'' +
                ", model='" + getModel() + '\'' +
                ", årgang=" + getÅrgang() +
                ", antalDøre=" + getAntalDøre() +
                '}';
    }

    public double beregnGrønEjerafgift() {
        double grønEjerafgift = 0;
        double kmPrL = 100 / (whPrKm / 91.25);
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
