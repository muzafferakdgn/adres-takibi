package Proje.ödevi;

public class Adres {
    private String il;
    private String ilçe;
    private String mahalle;
    private String cadde;
    private String magazaAdi;  
    
    public Adres() {
        this.il = "Bilgi Girilmedi";
        this.ilçe = "Bilgi Girilmedi";
        this.mahalle = "Bilgi Girilmedi";
        this.cadde = "Bilgi Girilmedi";
        this.magazaAdi = "Bilgi Girilmedi";
    }

    public Adres(String il, String ilçe, String mahalle, String cadde, String magazaAdi) {
        this.il = il;
        this.ilçe = ilçe;
        this.mahalle = mahalle;
        this.cadde = cadde;
        this.magazaAdi = magazaAdi;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlçe() {
        return ilçe;
    }

    public void setIlçe(String ilçe) {
        this.ilçe = ilçe;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public String getCadde() {
        return cadde;
    }

    public void setCadde(String cadde) {
        this.cadde = cadde;
    }

    public String getMagazaAdi() {
        return magazaAdi;
    }

    public void setMagazaAdi(String magazaAdi) {
        this.magazaAdi = magazaAdi;
    } 
}
