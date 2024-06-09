package projectuts1;

/**
 * Kelas yang merepresentasikan data tiket konser.
 */
public class DataRecord {
    private int nomorSeriTiket;
    private String namaMahasiswa;
    private String NIM;
    private String statusTiket; // "Terjual" atau "Tidak Terjual"
    private String pembayaran; // Kosong jika tidak terjual
    private int poinSKP; // 10 jika terjual, 0 jika tidak terjual

    public DataRecord(int nomorSeriTiket, String namaMahasiswa, String NIM, String statusTiket, String pembayaran) {
        this.nomorSeriTiket = nomorSeriTiket;
        this.namaMahasiswa = namaMahasiswa;
        this.NIM = NIM;
        this.statusTiket = statusTiket;
        this.pembayaran = pembayaran;
        this.poinSKP = statusTiket.equals("Terjual") ? 10 : 0;
    }

    public int getNomorSeriTiket() {
        return nomorSeriTiket;
    }

    public String getNamaMahasiswa() {
        return namaMahasiswa;
    }

    public String getNIM() {
        return NIM;
    }

    public String getStatusTiket() {
        return statusTiket;
    }

    public String getPembayaran() {
        return pembayaran;
    }

    public int getPoinSKP() {
        return poinSKP;
    }

    public void setNamaMahasiswa(String namaMahasiswa) {
        this.namaMahasiswa = namaMahasiswa;
    }

    public void setNIM(String NIM) {
        this.NIM = NIM;
    }

    public void setStatusTiket(String statusTiket) {
        this.statusTiket = statusTiket;
        this.poinSKP = statusTiket.equals("Terjual") ? 10 : 0;
    }

    public void setPembayaran(String pembayaran) {
        this.pembayaran = pembayaran;
    }
}
