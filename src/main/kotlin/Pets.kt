abstract class Pet(val name: String, var age: Int) {
    abstract fun sound()

    public fun happyBirthday() {
        sound()
        age += 1
    }
}

class Dog(name: String, age: Int) : Pet(name, age) {
    override fun sound() {
        println("gav")
    }
}

class Cat(name: String, age: Int) : Pet(name, age) {
    override fun sound() {
        println("miu")
    }
}