package Controller;

import Dao.TrabajoImpl;
import Model.Trabajo;
import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.model.SelectItem;

@Named(value = "TrabajoC") //@ManagedBean
@SessionScoped
public class TrabajoC implements Serializable {

    private TrabajoImpl dao;
    private Trabajo model;
    private List<Trabajo> lstRADTRA;

    private List<SelectItem> listaColores;
    private String[] listaAnimales;
    private Map<String, Object> listaAutos;

    @PostConstruct
    public void init() {
        //lista de colores utilizando la classe SelecItem
        listaColores = new ArrayList<SelectItem>();
        listaColores.add(new SelectItem(1, "1. Azul"));
        listaColores.add(new SelectItem(2, "2. Verde"));
        listaColores.add(new SelectItem(3, "3. Rojo"));
        listaColores.add(new SelectItem(4, "4. Azul"));
        listaColores.add(new SelectItem(5, "5. Amarrillo"));

        //lista de autos utilizando Arrays
        listaAnimales = new String[5];
        listaAnimales[0] = "1. Perro";
        listaAnimales[1] = "2. Gato";
        listaAnimales[2] = "3. Oso";
        listaAnimales[3] = "4. Caballo";
        listaAnimales[4] = "5. Tigre";

        //lista de aves utilizando Map
        listaAutos = new LinkedHashMap<String, Object>();
        listaAutos.put("1. Bmw", "1");
        listaAutos.put("2. Chevrolet", "2");
        listaAutos.put("3. Ford", "3");
        listaAutos.put("4. Fiat", "4");
        listaAutos.put("5. Honda", "5");
    }

    public TrabajoC() {
        model = new Trabajo();
        dao = new TrabajoImpl();
    }

    public void registrar() {
        try {
            dao.registrar(model);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso", " "));
            limpiar();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro Fallido", " "));
            System.out.println("error en registrarC REC" + e.getMessage());
        }
    }

    public void registrarOneMenu() {
        try {
            dao.registrarOneMenu(model);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso", " "));
            limpiar();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro Fallido", " "));
            System.out.println("error en registrarC REC" + e.getMessage());
        }
    }

    public void registrarSpinner() {
        try {
            dao.registrarSpinner(model);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso", " "));
            limpiar();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro Fallido", " "));
            System.out.println("error en registrarC REC" + e.getMessage());
        }
    }
       
    
    public void registrarSlider() {
        try {
            dao.registrarSlider(model);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso", " "));
            limpiar();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro Fallido", " "));
            System.out.println("error en registrarC REC" + e.getMessage());
        }
    }
    
    public void registrarKnob() {
        try {
            dao.registrarKnob(model);
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_INFO, "Registro Exitoso", " "));
            limpiar();
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "Registro Fallido", " "));
            System.out.println("error en registrarC REC" + e.getMessage());
        }
    }
    
    
    
    public void listar() {
        try {
            lstRADTRA = dao.listar();
            System.out.println("Se listo Correctamente ");
        } catch (Exception e) {
            FacesContext.getCurrentInstance().addMessage(null,
                    new FacesMessage(FacesMessage.SEVERITY_FATAL, "ERROR", "REC no Listar"));
            System.out.println("error en listarC REC " + e.getMessage());
        }
    }

    public void limpiar() {
        dao = new TrabajoImpl();
        model = new Trabajo();
    }

    
    
    
    public TrabajoImpl getDao() {
        return dao;
    }

    public void setDao(TrabajoImpl dao) {
        this.dao = dao;
    }

    public Trabajo getModel() {
        return model;
    }

    public void setModel(Trabajo model) {
        this.model = model;
    }

    public List<Trabajo> getLstRADTRA() {
        return lstRADTRA;
    }

    public void setLstRADTRA(List<Trabajo> lstRADTRA) {
        this.lstRADTRA = lstRADTRA;
    }

    public List<SelectItem> getListaColores() {
        return listaColores;
    }

    public void setListaColores(List<SelectItem> listaColores) {
        this.listaColores = listaColores;
    }

    public String[] getListaAnimales() {
        return listaAnimales;
    }

    public void setListaAnimales(String[] listaAnimales) {
        this.listaAnimales = listaAnimales;
    }

    public Map<String, Object> getListaAutos() {
        return listaAutos;
    }

    public void setListaAutos(Map<String, Object> listaAutos) {
        this.listaAutos = listaAutos;
    }

}
