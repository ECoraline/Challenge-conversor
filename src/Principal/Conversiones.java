package Principal;

import java.util.HashMap;
import java.util.Map;

public class Conversiones {
    private Map<String, Double> tasas = new HashMap<>();
    public Conversiones(Datos datos){
        this.tasas = datos.conversion_rates();
    }

    @Override
    public String toString() {
        return "(tasas de conversion: " + tasas + ")";
    }

    public double usdars(double dolares){
        return dolares*tasas.get("ARS");
    }
    public double arsusd(double argentino){
        return argentino/tasas.get("USD");
    }

    public double usdmxn(double dolares){
        return dolares*tasas.get("MXN");
    }
    public double mxnusd(double pesos){
        return pesos/tasas.get("MXN");
    }

    public double usdpen(double dolares){
        return dolares*tasas.get("PEN");
    }
    public double penusd(double soles){
        return soles/tasas.get("PEN");
    }
    public double usdyen(double dolares){
        return dolares*tasas.get("YEN");
    }
    public double yenusd(double yenes){
        return yenes/tasas.get("YEN");
    }


}
