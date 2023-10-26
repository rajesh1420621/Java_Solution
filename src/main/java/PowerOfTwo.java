public class PowerOfTwo {
    static boolean isPowerOfTwo(int n){
        while (n%2==0){
            n= n/2;
        }if(n==1){
            return true;
        }else {

            return false;
        }
    }

    public static void main(String[] args) {
        if (isPowerOfTwo(17))
            System.out.println("Yes");
        else
            System.out.println("No");

        if (isPowerOfTwo(18))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
