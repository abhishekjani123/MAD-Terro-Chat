# --------------Terro-Chat Readme File-----------------------

I have created a basic chat application using Firebase.

Features:
1.Cloud Signin and Login
2.24/7 Chat can be done
3.Able to update profile photo
4.Message Notification

Firebase Features I used:
1. Authentication
2. Realtime Database
3. Storage

Working:

Login Section:
-It is the screen which will appear first when user opens the app.
-User have to enter Email and Password.
-If it is left blank a toast message will appear with message to fill details
-If the email or password enter by the user is wrong a toast message will appear with message "invalid details"
-if all credentials are correct user will move to its User's Activity [Chat Section].
-if the user is new to app, he/she can click SignIn button for Registeration.

SignIn Section:
-User has to fill the details regarding Name,Email,Password and Confirm Password
-If any of the field is left blank a toast message will be displayed on the app.
-When user fills all the details correctly, he/she will be redirected to User's Activity [Chat Section] of the App.
-User Can Switch to login screen by pressing login button.

Chat Section:
-After Successful Login/SignIn user can see the list of the users in the app.
-User can also Upload their profile picture by clicking the userprofile image
-when image will be successfully uploaded to the cloud storage a toast message will be displayed
-User can chat with other user by clicking on the user name.
-A chat window will be open where user can chat.
-If user click on send button without typing anything a toast message will be displayed.
-A Notification will be displayed to the receiver when sender will send the message.


![Terro-chat](https://user-images.githubusercontent.com/65763501/146199307-58df1494-440d-48e8-9fe6-5258356240c9.png)

