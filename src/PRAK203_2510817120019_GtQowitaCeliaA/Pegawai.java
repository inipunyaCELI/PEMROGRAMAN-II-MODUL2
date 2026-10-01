package PRAK203_2510817120019_GtQowitaCeliaA;

// pada baris ini error karena nama classnya Employee tidak sama dengan nama filenya yaitu Pegawai
// public class Employee {
public class Pegawai {
    public String nama;
//  pada baris ini error karena tipe data char tidak bisa menyimpan kalimat panjang
//  public char asal;
    public String asal;
    public String jabatan;
    public int umur;

    public String getNama() {
        return nama;
    }

    public String getAsal() {
        return asal;
    }

//  Pada baris ini error karena method setJabatan() tidak mempunyai parameter dan variabel j tidak terdefinisikan
//  public void setJabatan() {
//  this.jabatan = j;
//  }
    public void setJabatan(String j) {
        this.jabatan = j;
    }
}
