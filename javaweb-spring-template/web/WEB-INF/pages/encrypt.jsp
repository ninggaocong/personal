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
    <br><%--
  Created by IntelliJ IDEA.
  User: Ning
  Date: 1/3/2018 0003
  Time: 1:09 PM
  To change this template use File | Settings | File Templates.
--%>
    <br><br><br><br>
</div>

<div class="row">
    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div>

    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4">
            <form class="form-horizontal" action="/view" method="post">
                <div class="form-group">
                    <label class="col-md-2 control-label">加密方式</label>
                    <div class="col-md-10">
                        <select class="form-control" name="type">
                            <option onclick="item('')" value="1">移位加密</option>
                            <option value="2">置换加密</option>
                            <option value="3">维吉尼亚加密</option>
                            <option value="4">仿射加密</option>
                        </select>
                    </div>
                </div>

                <div class="form-group">
                    <label for="plaintext" class="col-md-2 control-label">明文</label>
                    <div class="col-md-10">
                        <input name="text" class="form-control" id="plaintext" placeholder="明文">
                    </div>
                </div>

                <div class="form-group">
                    <label for="key" class="col-md-2 control-label">秘钥</label>
                    <div class="col-md-10">
                        <input name="key" class="form-control" id="key" placeholder="秘钥">
                    </div>
                </div>

                <button type="submit" class="btn btn-primary">加密</button>
            </form>
    </div>

    <div class="col-xs-4 col-sm-4 col-md-4 col-lg-4"></div>
</div>

<script type="text/javascript">
    function item(value) {
        alert('item');
    }
</script>
</body>
</html>
