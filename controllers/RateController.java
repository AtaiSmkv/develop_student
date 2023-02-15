package kg.mega.student.controllers;

import kg.mega.student.models.Rates;
import kg.mega.student.models.Schoolarship;
import kg.mega.student.models.dto.RatesDto;
import kg.mega.student.services.RateService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    @GetMapping("/findById")
    public RatesDto findById(@RequestParam Long id) {
        return rateService.findById(id);
    }
    @GetMapping("/findAll")
    public List<Rates> findAll() {
        return rateService.findAll();
    }
}
