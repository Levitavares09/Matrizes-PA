public class Main {
    public static void main(String[] args) {
        //declarando a matriz A
        int[][] A = {
                {2,4},
                {6,8}
        };
        //declarando a matriz B
        int[][] B = {
                {1,3},
                {5,7}
        };
        //declarando a matriz C
        int[][] C = new int[2][2];

        //percorre as matrizes e soma elas
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }


        System.out.println("Matriz B:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        //Matriz C
        System.out.println("Matriz C:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }
    }
}