package com.pushtech.crawler.launcher;

import static com.pushtech.crawler.launcher.CrawlListing.getNextPageLink;

import java.util.ArrayList;

import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpResponse;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import com.pushtech.commons.Product;
import com.pushtech.crawler.beans.Page;
import com.pushtech.crawler.connection.ConnectionHandler;
import com.pushtech.crawler.connection.EngineContext;
import com.pushtech.crawler.ihm.FormHandler;
import com.pushtech.crawler.parsing.ParserFactory;
import com.pushtech.crawler.serialization.AbstractDAOEntity;
import com.pushtech.crawler.serialization.DAOFactory;
import com.pushtech.crawler.serialization.DataBaseDAO;
import com.pushtech.crawler.serialization.ProductDAO;

public class Crawler extends Thread{

	@Override
	public void run() {
		String linkToCrawl = FormHandler.getForm().getLinkToCrawl();
		if (StringUtils.isBlank(linkToCrawl)) {
			linkToCrawl = "http://www.alcodistributions.fr/";
		}
//		new TreatCrawl(linkToCrawl);
		
		
		new Crawl(linkToCrawl);
	}
	
}
