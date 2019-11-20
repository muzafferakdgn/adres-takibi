package Proje.ödevi;

import java.util.ArrayList;

public class Magazalar extends Adres {
    
    private String amacı;
    private String calismaSaatleri;
    private ArrayList<Calisanlar> calisanlar_liste = new ArrayList<Calisanlar>();
    public Magazalar(){
        this.amacı = "Bilgi Girilmedi";
        this.calismaSaatleri = "Bilgi Girilmedi";
    }

    public Magazalar(String amacı, String calismaSaatleri) {
        this.amacı = amacı;
        this.calismaSaatleri = calismaSaatleri;
    }

    public Magazalar(String amacı, String calismaSaatleri, String il, String ilçe, String mahalle, String cadde, String magazaAdi) {
        super(il, ilçe, mahalle, cadde, magazaAdi);
        this.amacı = amacı;
        this.calismaSaatleri = calismaSaatleri;
    }

    public ArrayList<Calisanlar> getCalisanlar_liste() {
        return calisanlar_liste;
    }

    public String getAmacı() {
        return amacı;
    }

    public void setAmacı(String amacı) {
        this.amacı = amacı;
    }

    public String getCalismaSaatleri() {
        return calismaSaatleri;
    }

    public void setCalismaSaatleri(String calismaSaatleri) {
        this.calismaSaatleri = calismaSaatleri;
    }
}