<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>用户信息列表</title>
</head>
<body> 
<%-- 用户列表：
<table width="100%" border=1>
<tr>
	<td>ID</td>
	<td>userCode</td>
	<td>passWord</td>
	<td>userName</td>
	<td>userSex</td>
	<td>userBirthday</td>
	<td>userDepId</td>
	<td>userDepartment</td>
	<td>userAddress</td>
	<td>userPhone</td>
	<td>userQQ</td>
	<td>userEmail</td>
	<td>userState</td>
	<td>userRemark</td>
	<td>creatTime</td>
	<td>onlineState</td>
</tr>
<c:forEach items="${user }" var="user">
<tr>
	
	<td>${user.id }</td>
	<td>${user.userCode }</td>
	<td>${user.passWord }</td>
	<td>${user.userName }</td>
	<td>${user.userSex }</td>
	<td><fmt:formatDate value="${user.userBirthday}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${user.userDepId }</td>
	<td>${user.userDepartment }</td>
	<td>${user.userAddress }</td>
	<td>${user.userPhone }</td>
	<td>${user.userQQ }</td>
	<td>${user.userEmail }</td>
	<td>${user.userState }</td>
	<td>${user.userRemark }</td>
	<td><fmt:formatDate value="${user.creatTime}" pattern="yyyy-MM-dd HH:mm:ss"/></td>
	<td>${user.onlineState }</td>

</tr>
</c:forEach>

</table>
</body> --%>
${user.username||user.sex||user.birthday||user.address }
</html>