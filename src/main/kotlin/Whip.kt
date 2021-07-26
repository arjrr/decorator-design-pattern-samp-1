class Whip(
    beverage: Beverage
) : CondimentDecorator() {

    init {
        component = beverage
    }

    override var description: String
        get() = component.description + " + Whip"
        set(value) {}

    override fun cost(): Double {
        return .25 + component.cost()
    }

}