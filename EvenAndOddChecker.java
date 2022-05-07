public class EvenAndOddChecker {
    public String checking(int n){
        if ( n < 0)
            throw new IllegalArgumentException("Number must be greater than 0");
        if(n%2==0)
            return "The number is Even";
        else
            return "The number is Odd";
    }

}
