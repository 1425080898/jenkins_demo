package com.lzb.jenkins.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author :xiaoLiu
 * @date ：Created in 2020/7/19 18:56
 * @description：部门controller
 * @modified By：
 * @version:
 */
@Controller
@RequestMapping("/dept")
public class DeptController {

    @RequestMapping("/deptList")
    public String deptList(Model model){
        Map map = new HashMap();
        map.put("id","1");
        map.put("name","人事部");
        Map map2 = new HashMap();
        map2.put("id","2");
        map2.put("name","技术部");
        List list = new ArrayList();
        list.add(map);
        list.add(map2);
        model.addAttribute("deptList",list);
        return "deptList";
    }
}
