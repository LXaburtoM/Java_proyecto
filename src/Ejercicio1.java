public class Ejercicio1 {

    public static String determinarMetodoEnvio(double peso, double distancia, boolean esFragil) {

        if (peso > 50 && distancia > 100) {
            return "Transporte pesado";
        }
        else if (peso < 50 && esFragil) {
            return "Envío Premium";
        }
        else if (peso < 10 && distancia < 20) {
            return "Dron";
        }
        else {
            return "Envío Estándar";
        }
    }

    public static void main(String[] args) {

        String metodo = determinarMetodoEnvio(60, 120, false);
        System.out.println(metodo);

    }
}