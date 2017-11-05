package pes.comunidad.sorteo;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import pes.comunidad.modelo.Cuadro;
import pes.comunidad.modelo.Equipo;
import pes.comunidad.modelo.Formato;
import pes.comunidad.modelo.TipoFormato;
import pes.comunidad.modelo.Torneo;
import pes.comunidad.util.Constantes;

public class SorteoTest implements Constantes {

	@Test
	public void elCuadroNoEsNuloAlSortearEliminacionDirecta() {
		
		Cuadro cuadro = inicializarTorneo(TipoFormato.ELIMINACION_DIRECTA.getDescripcion()).sortear();
		
		assertNotNull(cuadro);
		assertEquals(cuadro.getTipoCuadro(), TipoFormato.ELIMINACION_DIRECTA.getDescripcion());
	}

	private Torneo inicializarTorneo(String tipoFormato) {
		
		List<Equipo> equipos = Arrays.asList(Equipo.crear().conNombre(HOLANDA).conRanking(1),
											 Equipo.crear().conNombre(INGLATERRA).conRanking(2),
											 Equipo.crear().conNombre(ESPAÑA).conRanking(3),
											 Equipo.crear().conNombre(ITALIA).conRanking(4)
											);
		
		Formato formato = Formato.crear().conDescripcion(tipoFormato);
		
		return Torneo.crear().conNombre("TorneoPrueba").conEquipos(equipos).conFormato(formato);
	}
	
}
