@file:Suppress("WildcardImport")
package dev.fakek

import com.github.javafaker.Faker
import dev.fakek.fakes.*

/**
 * The top level function for interacting with FakeK. This provides an instance of [FakeContext] scoped to this
 * function. This allows for all interactions with [FakeContext] to persist during the usage of [fakek].
 *
 * @param fakeContext provides a [FakeContext] instance to be used, the default value is a new instance of
 * [FakeContext].
 * @param fakeContextScope provides a scope on the provided [fakeContext] instance.
 */
fun <T> fakek(
    fakeContext: FakeContext = FakeContext(),
    fakeContextScope: FakeContext.() -> T
): T = fakeContext.fakeContextScope()

/**
 * FakeContext acts as a Context object for the library. It provides an easy way to access all of the fakes within the
 * library along with caching certain values to allow for proper scoping with the [fakek] function.
 *
 * @param faker is an instance of [Faker] which will be used for generating the various fakes. This will default to a
 * new instance of [Faker].
 */
class FakeContext(private val faker: Faker = Faker.instance()) {
    private val fakerName by lazy { faker.name() }
    private val fakerInternet by lazy { faker.internet() }
    private val fakerAddress by lazy { faker.address() }

    /**
     * Provides a [FakeAddress].
     */
    val fakeAddress by lazy { FakeAddress(fakerAddress) }

    /**
     * Provides a [FakeCreditCard].
     */
    val fakeCreditCard by lazy { FakeCreditCard.create() }

    /**
     * Provides a [FakeEmailAddress] making use of [fakeName] to help generate parts of the email address.
     */
    val fakeEmailAddress by lazy { FakeEmailAddress(fakeName) }

    /**
     * Provides a [FakeName].
     */
    val fakeName by lazy { FakeName(fakerName) }

    /**
     * Provides a [FakePassword].
     */
    val fakePassword by lazy { FakePassword(fakerInternet) }

    /**
     * Provides a [FakeUrl].
     */
    val fakeUrl by lazy { FakeUrl(fakerInternet) }
}
