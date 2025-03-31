package eu.codlab.sentry.wrapper

actual object Sentry {
    actual fun init(configuration: (SentryOptions) -> Unit) {
    }

    actual fun captureException(throwable: Throwable) {
    }

    actual fun captureMessage(message: String) {
    }

}