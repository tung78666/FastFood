package com.project.orderfastfood.controller;


import com.project.orderfastfood.entity.Food;
import com.project.orderfastfood.repository.FoodRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    @Autowired
    public FoodRepository foodRepository;


    @GetMapping("/food/{id}")
    public ResponseEntity<Food> hewsd(@PathVariable String id){
        return ResponseEntity.ok(foodRepository.findAll().get(0));
    }
}
