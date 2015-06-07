package com.mkt;

/**
 * Stock GOOG Price 
<StockQuotes>
<Stock>
<Symbol>GOOG</Symbol>
<Last>532.11</Last>
<Date>5/29/2015</Date>
<Time>3:59pm</Time>
<Change>7.67</Change>
<Open>537.04</Open>
<High>538.63</High>
<Low>531.45</Low>
<Volume>2597407</Volume>
<MktCap>363.12B</MktCap>
<PreviousClose>539.78</PreviousClose>
<PercentageChange>-1.42%</PercentageChange>
<AnnRange>486.23 - 598.01</AnnRange>
<Earns>21.16</Earns>
<P-E>25.15</P-E>
<Name>Google Inc.</Name>
</Stock>
</StockQuotes>

 */

import javax.xml.parsers.*;
import org.xml.sax.InputSource;
import org.w3c.dom.*;
import java.io.*;

public class ParseStockXML {
	
	
	 public static String getCharacterDataFromElement(Element e) {
		    Node child = e.getFirstChild();
		    if (child instanceof CharacterData) {
		       CharacterData cd = (CharacterData) child;
		       return cd.getData();
		    }
		    return "?";
		  }
	
	 /***
		 * Parse XML string get data for element
		 * @param String stockRecords
		 * @return Object of Stock
		 */
	public Stock parseStock(String stockRecords){
		
		 Stock stock = new Stock();

		 try {
		        DocumentBuilderFactory dbf =
		            DocumentBuilderFactory.newInstance();
		        DocumentBuilder db = dbf.newDocumentBuilder();
		        InputSource is = new InputSource();
		        is.setCharacterStream(new StringReader(stockRecords));

		        Document doc = db.parse(is);
		        NodeList nodes = doc.getElementsByTagName("Stock");
		       
		        // iterate the employees
		        for (int i = 0; i < nodes.getLength(); i++) {
		           Element element = (Element) nodes.item(i);

		           NodeList symbol = element.getElementsByTagName("Symbol");
		           Element line = (Element) symbol.item(0);
		           stock.symbol= getCharacterDataFromElement(line);
		           System.out.println("Symbol: " + getCharacterDataFromElement(line));

		           NodeList last = element.getElementsByTagName("Last");
		           line = (Element) last.item(0);
		           stock.last = getCharacterDataFromElement(line);
		           System.out.println("Last: " + getCharacterDataFromElement(line));
		           
		           NodeList date = element.getElementsByTagName("Date");
		           line = (Element) date.item(0);
		           stock.date = getCharacterDataFromElement(line);          
		           System.out.println("Date: " + getCharacterDataFromElement(line));
		       
		           NodeList time = element.getElementsByTagName("Time");
		           line = (Element) time.item(0);
		           stock.time = getCharacterDataFromElement(line);
		           System.out.println("Time: " + getCharacterDataFromElement(line));
		       
		           NodeList change = element.getElementsByTagName("Change");
		           line = (Element) change.item(0);
		           stock.change = getCharacterDataFromElement(line);        
		           System.out.println("Change: " + getCharacterDataFromElement(line));
		       
		           NodeList open = element.getElementsByTagName("Open");
		           line = (Element) open.item(0);
		           stock.open = getCharacterDataFromElement(line);	           
		           System.out.println("Open: " + getCharacterDataFromElement(line));
		       
		           NodeList high = element.getElementsByTagName("High");
		           line = (Element) high.item(0);
		           stock.high = getCharacterDataFromElement(line);
		           System.out.println("High: " + getCharacterDataFromElement(line));
		       
		           NodeList low = element.getElementsByTagName("Low");
		           line = (Element) low.item(0);
		           stock.low = getCharacterDataFromElement(line);	           
		           System.out.println("Low: " + getCharacterDataFromElement(line));
		                  
		           NodeList volume = element.getElementsByTagName("Volume");
		           line = (Element) volume.item(0);
		           stock.volume = getCharacterDataFromElement(line);       
		           System.out.println("Volume: " + getCharacterDataFromElement(line));
		       
		           NodeList mktCap = element.getElementsByTagName("MktCap");
		           line = (Element) mktCap.item(0);
		           stock.mktCap = getCharacterDataFromElement(line);  
		           System.out.println("MktCap: " + getCharacterDataFromElement(line));
		       
		           NodeList previousClose = element.getElementsByTagName("PreviousClose");
		           line = (Element) previousClose.item(0);
		           stock.previousClose = getCharacterDataFromElement(line);           
		           System.out.println("PreviousClose: " + getCharacterDataFromElement(line));
		       
		           NodeList percentageChange = element.getElementsByTagName("PercentageChange");
		           line = (Element) percentageChange.item(0);
		           stock.percentageChange = getCharacterDataFromElement(line);       
		           System.out.println("PercentageChange: " + getCharacterDataFromElement(line));
		       
		           NodeList annRange = element.getElementsByTagName("AnnRange");
		           line = (Element) annRange.item(0);
		           stock.annRange = getCharacterDataFromElement(line);	           
		           System.out.println("AnnRange: " + getCharacterDataFromElement(line));
		       
		           NodeList earns = element.getElementsByTagName("Earns");
		           line = (Element) earns.item(0);
		           stock.earns = getCharacterDataFromElement(line);
		           System.out.println("Earns: " + getCharacterDataFromElement(line));
		       
		           NodeList pe = element.getElementsByTagName("P-E");
		           line = (Element) pe.item(0);
		           stock.pe = getCharacterDataFromElement(line);	           
		           System.out.println("P-E: " + getCharacterDataFromElement(line));
		       	           
		           NodeList name = element.getElementsByTagName("Name");
		           line = (Element) name.item(0);
		           stock.name = getCharacterDataFromElement(line);
		           System.out.println("Name: " + getCharacterDataFromElement(line));
		      
		        }
		    }
		    catch (Exception e) {
		        e.printStackTrace();
		    }
		return stock;
	}

}
