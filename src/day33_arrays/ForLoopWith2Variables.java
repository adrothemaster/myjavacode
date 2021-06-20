package day33_arrays;

public class ForLoopWith2Variables {
    public static void main(String[] args) {
        for (int i = 1, j = 1; i<=4; i++, j++){
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("------- 2 way loop ----------");
        for (int i = 1, j = 5; j >=0; i++,j--){
            System.out.println("i = " + i + ", j = " + j);
        }
        System.out.println("-------- 4 way loop ---------");
        for (int i = 1, j = 5, k = 3, l = 2; j >=0; i++,j--,k+=2,l-=2){
            System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", l = " + l);
        }
        System.out.println("-------- 8 way loop ---------");
        for (int i = 1, j = 5, k = 3, l = 2, a = 10, b = -10, c = 100, d = -101; j >=0; i++,j--,k+=2,l-=2,a/=2,b*=3,c%=2,d-=10,d+=3) {
            System.out.println("i = " + i + ", j = " + j + ", k = " + k + ", l = " + l + ", a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        }
        System.out.println("------------------------------------------------");
    }
}
