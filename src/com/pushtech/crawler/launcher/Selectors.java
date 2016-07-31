package com.pushtech.crawler.launcher;

public class Selectors {

   // product page
   public static final String PRODUCT_PAGE_IDENTIFIER = "div.product-view";
   public static final String PRODUCT_NAME = "div.product-name>h1";
   public static final String PRODUCT_LINK = "p.product-name>a";
   public static final String PRODUCT_DESCRIPTION = "meta[name=description]";
   public static final String PRODUCT_KEYWORDS = "meta[name=keywords]";
   public static final String PRODUCT_IDENTIFIER = "div.sku";
   public static final String PRODUCT_CATEGORY = "div.breadcrumbs>ul>li[class^=category]>a";// listing
   public static final String PRODUCT_IMAGE = "img#main-product-image";
   public static final String PRODUCT_PRICE = "span[id*=product-price]";
   public static final String PRODUCT_QUANTITY = "p.availability.in-stock>span";
   public static final String PRODUCT_DELIVERY = "div.delay-livraison>div:contains(Livraison)";

   // listing page
   public static final String LISTING_PAGE_IDENTIFIER = "ul.products-grid>li";
   public static final String HOME_PAGE_IDENTIFIER = "div.home-block";
   public static final String LISTING_PAGE_PRODUCTS = "ul.products-grid>li";
   public static final String LISTING_PAGE_PRODUCT_LINK = "p.product-name>a";
   public static final String NEXT_PAGE_LINK = "a.next";
   public static final String ALL_LISTING = "a.level-top"; //

}
