package Model;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

public class Trabajo {

    private Integer IDTRA;
    private String RADTRA;
    private String BOXTRA;
    
    private String ONEATRA;
    private String ONEBTRA;
    private String ONECTRA;
    
    private Integer SPIATRA;
    private Integer SPIBTRA;
    private Integer SLITRA;
    private Integer KNOTRA;

    
    
      // IDTRA    RADTRA    BOXTRA  ONEATRA   ONEBTRA ONECTRA  SPIATRA  SPIBTRA  SLITRA  KNOTRA   ;

    
    
    public void onChange() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Usted Seleccionó: " + KNOTRA, null));
    }
    public Integer getIDTRA() {
        return IDTRA;
    }

    public void setIDTRA(Integer IDTRA) {
        this.IDTRA = IDTRA;
    }

    public String getRADTRA() {
        return RADTRA;
    }

    public void setRADTRA(String RADTRA) {
        this.RADTRA = RADTRA;
    }

    public String getBOXTRA() {
        return BOXTRA;
    }

    public void setBOXTRA(String BOXTRA) {
        this.BOXTRA = BOXTRA;
    }

    public String getONEATRA() {
        return ONEATRA;
    }

    public void setONEATRA(String ONEATRA) {
        this.ONEATRA = ONEATRA;
    }

    public String getONEBTRA() {
        return ONEBTRA;
    }

    public void setONEBTRA(String ONEBTRA) {
        this.ONEBTRA = ONEBTRA;
    }

    public String getONECTRA() {
        return ONECTRA;
    }

    public void setONECTRA(String ONECTRA) {
        this.ONECTRA = ONECTRA;
    }

    public Integer getSPIATRA() {
        return SPIATRA;
    }

    public void setSPIATRA(Integer SPIATRA) {
        this.SPIATRA = SPIATRA;
    }

    public Integer getSPIBTRA() {
        return SPIBTRA;
    }

    public void setSPIBTRA(Integer SPIBTRA) {
        this.SPIBTRA = SPIBTRA;
    }

    public Integer getSLITRA() {
        return SLITRA;
    }

    public void setSLITRA(Integer SLITRA) {
        this.SLITRA = SLITRA;
    }

    public Integer getKNOTRA() {
        return KNOTRA;
    }

    public void setKNOTRA(Integer KNOTRA) {
        this.KNOTRA = KNOTRA;
    }

   
    
 }
    
 
