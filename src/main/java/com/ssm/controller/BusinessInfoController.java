package com.ssm.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.ssm.entity.BaseResult;
import com.ssm.entity.Pages;
import com.ssm.entity.po.BusinessInfo;
import com.ssm.entity.po.BusinessInfoExample;
import com.ssm.service.BusinessInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.commons.httpclient.Header;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.NameValuePair;
import org.apache.commons.httpclient.methods.PostMethod;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Controller
public class BusinessInfoController {
    @Autowired
    private BusinessInfoService businessInfoService;

    @ResponseBody
    @RequestMapping(value = "showInfo", method = RequestMethod.GET)
    public Pages<BusinessInfo> getShowInfo(HttpServletRequest request) {
        return showInfo(request, "GET");
    }

    @ResponseBody
    @RequestMapping(value = "showInfo", method = RequestMethod.POST)
    public Pages<BusinessInfo> postShowInfo(HttpServletRequest request) {
        return showInfo(request, "POST");
    }

    public Pages<BusinessInfo> showInfo(HttpServletRequest request, String method) {
        String limit = request.getParameter("limit");
        String nowPage = request.getParameter("nowPage");
        String order = request.getParameter("order");
        String managerId = request.getParameter("manager");
        String name = request.getParameter("name");
        String telNum = request.getParameter("tel");
        String comment = request.getParameter("comment");

        // 当前页数
        int nowPaged = Integer.parseInt(null == nowPage ? "1" : nowPage);
        // 每页显示页数
        int limited = Integer.parseInt(null == limit ? "10" : limit);

        Pages<BusinessInfo> pages = new Pages<>();
        //开始分页,参数1为请求第几页,参数2为请求条数
        PageHelper.startPage(nowPaged, limited);


        //查询条件
        BusinessInfoExample example = new BusinessInfoExample();
        BusinessInfoExample.Criteria criteria = example.createCriteria();
        if (!name.equals("")) {
            criteria.andCustomerNameLike("%" + name + "%");
        }
        if (!telNum.equals("")) {
            criteria.andTelNumLike("%" + telNum + "%");
        }
        if (!comment.equals("")) {
            criteria.andCommentLike("%" + comment + "%");
        }
        criteria.andManagerIdEqualTo(Integer.valueOf(managerId));
        example.setOrderByClause(order);

        //查询结果
        List<BusinessInfo> infoList = businessInfoService.selectByExample(example);

        //取记录总条数
        PageInfo<BusinessInfo> pageInfo = new PageInfo<>(infoList);
        int total = (int) pageInfo.getTotal();

        pages.setSuccess(true);
        pages.setMsg("共查询出" + total + "条数据!");
        pages.setRecords(infoList);
        pages.setTotal(total);
        pages.setStatus(0);

        return pages;
    }

    @ResponseBody
    @RequestMapping(value = "addAndUpdateInfo/{type}", method = RequestMethod.POST)
    public BaseResult addAndUpdateInfo(BusinessInfo info, @PathVariable String type) {
        boolean success = true;
        String msg = "添加成功!";
        int count = 0;
        BaseResult result = new BaseResult();

        try {
            if ("add".equals(type)) {
                count = businessInfoService.insertSelective(info);
            } else if ("update".equals(type)) {
                count = businessInfoService.updateByPrimaryKey(info);
            }

            if ("add".equals(type) && count <= 0) {
                success = false;
                msg = "添加失败!";
            } else if ("update".equals(type) && count <= 0) {
                success = false;
                msg = "更新失败!";
            } else if ("update".equals(type) && count > 0) {
                success = true;
                msg = "更新成功!";
            }
        } catch (Exception ex) {
            ex.printStackTrace();
            success = false;
            msg = "发生异常";
        }

        result.setSuccess(success);
        result.setMsg(msg);

        return result;
    }

    @ResponseBody
    @RequestMapping(value = "deleteInfo/{type}", method = RequestMethod.POST)
    public BaseResult deleteInfo(@PathVariable String type, HttpServletRequest request) {
        boolean success = true;
        String msg = null;
        String ids = request.getParameter("id");
        BaseResult result = new BaseResult();
        BusinessInfoExample example = null;

        if ("one".equals(type) && null != ids) {
            Integer id = Integer.parseInt(ids);

            example = new BusinessInfoExample();
            BusinessInfoExample.Criteria criteria = example.createCriteria();
            criteria.andIdEqualTo(id);
        } else if ("batch".equals(type) && null != ids) {
            List<Integer> delList = new ArrayList<>();
            String[] id = ids.split(",");
            for (String s : id) {
                delList.add(Integer.valueOf(s));
            }

            example = new BusinessInfoExample();
            BusinessInfoExample.Criteria criteria = example.createCriteria();
            criteria.andIdIn(delList);
        } else {
            businessInfoService.deleteByExample(example);
            success = true;
            msg = "清空完毕!";
            result.setSuccess(success);
            result.setMsg(msg);
            return result;
        }

        if (example == null) {
            success = false;
            msg = "没有删除条件!";
            result.setSuccess(success);
            result.setMsg(msg);
            return result;
        }

        int count = businessInfoService.deleteByExample(example);
        msg = "成功删除" + count + "条数据!";

        if (count <= 0) {
            success = false;
            msg = "删除失败!";
        }

        result.setSuccess(success);
        result.setMsg(msg);
        return result;
    }

    @ResponseBody
    @RequestMapping(value = "sendMessage", method = RequestMethod.POST)
    public BaseResult sendMessage(HttpServletRequest request) {
        final String text = "尊敬的顾客您好！您或您的家人所配眼镜已有一段时间，请有空来店做免费视力检查和眼镜保养。 扬州市精点眼镜 客服电话：0514-86861819";
        boolean success = true;
        BaseResult baseResult = new BaseResult();
        String msg = "";
        String tels = request.getParameter("tel");
        String[] tel = tels.split(",");
        List<String> sendList = new LinkedList<>();
        for (String cur: tel) {
            if (!cur.equals("") && cur.length() == 11 && !sendList.contains(cur)) {
                sendList.add(cur);
            }
        }
        try {

            for (String curTel: sendList) {
                HttpClient client = new HttpClient();
                PostMethod post = new PostMethod("http://gbk.api.smschinese.cn");

                post.addRequestHeader("Content-Type", "application/x-www-form-urlencoded;charset=gbk");//在头文件中设置转码
                NameValuePair[] data = {new NameValuePair("Uid", "bodhisatan"), new NameValuePair("Key", "d41d8cd98f00b204e980"), new NameValuePair("smsMob", curTel), new NameValuePair("smsText", text)};
                post.setRequestBody(data);

                client.executeMethod(post);
                Header[] headers = post.getResponseHeaders();
                int statusCode = post.getStatusCode();
                System.out.println("statusCode:" + statusCode);
                for (Header h : headers) {
                    System.out.println(h.toString());
                }
                String result = new String(post.getResponseBodyAsString().getBytes("gbk"));
                System.out.println(result); //打印返回消息状态

                post.releaseConnection();
            }

            msg = "短信发送成功" + sendList.size() + "条";
        } catch (Exception ex) {
            ex.printStackTrace();
            success = false;
            msg = "短信发送失败";
        }

        baseResult.setSuccess(success);
        baseResult.setMsg(msg);

        return baseResult;
    }
}
