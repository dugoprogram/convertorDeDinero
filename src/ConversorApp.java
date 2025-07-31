public class ConversorApp {

    public static double convertir(int opcion, double cantidad, Moneda moneda) {
        switch (opcion) {
            case 1 -> { return cantidad / moneda.getConversion_rates().get("CLP"); } // CLP -> USD
            case 2 -> { return cantidad * moneda.getConversion_rates().get("CLP"); } // USD -> CLP
            case 3 -> { return cantidad / moneda.getConversion_rates().get("BRL"); } // BRL -> USD
            case 4 -> { return cantidad * moneda.getConversion_rates().get("BRL"); } // USD -> BRL
            case 5 -> { return cantidad / moneda.getConversion_rates().get("AUD"); } // AUD -> USD
            case 6 -> { return cantidad * moneda.getConversion_rates().get("AUD"); } // USD -> AUD
            case 7 -> { return cantidad / moneda.getConversion_rates().get("MXN"); } // MXN -> USD
            case 8 -> { return cantidad * moneda.getConversion_rates().get("MXN"); } // USD -> MXN
            case 9 -> { return cantidad / moneda.getConversion_rates().get("JPY"); } // JPY -> USD
            case 10 -> { return cantidad * moneda.getConversion_rates().get("JPY"); } // USD -> JPY
            case 11 -> { return cantidad / moneda.getConversion_rates().get("BOB"); } // BOB -> USD
            case 12 -> { return cantidad * moneda.getConversion_rates().get("BOB"); } // USD -> BOB
            case 13 -> { return cantidad / moneda.getConversion_rates().get("CNY"); } // CNY -> USD
            case 14 -> { return cantidad * moneda.getConversion_rates().get("CNY"); } // USD -> CNY
            case 15 -> { return cantidad / moneda.getConversion_rates().get("ARS"); } // ARS -> USD
            case 16 -> { return cantidad * moneda.getConversion_rates().get("ARS"); } // USD -> ARS
            default -> throw new IllegalArgumentException("Opción de conversión no válida.");
        }
    }
}