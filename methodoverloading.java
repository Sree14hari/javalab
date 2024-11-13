
import java.util.Scanner;
class methodoverloading
{
    void volume(int l,int b,int h){
        int v=l*b*h;
        System.out.println("volume of rectangle is :"+v);
    }
    void volume(int r,int h){
        double v=3.14*r*r*h;
        System.out.println("volume of cylender is :"+v);
    }
    void volume(int s){
        int v=s*s*s;
        System.out.println("volume of cube is :"+v);
    }
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        methodoverloading met=new methodoverloading();
        while (true) { 
            System.out.println("enter choice \n1.cube\n2.cuboid\n3.cylender\n");
            int ch=obj.nextInt();
            switch(ch){
                case 1:
                System.out.println("enter side of cube");
                int side=obj.nextInt();
                met.volume(side);
                break;
                case 2:
                System.out.println("enter length bredth height");
                int len=obj.nextInt();
                int bre=obj.nextInt();
                int hei=obj.nextInt();
                met.volume(len,bre,hei);
                break;
                case 3:
                System.out.println("enter radius and height");
                int rad=obj.nextInt();
                int he=obj.nextInt();
                met.volume(rad,he);
                break;
                case 4:
                System.out.println("wrong choice ");
                break;

            }
        }
        
    }

}