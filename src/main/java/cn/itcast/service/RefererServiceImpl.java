package cn.itcast.service;

import cn.itcast.mapper.TRefererTypeMapper;
import cn.itcast.pojo.RefererToPageBean;
import cn.itcast.pojo.TRefererType;
import cn.itcast.pojo.TRefererTypeExample;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Allen Woon
 */

@Service
public class RefererServiceImpl implements RefererService{
    @Autowired
    private TRefererTypeMapper mapper;

    @Override
    public String getRefererNumByDts(String time) {
        TRefererTypeExample example = new TRefererTypeExample();
        TRefererTypeExample.Criteria criteria = example.createCriteria();
        criteria.andDatestrEqualTo(time);
        List<TRefererType> lists = mapper.selectByExample(example);

        // 数组大小
        int size = 4;
        String[] types = new String[size];
        Integer[] nums = new Integer[size];

        int i = 0;
        for (TRefererType tRefererType : lists) {
            types[i] = tRefererType.getType();
            nums[i] =tRefererType.getTypeNum();
            i++;
        }

        RefererToPageBean bean = new RefererToPageBean();
        bean.setDayStr(time);
        bean.setTypes(types);
        bean.setNums(nums);
        ObjectMapper om = new ObjectMapper();
        String beanJson= null;
        try {
            beanJson = om.writeValueAsString(bean);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return beanJson;
    }
}
