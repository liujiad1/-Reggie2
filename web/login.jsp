<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <style type="text/css">
        body{
            /*颜色这个看个人喜好*/
            background: darkslategrey;
            /*字体这个看个人喜好*/
            font-family: sans-serif;
        }

        /*主要是规定中间表单尺寸，调整到自己觉得好看就行了*/
        .mainbody {
            height: 440px;
            width: 400px;
        }

        /*居中效果*/
        .middle {
            /*使左上角对应到父元素的中心*/
            top: 50%;
            left: 50%;
            position: absolute;
            /*向左向上偏移50%*/
            transform: translate(-50%, -50%);
        }

        .form-box {
            width: 100%;
            height: 100%;
            margin: auto;
            background: darkcyan;
            /* 我觉得这个圆角大小刚刚好 */
            border-radius: 40px;
        }

        .input-normal {
            width: 220px;
            height: 38px;
            margin: 30px auto;
            padding: 0;
            text-align: center;
            border-radius: 20px;
            outline: none;
            display: block;
            transition: 0.3s;
            border: 1px solid #e6e6e6;
        }

        .btn-submit {
            width: 100px;
            height: 36px;
            margin: auto;
            font-size: 18px;
            text-align: center;
            color: white;
            border-radius: 20px;
            display: block;
            background: darkslategrey;
            transition: 0.3s;
        }

        .front {
            transform: rotateY(0deg);
        }

        /* 将back旋转180度，背面朝向用户，我这边选y轴的 */
        .back {
            transform: rotateY(-180deg);
        }

        .front,
        .back {
            position: absolute;
            /* 然后设置为背面朝向用户时不可见 */
            backface-visibility: hidden;
            /* 我觉得用linear顺滑一点 */
            transition: 0.3s linear;
        }

        /* 将front旋转180度 */
        .middle-flip .front {
            transform: rotateY(180deg);
        }
        /* 将back旋转180度 */
        .middle-flip .back {
            transform: rotateY(0deg);
        }

        /* 我调整了一下，感觉还不错的样式，你可以改成其他的好看点的 */
        p {
            margin: 15px auto;
            padding: 0;
            font-size: 16px;
            color: white;
            display: block;
            text-align: center;
        }
        a {
            color: aqua;
            cursor: pointer;
        }
    </style>
</head>
<body>
<div class="mainbody middle">

    <form class="form-box front" action="LoginServlet" method="post">
        <div>
            <h1 style="color: white; padding-left: 160px;" >登录</h1>
        </div>
        <div>
            <input class="input-normal" type="text" placeholder="UserAccount" name="username" />
            <input class="input-normal" type="password" placeholder="PassWord" name="password" />
            <button class="btn-submit" type="submit">
                <a>LOGIN</a>
            </button>
        </div>
        <div>
            <p style="margin-top: 40px">If you don't have account.Please</p>
            <p>Click here to <a id="register" href="register.jsp">Sign Up</a></p>
        </div>
        <div class="error" style="margin-left: 130px;">
            <div style="color: red">${login_msg}</div>
        </div>
    </form>

</div>
    </body>
</html>