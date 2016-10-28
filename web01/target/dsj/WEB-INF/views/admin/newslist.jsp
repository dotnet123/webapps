<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>

<c:import url="${pageContext.request.contextPath}/admin/top.do"/>

<div class="container"  id="app">

    <table class="table table-bordered" style="margin-top:3px;">
        <thead>
        <tr>
            <th>#编号</th>
            <th>标题</th>
        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="item" varStatus="vs">
            <tr>
                <td>${item.id}</td>
                <td><a
                      href="/admin/news/one/${item.id}">${item.title}</a></td>
            </tr>
        </c:forEach>
        </tbody>
    </table>


    <div id="pager123"></div>
</div>


<script> var loadurl =""; </script>
<c:import url="${pageContext.request.contextPath}/admin/foot.do"/>
<script>setPager(${count});</script>