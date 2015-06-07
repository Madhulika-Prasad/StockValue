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
public class Stock {
	
	String symbol;
	String last;
	String date;
	String time;
	String change;
	String open;
	String high;
	String low;
	String volume;
	String mktCap;
	String previousClose;
	String percentageChange;
	String annRange;
	String earns;
	String pe;
	String name;
	public String getSymbol() {
		return symbol;
	}
	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}
	public String getLast() {
		return last;
	}
	public void setLast(String last) {
		this.last = last;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getChange() {
		return change;
	}
	public void setChange(String change) {
		this.change = change;
	}
	public String getOpen() {
		return open;
	}
	public void setOpen(String open) {
		this.open = open;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getVolume() {
		return volume;
	}
	public void setVolume(String volume) {
		this.volume = volume;
	}
	public String getMktCap() {
		return mktCap;
	}
	public void setMktCap(String mktCap) {
		this.mktCap = mktCap;
	}
	public String getPreviousClose() {
		return previousClose;
	}
	public void setPreviousClose(String previousClose) {
		this.previousClose = previousClose;
	}
	public String getPercentageChange() {
		return percentageChange;
	}
	public void setPercentageChange(String percentageChange) {
		this.percentageChange = percentageChange;
	}
	public String getAnnRange() {
		return annRange;
	}
	public void setAnnRange(String annRange) {
		this.annRange = annRange;
	}
	public String getEarns() {
		return earns;
	}
	public void setEarns(String earns) {
		this.earns = earns;
	}
	public String getPe() {
		return pe;
	}
	public void setPe(String pe) {
		this.pe = pe;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	

}
