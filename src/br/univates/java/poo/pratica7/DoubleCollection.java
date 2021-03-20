package br.univates.java.poo.pratica7;

import lombok.Getter;
import lombok.Setter;

import java.util.Arrays;

@Getter
@Setter
public class DoubleCollection {

    private double[] numbers;

    public int getLength() {
        return getNumbers().length;
    }

    public double getSum() {
        double result = 0;
        for (int i = 0; i < getLength(); i++) {
            result += getNumbers()[i];
        }
        return result;
    }

    public double getAverange() {
        return getSum() / getLength();
    }

    public double getMax() {
        double result = Double.NEGATIVE_INFINITY;
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] > result) {
                result = getNumbers()[i];
            }
        }
        return result;
    }

    public double getMin() {
        double result = Double.POSITIVE_INFINITY;
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] < result) {
                result = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] gerEvenNumbers() {
        double[] result = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] % 2 == 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] gerOddNumbers() {
        double[] result = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] % 2 != 0) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] getGreaterThan(int x) {
        double[] result = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] > x) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public double[] getSmallerThan(int x) {
        double[] result = new double[0];
        for (int i = 0; i < getLength(); i++) {
            if (getNumbers()[i] < x) {
                result = Arrays.copyOf(result, result.length + 1);
                result[result.length - 1] = getNumbers()[i];
            }
        }
        return result;
    }

    public void setNumberAt(int x, double y) {
        double[] result = Arrays.copyOf(getNumbers(), getLength());
        result[x] = y;
        setNumbers(result);
    }

}
