package dev.fakek.fakes

import dev.fakek.fakes.utils.FakeCompanyBaseTest
import io.mockk.mockk
import org.junit.jupiter.api.Test
import strikt.api.expectThat
import strikt.assertions.isA

internal class FakeCommerceTest : FakeCompanyBaseTest() {

    private val fakeAddress: FakeAddress = mockk()

    @Test
    fun `given a FakeCommerce it should be subtype of FakeCompany with a fake address`() {
        val subject = FakeCommerce(fakeAddress, fakerCompany, fakeUrl)

        expectThat(subject) {
            isA<FakeCompany>()
            get { address }.isA<FakeAddress>()
        }
    }

}