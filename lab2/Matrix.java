
package matrix;

public class Matrix {
     public static void main(String[] args) {
        int r=3,c=3;
        int[][]arr1={{10,20,30},{40,50,60},{70,80,90}};
        int[][]arr2={{1,2,3},{4,5,6},{7,8,9}};
        int[][]sum=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                sum[i][j]=arr1[i][j]+arr2[i][j];
            }
        }
        System.out.println("sum of two matrices is :");
        for(int[]row:sum){
            for(int column:row){
                System.out.print(column +" ");
            
            
        }
            System.out.println();
    }

   
        
        // TODO code application logic here
    }
    
}
