<%--
  Created by IntelliJ IDEA.
  User: 刘家顺
  Date: 2021/12/14
  Time: 21:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style>
        body{
            background: url("/images/123.jpg") no-repeat;
        }

        .box{
            position: relative;
            width: 400px;
            height: 400px;
            background-color: rgba(105,101,105,.4);
            position: absolute;
            top: 50%;
            left: 50%;
            margin-top: -200px;
            margin-left: -200px;
        }

        .box .f{
            position: absolute;
            top: 40px;
            left:37.5px;
        }
        .box .f tr .left{
            padding-top: 20px;
            text-align: center;
        }
        .box .f tr td input{
            width: 251px;
            height: 32px;
            border: 1px solid #A6A6A6 ;
            /*设置边框圆角*/
            border-radius: 5px;
            padding-left: 5px;
            margin-left: 10px;
            margin-top: 20px;

        }
        .box .f .img td img{
            text-align: center;
            width: 100px;
            height: 50px;
            padding-left: 113px;
            margin-top: 13px;
        }
        .box .f tr td .login{
            width: 100px;
            height: 32px;
            border: 1px solid #A6A6A6 ;
            /*设置边框圆角*/
            border-radius: 5px;
            padding-left: 5px;
            margin-left: 110px;
            /* 	margin-top: 20px; */
        }
        .error{
            position: absolute;
            bottom:21px;
            left:142px;

        }
    </style>
    <title>登录页面</title>
</head>
<body>
<div class="box">
    <form action="LoginServlet" method="post" class="f">
        <table>
            <tr>
                <td class="left">用户名</td>
                <td><input type="text" name="username" placeholder="请输入用户名"/></td>
            </tr>
            <tr>
                <td class="left">密码</td>
                <td><input type="password" name="password" placeholder="请输入密码"/></td>
            </tr>

            <tr>
                <td colspan="2"><input type="submit" value="登录" class="Login" /></td>
            </tr>
        </table>

    </form>
</div>

</body>
</html>
