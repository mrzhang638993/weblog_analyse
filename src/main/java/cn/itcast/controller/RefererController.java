package cn.itcast.controller;

import cn.itcast.service.RefererService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Allen Woon
 */
@Controller
public class RefererController {
    @Autowired
    private  RefererService service;

    @RequestMapping(value="/refererTypeNum",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getTypeByDt() throws Exception{

        String string = service.getRefererNumByDts("20181101");

        return string;

    }
}
