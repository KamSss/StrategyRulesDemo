package org.demo.strategyrulesdemo.strategy;

import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.dto.SampleDto;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PersonnelNumberCheckStrategy implements SampleDataCheckStrategy {
    @Override
    public ResultDto check(SampleDto sampleDto, ResultDto resultDto) {
        // 规则1：抽样人员少于2人时,标记为存疑，记录存疑理由，并且设置标记为false
        //samplingPersonnel 字段存储的是抽样人员的数量
        boolean result = sampleDto.getSamplingPersonnel() != null && Integer.parseInt(sampleDto.getSamplingPersonnel()) >= 2;
        //如果已经是存疑数据，那就不用改result了，但还是要校验此条规则，所以这里用一个&&防止false的数据被改成true
        resultDto.setResult(result && resultDto.isResult());
        //存疑数据把理由写一下
        if(!result){
            List<String> reason = resultDto.getReason();
            reason.add("规则1校验失败");
            resultDto.setReason(reason);
        }
        return resultDto;
    }
}