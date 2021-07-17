public class demo {
    public static void main(String[] args) {
        int n=199;
        int sum=0;
        do{
             sum=n%10;
              n/=10;
            System.out.println(sum);
            System.out.println(n);
        }while (n>0);

    }
}
