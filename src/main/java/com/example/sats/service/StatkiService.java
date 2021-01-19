package com.example.sats.service;

import com.example.sats.dto.PlanszaDto;

import java.util.Optional;

public interface StatkiService {
    PlanszaDto getPlansza();
    Optional<Boolean> shot(int position);
}