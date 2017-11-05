package pes.comunidad.modelo;

public class Equipo {

	private Integer id;
	private String nombre;
	private Integer ranking;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public Integer getRanking() {
		return ranking;
	}
	
	public void setRanking(Integer ranking) {
		this.ranking = ranking;
	}
	
	public static Equipo crear() {
		return new Equipo();
	}
	
	public Equipo conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public Equipo conRanking(Integer ranking) {
		this.ranking = ranking;
		return this;
	}
	
}
