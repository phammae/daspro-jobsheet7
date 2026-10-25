import java.util.Scanner;

public class scBisokop17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int totalTiket = 0, hargaTiket = 50000;
        double totalPenjualan = 0;

        while (true) {
            System.out.print("Masukkan jumlah tiket yang dibeli (0 untuk selesai): ");
            int jmlTiket = sc.nextInt();

            if (jmlTiket == 0) {
                System.out.println("Program Selesai, Terimakasih!");
                break;
            }

            if (jmlTiket < 0) {
                System.out.println("Input tidak valid, tolong masukkan jumlah yang valid!");
                continue;
            }

            double diskon = 0;
            if (jmlTiket > 10) {
                diskon = 0.15;
            } else if (jmlTiket > 4) {
                diskon = 0.1;
            }

            double totalHarga = jmlTiket * hargaTiket;
            double hargaDiskon = totalHarga * diskon;
            double totalBayar = totalHarga - hargaDiskon;

            totalTiket += jmlTiket;
            totalPenjualan += totalBayar;
            System.out.println("Total Bayar: Rp." + totalBayar);

            System.out.println("=============LAPORAN PENJUALAN TIKET BISOKOP===============");
            System.out.println("total tiket terjual: " + totalTiket);
            System.out.println("Total pendapatan harian: Rp." + totalPenjualan);
            System.out.println("===========================================================");
        }

        sc.close();
    }
}
