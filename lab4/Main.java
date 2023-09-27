import resources.*;

public class Main {

    public static void main(String[] args) {
        MyArrayReader arrayReader = new MyArrayReader();
        MyArrayProcessor arrayProcessor = new MyArrayProcessor();

        String fileName = "OneDimensional.txt";
        double[] oneDimensionalArray ;

        if((oneDimensionalArray= arrayReader.readOneDimensionalArray(fileName))!=null){
            arrayProcessor.processArray(oneDimensionalArray);
            System.out.println("\none-demencional product = "+arrayProcessor.calculate(oneDimensionalArray));
        }
        else{
            System.out.println("some error with "+fileName+"...");
        }

        System.out.println();
        fileName = "TwoDimensional.txt";
        double[][] twoDimensionalArray;

        if((twoDimensionalArray= arrayReader.readTwoDimensionalArray(fileName))!=null){
            arrayProcessor.processArray(twoDimensionalArray);
            System.out.println("two-dimencionsl sum = "+ arrayProcessor.calculate(twoDimensionalArray));
        }
        else{
            System.out.println("some error with "+fileName+"...");
        }

    }
}
