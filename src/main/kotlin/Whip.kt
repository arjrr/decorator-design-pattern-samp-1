class Whip(
    private val beverage: Beverage
) : CondimentDecorator() {

    override fun getBeverageDescription(): String {
        return beverage.description + " + Whip"
    }

    override fun cost(): Double {
        return .25 + beverage.cost()
    }

}