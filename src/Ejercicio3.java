package Main;

public class Ejercicio3 {
    public static void main(String[] args) {
        int day = 1;
        String result1;
        switch (day) {
            case 1:
                result1 = "Lunes";
                break;
            case 2:
                result1 = "Martes";
                break;
            case 3:
                result1 = "Miercoles";
                break;
            default:
                result1 = "Desconocido";
                break;
        }
        System.out.println("Tradicional: " + result1);

        // Switch expression
        String result2 = switch (day) {
            case 1 -> "Lunes";
            case 2 -> "Martes";
            case 3 -> "Miercoles";
            default -> "Desconocido";
        };
        System.out.println("Expresion: " + result2);
    }
}
