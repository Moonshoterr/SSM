<%--
  Created by IntelliJ IDEA.
  User: zxk175
  Date: 16/11/13
  Time: 21:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta name="renderer" content="webkit|ie-comp|ie-stand">
    <meta name="viewport"
          content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no"/>
    <meta name="apple-mobile-web-app-capable" content="yes">
    <meta name="apple-mobile-web-app-status-bar-style" content="black">
    <meta name="format-detection" content="telephone=no">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="icon" type="image/x-icon" href="${pageContext.request.contextPath}/icon/favicon_64.ico"/>
    <link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/icon/favicon_64.ico"/>
    <title>${page_title}</title>
    <!-- jQuery -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/jquery/jquery.min.js"></script>
    <!-- bootstrap -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/bootstrap/js/bootstrap.js"></script>
    <link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/dependents/bootstrap/css/bootstrap.min.css">
    <!-- bootstrap-table -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/bootstrap-table/1.9.1/bootstrap-table.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/bootstrap-table/1.9.1/bootstrap-table-locale-all.js"></script>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/dependents/bootstrap-table/1.9.1/bootstrap-table.css"/>
    <!--[if lt IE 9]>
    <script src="${pageContext.request.contextPath}/dependents/bootstrap/plugins/ie/html5shiv.js"></script>
    <script src="${pageContext.request.contextPath}/dependents/bootstrap/plugins/ie/respond.js"></script>
    <![endif]-->
    <!--[if lt IE 8]>
    <script src="${pageContext.request.contextPath}/dependents/bootstrap/plugins/ie/json2.js"></script>
    <![endif]-->
    <!-- font-awesome -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/dependents/fontAwesome/css/font-awesome.min.css" media="all"/>
    <!-- layer -->
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/layer/layer.js"></script>
    <!-- laydate -->
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/dependents/laydate/need/laydate.css"/>
    <script type="text/javascript" src="${pageContext.request.contextPath}/dependents/laydate/laydate.js"></script>
    <!-- base -->
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/base.css">
</head>
<body>

<div class="container-fluid">

    <input type="hidden" name="manager" class="form-control" id="manager" value="${manager}">

    <h4>查询条件</h4>
    <div class="row-fluid">
        <div class="span12">
            <div class="control-group form-inline" style="border: 1px solid #ccc;padding: 10px; border-radius: 3px;">
                <div class="input-group input-group-sm">
                    <label for="name">顾客姓名</label>
                    <input id="name" type="text">
                </div>
                <div class="input-group input-group-sm">
                    <label for="telNum">联系方式</label>
                    <input id="telNum" type="text">
                </div>
                <div class="input-group input-group-sm">
                    <label for="comment">备注</label>
                    <input id="comment" type="text">
                </div>
                <button id="btn_search" type="button" class="btn btn-primary btn-sm">
                    <span class="glyphicon glyphicon-search" aria-hidden="true"></span>查询
                </button>
                <button id="btn_clean_search" type="button" class="btn btn-danger btn-sm">清空条件</button>
            </div>
        </div>
    </div>

    <div id="toolbar" class="btn-group">
        <!-- 工具栏 -->
        <button id="btn_add" type="button" class="btn btn-default btn-sm">
            <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>新增
        </button>
        <button id="btn_delete" type="button" class="btn btn-default btn-sm">
            <span class="glyphicon glyphicon-trash" aria-hidden="true"></span>删除
        </button>
        <button id="btn_sendMessage" type="button" class="btn btn-default btn-sm">
            <span class="glyphicon glyphicon-bell" aria-hidden="true"></span>发送短信
        </button>
        <button id="btn_refresh" type="button" class="btn btn-default btn-sm">
            <span class="glyphicon glyphicon-refresh" aria-hidden="true"></span>刷新
        </button>
        <button id="btn_toggleview" type="button" class="btn btn-default btn-sm">切换视图</button>
    </div>

    <!-- 表格 -->
    <table id="infos" class="table table-hover"></table>

    <!-- 新增或修改弹框 -->
    <div class="modal fade" id="addAndUpdate" tabindex="-1" role="dialog" aria-labelledby="addAndUpdateLabel">
        <div class="modal-dialog" role="document">
            <div class="modal-content">
                <div class="modal-header">
                    <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                            aria-hidden="true">×</span></button>
                    <h4 class="modal-title" id="addAndUpdateLabel">新增档案信息</h4>
                </div>
                <div class="modal-body">
                    <input type="hidden" name="txt_type" class="form-control" id="txt_type" placeholder="操作类型">
                    <input type="hidden" name="txt_id" class="form-control" id="txt_id" >
                    <input type="hidden" name="txt_manager" class="form-control" id="txt_manager" value="${manager}">
                    <div class="form-group">
                        <label for="date">配镜日期</label>
                        <input type="text" name="date" class="laydate-icon" style="margin: 10px 0;" id="date">
                    </div>
                    <div class="form-group">
                        <label for="txt_name">顾客姓名</label>
                        <input type="text" name="txt_name" class="form-control" id="txt_name" placeholder="顾客姓名">
                    </div>
                    <div class="form-group">
                        <label for="txt_telNum">电话号码</label>
                        <input type="text" name="txt_telNum" class="form-control" id="txt_telNum">
                    </div>
                    <div class="form-group">
                        <label for="txt_preLeft">裸视（左）</label>
                        <input type="text" name="txt_preLeft" class="form-control" id="txt_preLeft">
                    </div>
                    <div class="form-group">
                        <label for="txt_preRight">裸视（右）</label>
                        <input type="text" name="txt_preRight" class="form-control" id="txt_preRight">
                    </div>
                    <div class="form-group">
                        <label for="txt_postLeft">矫正（左）</label>
                        <input type="text" name="txt_postLeft" class="form-control" id="txt_postLeft">
                    </div>
                    <div class="form-group">
                        <label for="txt_postRight">矫正（右）</label>
                        <input type="text" name="txt_postRight" class="form-control" id="txt_postRight">
                    </div>
                    <div class="form-group">
                        <label for="txt_qiuLeft">球镜（左）</label>
                        <input type="text" name="txt_qiuLeft" class="form-control" id="txt_qiuLeft">
                    </div>
                    <div class="form-group">
                        <label for="txt_zhuLeft">柱镜（左）</label>
                        <input type="text" name="txt_zhuLeft" class="form-control" id="txt_zhuLeft">
                    </div>
                    <div class="form-group">
                        <label for="txt_zhouLeft">轴位（左）</label>
                        <input type="text" name="txt_zhouLeft" class="form-control" id="txt_zhouLeft">
                    </div>
                    <div class="form-group">
                        <label for="txt_qiuRight">球镜（右）</label>
                        <input type="text" name="txt_qiuRight" class="form-control" id="txt_qiuRight">
                    </div>
                    <div class="form-group">
                        <label for="txt_zhuRight">柱镜（右）</label>
                        <input type="text" name="txt_zhuRight" class="form-control" id="txt_zhuRight">
                    </div>
                    <div class="form-group">
                        <label for="txt_zhouRight">轴位（右）</label>
                        <input type="text" name="txt_zhouRight" class="form-control" id="txt_zhouRight">
                    </div>
                    <div class="form-group">
                        <label for="txt_tongJu">瞳距</label>
                        <input type="text" name="txt_tongJu" class="form-control" id="txt_tongJu">
                    </div>
                    <div class="form-group">
                        <label for="txt_frameName">镜架名称</label>
                        <input type="text" name="txt_frameName" class="form-control" id="txt_frameName">
                    </div>
                    <div class="form-group">
                        <label for="txt_framePrice">镜架价格</label>
                        <input type="text" name="txt_framePrice" class="form-control" id="txt_framePrice">
                    </div>
                    <div class="form-group">
                        <label for="txt_glassName">镜片名称</label>
                        <input type="text" name="txt_glassName" class="form-control" id="txt_glassName">
                    </div>
                    <div class="form-group">
                        <label for="txt_glassPrice">镜片价格</label>
                        <input type="text" name="txt_glassPrice" class="form-control" id="txt_glassPrice">
                    </div>
                    <div class="form-group">
                        <label for="txt_totalPrice">实收金额</label>
                        <input type="text" name="txt_totalPrice" class="form-control" id="txt_totalPrice">
                    </div>
                    <div class="form-group">
                        <label for="txt_comment">备注</label>
                        <input type="textarea" name="txt_comment" class="form-control" id="txt_comment">
                    </div>
                </div>
                <div class="modal-footer">
                    <button type="button" class="btn btn-default btn-sm" data-dismiss="modal"><span
                            class="glyphicon glyphicon-remove" aria-hidden="true"></span>关闭
                    </button>
                    <button type="button" id="btn_add_update_submit" class="btn btn-primary btn-sm"
                            data-dismiss="modal"><span
                            class="glyphicon glyphicon-floppy-disk" aria-hidden="true"></span>保存
                    </button>
                </div>
            </div>
        </div>
    </div>
</div>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/laydate.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/table.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/table_crud.js"></script>
</body>
</html>
