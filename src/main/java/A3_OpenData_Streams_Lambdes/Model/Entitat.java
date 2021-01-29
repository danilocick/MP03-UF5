package A3_OpenData_Streams_Lambdes.Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "entitat")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class Entitat {
    private String nom;
    private String tipus;
    private String numeroInscripcio;
    private String adreca;
    private String poblacio;
    private String codiPostal;
    private String comarca;
    private String classificacioEspecifica;
    private String telefon;
    private String fax;
    private String adrecaElectronica;
    private String web;
    private VinculacioPartitPolitic vinculacioPartitPolitic;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getTipus() {
        return tipus;
    }

    public void setTipus(String tipus) {
        this.tipus = tipus;
    }

    public String getNumeroInscripcio() {
        return numeroInscripcio;
    }

    public void setNumeroInscripcio(String numeroInscripcio) {
        this.numeroInscripcio = numeroInscripcio;
    }

    public String getAdreca() {
        return adreca;
    }

    public void setAdreca(String adreca) {
        this.adreca = adreca;
    }

    public String getPoblacio() {
        return poblacio;
    }

    public void setPoblacio(String poblacio) {
        this.poblacio = poblacio;
    }

    public String getCodiPostal() {
        return codiPostal;
    }

    public void setCodiPostal(String codiPostal) {
        this.codiPostal = codiPostal;
    }

    public String getComarca() {
        return comarca;
    }

    public void setComarca(String comarca) {
        this.comarca = comarca;
    }

    public String getClassificacioEspecifica() {
        return classificacioEspecifica;
    }

    public void setClassificacioEspecifica(String classificacioEspecifica) {
        this.classificacioEspecifica = classificacioEspecifica;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
    }

    public String getAdrecaElectronica() {
        return adrecaElectronica;
    }

    public void setAdrecaElectronica(String adrecaElectronica) {
        this.adrecaElectronica = adrecaElectronica;
    }

    public String getWeb() {
        return web;
    }

    public void setWeb(String web) {
        this.web = web;
    }

    public VinculacioPartitPolitic getVinculacioPartitPolitic() {
        return vinculacioPartitPolitic;
    }

    public void setVinculacioPartitPolitic(VinculacioPartitPolitic vinculacioPartitPolitic) {
        this.vinculacioPartitPolitic = vinculacioPartitPolitic;
    }

    @Override
    public String toString() {
        return "Entitat{" +
                "nom=" + nom +
                ", tipus=" + tipus +
                ", numeroInscripcio=" + numeroInscripcio +
                ", adreca=" + adreca +
                ", poblacio=" + poblacio +
                ", codiPostal=" + codiPostal +
                ", comarca=" + comarca +
                ", classificacioEspecifica=" + classificacioEspecifica +
                ", telefon=" + telefon +
                ", fax='" + fax +
                ", adrecaElectronica=" + adrecaElectronica +
                ", web=" + web +
                ", vinculacioPartitPolitic=" + vinculacioPartitPolitic +
                '}';
    }
}
