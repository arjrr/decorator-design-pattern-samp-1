fun main() {

    /** Creating a coffee (Concrete Component) */
    var beverage: Beverage
    beverage = EspressoCoffee()

    /** Decorating the coffee with condiment (Decorator) */
    beverage = Whip(beverage)

    /** Showing beverage with condiment */
    println("Beverage: ${beverage.getBeverageDescription()} \nCost: ${beverage.cost()}")

}