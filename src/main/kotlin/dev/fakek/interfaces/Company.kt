package dev.fakek.interfaces

/**
 * Company provides a company with random information.
 *
 * @property bs company corporate speak ex: "energistically mesh e-business opportunities".
 * @property buzzword
 * @property catchPhrase
 * @property industry
 * @property logo random url of the company logo.
 * @property name
 * @property profession
 * @property suffix
 * @property url random url of company website.
 */
interface Company {
    val bs: String
    val buzzword: String
    val catchPhrase: String
    val industry: String
    val logo: String
    val name: String
    val profession: String
    val suffix: String
    val url: String
}
