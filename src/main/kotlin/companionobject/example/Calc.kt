package companionobject.example

class Calc {

    companion object {

        const val PI = 3.14

        fun square(a: Int) = a * a

        fun lengthOfCircle(radius: Float) = 2 * PI * radius
    }
}