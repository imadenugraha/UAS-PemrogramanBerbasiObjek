package HitungGaji;

// Membuat interface hitungGajiPegawai
public interface hitungGajiPegawai {
    void setPresensi(int jamMasuk, int jamKeluar);
    void setJumlahAnak(int jumlahAnak);
    void totalGajiPokok();
    double tambahanLembur();
    double tambahanTunjanganAnak();
    void infoGaji();
}
