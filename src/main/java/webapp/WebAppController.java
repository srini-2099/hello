package webapp;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebAppController {

    @RequestMapping(value = "/echo/{input}", method = RequestMethod.GET)
    public String getEcho(@PathVariable("input") String echo) {
        return "echo : " + echo;
    }
}