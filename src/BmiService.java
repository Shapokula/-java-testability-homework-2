public class BmiService {

    public static int calculate(double heightM, int weightKg) {

        double index = weightKg / (heightM * heightM);

        return (int) index;
    }
}
