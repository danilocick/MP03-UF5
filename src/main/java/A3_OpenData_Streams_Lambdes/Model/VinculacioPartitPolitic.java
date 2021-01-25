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
}
