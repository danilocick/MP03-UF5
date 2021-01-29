package A3_OpenData_Streams_Lambdes.Model;

import lombok.Data;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "vinculacioPartitPolitic")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
public class VinculacioPartitPolitic {
    private String numeroCensal;
    private String dataAlta;
    private String nomPartit;

    public String getNumeroCensal() {
        return numeroCensal;
    }

    public void setNumeroCensal(String numeroCensal) {
        this.numeroCensal = numeroCensal;
    }

    public String getDataAlta() {
        return dataAlta;
    }

    public void setDataAlta(String dataAlta) {
        this.dataAlta = dataAlta;
    }

    public String getNomPartit() {
        return nomPartit;
    }

    public void setNomPartit(String nomPartit) {
        this.nomPartit = nomPartit;
    }

    @Override
    public String toString() {
        return " numeroCensal=" + numeroCensal +
                ", dataAlta=" + dataAlta +
                ", nomPartit=" + nomPartit +
                '}';
    }
}
