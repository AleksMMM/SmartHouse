package model.detector;

public class DetectorWater {

    private final Long id;
    private boolean waterYesNo;

    public DetectorWater(Long id, boolean waterYesNo) {
        this.id = id;
        this.waterYesNo = waterYesNo;
    }

    public Long getId() {
        return id;
    }

    public boolean isWaterYesNo() {
        return waterYesNo;
    }

    public void setWaterYesNo(boolean waterYesNo) {
        this.waterYesNo = waterYesNo;
    }
}
