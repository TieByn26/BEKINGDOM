package com.example.hotelproject.service.impl;

import com.example.hotelproject.entities.Degree;
import com.example.hotelproject.repository.DegreeRepository;
import com.example.hotelproject.service.IDegreeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DegreeService implements IDegreeService {

    @Autowired
    private DegreeRepository degreeRepository;
    @Override
    public void deleteDegree(Long id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void updateDegree(Long id, String name) {
        // TODO Auto-generated method stub
    }

    @Override
    public void addDegree(String name) {
        // TODO Auto-generated method stub
    }

    @Override
    public List<Degree> getAllDegrees() {
        // TODO Auto-generated method stub
        return degreeRepository.findAll();
    }

    @Override
    public void getDegreeById(Long id) {
        // TODO Auto-generated method stub
    }

    @Override
    public void getDegreeByName(String name) {
        // TODO Auto-generated method stub
    }
}
