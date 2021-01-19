package com.example.sats.service;

import com.example.sats.dto.PlanszaDto;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
public class StatkiServiceImpl implements StatkiService{

    private final int SIZE = 8;

    private PlanszaDto planszaDto;

    public StatkiServiceImpl() {
        List<String> plns  = Arrays.asList("","S","","","","S","","S"); //plns.add("")...plns.add("S")
        planszaDto = new PlanszaDto(plns);
    }

    @Override
    public PlanszaDto getPlansza() {
        return planszaDto;
    }

    @Override
    public Optional<Boolean> shot(int position) {
        if(position >= planszaDto.getPlansza().size()  || position < 0 || planszaDto.getPlansza().get(position).equals("X") || planszaDto.getPlansza().get(position).equals("O")){
            return Optional.empty();
        }
        if(planszaDto.getPlansza().get(position).equals("S")){
            planszaDto.getPlansza().set(position,"X");
            return Optional.of(true);
        }
        planszaDto.getPlansza().set(position,"O");
        return Optional.of(false);
    }
}