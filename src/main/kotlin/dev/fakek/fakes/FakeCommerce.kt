package dev.fakek.fakes

import dev.fakek.interfaces.Company

/**
 * FakeCommerce provides a commerce with random information.
 */
class FakeCommerce(val address: FakeAddress, fakeCompany: FakeCompany) : Company by fakeCompany
