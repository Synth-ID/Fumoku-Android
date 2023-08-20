/*
 * Copyright 2023 Ryyvv Assoc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.ryyvv.convention.build

import me.ryyvv.convention.build.dsl.android
import me.ryyvv.convention.build.dsl.javaLanguageVersion
import me.ryyvv.convention.build.dsl.javaVersion
import me.ryyvv.convention.build.dsl.libs
import org.jetbrains.kotlin.gradle.dsl.KotlinVersion

plugins {
    org.jetbrains.kotlin.android
}

android {
    compileOptions {
        sourceCompatibility = libs.versions.javaVersion.get()
        targetCompatibility = libs.versions.javaVersion.get()
    }
}

kotlin {
    compilerOptions {
        languageVersion.set(KotlinVersion.KOTLIN_2_0)
        apiVersion.set(KotlinVersion.KOTLIN_2_0)
    }
    jvmToolchain {
        languageVersion.set(libs.versions.javaLanguageVersion)
    }
}
