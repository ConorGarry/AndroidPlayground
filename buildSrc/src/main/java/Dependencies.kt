@file:Suppress("unused")

import org.gradle.api.JavaVersion

// All versions defined here.
object Vers {
    // Sdk and tools
    const val compileSdk = 28
    const val minSdk = 19
    const val targetSdk = 28
    const val buildTools = "28.0.2"
    const val gradle = "3.2.0"
    const val kotlin = "1.3.0-rc-146"
    const val ktxVersion = "1.0.0"
    const val coroutines = "0.30.2"
    const val ktlintVersion = "0.29.0"

    //  App dependency versions
    // Google / Android
    const val supportLibraries = "28.0.0"
    const val supportLibraryX = "1.0.0"
    const val playServices = "16.0.0"
    const val playServicesCastFramework = "16.0.3"
    const val googleServices = "4.1.0"
    const val constraintLayout = "2.0.0-alpha2"
    const val lifecycle = "2.0.0"
    const val navigation = "1.0.0-alpha06"
    const val room = "2.0.0"
    const val workManager = "1.0.0-alpha09"
    const val exoPlayer = "2.8.3"
    const val findBugs = "3.0.2"
    const val dexmaker = "1.2"
    const val flexBox = "0.3.1"
    const val multidex = "1.0.3"
    const val mapsUtils = "0.5"

    // Testing
    const val espresso = "3.1.0-alpha4"
    const val testRules = "1.0.2"
    const val coreTesting = "2.0.0"
    const val junit = "4.12"
    const val runner = "1.0.2"
    const val uiAutomator = "2.2.0-alpha4"
    const val daggerMock = "0.8.4"
    const val mockito = "2.8.47"
    const val robolectric = "2.8.47"
    const val robolectricMultidexShadows = "3.0"

    // Tools
    const val leakCanary = "1.6.1"
    const val sqlScout = "2.0"
    const val stetho = "1.5.0"
    const val tensorflow = "1.9.0"
    const val javaxAnnotation = "1.3.2"
    const val crashlytics = "2.9.5"
    const val fabricTools = "1.26.1"
    const val hugo = "1.2.1"
    const val playPublisher = "2.0.0-beta1"

    // Analytics
    const val mixpanel = "4.9.7"
    const val branch = "2.17.0"

    // FireBase
    const val fireBaseCore = "16.0.1"
    const val fireBaseAppIndexing = "16.0.2"
    const val fireBaseMessaging = "17.3.3"
    const val fireBaseMLVision = "17.0.1"

    // Third Party
    const val rxJava = "1.3.0"
    const val rxJava2 = "2.1.9"
    const val rxAndroid2 = "2.0.1"
    const val rxBroadcast = "2.0.0"
    const val rxBinding = "2.2.0"
    const val okhttp = "3.11.0"
    const val okio = "2.1.0"
    const val retrofit = "2.4.0"
    const val retrofitCoroutineAdapter = "0.9.2"
    const val sqldelight = "0.7.0"
    const val gson = "2.8.2"
    const val dagger = "2.15"
    const val butterknife = "9.0.0-rc1"
    const val picasso = "3.0.0-SNAPSHOT"//"2.71828"
    const val eventbus = "3.1.1"
    const val sqlBrite = "3.2.0"
    const val glideVersion = "4.8.0"
    const val jackson = "2.7.3"
    const val icepick = "3.2.0"
    const val jsoup = "1.11.3"
    const val jodaTimeAndroid = "2.9.9.4"
    const val uuidGenerator = "3.1.5"
    const val commonsLang = "3.8.1"
    const val commonsCollections = "4.2"
    const val commonsText = "1.5"
    const val commonsIo = "2.5"
    const val commonsConfiguration = "2.3"
    const val commonsMaths = "3.6.1"
    const val commonsCompress = "1.18"
    const val commonsPool2 = "2.6.0"
    const val commonsExec = "1.3"

    // Java
    val sourceCompatibilityVersion = JavaVersion.VERSION_1_8
    val targetCompatibilityVersion = JavaVersion.VERSION_1_8
}

// App dependencies
object Deps {
    // AndroidX / Support
    const val appcompat = "androidx.appcompat:appcompat:${Vers.supportLibraryX}"
    const val constraintLayout = "androidx.constraintlayout:constraintlayout:${Vers.constraintLayout}"
    const val legacySupportV4 = "androidx.legacy:legacy-support-v4:${Vers.supportLibraryX}"
    const val lifecycleExtensions = "androidx.lifecycle:lifecycle-extensions:${Vers.lifecycle}"
    const val recyclerView = "androidx.recyclerview:recyclerview:${Vers.supportLibraryX}"
    const val material = "com.google.android.material:material:${Vers.supportLibraryX}"
    const val room = "androidx.room:room-runtime:${Vers.room}"
    const val kotlinRoomCompiler = "androidx.room:room-compiler:${Vers.room}"
    const val archNavFragmentKtx = "android.arch.navigation:navigation-fragment-ktx:${Vers.navigation}"
    const val archNavUiKtx = "android.arch.navigation:navigation-ui-ktx:${Vers.navigation}"
    const val workManager = "android.arch.work:work-runtime-ktx:${Vers.workManager}"
    const val supportAnnotations = "com.android.support:support-annotations:${Vers.supportLibraryX}"
    const val multidex = "com.android.support:multidex:${Vers.multidex}"
    const val androidPercent = "com.android.support:percent:${Vers.supportLibraryX}"
    const val androidPalette = "com.android.support:palette-v7:${Vers.supportLibraryX}"
    const val androidDesign = "com.android.support:design:${Vers.supportLibraryX}"
    const val androidVectorDrawable = "com.android.support:support-vector-drawable:${Vers.supportLibraryX}"

    // Google
    const val gson = "com.google.code.gson:gson:${Vers.gson}"
    const val findBugsjsr305 = "com.google.code.findbugs:jsr305:${Vers.findBugs}"
    const val dexmaker = "com.google.dexmaker:dexmaker:${Vers.dexmaker}"
    const val flexBox = "com.google.android:flexbox:${Vers.flexBox}"

    // Kotlin
    const val coreKtx = "androidx.core:core-ktx:${Vers.ktxVersion}"
    const val kotlinStdlib = "org.jetbrains.kotlin:kotlin-stdlib-jdk8:${Vers.kotlin}"
    const val coroutines = "org.jetbrains.kotlinx:kotlinx-coroutines-core:${Vers.coroutines}"
    const val coroutinesRx = "org.jetbrains.kotlinx:kotlinx-coroutines-rx2:${Vers.coroutines}"
    const val coroutinesAndroid = "org.jetbrains.kotlinx:kotlinx-coroutines-android:${Vers.coroutines}"

    // Third party
    const val dagger = "com.google.dagger:dagger:${Vers.dagger}"
    const val daggerCompile = "com.google.dagger:dagger-compiler:${Vers.dagger}"
    const val daggerAndroid = "com.google.dagger:dagger-android:${Vers.dagger}"
    const val daggerAndroidProcessor = "com.google.dagger:dagger-android-processor:${Vers.dagger}"
    const val butterknife = "com.jakewharton:butterknife:${Vers.butterknife}"
    const val butterknifeCompile = "com.jakewharton:butterknife-compiler:${Vers.butterknife}"
    const val picasso = "com.squareup.picasso:picasso:${Vers.picasso}"
    const val okhttp = "com.squareup.okhttp3:okhttp:${Vers.okhttp}"
    const val okhttpLoggingInterceptor = "com.squareup.okhttp3:logging-interceptor:${Vers.okhttp}"
    const val okhttpMockWebServer = "com.squareup.okhttp3:mockwebserver:${Vers.okhttp}"
    const val rxJava = "io.reactivex.rxjava2:rxjava:${Vers.rxJava2}"
    const val rxAndroid = "io.reactivex.rxjava2:rxandroid:${Vers.rxAndroid2}"
    const val rxBroadcast = "com.cantrowitz:rxbroadcast:${Vers.rxBroadcast}" // exclude module: 'appcompat-v7'
    const val rxbinding = "com.jakewharton.rxbinding2:rxbinding:${Vers.rxBinding}"
    const val eventbus = "org.greenrobot:eventbus:${Vers.eventbus}"
    const val okio = "com.squareup.okio:okio:${Vers.okio}"
    const val retrofit = "com.squareup.retrofit:retrofit:${Vers.retrofit}"
    const val retrofitCoroutinesAdapter = "com.jakewharton.retrofit:retrofit2-kotlin-coroutines-adapter:${Vers.retrofitCoroutineAdapter}"
    const val sqlBrite = "com.squareup.sqlbrite3:sqlbrite:${Vers.sqlBrite}"
    const val sqlBriteKotlin = "com.squareup.sqlbrite3:sqlbrite-kotlin:${Vers.sqlBrite}"
    const val jodaTimeAndroid = "net.danlew:android.joda:${Vers.jodaTimeAndroid}"
    const val uuidGenerator = "com.fasterxml.uuid:java-uuid-generator:${Vers.uuidGenerator}"
    const val jackson = "com.fasterxml.jackson.core:jackson-core:${Vers.jackson}"
    const val jacksonAnnotations = "com.fasterxml.jackson.core:jackson-annotations:${Vers.jackson}"
    const val jacksonDatabind = "com.fasterxml.jackson.core:jackson-databind:${Vers.jackson}"
    const val icepick = "frankiesardo:icepick:${Vers.icepick}"
    const val icepickProcessor = "frankiesardo:icepick-processor:${Vers.icepick}"
    const val jsoup = "org.jsoup:jsoup:${Vers.jsoup}"
    const val apacheCommonsLang = "org.apache.commons:commons-lang3:${Vers.commonsLang}"
    const val apacheCommonsCollections = "org.apache.commons:commons-lang3:${Vers.commonsCollections}"
    const val apacheCommonsText = "org.apache.commons:commons-text:${Vers.commonsText}"
    const val apacheCommonsIo = "org.apache.commons:commons-io:${Vers.commonsIo}"
    const val apacheCommonsConfiguration = "org.apache.commons:commons-configuration2:${Vers.commonsConfiguration}"
    const val apachCommonsMath = "org.apache.commons:commons-math3:${Vers.commonsMaths}"
    const val apachCommonsCompress = "org.apache.commons:commons-compress:${Vers.commonsCompress}"
    const val apachCommonsPool = "org.apache.commons:commons-pool2:${Vers.commonsPool2}"
    const val apachCommonsExec = "org.apache.commons:commons-exec:${Vers.commonsExec}"

    // Testing
    const val runner = "androidx.test.runner.AndroidJUnitRunner"
    const val junit = "junit:junit:${Vers.junit}"
    const val archCoreTest = "androidx.arch.core:core-testing:${Vers.coreTesting}"
    const val espressoCore = "androidx.test.espresso:espresso-core:${Vers.espresso}"
    const val espressoContributors = "androidx.test.espresso:espresso-contrib:${Vers.espresso}"
    const val espressoIntents = "androidx.test.espresso:espresso-intents:${Vers.espresso}"
    const val uiAutomator = "androidx.test.uiautomator:uiautomator:${Vers.uiAutomator}"
    const val daggerMock = "com.github.fabioCollini.daggermock:daggermock:${Vers.daggerMock}"
    /** @see [https://github.com/fabioCollini/DaggerMock] */
    const val mockito = "org.mockito:mockito-core:${Vers.mockito}"
    const val testOrchestrator = "com.android.support.test:orchestrator:${Vers.testRules}"
    const val supportTestRunner = "com.android.support.test:runner:${Vers.testRules}"
    const val supportTestRules = "com.android.support.test:rules:${Vers.testRules}"
    const val robolectric = "org.robolectric:robolectric:${Vers.robolectric}"
    const val robolectricShadowsMultidex = "org.robolectric:shadows-multidex:${Vers.robolectricMultidexShadows}"

    // Play Services (more at https://developers.google.com/android/guides/releases)
    const val servicesLocation = "com.google.android.gms:play-services-location:${Vers.playServices}"
    const val playServicesCastFramework = "com.google.android.gms:play-services-cast-framework:${Vers.playServicesCastFramework}"
    const val mapUtils = "com.google.maps.android:android-maps-utils:${Vers.mapsUtils}"

    // FireBase (more at https://developers.google.com/android/guides/releases)
    const val fireBaseAppIndex = "com.google.firebase:firebase-appindexing:${Vers.fireBaseAppIndexing}"
    const val fireBaseMessaging = "com.google.firebase:firebase-messaging:${Vers.fireBaseMessaging}"
    const val fireBaseCore = "com.google.firebase:firebase-core:${Vers.fireBaseCore}"
    const val fireBaseMLVision =  "com.google.firebase:firebase-ml-vision:${Vers.fireBaseMLVision}"

    // Tools
    const val leakCanary = "com.squareup.leakcanary:leakcanary-android:${Vers.leakCanary}"
    const val sqlScout = "const val sqlScout = com.idescout.sql:sqlscout-server:${Vers.sqlScout}"
    const val stetho = "com.facebook.stetho:stetho:${Vers.stetho}"
    const val crashlytics = "com.crashlytics.sdk.android:crashlytics:${Vers.crashlytics}@aar"
    const val tensorflow = "org.tensorflow:tensorflow-android:${Vers.tensorflow}"
    const val javaxAnnotaion = "javax.annotation:javax.annotation-api:${Vers.javaxAnnotation}"

    // Analytics
    const val mixPanel = "com.mixpanel.android:mixpanel-android:${Vers.mixpanel}"
    const val branch = "io.branch.sdk.android:library:${Vers.branch}"
}

object Project {
    const val androidGradlePlugin = "com.android.tools.build:gradle:${Vers.gradle}"
    const val kotlinGradlePlugin = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Vers.kotlin}"
    const val archNavSafeArgs = "android.arch.navigation:navigation-safe-args-gradle-plugin:${Vers.navigation}"
    const val fabricTools = "io.fabric.tools:gradle:${Vers.fabricTools}"
    const val sqlDelight = "com.squareup.sqldelight:gradle-plugin:${Vers.sqldelight}"
    const val hugo = "com.jakewharton.hugo:hugo-plugin:${Vers.hugo}"
    const val playPublisher = "com.github.triplet.gradle:play-publisher:${Vers.playPublisher}"

    const val googleServicesRepo = "com.google.gms:google-services:${Vers.googleServices}"
    const val KotlinEapRepo = "http://dl.bintray.com/kotlin/kotlin-eap"
    const val ideScoutRepo = "http://www.idescout.com/maven/repo/"
    const val clojarsRepo = "https://clojars.org/repo/"
    const val jitpackRepo = "https://jitpack.io" // Req: DaggerMock.
    const val novodaRepo = "com.novoda:bintray-release:0.3.4"
    const val butterKnifSnapshotRepo = "com.jakewharton:butterknife-gradle-plugin:9.0.0-SNAPSHOT"
    const val sonatypeRepo = "https://oss.sonatype.org/content/repositories/snapshots" // Req: Play Publisher, ButterknifeSnapshots.
}

object Plugins {
    const val androidApplication = "com.android.application"
    const val kotlinAndroid = "kotlin-android"
    const val kotlinAndroidExtensions = "kotlin-android-extensions"
    const val kotlinKapt = "kotlin-kapt"
    const val androidXNavigation = "androidx.navigation.safeargs"
    const val googleServices = "com.google.gms.google-services"
    const val sqlDelight = "com.squareup.sqldelight"
    const val playPublisher = "com.github.triplet.play"
}