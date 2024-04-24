package com.example.tamagotchib

class Tamagotchi(private val name: String) {
    private var hunger = 0
    private var happiness = 0
    private var energy = 100

    fun feed() {
        hunger += 10
        if (hunger < 0) hunger = 0
    }

    fun play() {
        happiness += 10
        hunger -=10
        energy -= 10
        if (happiness > 100) happiness = 100
        if (energy < 0) energy = 0
    }

    fun sleep() {
        hunger-=2
        energy += 20
        if (energy > 100) energy = 100

    }

    fun getStatus(): String {
        return "$name's status:\nHunger: $hunger\nHappiness: $happiness\nEnergy: $energy"
    }

    fun getHungerLevel(): Int {
        return hunger
    }

    fun getHappinessLevel(): Int {
        return happiness
    }

    fun getEnergyLevel(): Int {
        return energy
    }
}
