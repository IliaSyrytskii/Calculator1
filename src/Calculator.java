public class Calculator {

    public Operations calculate (Operations operations) {
        switch (operations.getType()) {
            case "sum" -> {
                operations.setResult(sum(operations.getNumber1(), operations.getNumber2()));
                return operations;
            }
            case "sub" -> {
                operations.setResult(sub(operations.getNumber1(), operations.getNumber2()));
                return operations;
            }
            case "mult" -> {
                operations.setResult(mult(operations.getNumber1(), operations.getNumber2()));
                return operations;
            }
            case "div" -> {
                operations.setResult(div(operations.getNumber1(), operations.getNumber2()));
                return operations;
            }
        }
        return null;
    }
    private static double sum (double a, double b) {
        return a + b;
    }
    private static double sub (double a, double b) {
        return a - b;
    }
    private static double mult (double a, double b) {
        return a * b;
    }
    private static double div (double a, double b) {
        return a / b;
    }
}
