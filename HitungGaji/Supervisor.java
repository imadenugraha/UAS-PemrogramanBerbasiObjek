package HitungGaji;

// Membuat class Supervisor
public class Supervisor extends Pegawai {
    // Membuat constructor
    public Supervisor() {
        super("SPV", 10000000, 1000000, 0, 300000, 0);
        this.lemburPerJam = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (jamKeluar - 16) * 10000;
            return this.lemburPerJam = total;
        }
        return this.lemburPerJam = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 100000;
        if(jumlahAnak > 1) {
            total = 0;
            total = jumlahAnak * 200000;
            return this.tunjanganAnak = total;
        }
        return this.tunjanganAnak = total;
    }
}
