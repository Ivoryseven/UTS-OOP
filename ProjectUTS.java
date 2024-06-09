package projectuts1;

import java.io.Console;

/**
 * Aplikasi utama untuk mendata pengembalian tiket konser "Disteria Vol 1".
 * Author : I Gede Arya Restyandika Pramana Putra
 * Nim : 2201010325
 */
public class ProjectUTS {
    public static void main(String[] args) {
        DataKeeper dataKeeper = new DataKeeper(5);
        Console console = System.console();

        if (console == null) {
            System.out.println("Tidak ada console tersedia.");
            return;
        }

        while (true) {
            System.out.println("Data Pengembalian Tiket Disteria Vol.10 INSTIKI");
            System.out.println("1. Tambah Pengembalian");
            System.out.println("2. Tampilkan Data");
            System.out.println("3. Edit Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Keluar");

            int pilihan = Integer.parseInt(console.readLine("Pilih opsi: "));

            switch (pilihan) {
                case 1:
                    DataRecord record = new DataRecord(
                        Integer.parseInt(console.readLine("Masukkan Nomor Seri Tiket: ")),
                        console.readLine("Masukkan Nama Mahasiswa: "),
                        console.readLine("Masukkan NIM: "),
                        pilihStatusTiket(console),
                        console.readLine("Masukkan Pembayaran (Kosongkan jika tidak terjual): ")
                    );
                    dataKeeper.tambahRecord(record);
                    break;
                case 2:
                    dataKeeper.tampilkanRecords();
                    break;
                case 3:
                    int nomorSeriTiket = Integer.parseInt(console.readLine("Masukkan Nomor Seri Tiket untuk diperbarui: "));
                    DataRecord recordBaru = new DataRecord(
                        nomorSeriTiket,
                        console.readLine("Masukkan Nama Mahasiswa Baru: "),
                        console.readLine("Masukkan NIM Baru: "),
                        pilihStatusTiket(console),
                        console.readLine("Masukkan Pembayaran Baru (Kosong jika tidak terjual): ")
                    );
                    dataKeeper.perbaruiRecord(nomorSeriTiket, recordBaru);
                    break;
                case 4:
                    nomorSeriTiket = Integer.parseInt(console.readLine("Masukkan Nomor Seri Tiket untuk dihapus: "));
                    dataKeeper.hapusRecord(nomorSeriTiket);
                    break;
                case 5:
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }

    private static String pilihStatusTiket(Console console) {
        String status;
        while (true) {
            String pilihanStatus = console.readLine("Pilih Status Tiket (a. Terjual, b. Tidak Terjual): ");
            if (pilihanStatus.equalsIgnoreCase("a")) {
                status = "Terjual";
                break;
            } else if (pilihanStatus.equalsIgnoreCase("b")) {
                status = "Tidak Terjual";
                break;
            } else {
                System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
        return status;
    }
}
