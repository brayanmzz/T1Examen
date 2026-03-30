import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.*;

class InscripcionTest {

    @Test
    void test1() {
        Inscripcion ins = new Inscripcion();
        assertEquals("Debe ingresar todos los datos requeridos",
                ins.validarRegistro("", "", "", "", null));
    }

    @Test
    void test2() {
        Inscripcion ins = new Inscripcion();
        assertEquals("Ingrese un codigo de inscripcion valido",
                ins.validarRegistro("A1234", "Juan", "999888777", "a@a.com", LocalDate.now()));
    }

    @Test
    void test3() {
        Inscripcion ins = new Inscripcion();
        assertEquals("El nombre del participante debe tener al menos cuatro caracteres alfabeticos",
                ins.validarRegistro("E1234", "Ana", "999888777", "test@test.com", LocalDate.now()));
    }

    @Test
    void test4() {
        Inscripcion ins = new Inscripcion();
        assertEquals("Ingrese un numero de telefono valido",
                ins.validarRegistro("E1234", "Carlos", "123", "test@test.com", LocalDate.now()));
    }

    @Test
    void test5() {
        Inscripcion ins = new Inscripcion();
        assertEquals("Ingrese un correo electronico valido",
                ins.validarRegistro("E1234", "Carlos", "999888777", "carlos.com", LocalDate.now()));
    }

    @Test
    void test6() {
        Inscripcion ins = new Inscripcion();
        assertEquals("Ingrese una fecha de evento valida",
                ins.validarRegistro("E1234", "Carlos", "999888777", "carlos@gmail.com", LocalDate.now().minusDays(5)));
    }
}