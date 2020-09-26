package dev.fakek.fakes

/**
 * Fakecolor provides a random color name.
 */
data class FakeColor(val hex: String, val hexWithHashSign: String) {
    constructor(fakerColor: FakerColor): this(fakerColor.hex(), fakerColor.hex(true))
}
