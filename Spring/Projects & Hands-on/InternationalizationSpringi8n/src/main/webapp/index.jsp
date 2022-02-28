<%@page import="java.util.Locale"%>
<%@page import="org.springframework.context.support.AbstractApplicationContext"%>
<%@page import="org.springframework.context.support.ClassPathXmlApplicationContext"%>
<%
String lang=request.getHeader("accept-language");
//lang="te";
Locale locale1=new Locale(lang);
AbstractApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
String value=context.getMessage("label", null, locale1);
%>

<form action="./hello">
	<%=value%>:<input type="text" name="name"/>
	<input type="submit" value="submit"/>
</form>

<!-- standard format for locale file is <Name>_<localeName>.properties, for example Data_en.properties, in line 9 locale object and field name is passed to get corresponding unicode-->