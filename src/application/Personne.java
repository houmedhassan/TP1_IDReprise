package application;

import java.util.Date;
import java.util.List;
import java.util.Map;

import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MapKeyJoinColumn;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Personne {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private Integer id;
	
	private String nom;
	
	@ElementCollection
	@Column(name="LIST_PRENOM")
	private List <String> prenoms;
	
	@ElementCollection
	private Map<TypeAdresse, Adresse> adresses;
	
	@Temporal (TemporalType.DATE)
	private Date dateNaissance;
	private Civilite civilite;
	

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<String> getPrenoms() {
		return prenoms;
	}
	public void setPrenoms(List<String> prenoms) {
		this.prenoms = prenoms;
	}
	public Map<TypeAdresse, Adresse> getAdresses() {
		return adresses;
	}
	public void setAdresses(Map<TypeAdresse, Adresse> adresses) {
		this.adresses = adresses;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public Civilite getCivilite() {
		return civilite;
	}
	public void setCivilite(Civilite civilite) {
		this.civilite = civilite;
	}

}
