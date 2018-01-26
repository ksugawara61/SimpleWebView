# SimpleWebView

SimpleWebView library can use webview activity easily.

[![](https://jitpack.io/v/ksugawara61/SimpleWebView.svg)](https://jitpack.io/#ksugawara61/SimpleWebView)

## Implementation

To use this library your `minSdkVersion` must be >= 19

Add it in your root build.gradle at the end of repositories:

```
allprojects {
    repositories {
        ...
        maven { url "https://jitpack.io" }
    }
}   
```

Add the dependency

```
dependencies {
    implementation 'com.github.ksugawara61:SimpleWebView:1.0.0'
}
```

## Usage

You can use webview activity easily.
The following is a sample code

```
SimpleWebView simpleWebView = new SimpleWebView(this, "https://github.com/ksugawara61");
simpleWebView.setTitle("ksugawara61");
simpleWebView.setLoadText("Now Loading...");
simpleWebView.startWebViewActivity();
```

## License

```
MIT License

Copyright (c) 2017 ksugawara61

Permission is hereby granted, free of charge, to any person obtaining a copy
of this software and associated documentation files (the "Software"), to deal
in the Software without restriction, including without limitation the rights
to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
copies of the Software, and to permit persons to whom the Software is
furnished to do so, subject to the following conditions:

The above copyright notice and this permission notice shall be included in all
copies or substantial portions of the Software.

THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE
SOFTWARE.
```
