package domain;

public class Position {
    private Integer horizontalIndex;
    private Integer verticalIndex;

    public Position(Integer horizontalIndex, Integer verticalIndex) {
        this.horizontalIndex = horizontalIndex;
        this.verticalIndex = verticalIndex;
    }

    public Integer getHorizontalIndex() {
        return horizontalIndex;
    }

    public void setHorizontalIndex(Integer horizontalIndex) {
        this.horizontalIndex = horizontalIndex;
    }

    public Integer getVerticalIndex() {
        return verticalIndex;
    }

    public void setVerticalIndex(Integer verticalIndex) {
        this.verticalIndex = verticalIndex;
    }
}
