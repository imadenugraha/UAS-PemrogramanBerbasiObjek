package HitungGaji;

// Membuat kelas khusus teknisi
public class Teknisi extends Pegawai {
    // Membuat constructor
    public Teknisi() {
        super("TKN", 3000000, 500000, 0, 200000, 0);
        this.lemburPerJam = tambahanLembur();
        this.tunjanganAnak = tambahanTunjanganAnak();
    }

    // Implementasi tambahanLembur
    @Override
    public double tambahanLembur() {
        double total = 0;
        if(this.jamKeluar > 16) {
            total = (this.jamKeluar - 16) * 5000;
            return this.lemburPerJam = total;
        }
        return this.lemburPerJam = total;
    }

    // Implementasi tambahanTunjanganAnak
    @Override
    public double tambahanTunjanganAnak() {
        double total = 75000;
        if(this.jumlahAnak > 1) {
            total = 0;
            total = jumlahAnak * 150000;
            return this.tunjanganAnak = total;
        }
        return this.tunjanganAnak = total;
    }
}
