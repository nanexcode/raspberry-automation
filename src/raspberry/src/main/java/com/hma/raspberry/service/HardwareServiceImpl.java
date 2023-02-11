package com.hma.raspberry.service;

import com.pi4j.Pi4J;
import com.pi4j.context.Context;

public class HardwareServiceImpl implements HardwareService {
    private Context pi4j = Pi4J.newAutoContext();

    public HardwareServiceImpl() {

    }

}
