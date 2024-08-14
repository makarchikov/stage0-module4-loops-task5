package school.mjc.stage0.loops.task5;

public class Hourglass {
    public void printHourglassOfGivenSize(int height) {
        if (height <= 0) {
            return;
        }

        for (int i = 0; i < height; i++) {
            // Print the leading spaces
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the '8' characters
            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("8");
            }

            System.out.println();
        }

        for (int i = height - 2; i >= 0; i--) {
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < 2 * i + 1; j++) {
                System.out.print("8");
            }

            System.out.println();
        }

    }
}
