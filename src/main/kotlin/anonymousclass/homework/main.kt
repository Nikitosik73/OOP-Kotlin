package anonymousclass.homework

fun main() {

    val sportsman = Sportsman()
    sportsman.callAWaterCarrier(object : WaterCarrier {
        override fun sendWater() {
            println("Несу воду...")
        }
    })
}