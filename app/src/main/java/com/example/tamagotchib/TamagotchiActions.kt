package com.example.tamagotchib

object TamagotchiActions {

    fun feedTamagotchi(tamagotchi: Tamagotchi) {
        tamagotchi.feed()
    }

    fun playWithTamagotchi(tamagotchi: Tamagotchi) {
        tamagotchi.play()
    }

    fun letTamagotchiSleep(tamagotchi: Tamagotchi) {
        tamagotchi.sleep()
    }

    fun getTamagotchiImage(tamagotchi: Tamagotchi): Int {
        val hungerLevel = tamagotchi.getHungerLevel()
        val happinessLevel = tamagotchi.getHappinessLevel()
        val energyLevel = tamagotchi.getEnergyLevel()

        return when {
            hungerLevel > 70 -> R.drawable.hungry_tamagotchi // Hungry
            happinessLevel > 70 -> R.drawable.happy_tamagotchi // Happy
            energyLevel < 30 -> R.drawable.sleepy_tamagotchi // Sleepy
            else -> R.drawable.happy_tamagotchi // Default to happy
        }
    }
}
