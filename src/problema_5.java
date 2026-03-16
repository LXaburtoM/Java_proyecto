public class Problema5 {

    public String validarContrasena(String password) {

        if (password.length() < 8) {
            return "Insegura";
        }

        boolean tieneNumero = password.matches(".*\\d.*");
        boolean tieneMayuscula = password.matches(".*[A-Z].*");


        if (tieneNumero && tieneMayuscula) {
            return "Fuerte";
        }

        else if (tieneNumero) {
            return "Moderada";
        }
        else {
            return "Insegura";
        }
    }

    public static void main(String[] args) {
        Problema5 validador = new Problema5();
        System.out.println(validador.validarContrasena("abc123"));      // Insegura (<8)
        System.out.println(validador.validarContrasena("abcde123"));    // Moderada (>=8 + número)
        System.out.println(validador.validarContrasena("Abcde123"));    // Fuerte (>=8 + número + Mayus)
    }
}
