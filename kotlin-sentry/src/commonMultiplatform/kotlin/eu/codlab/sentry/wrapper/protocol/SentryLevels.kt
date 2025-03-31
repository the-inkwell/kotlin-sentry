package eu.codlab.sentry.wrapper.protocol

import io.sentry.kotlin.multiplatform.SentryLevel as ISentryLevel

internal fun SentryLevel.to() = when (this) {
    SentryLevel.DEBUG -> ISentryLevel.DEBUG
    SentryLevel.INFO -> ISentryLevel.INFO
    SentryLevel.WARNING -> ISentryLevel.WARNING
    SentryLevel.ERROR -> ISentryLevel.ERROR
    SentryLevel.FATAL -> ISentryLevel.FATAL
}