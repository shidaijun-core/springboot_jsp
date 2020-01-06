<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
  <h1>springboot+jsp搭建成功！</h1>
      <table>
          <tr>
              <td>${user.userid}</td>
              <td>${user.username}</td>
              <td>${user.pwd}</td>
              <td>${user.role}</td>
          </tr>
      </table>
</body>
</html>
