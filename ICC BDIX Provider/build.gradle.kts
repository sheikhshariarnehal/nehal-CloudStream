dependencies {
    implementation("com.google.android.material:material:1.12.0")
    implementation("androidx.recyclerview:recyclerview:1.3.2")
}

// Use an integer for version numbers
version = 1

cloudstream {
    // All of these properties are optional, you can safely remove any of them.

    description = "ICC BDIX Provider"
    authors = listOf("nehal")

    /**
    * Status int as one of the following:
    * 0: Down
    * 1: Ok
    * 2: Slow
    * 3: Beta-only
    **/
    status = 1 // Will be 3 if unspecified

    tvTypes = listOf("Movie", "TvSeries", "Anime")

    requiresResources = true
    language = "en"

    // Default icon - you can replace with your own
    iconUrl = "http://10.16.100.244/images/logo-purple.svg"
}

android {
    buildFeatures {
        buildConfig = true
        viewBinding = true
    }
}
