public class exercise2 {
    public static void main(String[] args) {
        System.out.printf("%-10s %-10s %-10s %-10s %-10s%n", "Degrees", "Radians", "Sine", "Cosine", "Tangent");

        int[] degrees = {30, 60};

        for (int degree : degrees) {
            double radian = Math.toRadians(degree);
            System.out.printf("%-10d %-10.4f %-10.4f %-10.4f %-10.4f%n", degree, radian, Math.sin(radian), Math.cos(radian), Math.tan(radian));
        }
    }
}
