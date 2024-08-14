package school.mjc.stage0.loops.task5;

public class Cross {
    public static void printCross(int sideLength) {
        if (sideLength <= 0) {
            return;
        }

        for (int i = 0; i < sideLength / 2; i++) {
            System.out.print(" ");
            for (int j = 0; j < sideLength / 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }

        for (int i = 0; i < sideLength; i++) {
            System.out.print("8");
        }
        System.out.println();

        for (int i = 0; i < sideLength / 2; i++) {
            System.out.print(" ");
            for (int j = 0; j < sideLength / 2 - 1; j++) {
                System.out.print(" ");
            }
            System.out.println("8");
        }
    }
}