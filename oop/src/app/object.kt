package app

import data.Person

fun main() {

//    membuat object
    val dohan = Person()
    dohan.firstName = "Dohan"

    val pranata = Person()
    pranata.firstName = "Pranata"

    val wikanda = Person()
    wikanda.firstName = "Wikanda"

    print(dohan.firstName)
    print(pranata.firstName)
    print(wikanda.firstName)
}