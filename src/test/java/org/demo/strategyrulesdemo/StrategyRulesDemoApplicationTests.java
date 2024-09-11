package org.demo.strategyrulesdemo;

import jakarta.annotation.Resource;
import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.service.SampleServiceImpl;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StrategyRulesDemoApplicationTests {
	@Resource
	SampleServiceImpl sampleServiceImpl;

	@Test
	void contextLoads() {
		String testSampleNumber = "2134";
		ResultDto resultDto = sampleServiceImpl.sampleDataCheck(testSampleNumber);
		System.out.println("校验完成，存疑结果为：" + resultDto.isResult()
		+ " 存疑理由为:" + resultDto.getReason().toString());
	}

}
