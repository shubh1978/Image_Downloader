package org.springframework.boot;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyServiceImpl implements MyClass {

    @Autowired
    private ImageRepository imageRepository;

    public List<String> generateImage(Long image_id){

        return imageRepository.imageGenerate(image_id);
    }




}
