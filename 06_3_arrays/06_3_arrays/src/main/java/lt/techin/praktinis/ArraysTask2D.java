package lt.techin.praktinis;

public class ArraysTask2D {

    public static void main(String[] args) {

        // (Papildomai) Įgyvendikite visus metodus (turi pažaliuoti unit testai).
        //  Pateiktas dvimatis masyvas programos patikrinimui. Elementų reikšmes galite keisti.

        int[][] marks = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        double averageMark = getAverageMark(marks);
        System.out.printf("Average mark: %.2f\n", averageMark);
        int minMark = getMinMark(marks);
        System.out.printf("Min mark: %d\n", minMark);
        int maxMark = getMaxMark(marks);
        System.out.printf("Max mark: %d\n", maxMark);
    }


    public static double getAverageMark(int[][] marks) {
        double multipler = 0;
        int sum = 0;
        for (int i = 0; i < marks.length; ++i) {
            for(int j = 0; j < marks[i].length; ++j) {
                sum += marks[i][j];
                multipler++;
            }
        }
        return sum/multipler;
    }


    public static int getMinMark(int[][] marks) {
        int result = marks[0][0];
        for (int i = 0; i < marks.length; ++i) {
            for(int j = 0; j < marks[i].length; ++j) {
                if (marks[i][j] < result) {
                    result = marks[i][j];
                }
            }
        }
        return result;
    }


    public static int getMaxMark(int[][] marks) {
        int result = marks[0][0];
        for (int i = 0; i < marks.length; ++i) {
            for(int j = 0; j < marks[i].length; ++j) {
                if (marks[i][j] > result) {
                    result = marks[i][j];
                }
            }
        }
        return result;
    }


}
