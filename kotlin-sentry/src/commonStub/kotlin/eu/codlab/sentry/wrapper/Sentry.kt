package eu.codlab.sentry.wrapper

actual object Sentry {
    actual fun init(configuration: (SentryOptions) -> Unit) {
        // nothing
    }

    actual fun captureException(throwable: Throwable) {
        // nothing
    }

    actual fun captureMessage(message: String) {
        // nothing
    }
}
