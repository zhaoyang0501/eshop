<%@ page contentType="text/html; charset=gb2312" %>
<%@ taglib uri="/struts-bean" prefix="bean" %>
<%@ taglib uri="/struts-html" prefix="html" %>
<html>
<head>
<title><bean:message key="admin.pageTitle"/></title>
<link href="../CSS/stylesheet.css" rel="stylesheet" type="text/css">
<style type="text/css">
	<!--
	body {
		background-color: lightgrey;
	} 
	-->
</style>
</head>
<body>

<form action="./adminMember.do" method="post">
<input type="hidden" name="method" value="noticeAdd">
  <table width="600" border="0" align="center" cellpadding="0" cellspacing="0">
    <tr height="40">
        <td colspan="2" class="itemTitle" align="center">
        	新增公告
        </td>
      </tr>
      <tr height="30">
        <td width="160" align="right">标题：</td>
         <td><input name="title"  size="41" styleClass="textBox"> </td>
     </tr>
      <tr height="30">
        <td valign="top"  align="right">公告内容：</td>
        <td>
        	<textarea name="context" cols="40" rows="10" class="textBox"></textarea>
        </td>
     </tr>
      <tr height="30">
        <td colspan="2" align="center">
			<html:reset><bean:message key="reset.text"/></html:reset>
			<html:submit><bean:message key="submit.text"/></html:submit>
		</td>
     </tr>
      <tr>
        <td height="30" align="center" colspan="2" class="redText">
			<html:errors property="addCateStatus"/>
		</td>
      </tr>
    </table>
    </form>
</body>
</html>