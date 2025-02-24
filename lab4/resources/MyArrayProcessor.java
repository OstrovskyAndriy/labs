package resources;

public class MyArrayProcessor implements ArrayProcessor {
    @Override
    public double calculate(double[] array) {
        double product = 1;
        for (double value : array) {
            if (value < 0) {
                product *= value;
            }
        }
        return product;
    }

    @Override
    public double calculate(double[][] array) {
        double sum = 0;

        for (int i = 0; i <= array.length / 2; i++) {
            for (int j = 0; j <= i; j++) {
                if (array[i][j] < 0) {
                    sum += array[i][j];
                }
            }
        }


        for (int i = array.length / 2 + 1; i < array.length; i++) {
            for (int j = 0; j < array.length - i; j++) {
                if (array[i][j] < 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    @Override
    public void processArray(double[] array) {
        System.out.println("One-Dimensional Array:");
        for (double value : array) {
            System.out.print(value + " ");
        }
    }

    @Override
    public void processArray(double[][] array) {
        System.out.println("Two-Dimensional Array:");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }
}
