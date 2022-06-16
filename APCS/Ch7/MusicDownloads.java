import java.util.*;

public class MusicDownloads {
    private List<DownloadInfo> downloadList;

    public MusicDownloads() {
        downloadList = new ArrayList<DownloadInfo>();
    }

    /* Question 1 - part A */
    public DownloadInfo getDownloadInfo(String title) {
        for (DownloadInfo download : downloadList)
            if (download.getTitle().equals(title))
                return download;
        return null;
    }

    /* Question 1 - part B */
    public void updateDownloads(List<String> titles) {
        for (String title : titles) {
            if (this.getDownloadInfo(title) == null) {
                downloadList.add(new DownloadInfo(title));
            } else {
                this.getDownloadInfo(title).incrementTimesDownloaded();
            }
        }
    }

    public String toString() {
        return "" + downloadList;
    }
}
