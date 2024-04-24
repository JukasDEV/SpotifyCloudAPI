package com.ProjetoCloud.SpotifyAPI.Controller;


import com.ProjetoCloud.SpotifyAPI.Models.Plans;
import com.ProjetoCloud.SpotifyAPI.Repository.PlansRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import java.util.List;

@RestController
@RequestMapping("/plan")
public class PlansController {

    private String nonNullOrDefault(String value, String defaultValue) {
        return value != null && !value.isEmpty() ? value : defaultValue;
    }

    private Integer nonNullOrDefault(Integer value, Integer defaultValue) {
        return value != null ? value : defaultValue;
    }
    private Double nonNullOrDefault(Double value, Double defaultValue) {
        return value != null ? value : defaultValue;
    }


    @Autowired
    private PlansRepository planRepository;

    @GetMapping("/getAll")
    public List<Plans> getAll() {
        return planRepository.findAll();
    }

    @GetMapping("/get{id}")
    public ResponseEntity<Plans> getById(@PathVariable("id") Integer id) {
        return this.planRepository.findById(id).map(plan -> {
            return new ResponseEntity<>(plan, HttpStatus.OK);
        }).orElse(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @PostMapping
    public ResponseEntity<Plans> addPlan(@Valid @RequestBody Plans plan) {
        Plans savedPlan = planRepository.save(plan);
        return new ResponseEntity<>(savedPlan, HttpStatus.CREATED);
    }
    @PutMapping("/update{id}")
    public ResponseEntity<Plans> updateBand(@PathVariable Integer id, @RequestBody Plans planDetails) {
        return planRepository.findById(id).map(plans -> {
            plans.setName(nonNullOrDefault(planDetails.getName(), plans.getName()));
            plans.setPrice(nonNullOrDefault(planDetails.getPrice(), plans.getPrice()));


            Plans updatedPlan = planRepository.save(plans);
            return ResponseEntity.ok(updatedPlan);
        }).orElse(ResponseEntity.notFound().build());
    }


    @DeleteMapping("{id}")
    public ResponseEntity<?> deleteBand(@PathVariable Integer id) {
        return planRepository.findById(id).map(plan -> {
            planRepository.delete(plan);
            return new ResponseEntity<>("Plan deleted successfully", HttpStatus.OK);
        }).orElse(new ResponseEntity<>("Plan not found", HttpStatus.NOT_FOUND));
    }

}