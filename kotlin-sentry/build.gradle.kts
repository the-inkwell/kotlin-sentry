plugins {
    alias(additionals.plugins.kotlin.multiplatform)
    alias(additionals.plugins.android.library)
    id("publication")
    id("jvmCompat")
}

kotlin {
    androidTarget {
        publishLibraryVariants("release")
    }

    jvm()
    iosArm64()
    iosSimulatorArm64()
    iosX64()
    watchosSimulatorArm64()
    watchosArm32()
    watchosArm64()
    watchosX64()
    tvosSimulatorArm64()
    tvosArm64()
    tvosX64()
    macosX64()
    macosArm64()

    // added also the platforms which were not compatible from https://github.com/getsentry/sentry-kotlin-multiplatform/blob/main/sentry-kotlin-multiplatform/build.gradle.kts
    js(IR) {
        browser()
    }

    linuxArm64()
    linuxX64()
    mingwX64()

    sourceSets {
        commonMain {
            dependencies {
                // nothing
            }
        }

        val common by creating {
            dependencies {
                implementation(libs.multiplatform.sentry)
            }
        }

        listOf(
            androidMain,
            jvmMain,
            iosArm64Main,
            iosSimulatorArm64Main,
            iosX64Main,
            watchosX64Main,
            watchosArm32Main,
            watchosArm64Main,
            watchosSimulatorArm64Main,
            tvosX64Main,
            tvosArm64Main,
            tvosSimulatorArm64Main,
            macosArm64Main,
            macosX64Main
        ).forEach {
            it.get().dependsOn(common)
        }
    }

    targets.configureEach {
        compilations.configureEach {
            compileTaskProvider.get().compilerOptions {
                freeCompilerArgs.add("-Xexpect-actual-classes")
            }
        }
    }
}

android {
    namespace = "eu.codlab.sentry"
}
