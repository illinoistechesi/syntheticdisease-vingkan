
class VespinDisease extends DiseaseBlueprint {
    
    @Override
    public String getName() {
        return "Vespin Disease";
    }
    
    @Override
    public double getInfectivity(AgeGroup ageGroup) {
        return 0;
    }
    
    @Override
    public double getToxigenicity(AgeGroup ageGroup) {
        return 0;
    }
    
    @Override
    public double getResistance(AgeGroup ageGroup) {
        return 0;
    }
    
    @Override
    public DiseaseAction move(SimulatedHost host) {
        DiseaseAction action = DiseaseAction.MULTIPLY;
        if(host.isIncubated()){
            action = DiseaseAction.RELEASE;
        }
        return action;
    }
    
}