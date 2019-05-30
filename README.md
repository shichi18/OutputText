# OutputText
### Description
This is library to output text files to TextView. (for AndroidStudio)  

![outputtext](https://github.com/shichi18/imagestore/blob/master/outputtext/outputtext.png)

## Development Environment
Programming Language：Kotlin  
Development Environment：AndroidStudio3.4  

## Download
### Release
Now Release Viersion 1.0.0  

### build.gradle(app)
```
dependencies {
    implementation 'com.github.shichi18.outputtext:outputtext:1.0.0'
}
repositories {
    maven { url 'http://raw.github.com/shichi18/OutputText/master/repository/' }
}
```

## Usage 
1. Create **Assets Folder**.  
2. Create **package** in Assets Folder & write PackageName. (ex. "InputData")  
![assets1](https://github.com/shichi18/imagestore/blob/master/outputtext/assets1.jpg)
3. Describe the content in a text file. (ex. "LICENCE","Long sentence"...)
4. Add Code. (in Activity or Fragment)

### Add Code
#### Activity or Fragment (Kotlin)
"InputData" is PackageName. (as you like it.)

```
val outputTextView = OutputTextView()
val assetManager = resources.assets
val linearLayout = findViewById<LinearLayout>(R.id.linearlayout)
outputTextView.textViewAssets(this, "InputData", assetManager, linearLayout)
```
#### .xml
you have to use a LinearLayout in ScrollView.

```
<ScrollView
        android:layout_width="match_parent"
        android:layout_height="match_parent">
    <LinearLayout 
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:orientation="vertical"
            android:id="@+id/linearlayout"
            android:padding="10dp"/>
</ScrollView>
```

## LICENSE
```
OutputText
https://github.com/shichi18/OutputText

Copyright (c) 2019 shichi18.

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
```

