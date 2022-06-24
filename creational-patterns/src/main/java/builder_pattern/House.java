package builder_pattern;

import java.util.Objects;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean furnished;
    private boolean painted;

    public String getFoundation() {
        return foundation;
    }

    public String getStructure() {
        return structure;
    }

    public String getRoof() {
        return roof;
    }

    public boolean isFurnished() {
        return furnished;
    }

    public boolean isPainted() {
        return painted;
    }

    public void setFoundation(String foundation) {
        this.foundation = foundation;
    }

    public void setStructure(String structure) {
        this.structure = structure;
    }

    public void setRoof(String roof) {
        this.roof = roof;
    }

    public void setFurnished(boolean furnished) {
        this.furnished = furnished;
    }

    public void setPainted(boolean painted) {
        this.painted = painted;
    }

    @Override
    public String toString() {
        return "House{" +
                "foundation='" + foundation + '\'' +
                ", structure='" + structure + '\'' +
                ", roof='" + roof + '\'' +
                ", furnished=" + furnished +
                ", painted=" + painted +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        House house = (House) o;
        return furnished == house.furnished && painted == house.painted && Objects.equals(foundation, house.foundation) && Objects.equals(structure, house.structure) && Objects.equals(roof, house.roof);
    }

    @Override
    public int hashCode() {
        return Objects.hash(foundation, structure, roof, furnished, painted);
    }
}
