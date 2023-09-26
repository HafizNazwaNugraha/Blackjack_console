import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("======== Selamat Datang di Toko Charlie ========");
        System.out.print("Banyak Pembelian barang : ");
        int barang = scan.nextInt();
        System.out.println("=================================================");
        if (barang < 0) {
            System.out.println("ERROR - Inputan harus lebih dari 0");
        } else {
            if (barang % 7 == 0) {
                int cashback = barang / 7 * 5500;
                System.out.println("Cashback : " + cashback + "RP");
            } else {
                System.out.println("Cashback : -");
            }
            System.out.print("Tambahan Barang : ");
            if (barang > 3 ) {
                int barangTambahan = barang / 3;
                System.out.println(barangTambahan);
                barang += barangTambahan;
            } else {
                System.out.println("-");
            }

            System.out.println("Jumlah barang : " + barang);
        }
    }
}
