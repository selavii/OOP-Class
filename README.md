# This repository is a mirror of my work at Object Oriented Classes, Autumn 2023.


## Laboratory work number 1:

### Creating my first ever class in java!

 
## Laboratory work number 2:
### In this files, I tried my best to create an University Management System

## For this project I built a program loop, an interactive command line for the TUM Board to be able to meet the following faculty operations:

### Create and assign a student to a faculty; 
### Graduate a student from a faculty;
### Display current enrolled students (Graduates would be ignored);
### Display graduates (Currently enrolled students would be ignored);
### Tell or not if a student belongs to this faculty. 
## • General operations:
### Create a new faculty;
### Search what faculty a student belongs to by a unique identifier (for example by email or a unique ID);
### Display University faculties;
### Display all faculties belonging to a field. (Ex. FOOD_TECHNOLOGY);



## Laboratory work number 3:

### Building a program loop, an interactive command line for the user to monitor changes
### in a folder. The folder location is hardcoded, meaning it’s constant, and up to the
### implementer to specify it’s location. The 3 mandatory actions a user can perform are:
##
###
### Actions:
###   1. commit - Simply update the snapshot time (can be a variable) to the current
###     time. It’s functionality is to emulate change detection since the previous
###     snapshot. When commit is invoked, the snapshot is updated and the state is
###     again clean (no changes).
###   2. info <filename> - prints general information about the file. filename can be
###    treated as an unique identifier, since even the OS doesn’t allow same filename
###    + extension in the same folder.
###     • all files - file name, pretty print of the file extension, created and updated
###     date and time.
###    • image files (png, jpg) - image size (ex. 1024x860).
###    • text files (txt) - line count, word count and character count.
###    • program files (.py, .java) - line count, class count, method count (files
###    from previous laboratory can be used).
###  3. status - shows the output presented in 1.1. When calling status an iteration
###    occurs through all the files stored in program memory and prints if they were
###    changed during snapshot time and current time.
