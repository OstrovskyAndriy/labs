package resources;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class MyArrayReader implements DoubleArrayReader {
    private double[] oneDimensionalArray;
    double[][] twoDimensionalArray;

    @Override
    public double[] readOneDimensionalArray(File file) {
        try {
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);
            int size = scanner.nextInt();
            oneDimensionalArray = new double[size];

            for (int i = 0; i < size; i++) {
                oneDimensionalArray[i] = scanner.nextDouble();
            }

            scanner.close();
            return oneDimensionalArray;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File does not exist");
            return null;
        }
    }

    @Override
    public double[] readOneDimensionalArray(String fileName) {
        File file = new File(fileName);
        return readOneDimensionalArray(file);
    }

    @Override
    public double[][] readTwoDimensionalArray(File file) {
        try {
            Scanner scanner = new Scanner(file);
            scanner.useLocale(Locale.US);

            int numRows = scanner.nextInt();
            int numCols = scanner.nextInt();
            twoDimensionalArray = new double[numRows][numCols];

            for (int i = 0; i < numRows; i++) {
                for (int j = 0; j < numCols; j++) {
                    twoDimensionalArray[i][j] = scanner.nextDouble();
                }
            }

            scanner.close();
            return twoDimensionalArray;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            System.out.println("File does not exist");
            return null;
        }
    }

    @Override
    public double[][] readTwoDimensionalArray(String fileName) {
        File file = new File(fileName);
        return readTwoDimensionalArray(file);
    }
}