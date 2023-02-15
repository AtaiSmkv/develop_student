package kg.mega.student.services.impl;

import kg.mega.student.mappers.RateMapper;
import kg.mega.student.models.Rates;
import kg.mega.student.models.dto.RatesDto;
import kg.mega.student.repositories.RateRepo;
import kg.mega.student.services.RateService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RateServiceImpl implements RateService {
    private final RateRepo rateRepo;
    private final RateMapper rateMapper;

    public RateServiceImpl(RateRepo rateRepo, RateMapper rateMapper) {
        this.rateRepo = rateRepo;
        this.rateMapper = rateMapper;
    }

    public RatesDto save(RatesDto ratesDto) {
        Rates rates = rateMapper.ratesDtoToRates(ratesDto);
        rates = rateRepo.save(rates);
        ratesDto.setId(ratesDto.getId());
        return ratesDto;
    }

    @Override
    public RatesDto findById(Long id) {
        Rates rates = rateRepo.findById(id).get();
        RatesDto ratesDto = rateMapper.ratesToRateDto(rates);
        return ratesDto;
    }

    @Override
    public List<Rates> findAll() {
        return null;
    }
}
