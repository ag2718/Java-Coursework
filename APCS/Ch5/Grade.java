/**
 * A class for storing numeric and string representations of a student's grade
 */
public class Grade {

    private String grade;

    /**
     * Constructer for Grade class
     * 
     * @param grade the student's grade as a string
     */
    public Grade(String grade) {
        this.grade = grade;
    }

    /**
     * Converts the string grade to a number
     * 
     * @return the numeric grade (as a double)
     */
    public double getNumericGrade() {
        double numGrade;
        if (this.grade.equals("A+")) {
            numGrade = 4;
        } else {
            numGrade = 0;
            if (this.grade.charAt(0) == 'A') {
                numGrade += 4;
            } else if (this.grade.charAt(0) == 'B') {
                numGrade += 3;
            } else if (this.grade.charAt(0) == 'C') {
                numGrade += 2;
            } else if (this.grade.charAt(0) == 'D') {
                numGrade += 1;
            }
            if (this.grade.charAt(0) != 'F' && this.grade.length() == 2) {
                numGrade += (this.grade.charAt(1) == '+') ? 0.3 : -0.3;
            }
        }
        return numGrade;
    }
}
