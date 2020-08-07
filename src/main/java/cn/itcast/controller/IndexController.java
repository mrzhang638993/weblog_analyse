package cn.itcast.controller;

import cn.itcast.service.AvgNumService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Allen Woon
 */
@Controller
public class IndexController {

    @Autowired
    private  AvgNumService service;

    @RequestMapping("/index")
    public String showIndex(){
        return "index";
    }

    //@RequestMapping("/avgPvNum")
    @RequestMapping(value="/avgPvNum",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getAvgByDates(){
        return service.getAvgNumByDts("20181101","20181107");
    }
}
