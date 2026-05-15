import java.util.Scanner;

 class symmatrix {
     public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("enter matrix row : ");
    int r = sc.nextInt();
    System.out.print("enter matrix columns : ");
    int c = sc.nextInt();
    int matrix[][] = new int[r][c];
    if(r!=c) {
        System.out.println("matrix is not symmatric!!");
        return;}
    System.out.println("");
    System.out.println("!!---matrix is symmetric---!!");
    System.out.println("enter matrix elements : ");
    for (int i =0; i<r; i++){
        for(int j=0; j<c; j++){
            matrix [i][j] = sc.nextInt();
        }}
    boolean symmetric = true;
    for(int i =0; i<r; i++) {
        for(int j=0; j<c; j++){
            if(matrix[i][j] != matrix[j][i]){
                symmetric = false;
                break;
            }}}
    if(symmetric){
        System.out.println("matrixis symmetric");
    } else {
        System.out.println("matrix is not symmetric!!");
    }}}
