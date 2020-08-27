package bai_19_string_and_regex.bai_tap.crawl_news;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CrawlNews {

    public static void main(String[] args) {
        try {
            URL url = new URL("https://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            System.out.println(scanner);
            scanner.useDelimiter("\\Z");
//            System.out.println(scanner);
            String news = scanner.next();
            scanner.close();
//            System.out.println(news);
            news = news.replaceAll("\\R", "");
//            System.out.println(news);
            Pattern pattern = Pattern.compile("<h3 class='news-item__title'> {20}<a {2}data-utm=\"(.*?)\" {2}href=\"(.*?)\" {2}title=\"(.*?)\"");
//            Pattern pattern = Pattern.compile("title=\"(.*?)\">");
            Matcher matcher = pattern.matcher(news);
            while (matcher.find()) {
                System.out.println(matcher.group(3));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
