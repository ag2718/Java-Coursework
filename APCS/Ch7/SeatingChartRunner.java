import java.util.List;
import java.util.ArrayList;

public class SeatingChartRunner {
    public static void main(String[] args) {
        // add code to test the SeatingChart class
        List<Student> stuList = new ArrayList<Student>();
        stuList.add(new Student("Karen", 3));
        stuList.add(new Student("Liz", 1));
        stuList.add(new Student("Paul", 4));
        stuList.add(new Student("Lester", 1));
        stuList.add(new Student("Henry", 5));
        stuList.add(new Student("Renee", 9));
        stuList.add(new Student("Glen", 2));
        stuList.add(new Student("Fran", 6));
        stuList.add(new Student("David", 1));
        stuList.add(new Student("Danny", 3));

        SeatingChart kids = new SeatingChart(stuList, 3, 4);
        System.out.println(kids);

        /*
         * outs
         * 
         * Karen 3 Lester 1 Glen 2 Danny 3 Liz 1 Henry 5 Fran 6 null Paul 4 Renee 9
         * David 1 null
         * 
         */

        System.out.println(kids.removeAbsentStudents(4));
        System.out.println(kids);

        /*
         * 3 Karen 3 Lester 1 Glen 2 Danny 3 Liz 1 null null null Paul 4 null David 1
         * null
         * 
         */

        kids = new SeatingChart(stuList, 7, 2);
        System.out.println(kids);

        /*
         * outs
         * 
         * Karen 3 Fran 6 Liz 1 David 1 Paul 4 Danny 3 Lester 1 null Henry 5 null Renee
         * 9 null Glen 2 null
         * 
         */

    }
}
