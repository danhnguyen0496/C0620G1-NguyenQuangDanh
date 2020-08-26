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
            URL url = new URL("http://dantri.com.vn/the-gioi.htm");
            Scanner scanner = new Scanner(new InputStreamReader(url.openStream()));
//            System.out.println(scanner);
            scanner.useDelimiter("\\Z");
//            System.out.println(scanner);
            String news = scanner.next();
            scanner.close();
//            System.out.println(news);
            news = news.replaceAll("\\n+", "");
//            System.out.println(news);
            Pattern pattern = Pattern.compile("title=\"(.*?)\">");
            Matcher matcher = pattern.matcher(news);
            while (matcher.find()) {
                System.out.println(matcher.group(2));
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
