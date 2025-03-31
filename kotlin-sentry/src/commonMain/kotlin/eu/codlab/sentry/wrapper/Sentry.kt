package eu.codlab.sentry.wrapper

expect object Sentry {
    fun init(configuration: (SentryOptions) -> Unit)

    fun captureException(throwable: Throwable)

    fun captureMessage(message: String)
}
