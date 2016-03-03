[33mcommit 9efe44552fc016d0816ac59489962f2039192f1f[m
Author: Paul An <paulan94@gmail.com>
Date:   Mon Feb 29 01:43:35 2016 -0300

    Added First fragment

[1mdiff --git a/.gitignore b/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..c6cbe56[m
[1m--- /dev/null[m
[1m+++ b/.gitignore[m
[36m@@ -0,0 +1,8 @@[m
[32m+[m[32m*.iml[m
[32m+[m[32m.gradle[m
[32m+[m[32m/local.properties[m
[32m+[m[32m/.idea/workspace.xml[m
[32m+[m[32m/.idea/libraries[m
[32m+[m[32m.DS_Store[m
[32m+[m[32m/build[m
[32m+[m[32m/captures[m
[1mdiff --git a/.idea/.name b/.idea/.name[m
[1mnew file mode 100644[m
[1mindex 0000000..0d8f838[m
[1m--- /dev/null[m
[1m+++ b/.idea/.name[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32mMindfulnessProjectQuotesPictures[m
\ No newline at end of file[m
[1mdiff --git a/.idea/compiler.xml b/.idea/compiler.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..9a8b7e5[m
[1m--- /dev/null[m
[1m+++ b/.idea/compiler.xml[m
[36m@@ -0,0 +1,22 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="CompilerConfiguration">[m
[32m+[m[32m    <option name="DEFAULT_COMPILER" value="Javac" />[m
[32m+[m[32m    <resourceExtensions />[m
[32m+[m[32m    <wildcardResourcePatterns>[m
[32m+[m[32m      <entry name="!?*.java" />[m
[32m+[m[32m      <entry name="!?*.form" />[m
[32m+[m[32m      <entry name="!?*.class" />[m
[32m+[m[32m      <entry name="!?*.groovy" />[m
[32m+[m[32m      <entry name="!?*.scala" />[m
[32m+[m[32m      <entry name="!?*.flex" />[m
[32m+[m[32m      <entry name="!?*.kt" />[m
[32m+[m[32m      <entry name="!?*.clj" />[m
[32m+[m[32m    </wildcardResourcePatterns>[m
[32m+[m[32m    <annotationProcessing>[m
[32m+[m[32m      <profile default="true" name="Default" enabled="false">[m
[32m+[m[32m        <processorPath useClasspath="true" />[m
[32m+[m[32m      </profile>[m
[32m+[m[32m    </annotationProcessing>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/copyright/profiles_settings.xml b/.idea/copyright/profiles_settings.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..e7bedf3[m
[1m--- /dev/null[m
[1m+++ b/.idea/copyright/profiles_settings.xml[m
[36m@@ -0,0 +1,3 @@[m
[32m+[m[32m<component name="CopyrightManager">[m
[32m+[m[32m  <settings default="" />[m
[32m+[m[32m</component>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/encodings.xml b/.idea/encodings.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..97626ba[m
[1m--- /dev/null[m
[1m+++ b/.idea/encodings.xml[m
[36m@@ -0,0 +1,6 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="Encoding">[m
[32m+[m[32m    <file url="PROJECT" charset="UTF-8" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/gradle.xml b/.idea/gradle.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..fc132b2[m
[1m--- /dev/null[m
[1m+++ b/.idea/gradle.xml[m
[36m@@ -0,0 +1,19 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="GradleSettings">[m
[32m+[m[32m    <option name="linkedExternalProjectsSettings">[m
[32m+[m[32m      <GradleProjectSettings>[m
[32m+[m[32m        <option name="distributionType" value="LOCAL" />[m
[32m+[m[32m        <option name="externalProjectPath" value="$PROJECT_DIR$" />[m
[32m+[m[32m        <option name="gradleHome" value="C:\Program Files\Android\Android Studio\gradle\gradle-2.8" />[m
[32m+[m[32m        <option name="gradleJvm" value="1.8" />[m
[32m+[m[32m        <option name="modules">[m
[32m+[m[32m          <set>[m
[32m+[m[32m            <option value="$PROJECT_DIR$" />[m
[32m+[m[32m            <option value="$PROJECT_DIR$/app" />[m
[32m+[m[32m          </set>[m
[32m+[m[32m        </option>[m
[32m+[m[32m      </GradleProjectSettings>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/misc.xml b/.idea/misc.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..95f0f03[m
[1m--- /dev/null[m
[1m+++ b/.idea/misc.xml[m
[36m@@ -0,0 +1,46 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="EntryPointsManager">[m
[32m+[m[32m    <entry_points version="2.0" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="NullableNotNullManager">[m
[32m+[m[32m    <option name="myDefaultNullable" value="android.support.annotation.Nullable" />[m
[32m+[m[32m    <option name="myDefaultNotNull" value="android.support.annotation.NonNull" />[m
[32m+[m[32m    <option name="myNullables">[m
[32m+[m[32m      <value>[m
[32m+[m[32m        <list size="4">[m
[32m+[m[32m          <item index="0" class="java.lang.String" itemvalue="org.jetbrains.annotations.Nullable" />[m
[32m+[m[32m          <item index="1" class="java.lang.String" itemvalue="javax.annotation.Nullable" />[m
[32m+[m[32m          <item index="2" class="java.lang.String" itemvalue="edu.umd.cs.findbugs.annotations.Nullable" />[m
[32m+[m[32m          <item index="3" class="java.lang.String" itemvalue="android.support.annotation.Nullable" />[m
[32m+[m[32m        </list>[m
[32m+[m[32m      </value>[m
[32m+[m[32m    </option>[m
[32m+[m[32m    <option name="myNotNulls">[m
[32m+[m[32m      <value>[m
[32m+[m[32m        <list size="4">[m
[32m+[m[32m          <item index="0" class="java.lang.String" itemvalue="org.jetbrains.annotations.NotNull" />[m
[32m+[m[32m          <item index="1" class="java.lang.String" itemvalue="javax.annotation.Nonnull" />[m
[32m+[m[32m          <item index="2" class="java.lang.String" itemvalue="edu.umd.cs.findbugs.annotations.NonNull" />[m
[32m+[m[32m          <item index="3" class="java.lang.String" itemvalue="android.support.annotation.NonNull" />[m
[32m+[m[32m        </list>[m
[32m+[m[32m      </value>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectLevelVcsManager" settingsEditedManually="false">[m
[32m+[m[32m    <OptionsSetting value="true" id="Add" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Remove" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Checkout" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Update" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Status" />[m
[32m+[m[32m    <OptionsSetting value="true" id="Edit" />[m
[32m+[m[32m    <ConfirmationsSetting value="0" id="Add" />[m
[32m+[m[32m    <ConfirmationsSetting value="0" id="Remove" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectRootManager" version="2" languageLevel="JDK_1_7" assert-keyword="true" jdk-15="true" project-jdk-name="1.8" project-jdk-type="JavaSDK">[m
[32m+[m[32m    <output url="file://$PROJECT_DIR$/build/classes" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m  <component name="ProjectType">[m
[32m+[m[32m    <option name="id" value="Android" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/modules.xml b/.idea/modules.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..a9f693b[m
[1m--- /dev/null[m
[1m+++ b/.idea/modules.xml[m
[36m@@ -0,0 +1,9 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="ProjectModuleManager">[m
[32m+[m[32m    <modules>[m
[32m+[m[32m      <module fileurl="file://$PROJECT_DIR$/MindfulnessProjectQuotesPictures.iml" filepath="$PROJECT_DIR$/MindfulnessProjectQuotesPictures.iml" />[m
[32m+[m[32m      <module fileurl="file://$PROJECT_DIR$/app/app.iml" filepath="$PROJECT_DIR$/app/app.iml" />[m
[32m+[m[32m    </modules>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/runConfigurations.xml b/.idea/runConfigurations.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..7f68460[m
[1m--- /dev/null[m
[1m+++ b/.idea/runConfigurations.xml[m
[36m@@ -0,0 +1,12 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="RunConfigurationProducerService">[m
[32m+[m[32m    <option name="ignoredProducers">[m
[32m+[m[32m      <set>[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.AllInPackageGradleConfigurationProducer" />[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.TestClassGradleConfigurationProducer" />[m
[32m+[m[32m        <option value="org.jetbrains.plugins.gradle.execution.test.runner.TestMethodGradleConfigurationProducer" />[m
[32m+[m[32m      </set>[m
[32m+[m[32m    </option>[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/.idea/vcs.xml b/.idea/vcs.xml[m
[1mnew file mode 100644[m
[1mindex 0000000..6564d52[m
[1m--- /dev/null[m
[1m+++ b/.idea/vcs.xml[m
[36m@@ -0,0 +1,6 @@[m
[32m+[m[32m<?xml version="1.0" encoding="UTF-8"?>[m
[32m+[m[32m<project version="4">[m
[32m+[m[32m  <component name="VcsDirectoryMappings">[m
[32m+[m[32m    <mapping directory="" vcs="" />[m
[32m+[m[32m  </component>[m
[32m+[m[32m</project>[m
\ No newline at end of file[m
[1mdiff --git a/app/.gitignore b/app/.gitignore[m
[1mnew file mode 100644[m
[1mindex 0000000..796b96d[m
[1m--- /dev/null[m
[1m+++ b/app/.gitignore[m
[36m@@ -0,0 +1 @@[m
[32m+[m[32m/build[m
[1mdiff --git a/app/build.gradle b/app/build.gradle[m
[1mnew file mode 100644[m
[1mindex 0000000..c9751d1[m
[1m--- /dev/null[m
[1m+++ b/app/build.gradle[m
[36m@@ -0,0 +1,27 @@[m
[32m+[m[32mapply plugin: 'com.android.application'[m
[32m+[m
[32m+[m[32mandroid {[m
[32m+[m[32m    compileSdkVersion 22[m
[32m+[m[32m    buildToolsVersion "21.1.2"[m
[32m+[m
[32m+[m[32m    defaultConfig {[m
[32m+[m[32m        applicationId "com.example.paul.mindfulnessprojectquotespictures"[m
[32m+[m[32m        minSdkVersion 11[m
[32m+[m[32m        targetSdkVersion 22[m
[32m+[m[32m        versionCode 1[m
[32m+[m[32m        versionName "1.0"[m
[32m+[m[32m    }[m
[32m+[m[32m    buildTypes {[m
[32m+[m[32m        release {[m
[32m+[m[32m            minifyEnabled false[m
[32m+[m[32m            proguardFiles getDefaultProguardFile('proguard-android.txt'), 'proguard-rules.pro'[m
[32m+[m[32m        }[m
[32m+[m[32m    }[m
[32m+[m[32m}[m
[32m+[m
[32m+[m[32mdependencies {[m
[32m+[m[32m    compile fileTree(dir: 'libs', include: ['*.jar'])[m
[32m+[m[32m    testCompile 'junit:junit:4.12'[m
[32m+[m[32m    compile 'com.android.support:appcompat-v7:22.2.1'[m
[32m+[m[32m    compile 'com.android.support:support-v4:22.2.1'[m
[32m+[m[32m}[m
[1mdiff --git a/app/proguard-rules.pro b/app/proguard-rules.pro[m
[1mnew file mode 100644[m
[1mindex 0000000..615d515[m
[1m--- /dev/null[m
[1m+++ b/app/proguard-rules.pro[m
[36m@@ -0,0 +1,17 @@[m
[32m+[m[32m# Add project specific ProGuard rules here.[m
[32m+[m[32m# By default, the flags in this file are appended to flags specified[m
[32m+[m[32m# in C:\Users\Paul\AppData\Local\Android\sdk/tools/proguard/proguard-android.txt[m
[32m+[m[32m# You can edit the include path and order by changing the proguardFiles[m
[32m+[m[32m# directive in build.gradle.[m
[32m+[m[32m#[m
[32m+[m[32m# For more details, see[m
[32m+[m[32m#   http://developer.android.com/guide/developing/tools/proguard.html[m
[32m+[m
[32m+[m[32m# Add any project specific keep options here:[m
[32m+[m
[32m+[m[32m# If your project uses WebView with JS, uncomment the following[m
[32m+[m[32m# and specify the fully qualified class name to the JavaScript interface[m
[32m+