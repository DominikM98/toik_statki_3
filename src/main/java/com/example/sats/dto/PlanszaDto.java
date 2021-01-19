package com.example.sats.dto;
// nowe DTO - position z privat eint positon;
import java.util.Arrays;
import java.util.List;

public class PlanszaDto {
    private List<String> plansza;

    public PlanszaDto(List<String> plansza) {
        this.plansza = plansza;
    }

    public List<String> getPlansza() {
        return plansza;
    }

    public void setPlansza(List<String> plansza) {
        this.plansza = plansza;
    }

    @Override
    public String toString() {
        return "PlanszaDto{" +
                "plansza=" + plansza +
                '}';
    }
}
