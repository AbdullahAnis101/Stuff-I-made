import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class pingPong {

    public ArrayList<Object> runPingPong(int countUpTo){
        ArrayList<Object> result = new ArrayList<Object>();
       for(int i = 1; i <= countUpTo; i++){


            if (i % 5 == 0 && i % 3 == 0){
               result.add("pingpong");
           }else if (i % 5 == 0) {
                result.add("pong");
            }else if (i % 3 == 0){
                    result.add("ping");
                }
            else{
               result.add(i);
           }
       }

        return result;
    }
    public static void main(String [] args){
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a ping-pong application!");
        System.out.println("Enter a number");
        try{
            String stringUserNumber = bufferedReader.readLine();
            int intUserNumber = Integer.parseInt(stringUserNumber);
            pingPong pingPong = new pingPong();
            ArrayList<Object> pingPongResult = pingPong.runPingPong(intUserNumber);
            System.out.println(pingPongResult);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
