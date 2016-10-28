<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html; charset = UTF-8" language="java"  pageEncoding="UTF-8"%>
<c:import url="${pageContext.request.contextPath}/admin/top.do"/>
<div class="container"  id="app">
    <c:if test="${not empty alert}">
           <script> layer.msg('${alert}');</script>
    </c:if>

    <form class="form-horizontal" action="/admin/news/one/${one.id}" id="form1" method="post">
        <div class="form-group">
            <label  class="col-sm-2 control-label">id：</label>
            <div class="col-sm-10">
                <input type="text" name="id" class="form-control "  value="${one.id}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">summary：</label>
            <div class="col-sm-10">
                <textarea  name="summary" class="form-control "  >${one.summary}</textarea>
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">ctime：</label>
            <div class="col-sm-10">
                <input type="text" name="ctime" class="form-control "  value = "<fmt:formatDate value="${one.ctime}" pattern="yyyy-MM-dd"/>">


            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">body：</label>
            <div class="col-sm-10">
                <input type="text" name="body" class="form-control  content"  value="${one.body}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">cateid：</label>
            <div class="col-sm-10">
                <input type="text" name="cateid" class="form-control "  value="${one.cateid}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">title：</label>
            <div class="col-sm-10">
                <input type="text" name="title" class="form-control "  value="${one.title}">

            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary ">提交</button>
                <a class="btn btn-primary " href="/admin/news/list" role="button">返回</a>
            </div>
        </div>
    </form>
</div>
<script>
var loadurl="/admin/news/one?id=${one.getId()}";
 function mysuccess(data)
{
     $.messager.alert('Info', '提交成功', 'info');
      jump(0,"/admin/news/one?id= "+data.msg);
}
</script>
<c:import url="${pageContext.request.contextPath}/admin/foot.do"/>
