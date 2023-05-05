<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="security" uri="http://www.springframework.org/security/tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
  <!-- 页面meta -->
  <meta charset="utf-8">
  <meta http-equiv="X-UA-Compatible" content="IE=edge">

  <title>员工维护显示</title>
  <meta name="description" content="员工维护显示">
  <meta name="keywords" content="员工维护显示">

  <!-- Tell the browser to be responsive to screen width -->
  <meta
          content="width=device-width,initial-scale=1,maximum-scale=1,user-scalable=no"
          name="viewport">

  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/bootstrap/css/bootstrap.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/font-awesome/css/font-awesome.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/ionicons/css/ionicons.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/iCheck/square/blue.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/morris/morris.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/jvectormap/jquery-jvectormap-1.2.2.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/datepicker/datepicker3.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/daterangepicker/daterangepicker.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/datatables/dataTables.bootstrap.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/treeTable/jquery.treetable.theme.default.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/select2/select2.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/colorpicker/bootstrap-colorpicker.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/bootstrap-markdown/css/bootstrap-markdown.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/adminLTE/css/AdminLTE.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/adminLTE/css/skins/_all-skins.min.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/css/style.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/ionslider/ion.rangeSlider.skinNice.css">
  <link rel="stylesheet"
        href="${pageContext.request.contextPath}/plugins/bootstrap-slider/slider.css">
</head>

<body class="hold-transition skin-blue sidebar-mini">

<div class="wrapper">

  <!-- 页面头部 -->
  <jsp:include page="../header.jsp"></jsp:include>
  <!-- 页面头部 /-->

  <!-- 导航侧栏 -->
  <jsp:include page="../aside.jsp"></jsp:include>
  <!-- 导航侧栏 /-->

  <!-- 内容区域 -->
  <div class="content-wrapper">

    <!-- 内容头部 -->
    <section class="content-header">
      <h1>
        基础维护 <small>员工维护</small>
      </h1>
      <ol class="breadcrumb">
        <li><a href="${pageContext.request.contextPath}/WEB-INF/pages/index.jsp"><i
                class="fa fa-dashboard"></i> 系统菜单</a></li>
        <li><a
                href="${pageContext.request.contextPath}/user/findAll.do">基础维护</a></li>

        <li class="active">员工维护</li>
      </ol>
    </section>
    <!-- 内容头部 /-->

    <!-- 正文区域 -->
    <section class="content"> <!-- .box-body -->
      <div class="box box-primary">
        <div class="box-header with-border">
          <h3 class="box-title">列表</h3>
        </div>



        <div class="box-body">

          <div class="form-group form-inline">
            <div class="btn-group">
              <a class="btn btn-primary" href="${pageContext.request.contextPath}/maintenance/ToAddEmp">新增员工</a>
            </div>
          </div>

          <!-- 数据表格 -->
          <div class="table-box">

            <!--工具栏-->
            <div align="center">
              <form class="form-inline" action="${pageContext.request.contextPath}/maintenance/EmpByMultipleBlur" method="post">
                <security:csrfInput/>
               <%-- <div class="form-group">
                  <label for="">用户名</label>
                  <input type="text" class="form-control" id="" placeholder="请输入真实姓名" name="name">
                </div>--%>
                <div class="form-group">
                  <label for="">真实姓名</label>
                  <input type="text" class="form-control" id="" placeholder="请输入真实姓名" name="name" value="${param.name}">
                </div>
                &emsp;
                <div class="form-group">
                  <label for="">电话</label>
                  <input type="text" class="form-control" id="" placeholder="请输入电话号码" name="tele" value="${param.tele}">
                </div>
                &nbsp;
                <div class="form-group">
                  <label>性别</label>
                  <select name="gender" class="form-control">
                    <option value="">请选择</option>
                      <option value="1">男</option>
                      <option value="0">女</option>
                  </select>
                </div>
                  &nbsp;
                <%--<div class="form-group">
                  <label for="">电子邮件</label>
                  <input type="text" class="form-control" id="" placeholder="请输入电子邮箱" name="email">
                </div>--%>
                &emsp;

                <div class="form-group">
                  <label for="">登录时间</label>
                  <input type="Date" class="form-control" id="" placeholder="请输入登录时间" name="lastLogintime">到
                  <input type="Date" class="form-control" id="" placeholder="请输入登录时间" name="logintimes">
                </div>
                &emsp;
                <div class="form-group">
                  <label>部门名称</label>
                  <select name="depuuid" class="form-control">
                    <option value="">请选择</option>
                    <c:forEach items="${deptAll}" var="tblDept">
                      <option value="${tblDept.uuid}">${tblDept.name}</option>
                    </c:forEach>

                  </select>
                </div>

                <input type="submit" class="btn btn-default" value="搜索">

                <%--<input type="submit" class="btn btn-default" value="新建">--%>

              </form>
            </div>

           <%-- <div class="box-tools pull-right">
              <div class="has-feedback">
                <input type="text" class="form-control input-sm"
                       placeholder="搜索"> <span
                      class="glyphicon glyphicon-search form-control-feedback"></span>
              </div>
            </div>--%>
            <!--工具栏/-->

            <!--数据列表-->
            <table id="dataList"
                   class="table table-bordered table-striped table-hover dataTable">
              <thead>
              <tr>
               <%-- <th class="" style="padding-right: 0px"><input
                        id="selall" type="checkbox" class="icheckbox_square-blue">
                </th>--%>
                <th class="sorting_asc">用户名</th>
                <th class="sorting_asc">真实姓名</th>
                <th class="sorting_asc">性别</th>
                <th class="sorting_asc">出生日期</th>
                <th class="sorting_asc">电话</th>
                <th class="sorting_asc">电子邮件</th>
                <th class="sorting_asc">所属部门</th>
                <th class="sorting_asc">登录时间</th>
                <th class="text-center">操作</th>
              </tr>
              </thead>
              <tbody>
              <c:forEach items="${emp.list}" var="empList">
                <tr>
                 <%-- <td><input name="ids" type="checkbox"></td>--%>
                  <td>${empList.username}</td>
                  <td>${empList.name}</td>
                  <td>
                  <c:if test="${empList.gender ==1}">男</c:if>
                  <c:if test="${empList.gender ==0}">女</c:if>
                  </td>
                  <td>${empList.birthday}</td>
                  <td>${empList.tele}</td>
                  <td>${empList.email}</td>
                  <td>${empList.tblDep.name}</td>
                  <td>${empList.lastlogintime}</td>
                  <td class="text-center">
                    <a href="${pageContext.request.contextPath}/maintenance/empShow?uuid=${empList.uuid}" class="btn bg-olive btn-xs">详情</a>
                    <a href="${pageContext.request.contextPath}/maintenance/deleteEmp?uuid=${empList.uuid}" class="btn bg-olive btn-xs">删除</a>
                    <a href="${pageContext.request.contextPath}/maintenance/ToUpdateEmp?uuid=${empList.uuid}" class="btn bg-olive btn-xs">修改员工</a>
                  </td>
                </tr>
              </c:forEach>
              </tbody>
              <!--
          <tfoot>
          <tr>
          <th>Rendering engine</th>
          <th>Browser</th>
          <th>Platform(s)</th>
          <th>Engine version</th>
          <th>CSS grade</th>
          </tr>
          </tfoot>-->
            </table>
            <!--数据列表/-->

          </div>
          <!-- 数据表格 /-->

        </div>
        <!-- /.box-body -->

        <!-- .box-footer-->
        <div class="box-footer">
          <%--<div class="pull-left">
            <div class="form-group form-inline">
              总共2 页，共14 条数据。 每页 <select class="form-control">
              <option>1</option>
              <option>2</option>
              <option>3</option>
              <option>4</option>
              <option>5</option>
            </select> 条
            </div>
          </div>--%>

            <div class="box-footer">
              <div class="pull-left">
                <div class="form-group form-inline">
                  总共<span>${emp.pages}</span> 页,
                  当前第<span>${emp.pageNum}</span>页,
                  共<span>${emp.total}</span>条数据


                </div>
              </div>


              <div class="box-tools pull-right">
                <div class="pull-left">

                </div>
                <ul class="pagination">
                  <li><a href="${pageContext.request.contextPath}/maintenance/empList?pageNum=1" aria-label="Previous">首页</a></li>

                  <li><a href="${pageContext.request.contextPath}/maintenance/empList?pageNum=${emp.pageNum == 1 || emp.pageNum==0 ? '1': emp.pageNum-1 }">上一页</a></li>

                  <li><a href="${pageContext.request.contextPath}/maintenance/empList?pageNum=${emp.pageNum == emp.pages ? emp.pageNum : emp.pageNum+1 }">下一页</a></li>

                  <li><a href="${pageContext.request.contextPath}/maintenance/empList?pageNum=${emp.pages}" aria-label="Next">尾页</a></li>
                </ul>
              </div>
            </div>
        <!-- /.box-footer-->

      </div>
      </div>

    </section>
    <!-- 正文区域 /-->

  </div>
  <!-- @@close -->
  <!-- 内容区域 /-->

  <!-- 底部导航 -->
  <footer class="main-footer">
    <div class="pull-right hidden-xs">
      <b>Version</b> 1.0.8
    </div>
    <strong>Copyright &copy; 2014-2017 <a
            href="http://www.itcast.cn">研究院研发部</a>.
    </strong> All rights reserved. </footer>
  <!-- 底部导航 /-->

</div>

<script src="../../../plugins/jQuery/jquery-2.2.3.min.js"></script>
<script src="../../../plugins/jQueryUI/jquery-ui.min.js"></script>
<script>
  $.widget.bridge('uibutton', $.ui.button);
</script>
<script src="../../../plugins/bootstrap/js/bootstrap.min.js"></script>
<script src="../../../plugins/raphael/raphael-min.js"></script>
<script src="../../../plugins/morris/morris.min.js"></script>
<script src="../../../plugins/sparkline/jquery.sparkline.min.js"></script>
<script src="../../../plugins/jvectormap/jquery-jvectormap-1.2.2.min.js"></script>
<script src="../../../plugins/jvectormap/jquery-jvectormap-world-mill-en.js"></script>
<script src="../../../plugins/knob/jquery.knob.js"></script>
<script src="../../../plugins/daterangepicker/moment.min.js"></script>
<script src="../../../plugins/daterangepicker/daterangepicker.js"></script>
<script src="../../../plugins/daterangepicker/daterangepicker.zh-CN.js"></script>
<script src="../../../plugins/datepicker/bootstrap-datepicker.js"></script>
<script
        src="../../../plugins/datepicker/locales/bootstrap-datepicker.zh-CN.js"></script>
<script
        src="../../../plugins/bootstrap-wysihtml5/bootstrap3-wysihtml5.all.min.js"></script>
<script src="../../../plugins/slimScroll/jquery.slimscroll.min.js"></script>
<script src="../../../plugins/fastclick/fastclick.js"></script>
<script src="../../../plugins/iCheck/icheck.min.js"></script>
<script src="../../../plugins/adminLTE/js/app.min.js"></script>
<script src="../../../plugins/treeTable/jquery.treetable.js"></script>
<script src="../../../plugins/select2/select2.full.min.js"></script>
<script src="../../../plugins/colorpicker/bootstrap-colorpicker.min.js"></script>
<script
        src="../../../plugins/bootstrap-wysihtml5/bootstrap-wysihtml5.zh-CN.js"></script>
<script src="../../../plugins/bootstrap-markdown/js/bootstrap-markdown.js"></script>
<script
        src="../../../plugins/bootstrap-markdown/locale/bootstrap-markdown.zh.js"></script>
<script src="../../../plugins/bootstrap-markdown/js/markdown.js"></script>
<script src="../../../plugins/bootstrap-markdown/js/to-markdown.js"></script>
<script src="../../../plugins/ckeditor/ckeditor.js"></script>
<script src="../../../plugins/input-mask/jquery.inputmask.js"></script>
<script
        src="../../../plugins/input-mask/jquery.inputmask.date.extensions.js"></script>
<script src="../../../plugins/input-mask/jquery.inputmask.extensions.js"></script>
<script src="../../../plugins/datatables/jquery.dataTables.min.js"></script>
<script src="../../../plugins/datatables/dataTables.bootstrap.min.js"></script>
<script src="../../../plugins/chartjs/Chart.min.js"></script>
<script src="../../../plugins/flot/jquery.flot.min.js"></script>
<script src="../../../plugins/flot/jquery.flot.resize.min.js"></script>
<script src="../../../plugins/flot/jquery.flot.pie.min.js"></script>
<script src="../../../plugins/flot/jquery.flot.categories.min.js"></script>
<script src="../../../plugins/ionslider/ion.rangeSlider.min.js"></script>
<script src="../../../plugins/bootstrap-slider/bootstrap-slider.js"></script>
<script>
  $(document).ready(function() {
    // 选择框
    $(".select2").select2();

    // WYSIHTML5编辑器
    $(".textarea").wysihtml5({
      locale : 'zh-CN'
    });
  });

  // 设置激活菜单
  function setSidebarActive(tagUri) {
    var liObj = $("#" + tagUri);
    if (liObj.length > 0) {
      liObj.parent().parent().addClass("active");
      liObj.addClass("active");
    }
  }

  $(document)
          .ready(
                  function() {

                    // 激活导航位置
                    setSidebarActive("admin-datalist");

                    // 列表按钮
                    $("#dataList td input[type='checkbox']")
                            .iCheck(
                                    {
                                      checkboxClass : 'icheckbox_square-blue',
                                      increaseArea : '20%'
                                    });
                    // 全选操作
                    $("#selall")
                            .click(
                                    function() {
                                      var clicks = $(this).is(
                                              ':checked');
                                      if (!clicks) {
                                        $(
                                                "#dataList td input[type='checkbox']")
                                                .iCheck(
                                                        "uncheck");
                                      } else {
                                        $(
                                                "#dataList td input[type='checkbox']")
                                                .iCheck("check");
                                      }
                                      $(this).data("clicks",
                                              !clicks);
                                    });
                  });
</script>
</body>

</html>