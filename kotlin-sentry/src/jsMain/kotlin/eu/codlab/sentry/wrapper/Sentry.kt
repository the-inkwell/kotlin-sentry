package eu.codlab.sentry.wrapper

actual object Sentry {
    actual fun captureException(throwable: Throwable) {
        // nothing
    }

    actual fun captureMessage(message: String) {
        // nothing
    }

    actual fun init(configuration: (SentryOptions) -> Unit) {
        // nothing
    }
}
