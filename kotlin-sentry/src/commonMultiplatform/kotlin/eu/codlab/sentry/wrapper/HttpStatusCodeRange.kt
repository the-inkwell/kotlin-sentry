package eu.codlab.sentry.wrapper

internal fun HttpStatusCodeRange.to() = io.sentry.kotlin.multiplatform.HttpStatusCodeRange(
    min = min,
    max = max
)