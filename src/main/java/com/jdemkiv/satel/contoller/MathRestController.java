package com.jdemkiv.satel.contoller;

import com.jdemkiv.satel.dto.NumberDto;
import com.jdemkiv.satel.service.MathService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/")
public class MathRestController {
    MathService mathService;

    @PostMapping("/sum")
    public int sum(@RequestBody NumberDto numberDto) {
        return mathService.sum(numberDto);
    }

    @PostMapping("/diff")
    public int diff(@RequestBody NumberDto numberDto) {
        return mathService.diff(numberDto);
    }

}
