import java.time.LocalDate;

public class Inscripcion {

    public String validarRegistro(String cod, String nom, String tel, String correo, LocalDate fecha) {

        //Validar que no falte nada
        if (cod == "" || nom == "" || tel == "" || correo == "" || fecha == null) {
            return "Debe ingresar todos los datos requeridos";
        }

        //Validar Codigo E + 4 números
        if (cod.length() != 5 || !cod.startsWith("E")) {
            return "Ingrese un codigo de inscripcion valido";
        }

        //Validar nombre minimo 4 letras
        if (nom.length() < 4) {
            return "El nombre del participante debe tener al menos cuatro caracteres alfabeticos";
        }

        //Validar telefono 9 dígitos
        if (tel.length() != 9) {
            return "Ingrese un numero de telefono valido";
        }

        //Validar Correo @ y 8 caracteres
        if (!correo.contains("@") || correo.length() < 8) {
            return "Ingrese un correo electronico valido";
        }

        //Validar Fecha
        if (fecha.isBefore(LocalDate.now())) {
            return "Ingrese una fecha de evento valida";
        }

        return "La inscripcion ha sido registrada correctamente";
    }
}