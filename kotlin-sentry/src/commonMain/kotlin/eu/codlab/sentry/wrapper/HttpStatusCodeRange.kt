package eu.codlab.sentry.wrapper

/**
 * The Http status code range. Example for a range: 400 to 499, 500 to 599, 400 to 599 The range is
 * inclusive so the min and max is considered part of the range.
 *
 * Example for a single status code 400, 500.
 *
 * @property min the min status code of the range
 * @property max the max status code of the range
 */
data class HttpStatusCodeRange(val min: Int = DEFAULT_MIN, val max: Int = DEFAULT_MAX) {

    constructor(statusCode: Int) : this(statusCode, statusCode)

    fun isInRange(statusCode: Int): Boolean {
        return statusCode in min..max
    }

    companion object {
        /** The default min status code of the range. */
        const val DEFAULT_MIN: Int = 500

        /** The default max status code of the range. */
        const val DEFAULT_MAX: Int = 599
    }
}
