<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
      <%String ctxPath = request.getContextPath(); %>


<!DOCTYPE html>
<html>
<head>
  <%--<%@include file="/WEB-INF/NewHeader.jsp" %>--%>
<meta charset="utf-8" />
<title>DeathGhost-用户中心</title>
<meta name="keywords" content="DeathGhost,DeathGhost.cn,web前端设,移动WebApp开发" />
<meta name="description" content="DeathGhost.cn::H5 WEB前端设计开发!" />
<meta name="author" content="DeathGhost"/>
	<meta name="viewport" content="width=device-width, initial-scale=1">
		<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
		<meta name="keywords" content="Play-Offs Responsive web template, Bootstrap Web Templates, Flat Web Templates, Andriod Compatible web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
		<script type="application/x-javascript"> addEventListener("load", function() {setTimeout(hideURLbar, 0); }, false); function hideURLbar(){ window.scrollTo(0,1); } </script>
		<!--bootstrap-->
		<link href="css/bootstrap.min.css" rel="stylesheet" type="text/css">
    <%--<script src="js/bootstrap.min.js"></script>
    <script src="js/jquery-2.1.4.min.js"></script>
    <script type="text/javascript" src="js/move-top.js"></script>
    <script type="text/javascript" src="js/easing.js"></script>--%>
    <link href="<%=ctxPath%>/css/style.css" rel="stylesheet" type="text/css"/>
<!--
Author: DeathGhost
Author URI: http://www.deathghost.cn
-->
<style type="text/css">
    form p{
        margin: 15px;
    }
    .wu_save{
        width: 100px;
        height:40px;
        background: #fff4c1;
        margin-left: 70px;
        font-size: 20px;
    }
    .wu_exit{
        width: 100px;
        height:40px;
        background: #fbffc6;
        font-size: 20px;
    }
</style>

</head>
<body>
<%@include file="/WEB-INF/NewNav.jsp" %>

  <div class="section fl">
    <div class="location tr">
    <a href="<%=ctxPath%>/User?action=self" class="label label-primary">我的资料</a>
    
    <a href="<%=ctxPath%>/User?action=order" class="label label-success">我的订单</a>
    <a href="<%=ctxPath%>/User?action=sign" class="label label-info">修改密码</a>
    <a href="<%=ctxPath%>/User?action=address" class="label label-warning">地址管理</a></div>
    <div class="pd20">
     <form action="<%=ctxPath%>/UserChangeSubmit" method="post">


          <p>账　　号：${user.email }</p>

        <p>昵　　称：<input type=""  name="name" value="${user.name}" class="form-control" style="display:inline-block;width: 300px;height: 35px;"></p>


       <%-- <tr>
          <th valign="top">头像：</th>
          <td>
            <div class="user-photo img fl"><img src="./uploads/10.jpg" ></div>
            <div class="upfilebox mt20">
              <a href="javascript:;" class="button btn-upfile" id="user-photo">选择照片</a>
              <p class="mt10">支持jpg,gif,png格式，建议尺寸大于100*100。</p>
            </div>
          </td>
        </tr>--%>
     <p>积　　分：${user.score }</p>

     <p>余　　额：${user.money }元</p>
     <p>职　　业：<input type="" name="major" value="${user.major}" class="form-control" style="display:inline-block;width: 300px;height: 35px;"></p>
      <p>电话号：　<input type="" name="phone" value="${user.phone}" class="form-control" style="display:inline-block;width: 300px;height: 35px;"></p>




      <%--  <tr>
          <th>所在城市：</th>
          <td><select data-placeholder="上海市" style="width:154px;" class="chosen-select-no-single" tabindex="9">
              <option>上海市</option>
              <option>上海市</option>
            </select><select data-placeholder="上海市" style="width:154px;" class="chosen-select-no-single" tabindex="9">
              <option>上海市</option>
              <option>上海市</option>
            </select><select data-placeholder="长宁区" style="width:154px;" class="chosen-select-no-single" tabindex="9">
              <option>长宁区</option>
              <option>长宁区</option>
            </select></td>
        </tr>--%>
        <p>个人简介：<textarea  name="description" width="500px" hegiht="500px" name="" cols="" rows="" class="form-control" style="width: 370px;height: 70px;">${user.description}</textarea></p>
        <p class="mt30 tc"><button type="Submit" class="btn-default btn-lg" >保　　存</button>
        <a href="<%=ctxPath%>/User?action=reset"> <button type="button" class="btn-default btn-lg">退　　出</button></a></p>


                        <label> <div style="color:red">${message}</div></label>
      
      </form>
    </div>
  </div>

<%@include file="/WEB-INF/NewFooter.jsp" %>
</body>

</html>
