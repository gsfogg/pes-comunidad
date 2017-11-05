package pes.comunidad.modelo;

import java.util.List;

import org.joda.time.DateTime;

public class Torneo {

	private Integer id;
	private String nombre;
	private DateTime fecha;
	private Formato formato;
	private List<Equipo> equipos;
	
	public Cuadro sortear() {
		
		Cuadro cuadro = new Cuadro();
		cuadro.setTipoCuadro(this.formato.getDescripcion());
		return cuadro;
	}
	
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
	
	public DateTime getFecha() {
		return fecha;
	}
	
	public void setFecha(DateTime fecha) {
		this.fecha = fecha;
	}
	
	public Formato getFormato() {
		return formato;
	}
	
	public void setFormato(Formato formato) {
		this.formato = formato;
	}
	
	public List<Equipo> getEquipos() {
		return equipos;
	}
	
	public void setEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
	}
	
	public static Torneo crear() {
		return new Torneo();
	}
	
	public Torneo conNombre(String nombre) {
		this.nombre = nombre;
		return this;
	}
	
	public Torneo conEquipos(List<Equipo> equipos) {
		this.equipos = equipos;
		return this;
	}
	
	public Torneo conFormato(Formato formato) {
		this.formato = formato;
		return this;
	}
	
}
