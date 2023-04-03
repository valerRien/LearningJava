package org.example.miniprojects.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class BuildingBlocksTest {

    private BuildingBlocks plant = new BuildingBlocks();

    @Test
    public void sampleTest() {
        BuildingBlocks.Block b = plant.new Block(new int[]{2,2,2});
        assertEquals(2,b.getWidth());
        assertEquals(2,b.getLength());
        assertEquals(2,b.getHeight());
        assertEquals(8,b.getVolume());
        assertEquals(24,b.getSurfaceArea());
    }

}