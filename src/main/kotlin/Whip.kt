class Whip(
    private val beverage: Beverage
) : CondimentDecorator() {

    override var description: String
        get() = beverage.description + " + Whip"
        set(value) {}

    override fun cost(): Double {
        return .25 + beverage.cost()
    }

}