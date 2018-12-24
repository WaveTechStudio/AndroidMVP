## AndroidMVP
An Android based Todo app for tracking items. You can add items with their Title, Cost, Location, Description and Image.

## Prerequisites
Android SDK v24
Latest Android Build Tools
Android Support Repository

## Features

You can add data of each item
- Item title
- Item price
- Item cost
- Item location
- Item picture (You can take picture from Camera or choose from Gallery)
- Items can be synced with firebase cloud to save and access remotely
- Item can be edit/delete/update

# [Architecture used](https://github.com/googlesamples/android-architecture "Architecture used")

![](https://i.imgur.com/5fg5z5r.png)


### Dependencies used

    // App's dependencies
    implementation 'com.android.support:appcompat-v7:28.0.0'


### Libraries used
##### [Glide](https://github.com/bumptech/glide "Glide")
For Image loading
##### [Rximagepicker](https://github.com/MLSDev/RxImagePicker "Rximagepicker")
For Image picking from Camera/Gallery


### [Firebase Realtime Database (JSON Structured)](https://firebase.google.com/docs/database/security/ "Firebase Realtime Database (JSON Structured)")

      {
         "items": [
             "-0f3b6efb-7689-4f2b-b6a0-e135b9a85fd8" : {
			 "id" : "123"
             "title" : "Buying Shoes",
             "cost" : "200"
			 "location" : "Gullberg III, Lahore, Pakistan"
			 "description" : "I am buying sports shoes from NIKE. "
			 "imagePath" : "...../shoesimage.png"
               }
		 ]
	  }
	  
### Database local table 
| items       | Value |
| --------- |-----|
| id  | 123 |
| title     |   Buying Shoes |
| cost      |    200$ |
| location      |    Gullberg III, Lahore, Pakistan |
| description      |    I am buying sports shoes from NIKE. |
| imagePath      |    ...../shoesimage.png |

### [Firebase database rules](https://firebase.google.com/docs/database/security/ "Firebase database rules")

      These rules allows everyone to read & write data without authentication. Currently for testing purposes we have applied these so everyone can read and write.
    {
       "rules": {
          ".read": true,
         ".write": true
        }
    }
	
	The below rules allow authenticated users only to read or write data.
     {
       "rules": {
           ".read": "auth != null",
          ".write": "auth != null"
     }
    }


## How to run a sample
- Clone or download the project open it with Android Studio compile and run it will work.


### Images
<img src="./screens/01.png" width="200"/> <img src="./screens/02.png" width="200"/>
 <img src="./screens/03.png" width="200"/>
<br/>


## Author
[Waheed Nazir (GreenProLogix)](https://www.linkedin.com/in/waheed-nazir-36521579/ "Waheed Nazir (GreenProLogix)")

## License
It is totally free to use. :)
