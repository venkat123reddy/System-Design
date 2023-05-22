package LLD.Adapter;

import LLD.Adaptee.WeightBabies;
import LLD.Adaptee.WeightPounds;

public class WeightAdapterImpl implements WeightAdapter{

    WeightPounds weightPounds = new WeightBabies();
    @Override
    public double getWeightKG() {
        return weightPounds.getWeightInPounds()*3;

    }
}
