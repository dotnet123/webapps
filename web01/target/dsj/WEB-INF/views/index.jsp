<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>	 <title>食行生鲜，买菜宝，价格就是比菜场低，有问题，轻松退！
</title>
    <meta http-equiv="Content-type" content="text/html;charset=UTF-8" />
    <meta http-equiv="X-UA-Compatible" content="IE=Edge,chrome=1">

    <script src="/js/all.js"  charset="utf-8"></script>

</head>
<body>
<h2>Hello World!</h2>
<script>
    KindEditor.ready(function (K) {
        var options = {
            uploadJson: '/upload/upload2json',
            fileManagerJson: '/kindeditor/jsp/file_manager_json.jsp',
            allowFileManager : false
        };
        window.editor = K.create('.Content', options);
    });
    KindEditor.ready(function (K) {
        var  editor = K.editor({
            cssPath: '/kindeditor/plugins/code/prettify.css',
            uploadJson: '/upload/upload2json'
        });

        $("body").delegate(".img", "click", function () {
            var obj = this;
            //  console.log(obj);
            editor.loadPlugin('image', function () {
                editor.plugin.imageDialog({
                    showRemote: true,
                    // imageUrl: "", //K('#' + urlid).val(),
                    clickFn: function (url, title, width, height, border, align) {
                        $(obj).val(url);
                        editor.hideDialog();
                    }
                });
            });
        });

        ///
    });
</script>

<%--<input type="text" class="img"/>--%>
<%--<textarea class="Content"></textarea>--%>

<c:forEach items="${msg}" var="m">

    ${m.oid}: ${m.title} <br/>

</c:forEach>

<form   action="/home/login">
    <input type="text" name="username" value="356"/><br>
    <input type="text" name="pw" value="356"/>
   <input type="submit" value="提交"/>
</form>
<br>这是分割线

<c:import url="${pageContext.request.contextPath}/home/foot"/>
</body>
</html>
