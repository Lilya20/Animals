class Dog(val noise: String, food: String, location: String) : Animal(food, location) {
    override fun makeNoise() {
        println("Cat make a sound $noise")

    }
    override fun eat() {
        println("Dog eat $food in $location.")
    }
}