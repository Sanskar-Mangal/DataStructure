public class factorialusingrecursion {

    static int factorial(int n){
        if(n==0) return 1;

        int sa=factorial(n-1);

        int ans=sa*n;
        return ans;
    }
        public static void main(String[] args) {
            System.out.println(factorial(5));
        }
}

