<%@page import="com.mkt.Stock"%>

<%
Stock stock=(Stock)request.getAttribute("stock");

out.println("Company: "+stock.getName());
 out.println("<BR>");
out.println("Open, "+stock.getOpen());
out.println("<BR>");
out.println("Earn, "+stock.getEarns());
out.println("<BR>");
out.println("High, "+stock.getHigh());
out.println("<BR>");
out.println("Last, "+stock.getLast());
out.println("<BR>");
out.println("Low, "+stock.getLow());
out.println("<BR>");
out.println("MktCap, "+stock.getMktCap());
out.println("<BR>");
out.println("AnnRange, "+stock.getAnnRange());
out.println("<BR>");
out.println("Change, "+stock.getChange());
out.println("<BR>");
out.println("Date, "+stock.getDate());
out.println("<BR>");
out.println("P-E, "+stock.getPe());
out.println("<BR>");
out.println("Percentage Change, "+stock.getPercentageChange());
out.println("<BR>");
out.println("Previous Close, "+stock.getPreviousClose());
out.println("<BR>");
out.println("Time, "+stock.getTime());
out.println("<BR>");
out.println("Volume, "+stock.getVolume());
out.println("<BR>");
out.println("Symbol, "+stock.getSymbol());
out.println("<BR>");
out.println("<BR>");
%>
<%
   String myPage = "index.jsp";
%>
<input type="button" value="home" onclick="JavaScript:window.location='<%= myPage %>';">
