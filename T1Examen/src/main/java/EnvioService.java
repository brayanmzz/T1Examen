public class EnvioService {
    public String chequearEnvio(String direccion, double peso, ZonaService zonaService) {

        if (zonaService.esRestringida(direccion)) {
            return "No permitir envios a zonas restringidas";
        }
        if (peso > 50) {
            return "Envio con recargo";
        }
        return "Envio procesado";
    }
}