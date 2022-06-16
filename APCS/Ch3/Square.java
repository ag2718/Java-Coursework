public class Square {
    private int sideLength;

    public Square(int length) {
        sideLength = length;
    }

    public int getArea() {
        int area = sideLength * sideLength;
        return area;
    }
}
