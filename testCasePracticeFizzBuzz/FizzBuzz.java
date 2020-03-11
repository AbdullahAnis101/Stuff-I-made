/**
 * @author Abdullah
 * Outputs a number that is written in the parameter. If the number is a multiple of 3 and 5 then it creates outputs fizz for 3 and buzz for 5. Finally if the number is a multiple of both numbers then the output is fizzBuzz.
 *
 */

public class FizzBuzz {
    public String process(Integer inputValue){
        if (inputValue % 3 == 0 && inputValue % 5 == 0){
            return "FizzBuzz";
        }
        if(inputValue % 3 == 0){
               return "Fizz";
           }
           if(inputValue % 5 == 0){
               return "Buzz";
           }
            return inputValue.toString();
    }
}
