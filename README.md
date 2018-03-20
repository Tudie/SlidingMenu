# SlidingMenu

## 1. 在Module下的build.gradle中添加依赖
### Step 1. Add the JitPack repository to your build file
    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
	
### Step 2. Add the dependency
     dependencies {
	        implementation 'com.github.Tudie:SlidingMenu:v1.0.0'
	}
