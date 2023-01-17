class Horse(val noise: String, food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Horse make a sound $noise")
    }
    override fun eat() {
        println("Horse eat $food in $location.")
    }
}