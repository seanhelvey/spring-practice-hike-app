package com.example.demo.controllers;


import com.example.demo.models.Hike;
import com.example.demo.repos.HikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class HikeController {

    @Autowired
    private HikeRepository hikeRepository;


    @GetMapping("/hikes")
    public Iterable<Hike> getHikeRoute(){
        return hikeRepository.findByName("Pikes Peak");
    }

    @GetMapping("/add")
    public Hike addHike() {
        Hike hike = new Hike(1, "Pikes Peak");
        hikeRepository.save(hike);
        return hike;
    }

}
