package javacb.btvn.cautrucvonglap;

public class Bai13 {
    public static void main(String[] args) {
        for (int i = 10; i <= 99; i++) {
            int tensDigit = i / 10;
            int unitsDigit = i % 10;

            if ((tensDigit * unitsDigit) == 2 * (tensDigit + unitsDigit)) {
                System.out.println(i);
            }
        }
    }
}
