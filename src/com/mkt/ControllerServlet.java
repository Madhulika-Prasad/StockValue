package com.mkt;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mkt.webservicex.StockQuote;
import com.mkt.webservicex.StockQuoteSoap;

public class ControllerServlet extends HttpServlet {
	
	/** This controller access the SOAP based webservice to get
	 * the stock details.
	 * http://www.webservicex.net/stockquote.asmx?WSDL
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		// Get the stock symbol
		String symbol =request.getParameter("symbol");	
		StockQuote stockQuote = new StockQuote();
		// Calling web service
		StockQuoteSoap stockQuoteSoap = stockQuote.getStockQuoteSoap();
		String stockValues = stockQuoteSoap.getQuote(symbol);
		// Parse the xml string
		ParseStockXML parseStockXML = new ParseStockXML();
		Stock stock = parseStockXML.parseStock(stockValues);
		request.setAttribute("stock",stock);	
		RequestDispatcher rd=request.getRequestDispatcher("stock.jsp");	
		rd.forward(request, response);	
	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		doPost(req, resp);
	}

	
}
