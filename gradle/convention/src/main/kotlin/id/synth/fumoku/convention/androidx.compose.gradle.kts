/*
 * Copyright 2023 Synth.ID
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

package id.synth.fumoku.convention

import id.synth.fumoku.convention.build.dsl.android
import id.synth.fumoku.convention.build.dsl.libs

android {
    buildFeatures {
        compose = true
    }

    composeOptions {
        kotlinCompilerExtensionVersion = libs.versions.compose.compiler.get()
    }
}

dependencies {
    val composeBom = platform(libs.androidx.compose.bom)
    add("implementation", composeBom)
    add("androidTestImplementation", composeBom)

    add("implementation", libs.androidx.compose.material3)
}
