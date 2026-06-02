package lesson2.homework2.task2;

public class SteeringWheel {
    private String material;
    private boolean hasButtons;
    private boolean hasAirbag;

    public SteeringWheel() {}

    public SteeringWheel(String material, boolean hasButtons, boolean hasAirbag) {
        this.material = material;
        this.hasButtons = hasButtons;
        this.hasAirbag = hasAirbag;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public boolean isHasButtons() {
        return hasButtons;
    }

    public void setHasButtons(boolean hasButtons) {
        this.hasButtons = hasButtons;
    }

    public boolean isHasAirbag() {
        return hasAirbag;
    }

    public void setHasAirbag(boolean hasAirbag) {
        this.hasAirbag = hasAirbag;
    }

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "material='" + material + '\'' +
                ", hasButtons=" + hasButtons +
                ", hasAirbag=" + hasAirbag +
                '}';
    }
}
