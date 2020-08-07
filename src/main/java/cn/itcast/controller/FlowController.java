package cn.itcast.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import cn.itcast.service.FlowService;

@Controller
public class FlowController {
    
    @Autowired
    private FlowService flowService;
    
    @RequestMapping(value="/flowNum",produces="application/json;charset=UTF-8")
    @ResponseBody
    public String getBarChart1() throws Exception{
        
            String string = flowService.getFlowByDates("20181101", "20181107");
            
            return string;
            
    }

}
