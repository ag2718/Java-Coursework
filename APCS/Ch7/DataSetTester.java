public class DataSetTester {
    public static void main(String[] args) {

        DataSet set = new DataSet(5);
        for (int i = 0; i < 6; i++) {
            set.add(Math.random() * 100);
        }
        System.out.println("Sum: " + set.sum());
        System.out.println("Average: " + set.average());
        System.out.println("Maximum value: " + set.max());
        System.out.println("Minimum value: " + set.min());

    }
}

class DataSet {

    private int numMaxVals;
    private int currSize;
    private double[] vals;

    public DataSet(int maximumNumberOfValues) {
        this.numMaxVals = maximumNumberOfValues;
        vals = new double[numMaxVals];
    }

    public void add(double value) {
        if (currSize < numMaxVals) {
            vals[currSize] = value;
            currSize++;
        } else {
            System.out.println("Value was not added, data set is full");
        }
    }

    public double sum() {
        double res = 0;
        for (int i = 0; i < currSize; i++) {
            res += vals[i];
        }
        return res;
    }

    public double average() {
        return this.sum() / currSize;
    }

    public double max() {
        double currMax = vals[0];
        for (int i = 1; i < currSize; i++) {
            if (vals[i] > currMax) {
                currMax = vals[i];
            }
        }
        return currMax;
    }

    public double min() {
        double currMin = vals[0];
        for (int i = 1; i < currSize; i++) {
            if (vals[i] < currMin) {
                currMin = vals[i];
            }
        }
        return currMin;

    }
}
