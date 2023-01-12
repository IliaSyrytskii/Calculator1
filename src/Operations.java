import java.util.Objects;

public class Operations {

    private double number1;
    private double number2;
    private double result;

    private String type;

    public Operations(double number1, double number2, String type){
        this.number1 = number1;
        this.number2 = number2;
        this.type = type;
    }

    public Operations(double number1, double number2, double result) {
        this.number1 = number1;
        this.number2 = number2;
        this.result = result;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public String getType() {
        return type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Operations that = (Operations) o;
        return Double.compare(that.number1, number1) == 0 && Double.compare(that.number2, number2) == 0 && Double.compare(that.result, result) == 0 && type.equals(that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number1, number2, result, type);
    }

    @Override
    public String toString() {
        return "Operations{" +
                "number1=" + number1 +
                ", number2=" + number2 +
                ", result=" + result +
                ", type='" + type + '\'' +
                '}';
    }
}
