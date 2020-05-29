package CicilanCalculator.src;

public class Cicilan {
    private int hargaAwal;
    private int durasiCicilan;
    private double bunga;

    public Cicilan(int hargaAwal, int durasiCicilan, double bunga) {
        setHargaAwal(hargaAwal);
        setDurasiCicilan(durasiCicilan);
        setBunga(bunga);
    }

    public int getHargaAwal() {
        return hargaAwal;
    }

    private void setHargaAwal(int hargaAwal) {
        if (hargaAwal < 1_000_000) {
            throw new IllegalArgumentException("HargaAwal cannot be below 1.000.000");
        }
        this.hargaAwal = hargaAwal;
    }

    public int getDurasiCicilan() {
        return durasiCicilan;
    }

    private void setDurasiCicilan(int durasiCicilan) {
        if (durasiCicilan < 1 ) {
            throw new IllegalArgumentException("durasiCicilan cannot be below 1 Tahun");
        }
        this.durasiCicilan = durasiCicilan;
    }

    public double getBunga() {
        return bunga;
    }

    private void setBunga(double bunga) {
        if (bunga < 0) {
            throw new IllegalArgumentException("Bunga cannot be below 0");
        }
        this.bunga = bunga;
    }
}