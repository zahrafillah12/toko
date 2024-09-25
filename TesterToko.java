package Toko;

import java.util.Scanner;

public class TesterToko {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Berapa jumlah objek? (max 10)");
        int jumlah = in.nextInt();
        // condition lengkapi >10 atau < 1 tidak dijalankan
        if (jumlah < 1 || jumlah > 10 ) {
            System.out.println("input salah");
        }
        for(int i=0; i<jumlah;i++){
            try {
                System.out.println("Silahkan pilih 1 untuk membuat CD atau 2 untuk membuat DVD");
                int pilihan = in.nextInt();
                if (pilihan == 1) {
                    CD c = new CD();
                    c.print();
                } else if (pilihan == 2) {
                    DVD d = new DVD();
                    d.print();
                } else {
                    System.out.println("pilihan tersebut tidak ada di data kami");
                }
            } catch (Exception e) {
                System.out.println("Tipe Data salah, hanya menerima angka");
            }
        }
            in.close();
        
    }
        // mencegah error karna tipe data tidak sesuai

    }


