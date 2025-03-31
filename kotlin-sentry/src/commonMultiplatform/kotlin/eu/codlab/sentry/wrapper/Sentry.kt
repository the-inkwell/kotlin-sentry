package eu.codlab.sentry.wrapper

import eu.codlab.sentry.wrapper.protocol.to
import eu.codlab.sentry.wrapper.protocol.toSdkVersion
import io.sentry.kotlin.multiplatform.Sentry as ISentry

actual object Sentry {
    actual fun init(configuration: (SentryOptions) -> Unit) {
        val options = SentryOptions()
        configuration(options)
        ISentry.init {
            it.dist = options.dist
            it.environment = options.environment
            it.release = options.release
            it.anrTimeoutIntervalMillis = options.anrTimeoutIntervalMillis
            it.appHangTimeoutIntervalMillis = options.appHangTimeoutIntervalMillis
            it.attachScreenshot = options.attachScreenshot
            it.attachStackTrace = options.attachStackTrace
            it.attachThreads = options.attachThreads
            it.attachViewHierarchy = options.attachViewHierarchy
            it.debug = options.debug
            it.diagnosticLevel = options.diagnosticLevel.to()
            it.dsn = options.dsn
            it.enableAppHangTracking = options.enableAppHangTracking
            it.enableAutoSessionTracking = options.enableAutoSessionTracking
            it.enableCaptureFailedRequests = options.enableCaptureFailedRequests
            it.enableWatchdogTerminationTracking = options.enableWatchdogTerminationTracking
            it.failedRequestStatusCodes = options.failedRequestStatusCodes.map { it.to() }
            it.failedRequestTargets = options.failedRequestTargets
            it.isAnrEnabled = options.isAnrEnabled
            it.maxAttachmentSize = options.maxAttachmentSize
            it.maxBreadcrumbs = options.maxBreadcrumbs
            it.release = options.release
            it.sampleRate = options.sampleRate
            it.sdk = options.sdk?.toSdkVersion()
            it.sessionTrackingIntervalMillis = options.sessionTrackingIntervalMillis
            it.tracesSampleRate = options.tracesSampleRate
        }
    }

    actual fun captureException(throwable: Throwable) {
        ISentry.captureException(throwable)
    }

    actual fun captureMessage(message: String) {
        ISentry.captureMessage(message)
    }
}
