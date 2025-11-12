public class BmiService {
    public int calculate(double heightInMeters, double weightInKilograms) {
        double bmiIndex = weightInKilograms / (heightInMeters * heightInMeters);
        return (int) bmiIndex;
    }
}
