package com.ronnie.railway.controller;

import com.ronnie.railway.model.TrainResponse;
import com.ronnie.railway.service.RailwayService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/railway")
public class RailwayController {

    private final RailwayService railwayService;

    public RailwayController (RailwayService railwayService) {
        this.railwayService = railwayService;
    }

    public TrainResponse getTrain(@PathVariable String number){
        return railwayService.getTrainDetails((number));
    }
}
