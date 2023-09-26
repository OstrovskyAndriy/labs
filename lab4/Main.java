import resources.*;

public class Main {

    public static void main(String[] args) {
        MyArrayReader arrayReader = new MyArrayReader();
        MyArrayProcessor arrayProcessor = new MyArrayProcessor();

        String fileName = "OneDimensional.txt";
        double[] oneDimensionalArray = arrayReader.readOneDimensionalArray(fileName);
        arrayProcessor.processArray(oneDimensionalArray);
        System.out.println("\none-demencional product = "+arrayProcessor.calculate(oneDimensionalArray));

        System.out.println();
        fileName = "TwoDimensional.txt";
        double[][] twoDimensionalArray = arrayReader.readTwoDimensionalArray(fileName);
        arrayProcessor.processArray(twoDimensionalArray);

        System.out.println("two-dimencionsl sum = "+ arrayProcessor.calculate(twoDimensionalArray));


    }
}
