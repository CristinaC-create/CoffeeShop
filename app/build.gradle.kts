plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    id("com.google.gms.google-services")

}

android {
    namespace = "com.cristinacabral.coffeeshop"
    compileSdk = 35

    defaultConfig {
        applicationId = "com.cristinacabral.coffeeshop"
        minSdk = 24
        targetSdk = 35
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }

    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }

    kotlinOptions {
        jvmTarget = "11"
    }

    buildFeatures {
        viewBinding = true
    }
}

dependencies {
    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)

    // ViewModel & LiveData
    //noinspection UseTomlInstead
    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.8.7")
    //noinspection UseTomlInstead
    implementation("androidx.lifecycle:lifecycle-livedata-ktx:2.8.7")
    //noinspection UseTomlInstead
    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.8.7")

    // activity viewModel extensions
    //noinspection UseTomlInstead
    implementation("androidx.activity:activity-ktx:1.10.1")

    // Glide for image loading
    //noinspection UseTomlInstead
    implementation("com.github.bumptech.glide:glide:4.16.0")

    // Gson for JSON parsing
    //noinspection UseTomlInstead
    implementation("com.google.code.gson:gson:2.13.0")
    implementation(libs.firebase.database)

    // Firebase Connection
    dependencies {
        //noinspection UseTomlInstead
        implementation("com.google.firebase:firebase-firestore-ktx:25.1.3")
    }

    // Testing
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}