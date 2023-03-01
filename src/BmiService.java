public class BmiService {
    public int calculate (int a, double b) {
        double index = a / (b*b);
        return (int) index;
    }
}
