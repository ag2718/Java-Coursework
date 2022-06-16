import java.util.*;

public class DownloadInfo {
    private String theTitle;
    private int timesDownloaded;

    public DownloadInfo(String title) {
        theTitle = title;
        timesDownloaded = 1;
    }

    public String getTitle() {
        return theTitle;
    }

    public void incrementTimesDownloaded() {
        timesDownloaded++;
    }

    public String toString() {
        return theTitle + " " + timesDownloaded;
    }
}
