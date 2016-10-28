<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<c:import url="${pageContext.request.contextPath}/admin/top.do"/>


<div class="container"  id="app" style="height:1500px;">
    <c:if test="${not empty alert}">
        <script> layer.msg('${alert}');</script>
    </c:if>


    <form class="form-horizontal" action="/admin/msg/one/${one.id}" id="form1" method="post">
        <div class="form-group">
            <label  class="col-sm-2 control-label">id：</label>
            <div class="col-sm-10">
                <input type="text" name="id" class="form-control "  value="${one.id}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">title：</label>
            <div class="col-sm-10">
                <input type="text" name="title" class="form-control "  value="${one.title}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">cateid：</label>
            <div class="col-sm-10">
                <input type="text" name="cateid" class="form-control "  value="${one.cateid}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">summary：</label>
            <div class="col-sm-10">
                <input type="text" name="summary" class="form-control "  value="${one.summary}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">pic1：</label>
            <div class="col-sm-10">
                <input type="text" name="pic1" class="form-control  pic"  value="${one.pic1}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">pic2：</label>
            <div class="col-sm-10">
                <input type="text" name="pic2" class="form-control  pic"  value="${one.pic2}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">pic3：</label>
            <div class="col-sm-10">
                <input type="text" name="pic3" class="form-control  pic"  value="${one.pic3}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">pic4：</label>
            <div class="col-sm-10">
                <input type="text" name="pic4" class="form-control  pic"  value="${one.pic4}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">pic5：</label>
            <div class="col-sm-10">
                <input type="text" name="pic5" class="form-control  pic"  value="${one.pic5}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">body：</label>
            <div class="col-sm-10">
                <textarea type="text" name="body" class="form-control  content"  >${one.body}</textarea>
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">author：</label>
            <div class="col-sm-10">
                <input type="text" name="author" class="form-control "  value="${one.author}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">ctime：</label>
            <div class="col-sm-10">
                <input type="text" name="ctime" class="form-control "  value = "<fmt:formatDate value="${one.ctime}" pattern="yyyy-MM-dd"/>">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">bzdate：</label>
            <div class="col-sm-10">
                <input type="text" name="bzdate" class="form-control "  value="${one.bzdate}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">bzren：</label>
            <div class="col-sm-10">
                <input type="text" name="bzren" class="form-control "  value="${one.bzren}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">bzno：</label>
            <div class="col-sm-10">
                <input type="text" name="bzno" class="form-control "  value="${one.bzno}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">bzaddress：</label>
            <div class="col-sm-10">
                <input type="text" name="bzaddress" class="form-control "  value="${one.bzaddress}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">tvurl：</label>
            <div class="col-sm-10">
                <input type="text" name="tvurl" class="form-control "  value="${one.tvurl}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">hits：</label>
            <div class="col-sm-10">
                <input type="text" name="hits" class="form-control "  value="${one.hits}">
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">utime：</label>
            <div class="col-sm-10">
                <input type="text" name="utime" class="form-control "  value='<fmt:formatDate value="${one.utime}" pattern="yyyy-MM-dd"/>'>
            </div>
        </div>

        <div class="form-group">
            <label  class="col-sm-2 control-label">oid：</label>
            <div class="col-sm-10">
                <input type="text" name="oid" class="form-control "  value="${one.oid}">
            </div>
        </div>

        <div class="form-group">
            <div class="col-sm-offset-2 col-sm-10">
                <button type="submit" class="btn btn-primary ">提交</button>
                <a class="btn btn-primary " href="/admin/msg/list" role="button">返回</a>
            </div>
        </div>
    </form>
</div>
<script>
 $(function(){

     $('input[name="cateid"]').combobox({
         url:'/admin/nav/list',
         valueField:'url',
         textField:'name'
     });

 });


</script>
<c:import url="${pageContext.request.contextPath}/admin/foot.do"/>

