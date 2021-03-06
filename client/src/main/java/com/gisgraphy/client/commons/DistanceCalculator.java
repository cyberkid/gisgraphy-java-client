package com.gisgraphy.client.commons;

import javax.measure.quantity.Length;
import javax.measure.unit.Unit;

public interface DistanceCalculator<T> {
    double distance(T o, Unit<Length> unit);
}
