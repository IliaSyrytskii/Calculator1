import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class ConsoleApp implements Application{

    private final Reader reader = new ConsoleReader();
    private final FileWriter fileWriter;
    private Operations result;

    {
        try {
            fileWriter = new FileWriter("History.txt", true);
        } catch (IOException exception) {
            throw new RuntimeException(exception);
        }
    }

    private final Writer writer = new ConsoleWriter();
    private final Calculator calculator = new Calculator();

    @Override
    public void run() {
        checkFile();
        while (true) {
            writer.write("Enter first number");
            double number1 = reader.readDouble();
            writer.write("Enter second number");
            double number2 = reader.readDouble();
            writer.write("Enter operation type");
            String type = reader.readString();
            Operations operations = new Operations (number1, number2, type);
            result = calculator.calculate(operations);
            try {
                //fileWriter.write(number1 + number2 + " = " + result);
                fileWriter.write(result.toString());
                fileWriter.flush();
                fileWriter.close();

            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
            writer.write("Result " + result);
        }


    }
    public void checkFile() {
        File file = new File("History.txt");
        if (!file.exists()) {
            try {
                file.createNewFile();
            } catch (IOException exception) {
                throw new RuntimeException(exception);
            }
        }
    }
}
