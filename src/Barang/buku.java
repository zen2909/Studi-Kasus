package Barang;

import java.util.ArrayList;
import java.util.Scanner;
public class buku {
    private String namabuku,pencipta;
    private int tahunterbit;

    public buku(){
        this.namabuku = getNamabuku();
        this.pencipta = getPencipta();
        this.tahunterbit = getTahunterbit();
        this.Tambahbuku();

    }
    public void setNamabuku(String namabuku){
        this.namabuku = namabuku;
    }
    public void setPencipta(String pencipta){

        this.pencipta = pencipta;
    }
    public void setTahunterbit(int tahunterbit){

        this.tahunterbit = tahunterbit;
    }

    public String getNamabuku() {

        return namabuku;
    }
    public String getPencipta(){

        return pencipta;
    }
    public int getTahunterbit() {

        return tahunterbit;
    }

    void cetak(){
        System.out.println("Judul : "+this.namabuku);
        System.out.println("Penulis : "+this.pencipta);
        System.out.println("Tahun Terbit : "+this.tahunterbit);
        System.out.println("====================");
    }

    void Tambahbuku() {
        Scanner input = new Scanner(System.in);
        
        for (int i = 0; i < 100; i++) {
            System.out.print("Judul : ");
            String judul = input.nextLine();
            System.out.print("Penulis : ");
            String pengarang = input.nextLine();
            System.out.print("Tahun Terbit : ");
            int tahun = input.nextInt();
            setNamabuku(judul);
            setPencipta(pengarang);
            setTahunterbit(tahun);
            System.out.println("====================");

            i = 100;
        }

    }
}
