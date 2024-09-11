package org.demo.strategyrulesdemo.dto;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Data
@Getter
@Setter
@TableName("sampledata")
public class SampleDto {
    private String samplingPersonnel;
    private Date samplingTime;
    private String sampledUnitName;
    private String samplingType;
    @TableId
    private String samplingNumber;
    private Integer samplingQuantity;
    private String samplingLocation;
    private String sampledUnitAddress;
    private String sampledUnitCity;
}
