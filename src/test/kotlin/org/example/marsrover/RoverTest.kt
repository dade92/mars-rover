package org.example.marsrover

import org.example.marsrover.Rover.Direction.EAST
import org.example.marsrover.Rover.Direction.NORTH
import org.example.marsrover.Rover.Direction.SOUTH
import org.example.marsrover.Rover.Direction.WEST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test

class RoverTest {

    @Test
    fun `init correctly`() {
        val rover = Rover(1, 2, NORTH)

        assertEquals(1, rover.x)
        assertEquals(2, rover.y)
        assertEquals(NORTH, rover.direction)
    }

    @Nested
    inner class MoveForward {
        @Test
        fun `move forward NORTH`() {
            val rover = Rover(1, 2, NORTH)

            rover.moveForward()

            assertEquals(1, rover.x)
            assertEquals(3, rover.y)
            assertEquals(NORTH, rover.direction)
        }

        @Test
        fun `move forward EAST`() {
            val rover = Rover(1, 2, EAST)

            rover.moveForward()

            assertEquals(2, rover.x)
            assertEquals(2, rover.y)
            assertEquals(EAST, rover.direction)
        }

        @Test
        fun `move forward WEST`() {
            val rover = Rover(1, 2, WEST)

            rover.moveForward()

            assertEquals(0, rover.x)
            assertEquals(2, rover.y)
            assertEquals(WEST, rover.direction)
        }

        @Test
        fun `move forward SOUTH`() {
            val rover = Rover(1, 2, SOUTH)

            rover.moveForward()

            assertEquals(1, rover.x)
            assertEquals(1, rover.y)
            assertEquals(SOUTH, rover.direction)
        }
    }
}