public class Crossing {
    public static void main(String[] args) {

        System.out.println("Initializing Traffic Crossing");
        TrafficLight trafficLight = new TrafficLight();
        trafficLight.showColor(3);
        System.out.println(
                "Initializing " +
                        "Traffic " +
                        "Crossing"
        );

        TrafficController controller =
                new TrafficController();
    }

    /**
     * @return
     */

    public static int getNumberOfTrafficLights() {return numberOfTrafficLights; }

    /**
     * @return
     */
    }
}
