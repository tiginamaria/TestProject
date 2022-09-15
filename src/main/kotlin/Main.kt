fun main(args: Array<String>) {
    val cat = Cat("Barsik", 5)
    val dog = Dog("Bobik", 3)
    val dog2 = Dog("Tolik", 10)
    val pets = listOf<Pet>(cat, dog, dog2)
    for (pet in pets) {
        println("${pet.name} ${pet.age}")
        pet.happyBirthday()
    }
}
