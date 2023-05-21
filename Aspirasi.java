package uts_pbo;

public class Aspirasi {
    private String nama;
    private String nim;

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public String getNim() {
        return nim;
    }

    public void tentangAspirasi() {
        System.out.println("Keterangan Aspirasi");
    }
}