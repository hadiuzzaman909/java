package JavaBasic;

public class Pyramid {

    public static void main(String[] args) {
        int row=6;
        int star=1;
        int space=row-1;

        for(int r=0; r<row; r++){
            for(int i=space;i>0;i--){
                System.out.print(" ");
            }
            space--;
            for(int s=0;s<star;s++){
                System.out.print("*");
                System.out.print(" ");
            }
            System.out.println();
            star++;
        }
    }
}
