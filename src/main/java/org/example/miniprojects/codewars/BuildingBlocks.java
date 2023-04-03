package org.example.miniprojects.codewars;

public class BuildingBlocks {
    public class Block{

        private int width;
        private int length;
        private int height;

        public int getVolume(){
            return width * length * height;
        }

        public int getSurfaceArea() {
            return 2 * length * height + 2 * length * width + 2 * height * width;
        }

        public Block(int[] data) {
            this.width = data[0];
            this.length = data[1];
            this.height = data[2];
        }

        public int getLength() {
            return length;
        }

        public int getWidth() {
            return width;
        }

        public int getHeight() {
            return height;
        }
    }
}
