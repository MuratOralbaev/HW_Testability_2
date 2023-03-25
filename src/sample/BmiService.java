package sample;

public class BmiService {
    public int calculate(double height, int weight) {
        double index = height * height;
        int bmi = (int) (weight / index);
        return bmi;
    }
}