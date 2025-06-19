package pertemuan1;
class Mahasiswa {
    String Nama = "Lukmanul Hakum";
    String NPM = "2310010398";
    String Jurusan = "Teknologi Informasi";
    String Prodi = "Teknik Informatika";
    String Alamat = "Hulu Sungai Selatan";
    String Hobi = "Membaca dan bermain game";
    int Umur = 20;
      
}

public class DataDiri {
    public static void main(String[] args){
        //Membuat objek Mahasiswa
        Mahasiswa mahasiswa1 = new Mahasiswa();
        
        //Menampilkan
        System.out.println("Nama    :" + mahasiswa1.Nama);
        System.out.println("NPM     :" + mahasiswa1.NPM);
        System.out.println("Jurusan :" + mahasiswa1.Jurusan);
        System.out.println("Prodi   :" + mahasiswa1.Prodi);
        System.out.println("Alamat  :" + mahasiswa1.Alamat);
        System.out.println("Hobi    :" + mahasiswa1.Hobi);
        System.out.println("Umur    :" + mahasiswa1.Umur);
        
        Mahasiswa mahasiswa2 = new Mahasiswa();
    }
}
