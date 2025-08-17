package com.ronnie.nasapod.Controller;

import com.ronnie.nasapod.model.NasaPodResponse;
import com.ronnie.nasapod.service.NasaPodService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/nasa")
public class NasaPodController {

    private final NasaPodService nasaPodService;

    public NasaPodController(NasaPodService nasaPodService){
        this.nasaPodService = nasaPodService;
    }

    public NasaPodResponse getPod(){
        return nasaPodService.fetchPod();
    }
}
