package com.example.hotelproject.service;

import com.example.hotelproject.entities.Division;

import java.util.List;

public interface IDivisionService {
    void deleteDivision(Long id);
    void updateDivision(Long id, String name);
    void addDivision(String name);
    List<Division> getAllDivisions();
    void getDivisionById(Long id);
    void getDivisionByName(String name);
}
