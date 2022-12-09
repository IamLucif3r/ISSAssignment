# JSON | JavaScript Object Notation 󠁻
JSON stands for JavaScript Object Notation. JSON objects are used for transferring data between server and client.JSON is a lightweight data-interchange format.

## 1. JSON Syntax Rules
The JSON Syntax follows certain rules, which are as follows:
  - Data format is `name`, `value` pair separated by a semi-colon `:`
    - Example: `firstName: Anmol`
  - Multiple data items separated by `commas`.
  - Curly Brackets are used to hold the objects.
  - Square Brackets are used to hold arrays.
  
  <b> Example </b> </br>
  
  ```json
  var employee = {
      "firstName" : "Anmol",
      "lastName" : "Yadav",
      "age" : "21"
  };
  ```
## 2. Why use JSON ??
The JSON has many advantages, which makes developers using JSON over any other language/structure. Some advantages of JSON are: 
- <b>Standard Structure : </b> JSON objects have a standard-structure that is easy to read and write for developers.
- <b>Light-Weight : </b> While using certain technologies (like AJAX) we need to load data very quickly and asynchronously, without requesting the page-reload. Since JSON is very light-weighted, it is easier to load the requested data very quickly.
- <b>Language Independent : </b> JSON is Language-Independent, which means is can be used with most of the modern programming languages very easily.

## 3. Data Types in JSON
JSON can represent four primitive types (strings, numbers, booleans, and null) and two structured types (objects and arrays).JSON has following data types:
  - String : ``` {"firstName" : "Anmol"}```
  - Number : ``` {"age" : 21}```
  - JSON Object : ``` {"employee": {"firstName":"Anmol", "age" : 21, "country" : "India"} }```
  - Arrays : ``` {"employee" : ["Anmol","Utsav","Vaibhav","Ayushi",]}```
  - Boolean : ``` {"isValid" : true}```
  
 ## 4. Data Structures in JSON
 JSON has following types of data structures:
   1. JSON Objects
   2. JSON Objects in Array
   3. Nesting of JSON Objects
 
 ### 4.1 JSON Objects
 An object can be created as shown below, that can be accessed using the variable name `Employee`. Inside an object, we can have any number of key-value pairs.
 
 ```json
 var employee = {
    "name" : "Anmol Singh Yadav",
    "age" : 21,
    "country" : "India"
  };
  ```
  
  In order to access information, from the JSON object like above, we can do it by :
  
  ```
  document.writeln("The Name is: "+employee.name);
  document.writeln("The Age is: "+employee.age);
  document.writeln("The Country is: "+employee.country);
  ```
 
### 4.2 JSON Object in Array
If we want to store the information of multiple entities, we can do that using array of objects. An example is shown below:

```
var employee = [{
      "name" : "Anmol Singh Yadav",
      "age" : 21
    },
    {
       "name" : "Utsav Verma",
       "age" : 18
    },
    {
        "name" : "Vaibhav Mishra",
        "age" : 21
    }

];
```
Now, in order to access the information from Array, we can do :
```
document.writeln(employee[0].age);
document.writeln(employee[1].name);
```

### 4.3 Nesting of JSON Objects

It is very similar to the Arrays of Object. An example is shown below:

``` 
var employee = {
      "anmol": {"name" : "Anmol Singh Yadav","age" : 21},
      "utsav": {"name" : "Utsav Verma","age" : 18},
      "vaibhav": {"name" : "Vaibhav Mishra","age" : 21}

};
```
Now, in order to extract information from the nested objects, write the following code:
```
document.writeln(employee.anmol.age);
document.writeln(employee.utsav.name);
```












