package kg.mega.student.controllers;

import kg.mega.student.models.dto.RatesDto;
import kg.mega.student.services.RateService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping({"/rate"})
public class RateController {
    private final RateService rateService;

    public RateController(RateService rateService) {

        this.rateService = rateService;
    }

    @PostMapping({"/save"})
    public RatesDto save(@RequestBody RatesDto ratesDto) {

        return rateService.save(ratesDto);
    }
}
