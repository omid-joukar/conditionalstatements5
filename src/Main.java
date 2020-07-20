/**
 * Created by KPS on 7/20/2020.
 */
public class Main {
    public static void main(String[] args) {
        String[] days = {"Monday" , "Tuesday","Wednesday","Thursday","Friday","Saturday" , "Sunday"};
 
        int number = 0 ;
        int min = 1;
        int max = 7;
        number = (int) (min+(Math.random()*((max-min)+1)));
        System.out.println(days[number]);
    }
}
