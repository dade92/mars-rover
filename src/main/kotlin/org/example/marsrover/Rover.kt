package org.example.marsrover

class Rover {
    var x = 0
    var y = 0
    var direction = Direction.NORTH

    constructor(x: Int, y: Int, direction: Direction) {
        this.x = x
        this.y = y
        this.direction = direction
    }

    fun moveForward() {
        when (direction) {
            Direction.NORTH -> y++
            Direction.SOUTH -> y--
            Direction.EAST -> x++
            Direction.WEST -> x--
        }
    }

    fun moveBackward() {
        when (direction) {
            Direction.NORTH -> y--
            Direction.SOUTH -> y++
            Direction.EAST -> x--
            Direction.WEST -> x++
        }
    }

    enum class Direction {
        NORTH, SOUTH, EAST, WEST
    }
}