package anonymousclass.homework

class Sportsman {

    fun callAWaterCarrier(waterCarrier: WaterCarrier) {
        waterCarrier.sendWater()
    }

    fun invokeWaterCarrier(bringWater: () -> Unit) {
        bringWater()
    }

}