package HitungGaji;

// Membuat class Karyawan
public class Karyawan extends Pegawai {
    // Membuat constructor
    public Karyawan() {
        super("KRY", 1500000, 250000, 0, 200000, 0);
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
        double total = 60000;
        if(this.jumlahAnak > 1) {
            total = 0;
            total = jumlahAnak * 130000;
            return this.tunjanganAnak = total;
        }
        return this.tunjanganAnak = total;
    }
}
