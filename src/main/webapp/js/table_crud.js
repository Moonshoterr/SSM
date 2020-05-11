/**
 * Created by zxk175 on 16/12/3.
 */

//刷新页面
function refresh() {
    $table.bootstrapTable('refresh');
}

//查询按钮点击事件
$("#btn_search").on("click", function () {
    refresh();
});

//清空条件按钮点击事件
$("#btn_clean_search").on("click", function () {
    $('#name').val("");
    $('#telNum').val("");
    $('#comment').val("");
    refresh();
});

//新增按钮点击事件
$("#btn_add").on("click", function () {
    $('#addAndUpdateLabel').text("新增档案信息");
    $('#txt_type').val("add");
    $('#addAndUpdate').modal({
        //点击ESC键,模态窗口即会退出。
        keyboard: true
    });
});

//删除按钮点击事件
$("#btn_delete").on("click", function () {
    var datas = $table.bootstrapTable('getSelections');
    if (datas.length < 1) {
        layer.alert('请选择一条或多条数据进行删除！', {icon: 2});
    } else {
        var id = [];
        for (var i = 0; i < datas.length; i++) {
            id.push(datas[i].id);
        }
        delData(id, "batch");
    }
});

$("#btn_sendMessage").on("click", function () {
    var datas = $table.bootstrapTable('getSelections');
    if (datas.length < 1) {
        layer.alert('请选择一条或多条数据！', {icon: 2});
    } else if (datas.length > 100) {
        layer.alert('一次最多发送100条 请重新选择！', {icon: 2});
    } else {
        var tel = [];
        for (var i = 0; i < datas.length; i++) {
            tel.push(datas[i].telNum);
        }
        sendMassage(tel)
    }
});

//刷新按钮点击事件
$("#btn_refresh").on("click", function () {
    refresh();
});

//切换视图按钮点击事件
$("#btn_toggleview").on("click", function () {
    $table.bootstrapTable('toggleView');
});

//清除弹窗原数据
$("#addAndUpdate").on("hidden.bs.modal", function () {
    $('#txt_id').val("");
    $('#date').val("");
    $('#txt_name').val("");
    $('#txt_preLeft').val("");
    $("#txt_preRight").val("");
    $('#txt_postLeft').val("");
    $('#txt_postRight').val("");
    $('#txt_zhuLeft').val("");
    $('#txt_zhuRight').val("");
    $('#txt_qiuLeft').val("");
    $('#txt_qiuRight').val("");
    $('#txt_zhouLeft').val("");
    $('#txt_zhouRight').val("");
    $('#txt_tongJu').val("");
    $('#txt_frameName').val("");
    $('#txt_framePrice').val("");
    $('#txt_glassName').val("");
    $('#txt_glassPrice').val("");
    $('#txt_totalPrice').val("");
    $('#txt_telNum').val("");
    $('#txt_comment').val("");
});

//弹框保存按钮点击事件
$("#btn_add_update_submit").off().on('click', function () {
    var id = $('#txt_id').val(),
        date = $('#date').val(),
        name = $('#txt_name').val(),
        preLeft = $('#txt_preLeft').val(),
        preRight = $("#txt_preRight").val(),
        postLeft = $('#txt_postLeft').val(),
        postRight = $('#txt_postRight').val(),
        zhuLeft = $('#txt_zhuLeft').val(),
        zhuRight = $('#txt_zhuRight').val(),
        qiuLeft = $('#txt_qiuLeft').val(),
        qiuRight = $('#txt_qiuRight').val(),
        zhouLeft = $('#txt_zhouLeft').val(),
        zhouRight = $('#txt_zhouRight').val(),
        tongJu = $('#txt_tongJu').val(),
        frameName = $('#txt_frameName').val(),
        framePrice = $('#txt_framePrice').val(),
        glassName = $('#txt_glassName').val(),
        glassPrice = $('#txt_glassPrice').val(),
        totalPrice = $('#txt_totalPrice').val(),
        telNum = $('#txt_telNum').val(),
        comment = $('#txt_comment').val(),
        managerId = $('#txt_manager').val(),
        type = $('#txt_type').val();

    //验证数据
    if (!name) {
        layer.msg('请填写名称!', {icon: 2, time: 1500});
        return false;
    }

    $.ajax({
        url: 'addAndUpdateInfo/' + type,
        method: 'post',
        contentType: "application/x-www-form-urlencoded",
        data: {
            managerId: managerId,
            id: id,
            date: date,
            customerName: name,
            preLeft: preLeft,
            preRight: preRight,
            postLeft: postLeft,
            postRight: postRight,
            zhuLeft: zhuLeft,
            zhuRight: zhuRight,
            qiuLeft: qiuLeft,
            qiuRight: qiuRight,
            zhouLeft: zhouLeft,
            zhouRight: zhouRight,
            tongJu: tongJu,
            frameName: frameName,
            framePrice:framePrice,
            glassName: glassName,
            glassPrice: glassPrice,
            totalPrice: totalPrice,
            telNum: telNum,
            comment: comment
        },
        //阻止深度序列化，向后台传送数组
        traditional: true,
        success: function (msg) {
            if (msg.success) {
                layer.msg(msg.msg, {icon: 1, time: 1500});
            } else {
                layer.msg(msg.msg, {icon: 2, time: 1500});
            }
            refresh();
        }
    })
});

//tr中编辑按钮点击事件
function editData(row) {
    //向模态框中传值
    $('#txt_id').val(row.id);
    $('#date').val(row.date);
    $('#txt_name').val(row.customerName);
    $('#txt_preLeft').val(row.preLeft);
    $("#txt_preRight").val(row.preRight);
    $('#txt_postLeft').val(row.postLeft);
    $('#txt_postRight').val(row.postRight);
    $('#txt_zhuLeft').val(row.zhuLeft);
    $('#txt_zhuRight').val(row.zhuRight);
    $('#txt_qiuLeft').val(row.qiuLeft);
    $('#txt_qiuRight').val(row.qiuRight);
    $('#txt_zhouLeft').val(row.zhouLeft);
    $('#txt_zhouRight').val(row.zhouRight);
    $('#txt_tongJu').val(row.tongJu);
    $('#txt_frameName').val(row.frameName);
    $('#txt_framePrice').val(row.framePrice);
    $('#txt_glassName').val(row.glassName);
    $('#txt_glassPrice').val(row.glassPrice);
    $('#txt_totalPrice').val(row.totalPrice);
    $('#txt_telNum').val(row.telNum);
    $('#txt_comment').val(row.comment);
    $('#txt_manager').val(row.managerId);

    $('#txt_type').val("update");

    $('#addAndUpdateLabel').text("修改档案信息");

    //显示模态窗口
    $('#addAndUpdate').modal({
        //点击ESC键,模态窗口即会退出。
        keyboard: true
    });
}

//tr中删除按钮点击事件
function delData(id, type) {
    layer.confirm('确定要删除用户编号为' + id + '数据?', {icon: 3, title: '提示'}, function () {
        $.ajax({
            url: 'deleteInfo/' + type,
            method: 'post',
            contentType: "application/x-www-form-urlencoded",
            //阻止深度序列化，向后台传送数组
            traditional: true,
            data: {id: id.toString()},
            success: function (msg) {
                if (msg.success) {
                    layer.msg(msg.msg, {icon: 1, time: 1500});
                } else {
                    layer.msg(msg.msg, {icon: 2, time: 1500});
                }
                refresh();
            }
        })
    });
}

// 发送短信事件
function sendMassage(tel) {
    layer.confirm('确定要发送' + tel.length + '条短信？（约0.05元/条计费）', {icon: 3, title: '提示'}, function () {
        $.ajax({
            url: 'sendMessage',
            method: 'post',
            contentType: "application/x-www-form-urlencoded",
            //阻止深度序列化，向后台传送数组
            traditional: true,
            data: {tel: tel.toString()},
            success: function (msg) {
                if (msg.success) {
                    layer.msg(msg.msg, {icon: 1, time: 1500});
                } else {
                    layer.msg(msg.msg, {icon: 2, time: 1500});
                }
                refresh();
            }
        })
    });
}