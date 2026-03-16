public class Ejeraicio_4 {
    enum ClientType {
        REGULAR, SILVER, GOLD, PLATINUM, DIAMOND, VIP1, VIP2, VIP3, VIP4, VIP5
    }

    public static double calculateDiscount(ClientType type) {
        if (type == ClientType.REGULAR) {
            return 0.0;
        } else if (type == ClientType.SILVER) {
            return 0.05;
        } else if (type == ClientType.GOLD) {
            return 0.1;
        } else if (type == ClientType.PLATINUM) {
            return 0.15;
        } else if (type == ClientType.DIAMOND) {
            return 0.2;
        } else if (type == ClientType.VIP1) {
            return 0.25;
        } else if (type == ClientType.VIP2) {
            return 0.3;
        } else if (type == ClientType.VIP3) {
            return 0.35;
        } else if (type == ClientType.VIP4) {
            return 0.4;
        } else if (type == ClientType.VIP5) {
            return 0.5;
        } else {
            return 0.0;
        }
    }

    public static double calculateDiscountSwitch(ClientType type) {
        return switch (type) {
            case REGULAR -> 0.0;
            case SILVER -> 0.05;
            case GOLD -> 0.1;
            case PLATINUM -> 0.15;
            case DIAMOND -> 0.2;
            case VIP1 -> 0.25;
            case VIP2 -> 0.3;
            case VIP3 -> 0.35;
            case VIP4 -> 0.4;
            case VIP5 -> 0.5;
        };
    }
}
//Tiene un if…else de 10 niveles para calcular descuentos según el tipo de cliente. Investigue 
//porque los desarrolladores dicen que “muchos if seguidos son olor de código (code smell)” y 
//proponga una alternativa inicial usando un switch mejorado o discutir como los objetos 
//podrían reemplazar estas decisiones en el futuro.
