/*package com.radionbes.spring.RiverBank.Rate;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.URL;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Service
public class ExchangeRate {
    private Pattern pattern = Pattern.compile("\\d{2},\\d{4}");
    private Document documentPage;
    public String getDocumentPage() throws Exception {
        documentPage = Jsoup.parse(new URL("https://ru.investing.com/currencies/"),15000);
        return find(getExchangeRate(documentPage));
    }
    public String getExchangeRate(Document document){
        Elements elements = document.select("td[class=pid-2186-last]");
        return elements.toString();
    }
    public String find(String string) throws Exception {
        Matcher matcher = pattern.matcher(string);
        if (matcher.find()) return matcher.group();
        throw  new Exception("No Matcher founded!");
    }


}*/
