package org.factoriaf5.list;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.List;

public class ListweekTest {
    private Listweek listweek;

    @BeforeEach
    public void setUp() {
        listweek = new Listweek();
        listweek.crearListaDias();
    }

    @Test
    public void testCrearListaDias() {
        Listweek mockedListweek = mock(Listweek.class);
        doNothing().when(mockedListweek).crearListaDias();

        mockedListweek.crearListaDias();

        verify(mockedListweek, times(1)).crearListaDias();
        when(mockedListweek.getDias()).thenReturn(List.of("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo"));
        assertEquals(7, mockedListweek.getDias().size());
    }

    @Test
    public void testGetDias() {
        List<String> dias = listweek.getDias();
        assertNotNull(dias);
        assertEquals(7, dias.size());
    }

    @Test
    public void testGetLargoLista() {
        int largo = listweek.getLargoLista();
        assertEquals(7, largo);
    }

    @Test
    public void testEliminarDia() {
        Listweek mockedListweek = spy(listweek);
        mockedListweek.eliminarDia("Miércoles");
        assertFalse(mockedListweek.getDias().contains("Miércoles"));
        assertEquals(6, mockedListweek.getLargoLista());
    }

    @Test
    public void testGetDia() {
        Listweek mockedListweek = spy(listweek);
        assertEquals("Lunes", mockedListweek.getDia(0));
        assertEquals("Índice fuera de rango", mockedListweek.getDia(10));
    }

    @Test
    public void testExisteDia() {
        assertTrue(listweek.existeDia("Lunes"));
        assertFalse(listweek.existeDia("Funday"));
    }

    @Test
    public void testOrdenarDias() {
        listweek.ordenarDias();
        List<String> diasOrdenados = listweek.getDias();
        assertEquals(List.of("Domingo", "Jueves", "Lunes", "Martes", "Miércoles", "Sábado", "Viernes"), diasOrdenados);
    }

    @Test
    public void testVaciarLista() {
        listweek.vaciarLista();
        assertTrue(listweek.getDias().isEmpty());
    }
}
