<%@ page language="java" contentType="text/html; charset=utf-8"
         pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<c:set var="contextPath" value="${pageContext.request.contextPath}" scope="application"/>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <title>table模块快速使用</title>
    <link rel="stylesheet" href="css/bootstrap.min.css">

    <script src="js/jquery-3.3.1.js"></script>
    <script src="js/bootstrap.js"></script>

</head>
<body>
<div class="container">

    <div class="text-right" style="margin-top: 30px">
        <a href="index.html" style="font-size: 25px;float: left" id="add"><span class="glyphicon glyphicon-plus"></span></a>
        <label style="margin-right: 10px">
            产品代码
            <input type="text" style="border: 1px solid gainsboro;height: 30px;" id="ac">
        </label>
        <label for="risk" style="margin-right: 10px">风险评估</label>
        <select name="risk" id="risk" style="width: 15%;height: 30px;border-color: lavender;margin-right: 10px;">
        <option value="" selected = "selected" class="a1">请选择</option>
        <option value="1" class="a1">R1</option>
        <option value="2" class="a1">R2</option>
        <option value="3" class="a1">R3</option>
        </option>
    </select>
        <button type="button" class="btn btn-warning" id="sel" style="padding: 5px 40px">查询</button>
    </div>





    <div class="table-responsive" style="clear: both">

        <table class="table table-bordered" >
            <tr class="info" style="font-weight: bold">
                <td>产品代码</td>
                <td>风险评级</td>
                <td>预期收益</td>
                <td>发售起始日</td>
                <td>发售截止日</td>
                <td>产品到期日</td>
            </tr>
            <tbody id="fp">

            </tbody>
        </table>
    </div>

</div>

<script>
    up();
    $("#sel").click(function () {

       up();
    });
    function up() {
        var risk = $("#risk").val();
        var id  = $("#ac").val();
        console.log(risk+" "+id);
        $.ajax({
            url:"${contextPath}/getFP",
            data:{"id":id,"risk":risk},
            type:"post",
            dataType:"json",
            success:function (data) {
                var result="";
                for(var i =0 ;i<data.length;i++){
                    if (i%2===0){
                        result+="<tr class='btn-warning'>";
                    }else{
                        result+="<tr>";
                    }
                    result+="<td>"+data[i].id+"</td>"
                    result+="<td>"+data[i].risk+"</td>"
                    result+="<td>"+data[i].income+"</td>"
                    result+="<td>"+data[i].saleStarting+"</td>"
                    result+="<td>"+data[i].saleEnd+"</td>"
                    result+="<td>"+data[i].end+"</td>"
                    result+="</tr>";
                }
                $("#fp").html(result);

            }
        });
    }

</script>


</body>
</html>
