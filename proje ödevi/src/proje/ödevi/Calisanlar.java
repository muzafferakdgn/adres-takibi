package Proje.ödevi;

public class Calisanlar {
    
    private String adi;
    private String soyadi;
    private String departmani;
    private int maasi;
    
    public Calisanlar() {
        
        this.adi = " ";
        this.soyadi = " ";
        this.departmani = " ";
        this.maasi = 0;   
}

    public Calisanlar(String adi, String soyadi, String departmani, int maasi) {
        this.adi = adi;
        this.soyadi = soyadi;
        this.departmani = departmani;
        this.maasi = maasi;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public String getSoyadi() {
        return soyadi;
    }

    public void setSoyadi(String soyadi) {
        this.soyadi = soyadi;
    }

    public String getDepartmani() {
        return departmani;
    }

    public void setDepartmani(String departmani) {
        this.departmani = departmani;
    }

    public int getMaasi() {
        return maasi;
    }

    public void setMaasi(int maasi) {
        this.maasi = maasi;
    }
}