package kg.mega.student.services;

import kg.mega.student.models.dto.RatesDto;

public interface RateService {
    RatesDto save(RatesDto ratesDto);
    RatesDto findById(Long id);
}
