package src;

import src.interfeces.perhitungan;

public class jalankanperhitungan {
    public static void main(String[] args, int b, int a, int angka2, int angka1, int angka3, int angka4) {
    int hasil;
    perhitungan s =  new perhitungan(a: 4, b: 6,hasil: 0);
    
    int hasiltambah =s.hitungan(angka1: 4,angka2 : 6);
    System.out.println(hasiltambah);

    int hasilkali = s.kalian(angka3: 4, angka4: 6);
    System.out.println(hasilkali);

    s.printjudul();
    }
}
