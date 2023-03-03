package Recursion;

public class XPowerN {
    public static int calcPower(int x, int n) {
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int xPow1=calcPower(x,n-1);
        System.out.println(xPow1);
        int xPow=x*xPow1;
        return xPow;
    }
    public static void main(String[] args) {
        int x=2;
        int n=5;
        int ans=calcPower(x,n);
        System.out.println(ans);
    }
}
