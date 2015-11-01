import java.util.Scanner;

public class Problem2TriangleArea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numAx = in.nextInt();
        int numAy = in.nextInt();
        int numBx = in.nextInt();
        int numBy = in.nextInt();
        int numCx = in.nextInt();
        int numCy = in.nextInt();

        int summ = (numAx*(numBy - numCy) + numBx*(numCy - numAy) + numCx*(numAy - numBy)) / 2;

        System.out.println(Math.abs(summ));
    }
}
