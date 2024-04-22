package org.springframework.boot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class Controller {
    @Autowired
    private MyServiceImpl service;

    @PutMapping("/post")
    public List<String> generate(@RequestParam Long image_id){
        return service.generateImage(image_id);

    }
}
