package eu.codlab.sentry.wrapper

internal fun HttpStatusCodeRange.to() = io.sentry.HttpStatusCodeRange(min, max)
