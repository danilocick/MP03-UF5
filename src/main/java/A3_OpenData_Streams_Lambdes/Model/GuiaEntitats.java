package A3_OpenData_Streams_Lambdes.Model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "guiaEntitats")
public class GuiaEntitats {
    private Entitats entitats;

    public Entitats getEntitats() {
        return entitats;
    }

    public void setEntitats(Entitats entitats) {
        this.entitats = entitats;
    }
}
