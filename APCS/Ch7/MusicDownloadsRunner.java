import java.util.*;

public class MusicDownloadsRunner {
    public static void main(String[] args) {
        DownloadInfo d = new DownloadInfo("Funky Cold Medina");
        System.out.println(d);

        DownloadInfo x = new DownloadInfo("Stay");
        System.out.println(x);

        List<String> list = new ArrayList<String>();
        for (int i = 1; i < 6; i++)
            list.add("Hey Jude");
        for (int i = 1; i < 4; i++)
            list.add("Soul Sister");
        for (int i = 1; i < 11; i++)
            list.add("Aqualung");

        MusicDownloads md = new MusicDownloads();
        md.updateDownloads(list);
        System.out.println(md.getDownloadInfo("Stay"));
        System.out.println(md);

        list = new ArrayList<String>();
        list.add("Lights");
        list.add("Aqualung");
        list.add("Soul Sister");
        list.add("Go Now");
        list.add("Lights");
        list.add("Soul Sister");

        md.updateDownloads(list);
        System.out.println(md.getDownloadInfo("Aqualung"));
        System.out.println(md);

    }
}
