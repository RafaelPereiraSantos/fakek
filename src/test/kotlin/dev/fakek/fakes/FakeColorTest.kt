package dev.fakek.fakes

import io.mockk.every
import io.mockk.mockk
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isEqualTo

class FakeColorTest {

    private val hexColor by lazy { "FF2D00" }
    private val hexColorWithHashSymbol by lazy { "#$hexColor" }
    private val fakerColor by lazy {
        mockk<FakerColor>()
            .also {
                every { it.hex() } returns hexColor
                every { it.hex(true) } returns hexColorWithHashSymbol
            }
    }

    @Test
    fun `given a FakerColor when creating a FakeColor then the correct hex color should be set`() {
        val subject = fakeColor()

        expectThat(subject.hex).isEqualTo(hexColor)
    }

    @Test
    fun `given a FakerColor when creating a FakeColor then the correct hex color with hash symbol should be set`() {
        val subject = fakeColor()

        expectThat(subject.hexWithHashSign).isEqualTo(hexColorWithHashSymbol)
    }

    private fun fakeColor() = FakeColor(fakerColor)
}
