/**
 * Created by zxk175 on 16/12/2.
 */

var $table = $('#infos');

//bootstrapTable使用中文
$.extend($.fn.bootstrapTable.defaults, $.fn.bootstrapTable.locales['zh-CN']);

//防止表头与表格不对齐
$(window).resize(function () {
    $table.bootstrapTable('resetView');
});

$(function () {
    //使用严格模式
    "use strict";

    tableInit();
    $('#users').bootstrapTable('hideLoading');
})

//初始化Table
function tableInit() {
    //先销毁表格
    $table.bootstrapTable('destroy');

    $table.bootstrapTable({
        //请求地址
        url: 'showInfo',
        //请求方式
        method: 'post',
        //请求内容类型
        contentType: "application/x-www-form-urlencoded",
        //数据类型
        dataType: "json",
        //table高度，
        //如果没有设置height属性，
        //表格自动根据记录条数觉得表格高度
        height: '482',
        //是否显示行间隔色
        striped: true,
        //是否启用排序
        sortable: false,
        //排序方式
        sortOrder: "asc",
        //是否使用缓存
        cache: false,
        //每行的唯一标识
        uniqueId: "id",
        //指定工具栏
        toolbar: "#toolbar",
        //显示隐藏列
        showColumns: true,
        //显示刷新按钮
        showRefresh: false,
        //切换显示样式
        showToggle: false,
        //显示Table脚部
        showFooter: false,
        //是否显示详细视图
        cardView: false,
        //是否显示父子表
        detailView: true,
        //detail格式化
        detailFormatter: genderDetail,
        //是否显示分页
        pagination: true,
        //是否显示分页按钮
        showPaginationSwitch: false,
        //是否启用点击选中行
        clickToSelect: false,
        //最少要显示的列数
        minimumCountColumns: 2,
        //cell没有值时显示
        undefinedText: '-',
        //分页方式：client客户端分页，server服务端分页
        sidePagination: "server",
        //每页的记录行数
        pageSize: 10,
        //初始化加载第1页，默认第1页
        pageNumber: 1,
        //可供选择的每页的行数
        pageList: "[10, 25, 50, 80, 100]",
        paginationFirstText: "首页",
        paginationPreText: "上一页",
        paginationNextText: "下一页",
        paginationLastText: "末页",
        buttonsClass: 'default',
        iconsPrefix: 'glyphicon',
        queryParams: queryParams,
        icons: {
            paginationSwitchDown: 'glyphicon-collapse-down icon-chevron-down',
            paginationSwitchUp: 'glyphicon-collapse-up icon-chevron-up',
            refresh: 'glyphicon-refresh icon-refresh',
            toggle: 'glyphicon-list-alt icon-list-alt',
            columns: 'glyphicon-th icon-th',
            detailOpen: 'glyphicon-plus icon-plus',
            detailClose: 'glyphicon-minus icon-minus'
        }, columns: [{
            field: 'state',
            checkbox: true,
            align: 'center',
            valign: 'middle'
        }, {
            title: '序号',
            field: 'index',
            align: 'center',
            valign: 'middle',
            formatter: genderIndex
        }, {
            title: '档案编号',
            field: 'id',
            align: 'center',
            valign: 'middle'
        }, {
            title: '客户姓名',
            field: 'customerName',
            align: 'center',
            valign: 'middle'
        }, {
            title: '配镜日期',
            field: 'date',
            align: 'center',
            valign: 'middle'
        }, {
            title: '联系方式',
            field: 'telNum',
            align: 'center',
            valign: 'middle'
        }, {
            title: '裸视（左）',
            field: 'preLeft',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '裸视（右）',
            field: 'preRight',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '矫正（左）',
            field: 'postLeft',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '矫正（右）',
            field: 'postRight',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '球镜（左）',
            field: 'qiuLeft',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '柱镜（左）',
            field: 'zhuLeft',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '轴位（左）',
            field: 'zhouLeft',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '球镜（右）',
            field: 'qiuRight',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '柱镜（右）',
            field: 'zhuRight',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '轴位（右）',
            field: 'zhouRight',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '瞳距',
            field: 'tongJu',
            align: 'center',
            valign: 'middle'
        }, {
            title: '镜架名称',
            field: 'frameName',
            align: 'center',
            valign: 'middle'
        }, {
            title: '镜架价格',
            field: 'framePrice',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '镜片名称',
            field: 'glassName',
            align: 'center',
            valign: 'middle'
        }, {
            title: '镜片价格',
            field: 'glassPrice',
            align: 'center',
            valign: 'middle',
            visible: false
        }, {
            title: '实收金额',
            field: 'totalPrice',
            align: 'center',
            valign: 'middle'
        }, {
            title: '备注',
            field: 'comment',
            align: 'center',
            valign: 'middle'
        }, {
            title: '操作',
            field: 'operate',
            align: 'center',
            events: operateEvents,
            formatter: genderOpt
        }],
        responseHandler: function (res) {
            if (res.status == 0) {
                var obj = {
                    "total": res.total,
                    "rows": res.records,
                };
            } else {
                var obj = {
                    "total": 0,
                    "rows": [],
                }
            }
            return obj;
        }, onLoadSuccess: function () {
            //加载成功时执行
            console.log("加载成功!");
        }, onLoadError: function () {
            //加载失败时执行
            layer.msg("加载失败!", {icon: 2, time: 2000});
        }, formatLoadingMessage: function () {
            //正在加载
            return "请稍等，正在加载中...";
        }, formatNoMatches: function () {
            //没有匹配的结果
            return '无符合条件的记录';
        }
    })
}

//生成详细视图
function genderDetail(index, row) {
    var html = [];
    $.each(row, function (key, value) {
        html.push('<p><b>' + key + ':</b> ' + value + '</p>');
    });
    return html.join('');
}

//生成序号
function genderIndex(value, row, index) {
    return index + 1;
}

//自定义列内容
function genderOpt() {
    return [
        '<a id="edit" href="javascript:void(0)" title="编辑">',
        '<i class="glyphicon glyphicon-pencil"></i>',
        '</a>  ',
        '<a id="remove" href="javascript:void(0)" title="删除">',
        '<i class="glyphicon glyphicon-trash"></i>',
        '</a>'
    ].join('');
}

//自定义列内容事件
window.operateEvents = {
    'click #edit': function (e, value, row, index) {
        editData(row);
    },
    'click #remove': function (e, value, row, index) {
        delData(row.id, "one");
    }
};

//查询条件与分页数据
function queryParams(params) {
    //排序方式
    params.order = "date_ desc";
    //第几页
    params.nowPage = this.pageNumber;
    //name
    params.name = $("#name").val();
    //manager
    params.manager = $('#manager').val();
    //tel
    params.tel = $("#telNum").val();
    //comment
    params.comment = $("#comment").val();
    return params;
}
