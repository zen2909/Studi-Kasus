package Barang;

import java.util.ArrayList;
import java.util.Scanner;
public class Menu {
    int pilihan;
    private ArrayList<buku> book = new ArrayList<buku>();;

    public Menu() {
        int i = 1;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("MENU");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Edit Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("4. Lihat Buku");
            System.out.println("5. Exit");
            System.out.print("Masukkan Pilihan : ");
            this.pilihan = input.nextInt();
            System.out.println("====================");
            switch (this.pilihan) {
                case 1:
                    this.Arraybuku();
                    break;
                case 2:
                    this.editbuku();
                    break;
                case 3:
                    this.hapusbuku();
                    break;
                case 4:
                    this.Display();
                    break;
                case 5:
                    i = 0;
                    break;
            }
        }while(i>0);
    }

    void Arraybuku() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            book.add(new buku());
            System.out.print("Apakah Ingin Menambah Buku Lagi? (y/t) ");
            String pilih = input.nextLine();
            System.out.println("====================");
            switch (pilih) {
                case "y":
                    i++;
                    break;
                case "t":
                    i = 0;
                    break;
            }
        } while (i>0);
    }

    void Display() {
        int nomor = 1;
        for (int i = 0; i < book.size(); i++) {
            System.out.println("Buku ke - " + nomor);
            System.out.println("====================");
            nomor++;
            book.get(i).cetak();
        }
    }

    void editbuku() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            System.out.print("Masukkan Nomor buku : ");
            int nomor = input.nextInt();
            input.nextLine();
            if ( nomor >= i) {
                book.remove(nomor-1);
                book.add(nomor-1,new buku());
            }
            System.out.print("Apakah Ingin Mengedit Buku Lagi? (y/t) ");
            String pilih = input.nextLine();
            System.out.println("====================");
            switch (pilih) {
                case "y":
                    i++;
                    break;
                case "t":
                    i = 0;
                    break;
            }
        }while(i>0);
    }

    void hapusbuku() {
        Scanner input = new Scanner(System.in);
        int i = 1;
        do {
            System.out.print("Masukkan Nomor buku : ");
            int nomor = input.nextInt();
            input.nextLine();
            if ( nomor >= i) {
                book.remove(nomor - 1);
            }
                System.out.print("Apakah Ingin Menghapus Buku Lagi? (y/t) ");
                String pilih = input.nextLine();
                System.out.println("====================");
                switch (pilih) {
                    case "y":
                        i++;
                        break;
                    case "t":
                        i = 0;
                        break;
                }
            }while (i>0);
        }
    }
