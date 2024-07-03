plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.jetbrains.kotlin.android)
}

android {
    namespace = "com.imtiaz_acedamy.financeappkotlin"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.imtiaz_acedamy.financeappkotlin"
        minSdk = 21
        targetSdk = 34
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
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
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)




    implementation("com.github.Dimezis:BlurView:version-2.0.3")
    implementation ("com.github.bumptech.glide:glide:4.16.0")
    implementation ("com.mikhaellopez:circularprogressbar:3.1.0")

//    //implementation("com.github.Dimezis: BlurView:version-2.0.3")
//    //Lifecycle
//    implementation(libs.androidx.xlifecycle.extensions)
//    implementation("androidx.lifecycle:lifecycle-runtime-ktx:2.6.2")
//    implementation("androidx.lifecycle:lifecycle-viewmodel-ktx:2.6.2")
//    implementation ("androidx.lifecycle:lifecycle-livedata-ktx:2.6.2")
//
//
//    //ViewModel
//    implementation ("androidx.activity: activity-ktx:1.4.0")
}