import java.util.Scanner;

public class Main {

    public static char[][] map;
    public static Scanner sc;

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        initMap();
        showMap();

        humanTurn();
        showMap();
    }

    public static void initMap() {
        map = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                map[i][j] = '*';

            }
        }
    }

    public static boolean isCellEmpty(int x, int y) {
        if (map[y][x] != '*')
            return false;
        return true;
    }

    public static void showMap() {
        System.out.println("0 1 2 3 -X");
        for (int i = 0; i < 3; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 3; j++) {
                System.out.print(map[i][j] + " ");

            }

            System.out.println();
        }
    }

    public static void humanTurn() {
        System.out.println("Введите координаты X Y");
        
        int x, y;
        x = sc.nextInt() - 1;
        y = sc.nextInt() - 1;
        map[y][x] = 'X';
    }
}
