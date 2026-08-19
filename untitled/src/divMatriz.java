public class divMatriz {
    public static void main(String[] args) {
        //declaranda a matriz A
        int[][] A = {
                {10,20},
                {30,40}
        };
        //declarando a matriz B
        int[][] B = {
                {2,4},
                {6,8}
        };
        //declarando a matriz C
        double[][] C = new double[2][2];

        //Resultado de C
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                //verificar se é possivel fazer divisão
                if (B[i][j] != 0){

                    C[i][j] = (double) A[i][j] / B[i][j];
                }
                else {
                    System.out.println("Não é possivel dividir por 0  na posição [" + i + "][" + j + "]");
                }
            }
        }
        //Matriz A:
        System.out.println("Matriz A:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(A[i][j] + "\t");
            }
            System.out.println();
        }
        //Matriz B:
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
