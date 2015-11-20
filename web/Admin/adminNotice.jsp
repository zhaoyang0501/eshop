<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-bean" prefix="bean"%> 
<%@ taglib uri="/struts-html" prefix="html"%> 
<%@ taglib uri="/struts-logic" prefix="logic" %>
<%@ taglib uri="http://displaytag.sf.net" prefix="display" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html> 
	<head>
		<title><bean:message key="admin.pageTitle"/></title>
		<link rel="stylesheet" type="text/css" href="../CSS/stylesheet.css">
		<link rel="stylesheet" type="text/css" href="../CSS/displaytag.css" />		
	<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
	<style type="text/css">
		<!--
		body {
			background-color: lightgrey;
		}
		-->
	</style>
	</head>  
  <body>
	<table border="0" align="center" cellpadding="0" cellspacing="0" style="background-color:lightgrey; border:0px;">
	  <tr>
		<td height="40" class="itemTitle" align="center">公告管理</td>
	  </tr>
	  <tr>
		<td height="30" class="blueText" align="center">
			<html:link page="/Admin/adminAddNotice.jsp">
					 <span class="blueText">新增公告</span>			
			</html:link>
		</td>
	  </tr>
	  <tr>
	    <td height="30" align="center">		
			<display:table name="wordList" id="row" pagesize="15" export="true" class="displaytag" requestURI="/Admin/adminMember.do?method=browseNotice" >
				<display:column property="title" title="公告标题" sortable="true" headerClass="sortable" style="text-align:center;"/>
				<display:column property="leaveDate" title="公告发布日期" sortable="true" headerClass="sortable" style="text-align:center;"/>				
				<display:column title="操作" media="html" style="text-align:center;">
					<html:link page="/Admin/adminMember.do?method=viewNotice" 
							   paramId="id" 
							   paramName="row" 
							   paramProperty="id">
						<bean:message key="notice.info"/>
					</html:link>					
					<html:link page="/Admin/adminMember.do?method=delNotice" 
							   paramId="id" 
							   paramName="row" 
							   paramProperty="id">
						<bean:message key="notice.del"/>
					</html:link>
				</display:column>
				<display:setProperty name="export.csv.filename" value="word.csv"/>
				<display:setProperty name="export.excel.filename" value="word.xls"/>
			</display:table>		
		</td>
      </tr>
	<logic:messagesPresent property="delWordStatus">
      <tr>
	    <td height="30" align="center" class="redText"><html:errors property="delWordStatus"/></td>
      </tr>
	</logic:messagesPresent>
	<logic:messagesPresent property="answerWordStatus">
      <tr>
	    <td height="30" align="center" class="redText"><html:errors property="answerWordStatus"/></td>
      </tr>
	</logic:messagesPresent>
  </table>
  </body>
</html>