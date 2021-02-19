package com.atguigu.crowd.mvc.handler;

import com.atguigu.crowd.entity.Admin;
import com.atguigu.crowd.service.api.AdminService;
import com.atguigu.crowd.util.ResultEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class TestHandler {

    @Autowired
    private AdminService adminService;

    private Logger logger = LoggerFactory.getLogger(TestHandler.class);

    @RequestMapping("/test/ssm.html")
    public String testSsm(ModelMap modelMap) {
        List<Admin> adminList = adminService.findAll();
        modelMap.addAttribute("adminList", adminList);

        System.out.println(10 / 0);

        return "target";
    }

    @ResponseBody
    @RequestMapping("/send/array.html")
    public String testAjax(@RequestBody List<Integer> array) {
        for(Integer num : array) {
            logger.info("number"+num);
        }

        return "success";
    }

    @ResponseBody
    @RequestMapping("send/object.json")
    public ResultEntity<List<Integer>> testObject(@RequestBody List<Integer> array) {
        ResultEntity<List<Integer>> resultEntity = ResultEntity.successWithData(array);
        String a = null;

        System.out.println(10 / 0);
        return resultEntity;
    }
}
