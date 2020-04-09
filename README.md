[![](https://jitpack.io/v/alokjkashyap/SearchFromHash.svg)](https://jitpack.io/#alokjkashyap/SearchFromHash)
# SearchFromHash
This library will just split a HashMap into two different List<String>.
I created this because using this you can implement Search function on Firestore at no cost.

## Step 1
Add it in your root build.gradle at the end of repositories:

    allprojects {
		repositories {
			...
			maven { url 'https://jitpack.io' }
		}
	}
  
  ## Step 2
  Add the dependency
  
      dependencies {
	        implementation 'com.github.alokjkashyap:SearchFromHash:<latest-version>'
	}

## Step 3
Now Convert your firebase data into a hashmap.

## Step 4
Split the Hashmap using this

    FirestoreSearch.getField(yourHashmap, searchWord);
    
This code will return you a List<String> containing all the key from Hashmap matching with the String searchWord.
if you want FieldValue (the other part or object from hashmap) use the code below:
	
    FirestoreSearch.getFieldValue(yourHashmap, searchWord);
    
It will search for values in the hashmap containg searchWord and return a List<String> containing all the values matching searchWord.
	
	
Feel free to ask anything :)
