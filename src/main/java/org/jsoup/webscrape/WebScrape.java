package org.jsoup.webscrape;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;

public class WebScrape {
    public static void main(String[] args) throws IOException {

       final String url = "https://www.imdb.com/chart/top";
        final Document document = Jsoup.connect(url).get();
          for (Element row : document.select("table.chart.full-width tr"))
          {
              final String title = row.select(".titleColumn").text();
              System.out.println(title);
          }

        /*
        Corona Cases Countries
        final String url = "https://www.worldometers.info/coronavirus";
        final Document document = Jsoup.connect(url).get();
        for (Element row : document.select("div.row")) {
            final String title = row.select(".mt_a").text();
            System.out.println("Countries Name :"+ title);
         */
  /*      final String url = "https://www.worldometers.info/world-population/";
        final Document document = Jsoup.connect(url).get();
            final String title = document.select("div.content-inner").select("div.maincounter-wrap").select("div.maincounter-number").select("rts-counter").text();
            System.out.println("Current World Population :"+title);

   */
    }

}
