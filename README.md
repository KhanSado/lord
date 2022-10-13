[![](https://jitpack.io/v/karontyy/lord.svg)](https://jitpack.io/#karontyy/lord)

<img src="https://raw.githubusercontent.com/karontyy/lord/master/lordLogo.png" width="640" height="320"/>


# Welcome to Lord UI !
Lord is library with UI components using jetpack compose
⚠ **Under Construction**

## Sample

<img src="https://raw.githubusercontent.com/karontyy/lord/master/sample.GIF" width="220" height="340"/>

# implementing
Implementing mode

### Download

Add it in your root build.gradle at the end of repositories:
```css
allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
```
Add the dependency
```css
dependencies {
	 implementation 'com.github.karontyy:lord:0.1.0'
}
```
### Usage

Create a array to slide informations, each slide is an object
```kotlin
val data = arrayOf(  
    DataSlide(
	    "Title slide one",
	    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id.", 
	    img = R.drawable.piplup
    ),
    DataSlide(
	    "Title slide two",
	    "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Curabitur id.", 
	    img = R.drawable.chamander
    )
)
```

* Slide View Basic usage
```kotlin
SliderView(  
   items = data  
)
```
* Slide View full usage
```kotlin
SliderView(  
    items = data,  
    bgColor = Color.Gray, //define background color screen
	colorTitle = Color.Cyan, // Define title color
	colorDescription = Color.Green, // Define decription color
	fontFamilyTitle = FontFamily.Monospace, //dfine title font family 
	fontFamilyDescription = FontFamily.Serif // define dscription font family 
)
```

## Show some ❤ and support

Give a ⭐️ if this project helped you!

<a href="https://www.buymeacoffee.com/karonty" target="_blank">
    <img src="https://cdn.buymeacoffee.com/buttons/v2/default-yellow.png" alt="Buy Me A Coffee" width="160">
</a>