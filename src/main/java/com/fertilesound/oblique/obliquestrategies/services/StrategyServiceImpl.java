package com.fertilesound.oblique.obliquestrategies.services;

import com.fertilesound.oblique.obliquestrategies.ObliqueStrategiesStrings;
import org.springframework.stereotype.Service;

@Service
public class StrategyServiceImpl implements StrategyService{

    // Create this once
    private final ObliqueStrategiesStrings obliqueStrategiesStrings;

    public StrategyServiceImpl() {
        this.obliqueStrategiesStrings = new ObliqueStrategiesStrings();
    }

    @Override
    public String getStrategy() {
        return obliqueStrategiesStrings.getRandomStrategy();
    }
}
