package projectuts1;

/**
 * Kelas yang mengelola data tiket konser.
 */
public class DataKeeper {
    private final DataRecord[] records;

    public DataKeeper(int kapasitas) {
        records = new DataRecord[kapasitas];
    }

    public void tambahRecord(DataRecord record) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] == null) {
                records[i] = record;
                System.out.println("Tiket berhasil ditambahkan.");
                return;
            }
        }
        System.out.println("DataKeeper penuh. Tidak dapat menambah lebih banyak tiket.");
    }

    public void tampilkanRecords() {
        for (DataRecord record : records) {
            if (record != null) {
                System.out.println("Nomor Seri Tiket: " + record.getNomorSeriTiket());
                System.out.println("Nama Mahasiswa: " + record.getNamaMahasiswa());
                System.out.println("NIM: " + record.getNIM());
                System.out.println("Status Tiket: " + record.getStatusTiket());
                System.out.println("Pembayaran: " + (record.getStatusTiket().equals("Terjual") ? record.getPembayaran() : "Tidak Ada"));
                System.out.println("Poin SKP: " + record.getPoinSKP());
                System.out.println();
            }
        }
    }

    public void perbaruiRecord(int nomorSeriTiket, DataRecord recordBaru) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null && records[i].getNomorSeriTiket() == nomorSeriTiket) {
                records[i] = recordBaru;
                System.out.println("Tiket berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan.");
    }

    public void hapusRecord(int nomorSeriTiket) {
        for (int i = 0; i < records.length; i++) {
            if (records[i] != null && records[i].getNomorSeriTiket() == nomorSeriTiket) {
                records[i] = null;
                System.out.println("Tiket berhasil dihapus.");
                return;
            }
        }
        System.out.println("Tiket tidak ditemukan.");
    }
}
