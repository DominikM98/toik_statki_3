package com.example.sats.rest;



import com.example.sats.service.StatkiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
public class StatkiApiController {

    private static final Logger LOG = LoggerFactory.getLogger(StatkiApiController.class);

    @Autowired
    StatkiService statkiService;

    @PostMapping("/api/shot/{position}")
    ResponseEntity<Void> shot(@PathVariable("position") String position){                                               //requestbody positionDto positondto
        Optional<Boolean> result = statkiService.shot(Integer.parseInt(position));                                      //shot(position.getpostionn)
        LOG.info(statkiService.getPlansza().toString());
        if(result.isPresent()){
            if(result.get()){
                return ResponseEntity.ok().build();
            }else{
                return ResponseEntity.notFound().build();
            }
        }else{
            return ResponseEntity.badRequest().build();
        }
    }
}
