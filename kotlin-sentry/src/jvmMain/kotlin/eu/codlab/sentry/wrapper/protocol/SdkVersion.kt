package eu.codlab.sentry.wrapper.protocol

internal fun SdkVersion.toSdkVersion() = io.sentry.protocol.SdkVersion(name,version)
