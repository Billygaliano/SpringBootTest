package wbs.practice.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class RestApiController {

    @RequestMapping(method=RequestMethod.GET)
    public Map<String, String> get() {
        // lets say this is user having name = raks
        Map<String, String> map = new HashMap<String, String>();
        map.put("author", "Guillermo Galiano Sánchez");
        return map;
    }

}
