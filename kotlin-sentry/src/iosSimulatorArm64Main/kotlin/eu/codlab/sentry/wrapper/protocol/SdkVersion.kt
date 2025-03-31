package eu.codlab.sentry.wrapper.protocol

internal fun SdkVersion.toSdkVersion() = io.sentry.kotlin.multiplatform.protocol.SdkVersion(
    name = name,
    version = version
)