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
    /**
     * create by: xiaoLiu
     * description: 再次测试jenkins
     * create time: 2020/7/19 19:45
     * @return
     */
    @RequestMapping("/deptList")
    public String deptList(Model model){
        Map map = new HashMap();
        map.put("id","3");
        map.put("name","质检部");
        Map map2 = new HashMap();
        map2.put("id","4");
        map2.put("name","运维部");
        List list = new ArrayList();
        list.add(map);
        list.add(map2);
        model.addAttribute("deptList",list);
        return "deptList";
    }
}
