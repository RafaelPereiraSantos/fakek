package dev.fakek.fakes

/**
 * FakeCommerce provides a commerce with random information.
 *
 * @param address a instance of FakeAddress containing all info related to the fake address of the commerce.
 */
class FakeCommerce(
    val address: FakeAddress,
    fakerCompany: FakerCompany,
    fakeUrl: FakeUrl
) : FakeCompany(fakerCompany, fakeUrl)
