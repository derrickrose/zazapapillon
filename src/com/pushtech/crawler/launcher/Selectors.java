package com.pushtech.crawler.launcher;

public class Selectors {

   // home page
   // public static final String ALL_LISTING = "td:has(input[name=codigo]):has(table)";
   // category page
   // listing page

   // product page
   public static final String PRODUCT_PAGE_IDENTIFIER = "h1";
   public static final String PRODUCT_NAME = "h1";
   public static final String PRODUCT_LINK = "td:has(input[name=codigo]):has(table) a:not(:has(img))";
   public static final String PRODUCT_DESCRIPTION = "meta[name=Description]";
   public static final String PRODUCT_KEYWORDS = "meta[name=keywords]";
   public static final String PRODUCT_IDENTIFIER = "span.mini";
   public static final String PRODUCT_CATEGORY = "div#contenido";
   public static final String PRODUCT_IMAGE = "img[name=foto]";
   public static final String PRODUCT_PRICE = "input[name^=precio]";

   // listing page
   public static final String LISTING_PAGE_IDENTIFIER = "td:has(input[name=codigo]):has(table)";
   public static final String HOME_PAGE_IDENTIFIER = "#coin-slider-portada_slide";
   public static final String LISTING_PAGE_PRODUCTS = "td:has(input[name=codigo]):has(table)";
   public static final String LISTING_PAGE_PRODUCT_LINK = "td:has(input[name=codigo]):has(table) a:not(:has(img))";
   public static final String NEXT_PAGE_LINK = "a[name=siguiente_pagina]";
   // public static final String ALL_LISTING="div.divino>ul>li>div>ul>ul>li>a";//OTHERS
   // public static final String ALL_LISTING="div#capa120843>ul a";//ALL//capa120843
   // public static final String ALL_LISTING="#menu div[id*=capa] > ul a";
   // public static final String ALL_LISTING = "li:has(h2:contains(LICENCES)) + div a:has(h3:matchesOwn((S|T|U|V|W|X|Y|Z)([a-zA-Z]+\\s)+))";
   // public static final String ALL_LISTING = "li:has(h2:contains(JOUETS)) + div a:has(h3:contains(PERSONNAGE))+ div li a";
   public static final String ALL_LISTING = "div.divino a[href*=categorias]"; //

}
