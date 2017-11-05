package pes.comunidad.modelo;

public class Formato {

	private Integer id;
	private String descripcion;
	private Integer cantidadDeEquipos;
	
	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public String getDescripcion() {
		return descripcion;
	}
	
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	public Integer getCantidadDeEquipos() {
		return cantidadDeEquipos;
	}
	
	public void setCantidadDeEquipos(Integer cantidadDeEquipos) {
		this.cantidadDeEquipos = cantidadDeEquipos;
	}
	
	public static Formato crear() {
		return new Formato();
	}
	
	public Formato conCantidadDeEquipos(Integer cantidadeEquipos) {
		this.cantidadDeEquipos = cantidadeEquipos;
		return this;
	}
}
