<%--
  Created by IntelliJ IDEA.
  User: Ning
  Date: 1/3/2018 0003
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet"
          type="text/css"
          href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
          crossorigin="anonymous">
</head>

<body>
<div>
    <br><br><br><br><br>
</div>

<div class="jumbotron">
    <div class="container">
        <form action="/view" method="post">
            <input type="submit" class="btn btn-primary" value="加密">
        </form>
    </div>
</div>


<script type="text/javascript">
    function item(value) {
        alert('item');
    }
</script>
</body>
</html>
