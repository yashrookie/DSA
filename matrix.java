public class matrix {
    public static void main(String[]args){
        int [][]matrix = new int[5][5];
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++){
                matrix[i][j] =10;
            }
        }
        for(int i =0;i<5;i++){
            for(int j =0;j<5;j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }
        //System.out.println();
    }
    
}
