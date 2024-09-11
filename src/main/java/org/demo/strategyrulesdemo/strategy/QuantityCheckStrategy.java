package org.demo.strategyrulesdemo.strategy;

import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.dto.SampleDto;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QuantityCheckStrategy implements SampleDataCheckStrategy {
    @Override
    public ResultDto check(SampleDto sampleDto, ResultDto resultDto) {
        // 规则2：抽样数量单位缺少或重复，或抽样数量填为0时返回false
        boolean result = sampleDto.getSamplingQuantity() != null && sampleDto.getSamplingQuantity() != 0;
        //如果已经是存疑数据，那就不用改result了，但还是要校验此条规则，所以这里用一个&&防止false的数据被改成true
        resultDto.setResult(result && resultDto.isResult());
        //存疑数据把理由写一下
        if(!result){
            List<String> reason = resultDto.getReason();
            reason.add("规则2校验失败");
            resultDto.setReason(reason);
        }
        return resultDto;
    }
}