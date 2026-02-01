package design;

public class KissExamples {

    public void processNumbers(int[] numbers) {
        if (numbers == null) return;

        for (int number : numbers) {
            if (number > 0) {
                System.out.println(number);
            }
        }
    }

    public int divide(int a, int b) {
        if (b == 0) return 0;
        return a / b;
    }
}
