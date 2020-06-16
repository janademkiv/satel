package com.jdemkiv.satel.service;

import com.jdemkiv.satel.dto.NumberDto;
import org.springframework.stereotype.Service;

@Service
public class MathService {

    public int sum(NumberDto numberDto) {
        return numberDto.getA() + numberDto.getB();
    }

    public int diff(NumberDto numberDto) {
        return numberDto.getA() - numberDto.getB();
    }
}
