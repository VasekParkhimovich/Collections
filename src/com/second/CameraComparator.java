package com.second;
import java.util.Comparator;

public class CameraComparator implements Comparator<Phone> {
    @Override
    public int compare(Phone o1, Phone o2) {
        return o1.getCamera()- o2.getCamera();
    }
}
