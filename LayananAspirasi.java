package uts_pbo;

public class LayananAspirasi extends Aspirasi {
    private String deskripsi;

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    @Override
    public void tentangAspirasi() {
        if (!deskripsi.isEmpty()) {
            System.out.println("Aspirasi Anda Diterima");
        } else {
            System.out.println("Aspirasi Anda Ditolak");

        }
    }
}
