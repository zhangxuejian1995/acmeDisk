<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/20
  Time: 14:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.getRequestDispatcher("/list?typeparentId=1&pageNum=0&pageSize=4&typeparentId2=2").forward(request,response); %>
</body>
</html>
