public class TrafficLight {
    public enum Color {
        RED,
        YELLOW,
        GREEN
    }

    private Color color;
    private int duration;

    public TrafficLight(Color initialColor, int duration) {
        this.color = initialColor;
        this.duration = duration;
    }

    public void changeColor() {
        switch (color) {
            case RED:
                color = Color.GREEN;
                break;
            case YELLOW:
                color = Color.RED;
                break;
            case GREEN:
                color = Color.YELLOW;
                break;
        }
    }

    public boolean isRed() {
        return color == Color.RED;
    }

    public boolean isGreen() {
        return color == Color.GREEN;
    }

    public Color getColor() {
        return color;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public int getDuration() {
        return duration;
    }

    public static void main(String[] args) {
        TrafficLight trafficLight = new TrafficLight(Color.RED, 10);
        System.out.println("Начальный цвет: " + trafficLight.getColor());

        trafficLight.changeColor();
        System.out.println("Новый цвет: " + trafficLight.getColor());

        System.out.println("Красный ли он? " + trafficLight.isRed());
        System.out.println("Зеленый ли он? " + trafficLight.isGreen());
    }
}
