fun main(){
    val vet = Vet()
    val animals = listOf(
        Dog("Bow-bow!","meat","dog house"),
        Cat("Meooooow!","fish","kitchen"),
        Horse("Hee-haw!","grass","field"))
    animals.forEach{animal ->
        vet.treatAnimal(animal)
    }
}