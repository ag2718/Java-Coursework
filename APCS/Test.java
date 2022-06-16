public class Test {

    private String message;

    public Test(String str) {
        message = str;
    }

    public void display() {
        System.out.println(message);
    }

    public void changeStr(String newStr) {
        message = newStr;
    }

    public static void main(String[] args) {

        Test[] arr = new Test[1];
        arr[0] = new Test("test1");

        arr[0].display();

        for (Test obj : arr) {
            obj.changeStr("NEW");
        }

        arr[0].display();

    }

}
