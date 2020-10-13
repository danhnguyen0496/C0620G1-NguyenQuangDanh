package service.impl;

import org.springframework.stereotype.Service;
import service.ConvertService;

@Service
public class ConvertServiceImpl implements ConvertService {
    @Override
    public double currencyConvert(double usd, double rate) {
        return usd * rate;
    }
}
