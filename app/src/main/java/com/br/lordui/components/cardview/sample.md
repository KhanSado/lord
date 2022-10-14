## SAMPLE
<img src="https://raw.githubusercontent.com/karontyy/lord/master/cardview.png" width="220" height="340"/>

# implementing
Implementing mode

### Usage

Create a remember variable to fields title and description
```kotlin
    var title by remember {
        mutableStateOf("Title card")
    }
    var description by remember {
        mutableStateOf("this is a very beautiful descirption to this card")
    }
```

* CarddView Basic usage
```kotlin
  CardView(
        image = R.drawable.piplup,
        title = title,
        description = description,
        titleColor = Color.Black,
        descriptionColor = Color.Gray
    )
```