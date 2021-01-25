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
}
