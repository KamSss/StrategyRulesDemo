package org.demo.strategyrulesdemo.service;

import jakarta.annotation.Resource;
import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.dto.SampleDto;
import org.demo.strategyrulesdemo.mapper.SampleMapper;
import org.demo.strategyrulesdemo.strategy.SampleDataCheckStrategy;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SampleServiceImpl implements SampleService {

    @Resource
    private SampleMapper sampleMapper;

    @Resource
    private List<SampleDataCheckStrategy> strategies;

    @Override
    public ResultDto sampleDataCheck(String samplingNumber) {
        SampleDto sampleDto = sampleMapper.selectById(samplingNumber);
        ResultDto resultDto = new ResultDto();
        resultDto.setReason(new ArrayList<>());
        // 数据不存在
        if (sampleDto == null) {
            resultDto.setResult(false);
            resultDto.setReason(new ArrayList<>());
            return resultDto;
        }

        for (SampleDataCheckStrategy strategy : strategies) {
            if (!strategy.check(sampleDto, resultDto).isResult()) {
                System.out.println("存疑数据+1");
            }
        }
        return resultDto; // 所有规则校验通过
    }
}