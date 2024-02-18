package HitungGaji;

// Membuat class HRD
public class HRD extends Pegawai {
    // Membuat constructor
    public HRD() {
        super("HRD", 5000000, 750000, 0, 250000, 0);
        this.lemburPerJam = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (this.jamKeluar - 16) * 7500;
            return this.lemburPerJam = total;
        }
        return this.lemburPerJam = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 90000;
        if(this.jumlahAnak > 1) {
            total = 0;
            total = jumlahAnak * 190000;
            return this.tunjanganAnak = total;
        }
        return this.tunjanganAnak = total;
    }
}
