package pes.comunidad.sorteo;

import static org.junit.Assert.assertNotNull;

import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import pes.comunidad.modelo.Cuadro;
import pes.comunidad.modelo.Equipo;
import pes.comunidad.modelo.Torneo;

public class SorteoTest {

	@Test
	public void elCuadroNoEsNuloAlSortear() {
		
		/* Inicializacion */
		Torneo torneo = inicializarTorneo();
		
		/* Operacion */
		Cuadro cuadro = torneo.sortear();
		
		/* Expectativas */
		assertNotNull(cuadro);
	}

	private Torneo inicializarTorneo() {
		
		List<Equipo> equipos = Arrays.asList(Equipo.crear().conNombre("Holanda").conRanking(1),
											 Equipo.crear().conNombre("Inglaterra").conRanking(2),
											 Equipo.crear().conNombre("España").conRanking(3),
											 Equipo.crear().conNombre("Italia").conRanking(4)
											);
		
		return Torneo.crear().conNombre("TorneoPrueba").conEquipos(equipos);
	}
	
}
