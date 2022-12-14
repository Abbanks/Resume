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
![English Dark Mode](https://user-images.githubusercontent.com/51162743/200121490-f7083b6c-145e-4ecb-bb79-6f5e520774ef.png)
![French Dark Mode](https://user-images.githubusercontent.com/51162743/200121602-760fed17-f79c-4d6c-9bb3-e6af52984c7b.png)
![Yoruba Light Mode](https://user-images.githubusercontent.com/51162743/200121922-469fb3c0-76ca-4924-9763-ea49dea49bd0.png)
![Yoruba Light Mode](https://user-images.githubusercontent.com/51162743/200121998-a7a1fba0-a2fd-48d3-a1e8-e2b6020bbcef.png)
![Spanish Landscape Mode](https://user-images.githubusercontent.com/51162743/200121757-af4ba064-ae10-4e6b-bbb3-2439d74cbb9a.png)
![Spanish Landscape Mode](https://user-images.githubusercontent.com/51162743/200121797-df4e2270-f054-47d3-9a87-5623a197c3df.png)
 
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
