<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<c:import url="${pageContext.request.contextPath}/admin/top.do"/>

<script>
    $(document).ready(function () {


        $(".btn-group > a").click(function () {
            var index3 = $(this).index();
            $.cookie('daohang', index3)
        });

        if ($.cookie("daohang") != null && $.cookie("daohang") != "") {

            var daohang = $.cookie("daohang");
            $(".btn-group > a").eq(daohang).addClass("btn-primary");

        }
        else {

            $(".btn-group > a").eq(0).addClass("btn-primary");
        }

    });
</script>

<div class="container"  id="app" style="height:1500px;">

    <div class="btn-group" style="margin-top:3px;">
<c:forEach items="${navlist}" var="item" varStatus="vs">
          <a  class="btn btn-default"
             href="/admin/msg/list?cateid=${item.url}"    role="button">${item.name}</a>
</c:forEach>
    </div>

    <table class="table table-bordered" style="margin-top:3px;">
        <thead>
        <tr>
            <th>#编号</th>
            <th>标题</th>
            <th>图片</th>

        </tr>
        </thead>
        <tbody>
        <c:forEach items="${list}" var="item" varStatus="vs">
            <tr>
            <td>${item.id}</td>
            <td><a
                   href="/admin/msg/one/${item.id}">

                <c:set var="title" value="${item.title}"></c:set>
                <c:choose>
                    <c:when test="${fn:length(title) > 35}">
                        <c:out value="${fn:substring(title, 0, 35)}......" />
                    </c:when>
                    <c:otherwise>
                        <c:out value="${title}" />
                    </c:otherwise>
                </c:choose>

            </a></td>
            <td><img src="${item.pic1}"  class="img1"/>
                <img src="${item.pic2}" class="img1"/>
                <img src="${item.pic3}" class="img1"/>
                <img src="${item.pic4}" class="img1"/></td>

        </tr>
    </c:forEach>
        </tbody>
    </table>


    <div id="pager123"></div>
</div>

            <script> var loadurl =""; </script>
    <c:import url="${pageContext.request.contextPath}/admin/foot.do"/>
            <script>setPager(${count});</script>