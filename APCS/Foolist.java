import java.util.ArrayList;

public class Foolist {

    private ArrayList<String> strs = new ArrayList<String>();
    private int len;

    public Foolist(int len) {
        this.len = len;
    }

    public boolean found(String str) {
        for (String foo : this.strs) {
            if (foo == str) {
                return true;
            }
        }
        return false;
    }

    public void addFoo(String entry) {
        if (entry.length() == this.len) {
            this.strs.add(entry);
        }
    }

    public void removeRandom() {
        // Generate some random variable using a function, and store it in n (chose a
        // fixed value for now)
        int n = this.len / 2;
        this.strs.remove(n);
    }

}
