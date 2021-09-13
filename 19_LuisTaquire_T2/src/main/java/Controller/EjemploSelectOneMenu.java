/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import Model.Trabajo;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
 
import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.faces.model.SelectItem;
import javax.inject.Named;
 
@Named
@RequestScoped
public class EjemploSelectOneMenu implements Serializable {
 
	private static final long serialVersionUID = 1L;
	
	private String colorFavorito;
	private String animalFavorito;
	private String autoFavorito;
	
        private Trabajo model;
	private List<SelectItem> listaColores;
	private String[] listaAnimales;
	private Map<String, Object> listaAutos;
 
	@PostConstruct
	public void init() {
		//lista de colores utilizando la classe SelecItem
		listaColores = new ArrayList<SelectItem>();
		listaColores.add(new SelectItem("Azul", "1. Azul"));
		listaColores.add(new SelectItem("Verde", "2. Verde"));
		listaColores.add(new SelectItem("Rojo", "3. Rojo"));
		listaColores.add(new SelectItem("Azul", "4. Azul"));
		listaColores.add(new SelectItem("Amarrillo", "5. Amarrillo"));
		
		//lista de autos utilizando Arrays
		listaAnimales = new String[5];
		listaAnimales[0] = "1. Perro";
		listaAnimales[1] = "2. Gato";
		listaAnimales[2] = "3. Oso";
		listaAnimales[3] = "4. Caballo";
		listaAnimales[4] = "5. Tigre";
		
		//lista de aves utilizando Map
		listaAutos = new LinkedHashMap<String,Object>();
		listaAutos.put("1. Bmw", "Bmw"); 
		listaAutos.put("2. Chevrolet", "Chevrolet");
		listaAutos.put("3. Ford", "Ford");
		listaAutos.put("4. Fiat", "Fiat");
		listaAutos.put("5. Honda", "Honda");
	}
 
	public String getColorString() {
		return "Color favorito: " + colorFavorito;
	}
	
	public String getAnimalString() {
		return "Animal favorito: " + animalFavorito;
	}
	
	public String getAutoString() {
		return "Auto favorito: " + autoFavorito;
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
 
	public String getColorFavorito() {
		return colorFavorito;
	}
 
	public void setColorFavorito(String colorFavorito) {
		this.colorFavorito = colorFavorito;
	}
 
	public String getAnimalFavorito() {
		return animalFavorito;
	}
 
	public void setAnimalFavorito(String animalFavorito) {
		this.animalFavorito = animalFavorito;
	}
 
	public String getAutoFavorito() {
		return autoFavorito;
	}
 
	public void setAutoFavorito(String autoFavorito) {
		this.autoFavorito = autoFavorito;
	}

    public Trabajo getModel() {
        return model;
    }

    public void setModel(Trabajo model) {
        this.model = model;
    }
}