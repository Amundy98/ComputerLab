package automation;

import java.util.Map;

public class Book {
    public static void main(String[] args) {
        Map<Object, Integer> book = TestResults.getOriginalGrades();
        Map<String, Integer> test2 = TestResults.getMakeUpGrade();


        for (Map.Entry higherGrade : test2.entrySet()) {
            Integer firstGrade = book.get(higherGrade.getKey());
            Integer secondGrade = test2.get(higherGrade.getKey());

            if (secondGrade > firstGrade){
                book.put(higherGrade, secondGrade);
                System.out.println("Student: " + higherGrade.getKey() + " " + " Grade: " + higherGrade.getValue());
            }


        }

        try {
            int c = 30/0;
        }catch (ArithmeticException b){
            System.out.println("Dividing by zero is not accepted");
        }finally {
            System.out.println("Division is fun!");
        }

    }
}
