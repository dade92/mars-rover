package org.example.marsrover

import io.mockk.Runs
import io.mockk.every
import io.mockk.just
import io.mockk.mockk
import io.mockk.verify
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

class RoverControllerTest {

    private val rover = mockk<Rover>()
    private val controller = RoverController(rover)

    @BeforeEach
    fun setUp() {
        every { rover.moveForward() } just Runs
        every { rover.moveBackward() } just Runs
        every { rover.turnRight() } just Runs
        every { rover.turnLeft() } just Runs
    }

    @Test
    fun `run sequence of commands`() {
        controller.run("f,r,b,l")

        verify { rover.moveForward() }
        verify { rover.turnRight() }
        verify { rover.moveBackward() }
        verify { rover.turnLeft() }
    }

    @Test
    fun `invalid command`() {
        Assertions.assertThrows(IllegalArgumentException::class.java) {
            controller.run("I")
        }
    }
}