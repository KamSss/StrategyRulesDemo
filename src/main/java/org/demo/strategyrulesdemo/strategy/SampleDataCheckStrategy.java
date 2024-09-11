package org.demo.strategyrulesdemo.strategy;

import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.dto.SampleDto;

public interface SampleDataCheckStrategy {
    ResultDto check(SampleDto sampleDto, ResultDto resultDto);
}