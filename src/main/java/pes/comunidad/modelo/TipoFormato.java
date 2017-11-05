package pes.comunidad.modelo;

import java.util.HashMap;
import java.util.Map;

public enum TipoFormato {

	ELIMINACION_DIRECTA(1, "Eliminacion Directa", 8),
	IDA_Y_VUELTA(2, "Ida y vuelta", 5),
	DOBLE_TRIANGULAR(3, "Doble Triangular", 6),
	DOBLE_VIDA(4, "Doble vida", 4),
	SERIE(5, "Serie", 5);
	
	private Integer id;
	private String descripcion;
	private Integer cantidadDeEquipos;
	
	private static Map<Integer, TipoFormato> tiposDeFormato = new HashMap<>();
	
	static {
		
		for (TipoFormato tipoFormato : values()) {
			tiposDeFormato.put(tipoFormato.id, tipoFormato);
		}
		
	}
	
	private TipoFormato(Integer id, String descripcion, Integer cantidadDeEquipos) {
		this.id = id;
		this.setDescripcion(descripcion);
		this.setCantidadDeEquipos(cantidadDeEquipos);
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
	
}
