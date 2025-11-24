package org.example.marsrover

import org.example.marsrover.Rover.Direction.EAST
import org.example.marsrover.Rover.Direction.NORTH
import org.example.marsrover.Rover.Direction.SOUTH
import org.example.marsrover.Rover.Direction.WEST
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import kotlin.math.E

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
        fun `move NORTH`() {
            val rover = Rover(1, 2, NORTH)

            rover.moveForward()

            assertEquals(1, rover.x)
            assertEquals(3, rover.y)
            assertEquals(NORTH, rover.direction)
        }

        @Test
        fun `move EAST`() {
            val rover = Rover(1, 2, EAST)

            rover.moveForward()

            assertEquals(2, rover.x)
            assertEquals(2, rover.y)
            assertEquals(EAST, rover.direction)
        }

        @Test
        fun `move WEST`() {
            val rover = Rover(1, 2, WEST)

            rover.moveForward()

            assertEquals(0, rover.x)
            assertEquals(2, rover.y)
            assertEquals(WEST, rover.direction)
        }

        @Test
        fun `move SOUTH`() {
            val rover = Rover(1, 2, SOUTH)

            rover.moveForward()

            assertEquals(1, rover.x)
            assertEquals(1, rover.y)
            assertEquals(SOUTH, rover.direction)
        }
    }

    @Nested
    inner class MoveBackward {
        @Test
        fun `move NORTH`() {
            val rover = Rover(1, 2, NORTH)

            rover.moveBackward()

            assertEquals(1, rover.x)
            assertEquals(1, rover.y)
            assertEquals(NORTH, rover.direction)
        }

        @Test
        fun `move EAST`() {
            val rover = Rover(1, 2, EAST)

            rover.moveBackward()

            assertEquals(0, rover.x)
            assertEquals(2, rover.y)
            assertEquals(EAST, rover.direction)
        }

        @Test
        fun `move WEST`() {
            val rover = Rover(1, 2, WEST)

            rover.moveBackward()

            assertEquals(2, rover.x)
            assertEquals(2, rover.y)
            assertEquals(WEST, rover.direction)
        }

        @Test
        fun `move SOUTH`() {
            val rover = Rover(1, 2, SOUTH)

            rover.moveBackward()

            assertEquals(1, rover.x)
            assertEquals(3, rover.y)
            assertEquals(SOUTH, rover.direction)
        }
    }

    @Nested
    inner class TurnRight {

        @Test
        fun `turn NORTH`() {
            val rover = Rover(1, 2, NORTH)

            rover.turnRight()

            assertEquals(1, rover.x)
            assertEquals(2, rover.y)
            assertEquals(EAST, rover.direction)
        }

        @Test
        fun `turn EAST`() {
            val rover = Rover(1, 2, EAST)

            rover.turnRight()

            assertEquals(1, rover.x)
            assertEquals(2, rover.y)
            assertEquals(SOUTH, rover.direction)
        }

        @Test
        fun `turn SOUTH`() {
            val rover = Rover(1, 2, SOUTH)

            rover.turnRight()

            assertEquals(1, rover.x)
            assertEquals(2, rover.y)
            assertEquals(WEST, rover.direction)
        }

        @Test
        fun `turn WEST`() {
            val rover = Rover(1, 2, WEST)

            rover.turnRight()

            assertEquals(1, rover.x)
            assertEquals(2, rover.y)
            assertEquals(NORTH, rover.direction)
        }
    }
}