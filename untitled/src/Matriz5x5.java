public class Matriz5x5 {
    public static void main(String[] args) {
        //declaranda a matriz A
        int[][] A = {
                {10, 20, 30, 40, 50},
                {60, 70, 80, 90, 100},
                {110, 120, 130, 140, 150},
                {160, 170, 180, 190, 200},
                {210, 220, 230, 240, 250}
        };
        //declarando a matriz B
        int[][] B = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14, 15},
                {16, 17, 18, 19, 20},
                {21, 22, 23, 24, 25}
        };
        //declarando a matriz C
        int[][] C = new int[5][5];

        //soma a matriz C
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = A[i][j] + B[i][j];
            }
        }

        //mostrando matriz A
        System.out.println("Matriz A:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println();

        //mostrando matriz B
        System.out.println("Matriz B:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(B[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        //Mostrando a soma da Matriz C
        System.out.println("A soma das matrizes C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        //Subtração Matriz C
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                C[i][j] = A[i][j] - B[i][j];
            }
        }

        //Mostrando a Subtração da Matriz C
        System.out.println("A Subtração das matrizes C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(C[i][j] + "\t");
            }
            System.out.println();
        }

        System.out.println("\n");

        //terei que criar uma matriz double para a divisao sair em decimal
        double[][] Divresult = new double[5][5];

        //Resultado da divisão C
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                //verificar se é possivel fazer divisão
                if (B[i][j] != 0){

                    Divresult[i][j] = (double) A[i][j] / B[i][j];
                }
                else {
                    System.out.println("Não é possivel dividir por 0  na posição [" + i + "][" + j + "]");
                }
            }
        }

        System.out.println("A Divisão das matrize C:");
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.print(Divresult[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
