public class MethodOverloadingChallenge {

    public static final String INVALID_VALUE_MESSAGE = "Invalid value.";    //Constant string variable, keyword final.

    public static void main(String[] args) {

        getDurationString(3601);

    }

    public static String getDurationString(int minutes, int seconds) {


        if (minutes < 0 || seconds < 0 || seconds >= 60) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int hours = minutes/60;
        int remainingMinutes = minutes % 60;

        String hourString = hours + "h";
        if (hours < 10) {
            hourString = "0" + hourString;
        }

        String minuteString = remainingMinutes  + "m";
        if (remainingMinutes < 10) {
            minuteString  = "0" + minuteString;
        }

        String secondString = seconds  + "s";
        if (seconds < 10) {
            secondString = "0" + secondString;
        }


        String durationString = hourString + " " + minuteString + " " + secondString;
        System.out.println(durationString);
        return durationString;

    }

    public static String getDurationString(int seconds) {


        if (seconds < 0) {
            System.out.println(INVALID_VALUE_MESSAGE);
            return INVALID_VALUE_MESSAGE;
        }

        int minutes = seconds/60;
        int remainingSeconds = seconds % 60;

        return(getDurationString(minutes, remainingSeconds));

    }


}
