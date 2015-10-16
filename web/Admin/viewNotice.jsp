<%@ page language="java" pageEncoding="gb2312"%>
<%@ taglib uri="/struts-bean" prefix="bean"%> 
<%@ taglib uri="/struts-html" prefix="html"%> 
<%@ taglib uri="/struts-logic" prefix="logic" %>
<html> 
	<head>
	<title><bean:message key="admin.pageTitle"/></title>
	<link rel="stylesheet" type="text/css" href="../CSS/stylesheet.css">
	<script type="text/javascript" src="../JS/jsonrpc.js"></script>				
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
		<td height="40" class="itemTitle" align="center"><bean:message key="member.info"/></td>
	  </tr>
	  <tr>
	    <td height="30" align="center">
		<table width="94%" border="0" cellpadding="0" cellspacing="0">
          <logic:notPresent name="notice">
            <tr align="center">
              <td colspan="2" height="30" class="redText"><bean:message key="word.notExist"/></td>
            </tr>
          </logic:notPresent>
          <logic:present name="notice">
            <tr><td height="10" colspan="2"></td></tr>
            <tr>
              <td width="160" height="30" align="right">标题
                ：</td>
              <td>&nbsp;${notice.title}</td>
            </tr>
            <tr>
              <td width="160" height="30" align="right">发布日期
                ：</td>
              <td>&nbsp;${notice.leaveDate}</td>
            </tr>
            <tr>
              <td width="160" height="30" align="right">公告内容
                ：</td>
              <td>&nbsp;${notice.content}</td>
            </tr>
            <tr><td height="10" colspan="2"></td></tr>
          </logic:present>
        </table>
		</td>
      </tr>
  </table>
  <center>
	<html:link page="/Admin/adminMember.do?method=browseWord">
		<span><bean:message key="return.text"/></span>
	</html:link>
  </center>
 <script language="javascript">
 	//表单验证
	function checkForm(){
		if (document.all.answerContent.value==''){
			alert("回复内容不能为空！");
			return false;
		}else{
				document.form1.submit();
		}
	}
 </script>
</body>
</html>