import java.util.Objects;

public final class Monedas {
    private final String base_code;
    private final String target_code;
    private final double conversion_rate;
    private final double conversion_result;


    public Monedas(String base_code,
                   String target_code,
                   double conversion_rate,
                   double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_rate = conversion_rate;
        this.conversion_result = conversion_result;






    }

    public String base_code() {
        return base_code;
    }

    public String target_code() {
        return target_code;
    }

    public double conversion_rate() {
        return conversion_rate;
    }

    public double conversion_result() {
        return conversion_result;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) return true;
        if (obj == null || obj.getClass() != this.getClass()) return false;
        var that = (Monedas) obj;
        return Objects.equals(this.base_code, that.base_code) &&
                Objects.equals(this.target_code, that.target_code) &&
                Double.doubleToLongBits(this.conversion_rate) == Double.doubleToLongBits(that.conversion_rate) &&
                Double.doubleToLongBits(this.conversion_result) == Double.doubleToLongBits(that.conversion_result);
    }

    @Override
    public int hashCode() {
        return Objects.hash(base_code, target_code, conversion_rate, conversion_result);
    }

    public String toString() {
        return "Monedas[" +
                "base_code=" + base_code + ", " +
                "target_code=" + target_code + ", " +
                "conversion_rate=" + conversion_rate + ", " +
                "conversion_result=" + conversion_result + ']';
    }

}
