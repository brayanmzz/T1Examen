import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

class EnvioServiceTest {

    @Test
    void testEnvioProhibido() {
        ZonaService zonaMock = mock(ZonaService.class);
        when(zonaMock.esRestringida("Zona Roja")).thenReturn(true);
        EnvioService service = new EnvioService();
        assertEquals("No permitir envíos a zonas restringidas", service.chequearEnvio("Zona Roja", 10.0, zonaMock));
    }

    @Test
    void testEnvioConRecargo() {
        ZonaService zonaMock = mock(ZonaService.class);
        when(zonaMock.esRestringida("Lima")).thenReturn(false);
        EnvioService service = new EnvioService();
        String resultado = service.chequearEnvio("Lima", 60.0, zonaMock);
        assertEquals("Envio con recargo", resultado);
    }
}