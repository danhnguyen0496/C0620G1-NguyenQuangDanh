package model.employee;

public class Position {

    private String positionId;
    private String positionName;

    public Position(String positionId, String positionName) {
        this.positionId = positionId;
        this.positionName = positionName;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public String getPositionName() {
        return positionName;
    }

    public void setPositionName(String positionName) {
        this.positionName = positionName;
    }
}
