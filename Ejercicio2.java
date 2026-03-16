package Main;

public class Ejercicio2 {
    public boolean esFechaValida(int dia, int mes, int year) {
        if (year < 1 || mes < 1 || mes > 12 || dia < 1) return false;

        int diasEnMes;
        switch (mes) {
            case 2:
                // Cálculo de bisiesto
                diasEnMes = ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) ? 29 : 28;
                break;
            case 4: case 6: case 9: case 11:
                diasEnMes = 30;
                break;
            default:
                diasEnMes = 31;
                break;
        }
        return dia <= diasEnMes;
    }
}
