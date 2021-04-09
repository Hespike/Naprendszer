public class Bolygo {
    int tavolsag;
    double keringesiSebesseg;
    double forgasiIdo;

    int napokSzamaEvenkent() {
        double K = tavolsag * Math.PI * 2;
        double t = K / keringesiSebesseg;
        double result = t / (forgasiIdo * 60);
        return (int) result;
    }
}
