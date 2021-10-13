package Build;

import java.util.Objects;

public class Floor {
        public int floor;
        public int classroom;

        public Floor (int floor, int classRoom) {
                this.floor = floor;
                this.classroom = classRoom;
        }
        public int getFloor () {
                return floor;
        }
        public void setFloor (int floor) {
                this.floor = getFloor();
        }
        public int getClassRoom() {
                return classroom;
        }
        public void setClassRoom (int classRoom) {
                this.classroom = classRoom;
        }

        @Override
        public String toString() {
                return "Floor{" +
                        "floor=" + floor +
                        ", classroom=" + classroom +
                        '}';
        }

        @Override
        public boolean equals(Object o) {
                if (this == o) return true;
                if (o == null || getClass() != o.getClass()) return false;
                Floor floor1 = (Floor) o;
                return floor == floor1.floor && classroom == floor1.classroom;
        }

        @Override
        public int hashCode() {
                return Objects.hash(floor, classroom);
        }
}
