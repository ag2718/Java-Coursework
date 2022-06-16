/**
 * This class finds the smallest, middle, and largest of three strings.
 */
public class StringSet {
    private String str1, str2, str3;

    /**
     * Constructs a string set that processes three strings.
     * 
     * @param str1 the first string to sort
     * @param str2 the second string to sort
     * @param str3 the third string to sort
     */
    public StringSet(String str1, String str2, String str3) {
        this.str1 = str1;
        this.str2 = str2;
        this.str3 = str3;
    }

    /**
     * Gets the smallest string in the string set.
     * 
     * @return smallest the smallest of three strings
     */
    public String getSmallest() {
        if (this.str1.compareTo(this.str2) < 0) {
            return (this.str1.compareTo(this.str3) < 0) ? this.str1 : this.str3;
        }
        return (this.str2.compareTo(this.str3) < 0) ? this.str2 : this.str3;
    }

    /**
     * Gets the largest string in the string set.
     * 
     * @return largest the largest of three strings
     */
    public String getLargest() {
        if (this.str1.compareTo(this.str2) > 0) {
            return (this.str1.compareTo(this.str3) > 0) ? this.str1 : this.str3;
        }
        return (this.str2.compareTo(this.str3) > 0) ? this.str2 : this.str3;
    }

    /**
     * Gets the middle string in the string set.
     * 
     * @return middle the middle string of three strings
     */
    public String getMiddle() {
        if (this.str1.compareTo(this.str2) > 0) {
            return (this.str2.compareTo(this.str3) > 0) ? this.str2
                    : (this.str1.compareTo(this.str3) > 0) ? this.str3 : this.str1;
        }
        return (this.str2.compareTo(this.str3) > 0) ? ((this.str3.compareTo(this.str1) > 0) ? this.str3 : this.str1)
                : this.str2;
    }
}
