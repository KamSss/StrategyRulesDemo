package org.demo.strategyrulesdemo.mapper;

import org.demo.strategyrulesdemo.dto.SampleDto;
import org.apache.ibatis.annotations.Mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;

@Mapper
public interface SampleMapper extends BaseMapper<SampleDto>{

//    @Select("SELECT * FROM sampleData WHERE sampling_number = #{samplingNumber}")
//    SampleDto getSampleDataByNumber(String samplingNumber);
}