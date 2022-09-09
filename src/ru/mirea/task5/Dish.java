package ru.mirea.task5;
    public abstract class Dish {
        private String type;
        private double volume;
        private String colour;

        public Dish(double volume, String colour) {
            this.colour = colour;
            this.volume = volume;
        }

        public abstract void drop();

        public abstract void soutDish();

        public void setColour(String colour) {
            this.colour = colour;
        }

        public void setType(String type) {
            this.type = type;
        }

        public void setVolume(double volume) {
            this.volume = volume;
        }

        public String getColour() {
            return colour;
        }

        public String getType() {
            return type;
        }

        public double getVolume() {
            return volume;
        }
    }


