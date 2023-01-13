import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int n=4;
        int m=4;
        for(int i = 1;i<=n;i++){
            for(int j =1;j<=m;j++){
                 System.out.print("*");}
            System.out.print("\n");}


        for (int i1=n;i1>=1;i1--){
        for (int j1=1;j1<=i1;j1++){
            System.out.print("*");}
            System.out.print("\n");}


        for (int i2=1;i2<=n;i2++){
            for (int j2=1;j2<=i2;j2++){
            System.out.print("*");}
            System.out.print("\n");}

       Scanner ayush = new Scanner(System.in);
        System.out.println("enter the no-");
      int u = ayush.nextInt();
        for (int i2=1;i2<=u;i2+=2){
           for (int j2=1;j2<=i2;j2++){
               System.out.print("*");}
           System.out.print("\n");}

      for (int i3=u-2;i3>=0;i3-=2){
           for (int j3=1;j3<=i3;j3++){
               System.out.print("*");

           }
          System.out.print("\n");
      }


        int u1= ayush.nextInt();
        for (int i4=1;i4<=u1;i4+=2){
            for (int j4=1;j4<=i4;j4++){
                System.out.print("*");

            }
            System.out.print("\n");
        }

    }}














