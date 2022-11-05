# Resume

## Project Overview
Resume is an interactive mobile version of my resume. This app showcases:
- My name, job title, picture, A little bit about yourself, social media links and my skills.
- It supports dark mode and 5 languages which are English, Arabic, French, Spanish and Yoruba.
- It adapts its layout to landscape and portrait orientations accordingly.

## Code Description
- The `app` module: contains app level and scaffolding classes that bind the rest of the codebase, such as `MainActivity`, `AboutMe()`, `ContactInformation()` and `Skills()`.
- The `MainActivity`contains draws 3 composables, it has a verticalScroll modifier which scrolls the screen vertically. The UI is divided into 3 sections:
  - `AboutMe()` composable function : It implements an Image and 3 Text Composables which features my name, title and about me.
  - `ContactInformation()` composable function: It implements an Image and ClickableText Composables for my social media links.
  - `Skills()` composable function: It implements Text Composables for my skills.
- The `strings` resource folder consists of 5 xml files for 5 locales which are English, Arabic, French, Spanish and Yoruba.

## Design
The app design was inspired by [Monty Hayton](https://dribbble.com/shots/6479159/attachments/6479159-Job-Application-Process-Dashboard-pt3?mode=media) and 
[Helena](https://dribbble.com/shots/14436103-Resume-App/attachments/6116864?mode=media), The designs were really minimalistic so it was easier to recreated. Each information was seperated into sections. 

## Screenshots
![English Dark Mode](https://user-images.githubusercontent.com/51162743/200109636-ed93030c-86e3-435f-9004-4ae50d1e315e.png)
![French Dark Mode](https://user-images.githubusercontent.com/51162743/200109647-9e8692a9-1880-4a16-870c-ea00d12048bf.png)
![Youruba Light Mode](https://user-images.githubusercontent.com/51162743/200109650-36e12a33-37bd-48af-ac03-7d7d2a9adbb4.png)
![English Dark Mode](https://user-images.githubusercontent.com/51162743/200109670-4a6c9273-2ea5-4713-be78-e50411422f4c.png)
![Spanish Landscape Mode](https://user-images.githubusercontent.com/51162743/200109664-4c3fddc1-f739-4e8c-89ec-294e6a8faac7.png)
![Spanish Dark Mode](https://user-images.githubusercontent.com/51162743/200109658-998e5104-7112-4449-a0ac-0a84e1e9a8d7.png)
 
## Libraries used
I did not import a new library, i used the existing ones which are:
- Jetpack Compose - It is faster, easier to use and requires less code.
- Material Design - I majorly used for theming, styling, typography.
- Android KTX - Used to write more concise, idiomatic Kotlin code

## Features that i would love to add
- Educational Background
- Projects 
- Language
- Experience
- Tools Used

## App Link
[Resume App Link](https://drive.google.com/file/d/1smAs4zECzD9tbKNrWgqmJa_M7geK8_1V/view?usp=sharing)

## Challenges
- Design: I am not so good with design so it took me a while to figure out what to do, i had to check designs on Dribbble.
- Github: I have never used SSH key to push my code to Github, i have only used username and email, i checked the github documentation and read an article on medium in other to learn how to do it.

## Live Demo
[<img src="https://user-images.githubusercontent.com/51162743/200105989-f3cb52e3-f43f-4b81-8de0-1e9377798a2d.png">](https://appetize.io/app/wnmx2rgsmal4inf3umgp7i6p5q?device=pixel4&osVersion=11.0&scale=75)
