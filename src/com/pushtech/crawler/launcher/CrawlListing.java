package com.pushtech.crawler.launcher;

import java.util.ArrayList;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import static com.pushtech.commons.UriHandler.cleanPath;
import com.pushtech.crawler.beans.Page;

public class CrawlListing {

   public static ArrayList<String> getProductLinks(Page page) {
      ArrayList<String> productLinks = new ArrayList<String>();
      Document document = page.getDoc();
      Elements items = getOffers(document);
      for (Element item : items) {
         String link = getProductLink(item);
         System.out.println("Path :" + link);
         // for (char a : link.toCharArray()) {
         // System.err.println(" " + ((int) a) + " " + a);
         // }
         productLinks.add(link);
      }
      return productLinks;
   }

   private static Elements getOffers(Document doc) {
      return doc.select(Selectors.LISTING_PAGE_PRODUCTS);
   }

   private static Element getNextPageElement(Document doc) {
      return doc.select(Selectors.NEXT_PAGE_LINK).first();
   }

   public static String getNextPageLink(Document doc) {
      Element nextPageElement = getNextPageElement(doc);
      String nextPageLink = fromUrlAttribute(nextPageElement);
      System.out.println("Next page : " + nextPageLink);
      return nextPageLink;
   }
   
   public static String getIdFromLink(String url) {
		String id = null;
		if (url.contains("articulo")) {
			id = url.substring(url.indexOf("articulo/") + "articulo/".length());
			id = id.substring(0, id.indexOf("/"));
		}
		System.out.println("Id : " + id);
		return id;
	}

   private static String fromUrlAttribute(Element element) {
      String url = null;
      if (element != null) url = element.attr("href");
      return cleanPath(url);
   }

   private static String getProductLink(Element item) {
      Element product = item.select(Selectors.LISTING_PAGE_PRODUCT_LINK).first();
      if (product != null) {
         return cleanPath(product.attr("href"));
      } else {
         System.out.println("Error listing");
      }
      return "";
   }
   
}