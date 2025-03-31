### Kotlin Sentry Wrapper

**The current Sentry multiplatform implementation is not compatible with most projects which are targetting more than JVM, Android and iOS projects.**

The idea behind this wrapper is to simply add stubs so that all the calls can be compatible whatever the platforms while silently manages platforms which can't be yet used for reporting.

## Installation

```
implementation("eu.codlab:kotlin-sentry:$version")
```

### iOS specifics

TO use iOS specifically, you'll always either use the sentry SPM package
or cocoapods via either Podfile's `Pod("Sentry")` or :

```
kotlin {
    ...

    cocoapods {
        ...
        pod("Sentry") {
            extraOpts += listOf("-compiler-option", "-fmodules")
        }
    }

    ...
}
```