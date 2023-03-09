fun main() {
  val vehicle =Car("Toyota","Sunny","black",7)
    vehicle.carry(9,)
    vehicle.identity()
    var result=vehicle.calculate(19)
    println(result)
    var bus=Bus("single deck","Nissan","blue",30)
    var main=bus.maxTripFare(180.50)
    println(main)

}
 open class Car( var make:String, var model:String, var color:String, var capacity:Int) {
    fun carry(people: Int) {
        var x = (people - capacity)
        if (people == capacity) {
            println("carrying $people passengers ")

        } else if (people > capacity) {
            println("over capacity by $x people")


        }
    }

    fun identity() {
        println("I am a $color $make $model")
    }
  open  fun calculate(hours:Int):Int{
       var calc=hours*20
       return (calc)
    }
    }
class Bus(make: String,model: String,color: String,capacity: Int):Car(make,model,color, capacity){
    fun maxTripFare(fare:Double):Double{
        var calculate= capacity*fare
        return calculate

    }

    override fun calculate(hours: Int): Int {
        var fees = hours*capacity
        return fees
    }
}












