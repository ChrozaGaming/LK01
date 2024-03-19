import java.util.Scanner;

class BangunDatar {
    public int lebar;
    public int panjang;

    public BangunDatar(int lebar, int panjang) {
        this.lebar = lebar;
        this.panjang = panjang;
    }
}

class Lingkaran {
    public double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    public void hitungLuas() {
        double luas = Math.PI * Math.pow(jarijari, 2);
        System.out.println("Luas Lingkaran: " + luas);
    }

    public void tampilkanData() {
        hitungLuas();
    }
}

class SegiEmpat extends BangunDatar {
    public SegiEmpat(int lebar, int panjang) {
        super(lebar, panjang);
    }

    public void hitungLuas() {
        double luas = lebar * panjang;
        System.out.println("Luas SegiEmpat: " + luas);
    }

    public void hitungKeliling() {
        double keliling = 2 * (lebar + panjang);
        System.out.println("Keliling SegiEmpat: " + keliling);
    }

    public void hitungDiagonal() {
        double diagonal = Math.sqrt(Math.pow(lebar, 2) + Math.pow(panjang, 2));
        System.out.println("Diagonal SegiEmpat: " + diagonal);
    }

    public void tampilkanData() {
        hitungLuas();
        hitungKeliling();
        hitungDiagonal();
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Pilih program: ");
        System.out.println("1. Lingkaran");
        System.out.println("2. SegiEmpat");
        int pilihan = scanner.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Masukkan jarijari lingkaran: ");
                double jarijariLingkaran = scanner.nextDouble();
                Lingkaran lingkaran = new Lingkaran(jarijariLingkaran);
                lingkaran.tampilkanData();
                break;
            case 2:
                System.out.println("Masukkan lebar segiempat: ");
                int lebarSegiEmpat = scanner.nextInt();
                System.out.println("Masukkan panjang segiempat: ");
                int panjangSegiEmpat = scanner.nextInt();
                SegiEmpat segiEmpat = new SegiEmpat(lebarSegiEmpat, panjangSegiEmpat);
                segiEmpat.tampilkanData();
                break;
            default:
                System.out.println("Pilihan tidak tersedia");
        }
        scanner.close();
    }
}