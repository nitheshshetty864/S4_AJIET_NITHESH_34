public class monkey{
    public static void main(String[] args) {
        
            int n = 20;
            int k = 2;
            int j = 3;
            int m = 12;
            int p = 12;
            int TotalJumped=0;
            int remaining=0;

            if (n <= 0 || k <= 0 || j <= 0 || m < 0 || p < 0) {
                System.out.println("Invalid input");
            }
            else {
                int MonkeyBanana = m / k;
                int leftoverBananas = m % k;

                int MonkeyPeanut = p / j;
                int leftoverPeanuts = p % j;

                 TotalJumped = MonkeyBanana + MonkeyPeanut;

    
                if (leftoverBananas > 0 || leftoverPeanuts > 0) {
                    TotalJumped += 1;
                }

                remaining = n - TotalJumped;
                System.out.println("Number of Monkeys left on the tree:" + remaining);
            }
        
        
    }
}
