import java.util.*;
class matrix{
    public static void main(String[] args){
        int i,j;
        
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the dimensions of first matrix");
        int r1=obj.nextInt();
        int c1=obj.nextInt();
        System.out.println("enter the dimensions of second matrix");
        int r2=obj.nextInt();
        int c2=obj.nextInt();
        int a[][]=new int[r1][c1];
        int b[][]=new int[r2][c2];
        int c[][]=new int[r1][c2];
        if(c1==r2){
            System.out.println("enter the elements of first matrix");
            for(i=0;i<r1;i++){
                for(j=0;j<c1;j++){
                    a[i][j]=obj.nextInt();
                }
            }
            System.out.println("enter the elements of second matrix");
            for(i=0;i<r2;i++){
                for(j=0;j<c2;j++){
                    b[i][j]=obj.nextInt();
                }
            }
            for(i=0;i<r1;i++){
                for(j=0;j<c2;j++){
                    c[i][j]=0;
                    for(int k=0;k<c1;k++){
                        c[i][j]+=a[i][k]*b[k][j];
                    }        
                }
        }
        System.out.println("the resultant matrix is");
        for(i=0;i<r1;i++){
            for(j=0;j<c2;j++){
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }
    }
    else{
        System.out.println("multiplication not possible");
    }

}
}
