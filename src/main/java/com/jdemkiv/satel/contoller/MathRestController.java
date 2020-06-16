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

    @PostMapping(value = "/sum", produces = "application/json")
    public int sum(@RequestBody NumberDto numberDto) {
        return mathService.sum(numberDto);
    }

    @PostMapping(value = "/diff", produces = "application/json")
    public int diff(@RequestParam int a, @RequestParam int b) {
        return a - b;
    }

}
