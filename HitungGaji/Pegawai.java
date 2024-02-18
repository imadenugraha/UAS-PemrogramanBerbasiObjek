package HitungGaji;

// Membuat class Pegawai dan mengimplementasikan Interface HitungGajiPegawai
public abstract class Pegawai implements hitungGajiPegawai {
    // Deklarasi variable
    protected int jumlahAnak;
    protected int jamMasuk;
    protected int jamKeluar;
    protected String kodeJabatan;
    protected double gajiPokok;
    protected double transport;
    protected double lemburPerJam;
    protected double tunjanganIstri;
    protected double tunjanganAnak;

    // Membuat constructor
    public Pegawai(String kodeJabatan, double gajiPokok, double transport, double lemburPerJam, double tunjanganIstri, double tunjanganAnak) {
        this.kodeJabatan = kodeJabatan;
        this.gajiPokok = gajiPokok;
        this.transport = transport;
        this.lemburPerJam = lemburPerJam;
        this.tunjanganIstri = tunjanganIstri;
        this.tunjanganAnak = tunjanganAnak;
    }

    // Implementasi method setter
    @Override
    public void setPresensi(int jamMasuk, int jamKeluar) {
        this.jamMasuk = jamMasuk;
        this.jamKeluar = jamKeluar;
    }

    @Override
    public void setJumlahAnak(int jumlahAnak) {
        this.jumlahAnak = jumlahAnak;
    }

    // Implementasi method dendaPresensi
    @Override
    public void totalGajiPokok() {
        double denda = 0;
        if(jamMasuk > 7) {
            denda = (jamMasuk - 7) * 100000;
        }
        if(jamKeluar < 16) {
            denda = (16 - jamKeluar) * 100000;
        }
        this.gajiPokok -= denda;
    }

    // Membuat method abstract tambahanLembur
    @Override
    public abstract double tambahanLembur();

    // Membuat method abstract tambahanTunjanganAnak
    @Override
    public abstract double tambahanTunjanganAnak();

    // Implementasi method infoGaji
    @Override
    public void infoGaji() {
        System.out.println("=======================================");
        System.out.println("Jabatan: Supervisor");
        System.out.println("Gaji Pokok: " + String.format("%.0f", this.gajiPokok));
        System.out.println("Transportasi: " + String.format("%.0f", this.transport));
        System.out.println("Lembur/jam: " + String.format("%.0f", this.lemburPerJam));
        System.out.println("Tunjangan Istri: " + String.format("%.0f", this.tunjanganIstri));
        System.out.println("Tunjangan Anak: " + String.format("%.0f", this.tunjanganAnak));
        System.out.println("Total Gaji: " + String.format("%.0f", (this.gajiPokok + this.transport + this.lemburPerJam + this.tunjanganIstri + this.tunjanganAnak)));
        System.out.println("=======================================");
    }
}
