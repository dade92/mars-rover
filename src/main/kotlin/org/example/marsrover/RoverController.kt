package org.example.marsrover

class RoverController(
    private val rover: Rover
) {

    fun run(commandSequence: String) {
        val commands = commandSequence.split(",")

        for (command in commands) {
            when (command.trim().lowercase()) {
                "f" -> rover.moveForward()
                "b" -> rover.moveBackward()
                "l" -> rover.turnLeft()
                "r" -> rover.turnRight()
                else -> throw IllegalArgumentException("Invalid command: $command")
            }
        }
    }

}