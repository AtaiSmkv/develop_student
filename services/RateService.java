package kg.mega.student.services;

import kg.mega.student.models.Rates;
import kg.mega.student.models.dto.RatesDto;

import java.util.List;

public interface RateService {
    RatesDto save(RatesDto ratesDto);
    RatesDto findById(Long id);
    List<Rates> findAll();
}
