package cn.itcast.mapper;

import cn.itcast.pojo.TRefererType;
import cn.itcast.pojo.TRefererTypeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TRefererTypeMapper {
    long countByExample(TRefererTypeExample example);

    int deleteByExample(TRefererTypeExample example);

    int insert(TRefererType record);

    int insertSelective(TRefererType record);

    List<TRefererType> selectByExample(TRefererTypeExample example);

    int updateByExampleSelective(@Param("record") TRefererType record, @Param("example") TRefererTypeExample example);

    int updateByExample(@Param("record") TRefererType record, @Param("example") TRefererTypeExample example);
}