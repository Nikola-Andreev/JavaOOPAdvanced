package h_interfaceSegregation.lab.a_systemResources;

import java.time.LocalTime;

public class Clock implements TimeProvider {

    @Override
    public int getHour() {
        return LocalTime.now().getHour();
    }
}
