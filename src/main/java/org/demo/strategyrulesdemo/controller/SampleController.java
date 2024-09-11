import jakarta.annotation.Resource;
import org.demo.strategyrulesdemo.dto.ResultDto;
import org.demo.strategyrulesdemo.service.SampleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SampleController {

    @Resource
    private SampleService sampleService;

    @GetMapping("/check/{samplingNumber}")
    public ResultDto sampleDataCheck(@PathVariable String samplingNumber) {
        return sampleService.sampleDataCheck(samplingNumber);
    }
}