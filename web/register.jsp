<%--
  Created by IntelliJ IDEA.
  User: 刘家顺
  Date: 2021/12/20
  Time: 21:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册页面</title>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>修改用户</title>

    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery-2.1.0.min.js"></script>
    <script src="js/bootstrap.min.js"></script>
</head>
<body>
<body>
<div class="container" style="width: 400px;">
    <h3 style="text-align: center;">修改联系人</h3>
    <form action="addNew.jsp" method="post">
        <div class="form-group">
            <label for="name">姓名：</label>
            <input type="text" class="form-control" id="name" name="name"  placeholder="请输入姓名" />
        </div>



        <div class="form-group">
            <label for="password">密码：</label>
            <input type="password" class="form-control" id="password"  name="password" placeholder="请输入密码" />
        </div>

        <div class="form-group">
            <label for="phone">密码：</label>
            <input type="text" class="form-control" id="phone"  name="phone" placeholder="请输入手机号" />
        </div>



        <div class="form-group">
            <label for="birthday">生日</label>
            <input type="date" class="form-control" id="birthday" name="birthday" placeholder="请选择出生日期"/>
        </div>



        <div class="form-group" style="text-align: center">
            <input class="btn btn-primary" type="submit" value="提交" />
            <input class="btn btn-default" type="reset" value="重置" />
            <input class="btn btn-default" type="button" value="返回"/>
        </div>
    </form>
</div>
</body>
</body>
</html>
