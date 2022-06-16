import java.util.List;

public class SeatingChart {
    /**
     * seats[r][c] represents the Student in row r and column c in the classroom.
     */
    private Student[][] seats;

    /**
     * Creates a seating chart with the given number of rows and columns from the
     * students in studentList. Empty seats in the seating chart are represented by
     * null.
     * 
     * @param rows the number of rows of seats in the classroom
     * @param cols the number of columns of seats in the classroom Precondition:
     *             rows > 0; cols > 0; rows * cols >= studentList.size()
     *             Postcondition: - Students appear in the seating chart in the same
     *             order as they appear in studentList, starting at seats[0][0]. -
     *             seats is filled column by column from studentList, followed by
     *             any empty seats (represented by null). - studentList is
     *             unchanged.
     */
    public SeatingChart(List<Student> studentList, int rows, int cols) {
        seats = new Student[rows][cols];
        for (int i = 0; i < rows * cols; i++) {
            if (i < studentList.size())
                seats[i % rows][i / rows] = studentList.get(i);
            else
                seats[i % rows][i / rows] = null;
        }
    }

    /**
     * Removes students who have more than a given number of absences from the
     * seating chart, replacing those entries in the seating chart with null and
     * returns the number of students removed.
     * 
     * @param allowedAbsences an integer >= 0
     * @return number of students removed from seats Postcondition: - All students
     *         with allowedAbsences or fewer are in their original positions in seat
     *         - No student in seats has more than allowedAbsences absences. -
     *         Entries without students contain null.
     */
    public int removeAbsentStudents(int allowedAbsences) {
        int numRemoved = 0;
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] != null && seats[i][j].getAbsentCount() > allowedAbsences) {
                    seats[i][j] = null;
                    numRemoved++;
                }
            }
        }
        return numRemoved;
    }

    public String toString() {
        String output = "";
        for (Student[] row : seats) {
            for (Student s : row) {
                if (s == null) {
                    output += String.format("%-10s", "null");
                } else {
                    output += String.format("%-10s", s.getName() + " " + s.getAbsentCount());

                }
            }
            output += "\n";
        }
        return output;
    }
}
