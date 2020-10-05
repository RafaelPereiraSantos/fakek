package dev.fakek.fakes

/**
 * FakeCompany provides a company with random information.
 *
 * @param bs company bs.
 * @param buzzword company buzzword.
 * @param catchPhrase company famous phrase.
 * @param industry random industrial classification.
 * @param logo random url of the company logo.
 * @param name company official name.
 * @param profession random profession.
 * @param suffix company name suffix.
 * @param url random url of company website.
 */
data class FakeCompany(
    val bs: String,
    val buzzword: String,
    val catchPhrase: String,
    val industry: String,
    val logo: String,
    val name: String,
    val profession: String,
    val suffix: String,
    val url: String
) {
    constructor(fakerCompany: FakerCompany, fakeUrl: FakeUrl) :
        this(
            fakerCompany.bs(),
            fakerCompany.buzzword(),
            fakerCompany.catchPhrase(),
            fakerCompany.industry(),
            fakerCompany.logo(),
            fakerCompany.name(),
            fakerCompany.profession(),
            fakerCompany.suffix(),
            fakeUrl.url
        )
}
