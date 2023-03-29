plugins {
    id("org.jetbrains.kotlin.jvm") version "1.7.10"
}

repositories {
    mavenCentral()
}


testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useKotlinTest("1.7.10")
            dependencies {
                implementation("org.junit.jupiter:junit-jupiter-engine:5.9.1")
            }
        }
    }
}
