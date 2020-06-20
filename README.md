
# Web-UI
Task4 : Kaiburr Task4

# Project Title

The project is about creating Web Interface(UI) in Java using Spring MVC and Thymeleaf Template Engine.The web interface is provided to end-user for searching,creating ,deleting and updating “server” objects. The variety of Software Platforms are available as a resource on the server side.The frontend is created for a REST API and a client can request for a persistent resource by interacting with the layout.

## Getting Started

1.git clone https://github.com/bharatprakashparakh/Kaiburr-Task4.git

### Prerequisites

* Downlaod Java version 1.8
* Downlaod SpringToolSuite version 4.6.0
* Downlaod Apache Tomcat Server 8.5 
* Add Thymeleaf Dependency in SpringToolSutite
* Downlaod Mongo Database 4.2.5
* A Web Browser


## Running the tests

* Run the mongod server at port 27017 using "mongod command"
* Run the thymeleaf-testing-upload/src/main/java/io/bucket/thymeleaftesting/ThymeleafTestingApplication.java as JavaApplication.
* Open Web Browser and Hit URL localhost:8080

### Break down into end to end tests

* **The first page dispalyed is index.html which is a HOME PAGE.The user can click on respective buttons to perform operations like CREATE, READ, READ By Id, READ By Name on various available Platforms. [HOME PAGE]**

![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/1.Home%20Page.PNG)

* **View all available platforms present in the database.**

For this operation,click on button "View all platforms".It will prompt for "continue" or "close" option.

  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/2.View%20All%20Click.PNG)

  
    **Click on Home button will redirect the server to HOME page.**
    Clicking on "continue" button will result in following.
  

  
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/3.View%20All%20Result.PNG)

* **Find a Platform present in the database by mentioning Id in the form.**

  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/4.View%20By%20Id%20Click.PNG)
 
  The platform details of specified unique Id is displayed as a response.
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/5.View%20By%20Id%20Result.PNG)
  
 * **Returns an error as response if platform with given id is not present in list.**
 
  The Id which is not present in the database is being provided.The Error will be shown as "Requested Resource Not Found" using  c customised error.html page.
 
  Input
  
 ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/6.Invalid%20Id.PNG)
  
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/7.Invalid%20Id%20Response.PNG)

  
* **Find the list of required platforms by mentioning name in the form**

  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/8.View%20By%20name.PNG)
  
  Get a list of Platform with mentioned name
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/9.View%20by%20name%20result.PNG)
  

* **Returns an error as response if platforms with given name is not present in database**
  Input
 
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/10.Invalid%20name.PNG)
  
 
  Output
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/11.Invalid%20name%20response.PNG)


 
* **Add a new platform object in the database with the given details.**
  
  The Id, name, language, framework of the Platfrorm is provided in the form.
  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/12.Add%20new.PNG)
  
  Output
  
  On click of "see the list" button will redirect the server to "View All" page and all the available platforms are displayed.
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/13.Add%20New%20result.PNG)
  
  
  The "Edit" and "Delete" buttons are shown in front of every platform object, where all the available platform list is displayed.
  
* **Update a platform with given details.**
  
  It will update the platform object present in the database.
  Clicking on the "Edit" Button will prompt the current details of particular platform.
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/14.Update.PNG)
  
  Fill the new details in the following form.
  Input
  
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/15.Update%20details.PNG)
  
   Output
   
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/16.Updated%20result.PNG)
  


* **Delete a platform **
  
  It will delete the platform object completely from the database.
  Clicking on "Delete" button will prompt for "Yes Delete" or "Cancel" the delete operation.
  
  Input
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/17.Delete.PNG)
  
  Output
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/18.Delete%20Result.PNG)
  
* **Platfrom objects stored in Mongo DataBase  **
  
 
  ![](https://github.com/bharatprakashparakh/Kaiburr-Task4/blob/master/Images/MongoDB.PNG)
  

## Built With

* [Maven](https://maven.apache.org/) - Dependency Management


## Contributing

Contributions are welcome.

 ## Author

* **Bharat Prakash Parakh** 



