# Libre Netbird Android Client

This is a fork of the official Netbird Android client, with proprietary components removed (Crashlytics, GMS, etc.).

`react-native-device-info` has been replaced with a custom implementation of required functions, as the library was pulling in the play installer referrer library as well as Firebase/GMS.

Two permissions were also removed:
- `com.google.android.gms.permission.AD_ID`
- `BIND_GET_INSTALL_REFERRER_SERVICE` (through removal of device info lib)

APK scan before and after:

<details>
    <summary>Before</summary>

    No libsmali.jsonl entry for /com/shaded/fasterxml/jackson, this library will be ignored.
    
    Libraries detected:
    -------------------
    * Android Support v4 (/android/support/v4): Development Framework, Apache-2.0
    * AndroidX Activity (/androidx/activity): Utility, Apache-2.0
    * Android Jetpack Annotations (/androidx/annotation): Utility, Apache-2.0
    * Arch (/androidx/arch): Utility, Apache-2.0
    * AppCompat (/androidx/appcompat): Utility, Apache-2.0
    * Autofill (/androidx/autofill): Utility, Apache-2.0
    * Browser (/androidx/browser): Utility, Apache-2.0
    * Cardview (/androidx/cardview): UI Component, Apache-2.0
    * Android Support Library collections (/androidx/collection): Utility, Apache-2.0
    * Concurrent (/androidx/concurrent): Utility, Apache-2.0
    * Coordinatorlayout (/androidx/coordinatorlayout): UI Component, Apache-2.0
    * Androidx Core (/androidx/core): Utility, Apache-2.0
    * AndroidX Cursor Adapter (/androidx/cursoradapter): Utility, Apache-2.0
    * Android Support Library Custom View (/androidx/customview): UI Component, Apache-2.0
    * Documentfile (/androidx/documentfile): UI Component, Apache-2.0
    * Drawerlayout (/androidx/drawerlayout): UI Component, Apache-2.0
    * Android Emoji2 Compat (/androidx/emoji2): UI Component, Apache-2.0
    * AndroidX Fragment (/androidx/fragment): UI Component, Apache-2.0
    * Interpolator (/androidx/interpolator): UI Component, Apache-2.0
    * androidx.legacy (/androidx/legacy): Utility, Apache-2.0
    * Lifecycle (/androidx/lifecycle): Utility, Apache-2.0
    * Loader (/androidx/loader): Utility, Apache-2.0
    * AndroidX Local Broadcast Manager (/androidx/localbroadcastmanager): Utility, Apache-2.0
    * Print (/androidx/print): Utility, Apache-2.0
    * ResourceInspection (/androidx/resourceinspection): Development Aid, Apache-2.0
    * Recyclerview (/androidx/recyclerview): Utility, Apache-2.0
    * Android Activity Saved State (/androidx/savedstate): Utility, Apache-2.0
    * Startup (/androidx/startup): Utility, Apache-2.0
    * Swiperefreshlayout (/androidx/swiperefreshlayout): UI Component, Apache-2.0
    * Tracing (/androidx/tracing): Utility, Apache-2.0
    * Transition (/androidx/transition): UI Component, Apache-2.0
    * Vectordrawable (/androidx/vectordrawable): UI Component, Apache-2.0
    * Android Jetpack VersionedParcelable (/androidx/versionedparcelable): Utility, Apache-2.0
    * Viewpager (/androidx/viewpager): UI Component, Apache-2.0
    * AndroidX Widget ViewPager2 (/androidx/viewpager2): UI Component, Apache-2.0
    * Webkit (/androidx/webkit): Utility, Apache-2.0
    * Bolts Framework (/bolts): Development Framework, MIT
    * Lottie for React Native (/com/airbnb/android/react/lottie): Utility, Apache-2.0
    * Lottie for Android (/com/airbnb/lottie): UI Component, Apache-2.0
    * Play Install Referrer Library (/com/android/installreferrer): Utility, Proprietary; NonFreeComp,NonFreeNet,Tracking
    * Crashlytics (/com/crashlytics): Mobile Analytics, Proprietary; NonFreeComp,Tracking
    * Fresco (/com/facebook/fresco): Utility, MIT
    * Hermes JS Engine (/com/facebook/hermes): Utility, MIT
    * Infer (/com/facebook/infer): Utility, MIT
    * React Native (/com/facebook/react): Development Framework, MIT
    * SoLoader (/com/facebook/soloader): Utility, Apache-2.0
    * Google Ads (/com/google/ads): Advertisement, Proprietary; Ads,NonFreeComp
    * Firebase Data Transport (/com/google/android/datatransport): Utility, Apache-2.0; NonFreeNet
    * Android Market (/com/google/android/finsky): App Market, LicenseUnknown; NonFreeNet
    * Google Mobile Services (/com/google/android/gms): Development Framework, Proprietary; NonFreeComp
    * Google Material Design (/com/google/android/material): Utility, Apache-2.0
    * Google Core Libraries for Java 6+ (/com/google/common): Utility, Apache-2.0
    * Error Prone (/com/google/errorprone): Utility, Apache-2.0
    * Firebase (/com/google/firebase): Utility, LicenseUnknown; NonFreeNet,NonFreeComp
    * Firebase Analytics (/com/google/firebase/analytics): Mobile Analytics, Proprietary; NonFreeComp,Tracking
    * Firebase Installations (/com/google/firebase/installations): Development Aid, Apache-2.0; NonFreeNet
    * React Native SVG (/com/horcrux/rnsvg): Utility, MIT
    * react-native-svg (/com/horcrux/svg): Utility, MIT
    * react-native-device-info (/com/learnium/RNDeviceInfo): Utility, MIT
    * InAppBrowser for React Native (/com/proyecto26/inappbrowser): Utility, MIT
    * React Native Async Storage (/com/reactnativecommunity/asyncstorage): Utility, MIT
    * @react-native-community/clipboard (/com/reactnativecommunity/clipboard): Utility, MIT
    * React Native WebView (/com/reactnativecommunity/webview): Utility, MIT
    * OkHttp (/com/squareup/okhttp): Utility, Apache-2.0
    * React Native Gesture Handler (/com/swmansion/gesturehandler): Utility, MIT
    * React Native Reanimated (/com/swmansion/reanimated): Utility, MIT
    * react-native-screens (/com/swmansion/rnscreens): Utility, MIT
    * react-native-safe-area-context (/com/th3rdwave/safeareacontext): Utility, MIT
    * JavaX Annotation API (/javax/annotation): Utility, BSD-3-Clause
    * JavaX Dependency Injection (/javax/inject): Utility, Apache-2.0
    * Kotlin (/kotlin): Utility, Apache-2.0
    * kotlinx.coroutines (/kotlinx/coroutines): Utility, Apache-2.0
    * OkHttp okio Framework (/okio): Utility, Apache-2.0
    * Webkit Boundary Interfaces (/org/chromium/support_lib_boundary): Utility, BSD-3-Clause
    * react-native-splash-screen (/org/devio/rn/splashscreen): UI Component, MIT
    * EventBus (/org/greenrobot/eventbus): Utility, Apache-2.0
    * IntelliJ IDEA (/org/intellij): Utility, Apache-2.0
    
    Offending libs:
    ---------------
    * Play Install Referrer Library (/com/android/installreferrer): NonFreeComp,NonFreeNet,Tracking
    * Crashlytics (/com/crashlytics): NonFreeComp,Tracking
    * Google Ads (/com/google/ads): Ads,NonFreeComp
    * Firebase Data Transport (/com/google/android/datatransport): NonFreeNet
    * Android Market (/com/google/android/finsky): NonFreeNet
    * Google Mobile Services (/com/google/android/gms): NonFreeComp
    * Firebase (/com/google/firebase): NonFreeNet,NonFreeComp
    * Firebase Analytics (/com/google/firebase/analytics): NonFreeComp,Tracking
    * Firebase Installations (/com/google/firebase/installations): NonFreeNet
    
    9 offenders.
</details>

<details>
    <summary>After</summary>

    No libsmali.jsonl entry for /com/shaded/fasterxml/jackson, this library will be ignored.
    
    Libraries detected:
    -------------------
    * Android Support v4 (/android/support/v4): Development Framework, Apache-2.0
    * AndroidX Activity (/androidx/activity): Utility, Apache-2.0
    * Android Jetpack Annotations (/androidx/annotation): Utility, Apache-2.0
    * Arch (/androidx/arch): Utility, Apache-2.0
    * AppCompat (/androidx/appcompat): Utility, Apache-2.0
    * Autofill (/androidx/autofill): Utility, Apache-2.0
    * Browser (/androidx/browser): Utility, Apache-2.0
    * Cardview (/androidx/cardview): UI Component, Apache-2.0
    * Android Support Library collections (/androidx/collection): Utility, Apache-2.0
    * Concurrent (/androidx/concurrent): Utility, Apache-2.0
    * Coordinatorlayout (/androidx/coordinatorlayout): UI Component, Apache-2.0
    * Androidx Core (/androidx/core): Utility, Apache-2.0
    * AndroidX Cursor Adapter (/androidx/cursoradapter): Utility, Apache-2.0
    * Android Support Library Custom View (/androidx/customview): UI Component, Apache-2.0
    * Drawerlayout (/androidx/drawerlayout): UI Component, Apache-2.0
    * Android Emoji2 Compat (/androidx/emoji2): UI Component, Apache-2.0
    * AndroidX Fragment (/androidx/fragment): UI Component, Apache-2.0
    * Interpolator (/androidx/interpolator): UI Component, Apache-2.0
    * Lifecycle (/androidx/lifecycle): Utility, Apache-2.0
    * Loader (/androidx/loader): Utility, Apache-2.0
    * ResourceInspection (/androidx/resourceinspection): Development Aid, Apache-2.0
    * Recyclerview (/androidx/recyclerview): Utility, Apache-2.0
    * Android Activity Saved State (/androidx/savedstate): Utility, Apache-2.0
    * Sqlite (/androidx/sqlite): Utility, Apache-2.0
    * Startup (/androidx/startup): Utility, Apache-2.0
    * Swiperefreshlayout (/androidx/swiperefreshlayout): UI Component, Apache-2.0
    * Tracing (/androidx/tracing): Utility, Apache-2.0
    * Transition (/androidx/transition): UI Component, Apache-2.0
    * Vectordrawable (/androidx/vectordrawable): UI Component, Apache-2.0
    * Android Jetpack VersionedParcelable (/androidx/versionedparcelable): Utility, Apache-2.0
    * Viewpager (/androidx/viewpager): UI Component, Apache-2.0
    * AndroidX Widget ViewPager2 (/androidx/viewpager2): UI Component, Apache-2.0
    * Webkit (/androidx/webkit): Utility, Apache-2.0
    * Bolts Framework (/bolts): Development Framework, MIT
    * Lottie for React Native (/com/airbnb/android/react/lottie): Utility, Apache-2.0
    * Lottie for Android (/com/airbnb/lottie): UI Component, Apache-2.0
    * Flipper (/com/facebook/flipper/android): Development Aid, MIT
    * Fresco (/com/facebook/fresco): Utility, MIT
    * Hermes JS Engine (/com/facebook/hermes): Utility, MIT
    * Infer (/com/facebook/infer): Utility, MIT
    * React Native (/com/facebook/react): Development Framework, MIT
    * SoLoader (/com/facebook/soloader): Utility, Apache-2.0
    * Google Material Design (/com/google/android/material): Utility, Apache-2.0
    * Google Core Libraries for Java 6+ (/com/google/common): Utility, Apache-2.0
    * React Native SVG (/com/horcrux/rnsvg): Utility, MIT
    * react-native-svg (/com/horcrux/svg): Utility, MIT
    * InAppBrowser for React Native (/com/proyecto26/inappbrowser): Utility, MIT
    * React Native Async Storage (/com/reactnativecommunity/asyncstorage): Utility, MIT
    * @react-native-community/clipboard (/com/reactnativecommunity/clipboard): Utility, MIT
    * React Native WebView (/com/reactnativecommunity/webview): Utility, MIT
    * OkHttp (/com/squareup/okhttp): Utility, Apache-2.0
    * React Native Gesture Handler (/com/swmansion/gesturehandler): Utility, MIT
    * React Native Reanimated (/com/swmansion/reanimated): Utility, MIT
    * react-native-screens (/com/swmansion/rnscreens): Utility, MIT
    * react-native-safe-area-context (/com/th3rdwave/safeareacontext): Utility, MIT
    * JavaX Annotation API (/javax/annotation): Utility, BSD-3-Clause
    * JavaX Dependency Injection (/javax/inject): Utility, Apache-2.0
    * Kotlin (/kotlin): Utility, Apache-2.0
    * kotlinx.coroutines (/kotlinx/coroutines): Utility, Apache-2.0
    * OkHttp okio Framework (/okio): Utility, Apache-2.0
    * Webkit Boundary Interfaces (/org/chromium/support_lib_boundary): Utility, BSD-3-Clause
    * react-native-splash-screen (/org/devio/rn/splashscreen): UI Component, MIT
    * EventBus (/org/greenrobot/eventbus): Utility, Apache-2.0
    * IntelliJ IDEA (/org/intellij): Utility, Apache-2.0
    * Java WebSockets (/org/java_websocket): Utility, MIT
    * Simple Logging Facade for Java (/org/slf4j): Utility, MIT
    
    No offending libs found.
</details>

Scan made using tools provided by [IzzyOnDroid](https://gitlab.com/IzzyOnDroid/repo/) - thank you! <3

## Building from source
### Requirements
We need the following software:
* Java 1.11. Usually comes with Android Studio
* Android Studio initialized with JDK and emulator (not covered here, is a req from android-client and react-native-app projects)
* Gradle (https://gradle.org/install/)
* npm 1.18, yarn and nvm:
```shell
# download and install nvm https://github.com/nvm-sh/nvm
curl -o- https://raw.githubusercontent.com/nvm-sh/nvm/v0.39.3/install.sh | bash
#
nvm install v19
nvm use v19
npm install -g yarn
npm install -g npx
```

### Run locally
1. Close all repositories:
> assuming you use a path like ~/projects locally
```shell
mkdir ~/projects
cd projects
# clone netbird repo
git clone git@github.com:netbirdio/netbird.git
# clone react native app repo
git clone git@github.com:netbirdio/react-native-app.git
```
2. Checkout the repositories to the branches you want to test. If you want the latest, check the status information on your IDE or on https://github.com and verify the branch list and commit history.
3. Export JDK and Android home vars, on macOS they are: (please contribute with Linux equivalent)
```shell
# replace <USERNAME> with your name
export ANDROID_HOME=/Users/<USERNAME>/Library/Android/sdk
export JAVA_HOME=/Applications/Android Studio.app/Contents/jbr/Contents/Home
```
4. Install NDK and CMake
```shell
cd ~/projects/react-native-app
$ANDROID_HOME/cmdline-tools/latest/bin/sdkmanager --install "ndk;23.1.7779620"
```
5. Build the gomobile lib and the android client lib:
````shell
cd ~/projects/react-native-app
bash -x build-android-lib.sh ~/projects/netbird
````
6. Install the react native app dependencies
```shell
yarn install
yarn add file:./react/netbird-lib
```
7. Run the dev version
```shell
yarn start
```
8. Select `a` to install it on your android phone or emulator

### Generate debug bundle
Follow the steps to run locally until the step 5 then run the following steps:
1. run npx from react native app repo
```shell
cd ~/projects/react-native-app
npx react-native bundle --platform android --dev false --entry-file index.js --bundle-output android/app/src/main/assets/index.android.bundle --assets-dest android/app/src/main/res
```
2. run gradlew
```shell
cd ~/projects/react-native-app/android
./gradlew bundleDebug
```