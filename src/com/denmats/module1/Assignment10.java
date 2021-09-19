package com.denmats.module1;

public class Assignment10 {
    private final float brickSizeX;
    private final float brickSizeY;
    private final float brickSizeZ;
    private final float holeSizeX;
    private final float holeSizeY;

    public Assignment10(float brickSizeX, float brickSizeY, float brickSizeZ, float holeSizeX, float holeSizeY) {
        this.brickSizeX = brickSizeX;
        this.brickSizeY = brickSizeY;
        this.brickSizeZ = brickSizeZ;
        this.holeSizeX = holeSizeX;
        this.holeSizeY = holeSizeY;
    }

    public void printIfTheBrickGoThroughTheHole(){
        System.out.println(checkIfBrickGoThroughTheHole());
    }

    private boolean checkIfBrickGoThroughTheHole() {
        float AreaOfTheHoleXY = 2*(holeSizeX * holeSizeY);
        float AreaOfXYSideOfTheBrick = 2*(brickSizeX*brickSizeY);
        float AreaOfXZSideOfTheBrick = 2*(brickSizeX*brickSizeZ);
        float AreaOfYZSideOfTheBrick = 2*(brickSizeY*brickSizeZ);

        return AreaOfXYSideOfTheBrick < AreaOfTheHoleXY
                || AreaOfYZSideOfTheBrick < AreaOfTheHoleXY
                || AreaOfXZSideOfTheBrick < AreaOfTheHoleXY;
    }
}
