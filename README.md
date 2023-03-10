# Employee Coincidence Finder
This is a project made with Java. It consists of reading employees name and hour arrival from a TXT file and using this data to compare if certain employees arrived at the same time frame.

# How does this work and how did I approach it?

First off, you read a .TXT File containing the employees name and hours worked at a given time frame. Then, you put both the name and the hours in an object called Employee to encapsulate the information. The time frame is also encapsulated as an object called Hour, which has both the start time hour and the end time hour of a time frame.

Later, I created a EmployeeSystem object to handle the operations with the object Employee. This EmployeeSystem object lets us save the employees object in a list.

Finally, we call the findCoincidence() method, which takes up two strings (the first employee's name, the second employee's name). These names are compared if they are saved up in the list and if they are, it takes both employee's start times and endtimes to compare if an employee has coincided with another employee in the office. This method returns the amount of times these employees have been at the same time in the office.

# Arquitecture

This project is divided into:

├── lib                   # Library files (testing purposes)

├── src                   # Source code

├── tests                 # Automated Tests (JUnit)

├── data.txt              # TXT File with Data

└── Main.java             # Main file

# How to run the program

1. Clone the code through `<> Code` -> `Download ZIP`
2. Extract it wherever you like, preferably the desktop.
3. Open un the CMD (Terminal) and go to the project's folder using `cd` command.
4. Once inside the folder, type `javac Main.java` to compile the code.
5. Finally, type `java Main.java` to run the program.

# Conclusion

This project was a lot of fun to do and I learned a lot from it. 
If you have any questions or suggestions, be sure to message me!

