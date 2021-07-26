class EspressoCoffee : Beverage() {

    init {
        description = "Espresso Coffee"
    }

    override fun cost(): Double {
        return 2.50
    }
}