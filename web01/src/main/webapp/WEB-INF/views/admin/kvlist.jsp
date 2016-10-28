<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>

<c:import url="${pageContext.request.contextPath}/admin/top.do"/>

<div class="container" id="app">
    <c:if test="${null != alert && alert.length()!=0}">
        <div class="alert alert-success text-center" role="alert">${alert}</div>
    </c:if>
    <form class="form-horizontal" action="/admin/kv/kuaixunhotpic" id="form1" method="post">

        <table class="table table-bordered table-hover" style="margin-top:3px;">
            <thead>
            <tr>
                <th width="10%">#序号</th>
                <th>图片</th>
                <th>链接</th>
<th></th>
            </tr>
            </thead>
            <tbody>
            <c:forEach items="${list}" var="item" varStatus="vs">
                <tr>
                    <td>
                        <input type="text" name="seqno" class="form-control text-center" value="${item.seqno}">
                    </td>

                    <td>
                        <input type="text" name="pic1" class="form-control  pic" value="${item.pic1}">

                    </td>
                    <td>
                        <input type="text" name="url" class="form-control" value="${item.url}">

                    </td>
                    <td class="text-center"><a class="btn btn-danger btn-sm" onclick="del(this)">
                        <i class="fa fa-trash-o"></i> 删除</a></td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="4">
                    <button type="submit" class="btn btn-primary">提交</button>
                    <button type="button" onclick="add(this)" class="btn btn-primary">添加一行</button>
                </td>
            </tr>
            </tbody>
        </table>

    </form>
    <div id="pager123"></div>
</div>


<c:import url="${pageContext.request.contextPath}/admin/foot.do"/>
<script>

    setPager(${count});

    function add(_this)
    {

   var html=' <tr>'+
    '<td>'+
   ' <input type="text" name="seqno" class="form-control text-center" value="1">'+
           ' </td>'+
           ' <td>'+
           ' <input type="text" name="pic1" class="form-control  pic" value="">'+
           ' </td>'+
          '  <td>'+
          '  <input type="text" name="url" class="form-control" value="">'+

           ' </td>'+
           ' <td class="text-center"><a class="btn btn-danger btn-sm" onclick="del(this)">'+
           '<i class="fa fa-trash-o"></i> 删除</a></td>'+
           ' </tr>';
       // parent().insertAfter(html);
        $(html).insertBefore($(_this).parent().parent());
    }
function del(_this)
{
  $(_this).parent().parent().remove();
}
</script>
