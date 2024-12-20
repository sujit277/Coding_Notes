package enumeration;

import java.util.Enumeration;
import java.util.Vector;

public class Test {

    public static void main(String[] args){

        Vector<String> days = new Vector<>();
        days.add("Monday");
        days.add("Tuesday");
        days.add("Wednesday");
        days.add("Thursday");
        days.add("Friday");
        days.add("Saturday");

        Enumeration<String> daysEnum = days.elements();
        // hasMoreElements() Returns true if there are more elements to iterate through.
        while (daysEnum.hasMoreElements()){
            // nextElement() returns the next element in the series.
            String day = daysEnum.nextElement();
            System.out.println(day);
        }
    }
}
