public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        System.out.println("output: "+ isHappy(2));
    }
    public static  boolean isHappy(int n) {
        int slow = n , fast = n;

        do{
            slow=sumOfSquare(slow);
            System.out.println("slow: "+ slow );
            fast= sumOfSquare(sumOfSquare(fast));
            System.out.println("fast: "+ fast);

        }while(slow !=fast);
        if(slow == 1){
            return true;
        }
        return false;
    }
    public static int sumOfSquare(int n){
        int result = 0;
        while(n>0){
            int reminder = n%10;
            result +=reminder * reminder;
            n /=10;
        }

        return result;
    }
}