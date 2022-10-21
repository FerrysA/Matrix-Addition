
import java.util.Scanner;// библ для ввода с клавиатуры
public class Main {

    public static int[][] matrixAddition(int[][] a, int[][] b) {
        int n =a.length;

        for (int i =0;i<n;i++)
        {
            for(int j=0;j<n;j++)
            {
                a[i][j]=a[i][j]+b[i][j];
            }
        }
        return a;
    }

    private static Scanner inn = new Scanner(System.in);// метод для ввода с клавиатуры

    public static <string> void main(String[] args) {








    }
}
