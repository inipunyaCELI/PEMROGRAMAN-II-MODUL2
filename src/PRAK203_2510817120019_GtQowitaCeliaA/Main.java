package PRAK203_2510817120019_GtQowitaCeliaA;

public class Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai();

//      pada baris ini error karena kurangnya tanda titik koma ; di akhir statemen
//      p1.nama = "Roi"
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assassin");
//      pada baris inni error karena atribut umur belum diinisialisasi sehingga nilainya 0 dan perlu di beeri nilai 17
        p1.umur = 17;
//      pada baris ini error karena teks namaPegawai tidak sama dengab output yang diminta
//      System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Nama: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
//      System.out.println("Umur: " + p1.umur);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}
