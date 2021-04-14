plugins {
    `kotlin-dsl`
}
repositories{
    mavenCentral()
    google()
    jcenter()
}

dependencies{
    implementation("com.android.tools.build:gradle:3.5.3")
    implementation("org.jetbrains.kotlin:kotlin-gradle-plugin:1.4.32")

    implementation(gradleApi())
    implementation(localGroovy())
}