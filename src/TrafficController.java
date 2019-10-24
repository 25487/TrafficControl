public class TrafficController {

        private TrafficLight[] trafficLights;

        public TrafficController() {
            System.out.println(
                    "Total number of Traffic lights: " +
                            Crossing.getNumberOfTrafficLights());

            this.trafficLights =
                    new TrafficLight[
                            Crossing.getNumberOfTrafficLights()
                            ];

            for(int count = 0;
                count < Crossing.getNumberOfTrafficLights();
                count++) {

                trafficLights[count] =
                        new TrafficLight(
                                count,
                                Crossing.getNumberOfLights()
                        );
                int i = 1;
                switch(i)
                {
                    case 1:
                        System.out.println("Current color case1: " +
                                trafficLights[count].getCurrentColor()
                        );
                        break;
                    case 2:
                        System.out.println("Current color case2: " +
                                trafficLights[count].getCurrentColor()
                        );
                        break;
                }
            }

        }
    }
}
