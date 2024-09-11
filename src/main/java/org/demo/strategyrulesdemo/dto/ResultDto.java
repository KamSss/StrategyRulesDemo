package org.demo.strategyrulesdemo.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class ResultDto {
    //    筛查结果
    boolean result = true;
    List<String> reason;
}
