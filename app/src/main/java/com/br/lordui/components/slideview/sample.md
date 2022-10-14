## SAMPLE
<img src="https://raw.githubusercontent.com/karontyy/lord/master/sample.GIF" width="220" height="340"/>

# implementing
Implementing mode

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