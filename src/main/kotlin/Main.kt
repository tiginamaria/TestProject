fun main(args: Array<String>) {
    val cat = Cat("Barsik", 5)
    val dog = Dog("Bobik", 3)
    val puppy = Dog("Tolik", 1)
    val pets = listOf<Pet>(cat, dog, puppy)
    for (pet in pets) {
        println("${pet.name} - ${pet.age}")
        pet.happyBirthday()
    }
}
