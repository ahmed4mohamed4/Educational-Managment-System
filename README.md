# 🎓 Education Management System

A comprehensive Java-based management system for handling students, courses, and instructors in an educational institution.

---

## 📋 Table of Contents

- [Features](#features)
- [Project Structure](#project-structure)
- [Classes Overview](#classes-overview)
- [Getting Started](#getting-started)
- [Usage](#usage)
- [System Requirements](#system-requirements)
- [How to Run](#how-to-run)

---

## ✨ Features

### Student Management
- **View all students** - Display complete student roster with details
- **Add new student** - Register students with name, department, ID, level, and GPA
- **Edit student information** - Update any student's details
- **Delete student** - Remove a student from the system
- **Search student** - Find students by their ID

### Course Management
- **View all courses** - Display all available courses
- **Add new course** - Create courses with name, code, instructor, hours, and content titles
- **Edit course information** - Modify course details
- **Delete course** - Remove courses from the system
- **Search course** - Find courses by course code

### Instructor Management
- **View all instructors** - Display all instructors with their details
- **Add new instructor** - Register instructors with name, rank (Doctor/Assistant), salary, and ID
- **Edit instructor information** - Update instructor details
- **Delete instructor** - Remove instructors from the system

---

## 📁 Project Structure

```
education_management_system/
├── src/
│   ├── Main.java           # Entry point - Main application logic
│   ├── Entity.java         # Abstract base class for all entities
│   ├── Student.java        # Student class definition
│   ├── Course.java         # Course class definition
│   ├── Instructor.java     # Instructor class definition
│   └── Functions.java      # Utility functions for the system
└── README.md              # This file
```

---

## 📚 Classes Overview

### `Entity` (Abstract Class)
Base class for all entities in the system.
- **Abstract Method**: `PrintAllInfo()` - Print entity information
- **Protected Method**: `PrintSeparator()` - Print separator line

### `Student`
Represents a student in the system.

**Attributes:**
- `FullName` (String) - Student's full name
- `Department` (String) - Department enrolled in
- `Id` (int) - Unique student ID
- `Level` (int) - Academic level
- `Gpa` (double) - Grade Point Average

**Key Methods:**
- Getters and setters for all attributes
- `PrintAllInfo()` - Display all student information

### `Course`
Represents a course offered by the institution.

**Attributes:**
- `Name` (String) - Course name
- `Code` (String) - Unique course code
- `Instructor` (String) - Instructor name
- `Hours` (int) - Course credit hours
- `Content` (List<String>) - List of course topics/titles

**Key Methods:**
- Getters and setters for all attributes
- `PrintAllInfo()` - Display course details with all topics

### `Instructor`
Represents an instructor in the institution.

**Attributes:**
- `FullName` (String) - Instructor's full name
- `DoctorOrAssistant` (String) - Rank (Doctor or Assistant)
- `Salary` (int) - Annual salary
- `Id` (int) - Unique instructor ID

**Key Methods:**
- Getters and setters for all attributes
- `PrintAllInfo()` - Display instructor information

### `Functions`
Utility class containing helper methods.

**Key Methods:**
- `CheckStrInput(String input, String word)` - Validate string input
- `SearchFor()` - Overloaded method to search for students, courses, or instructors
- `SaySorryIfEmpty(String section)` - Display message when list is empty
- `ShowMessageAndInputProcessForSection(String section)` - Display menu options

### `Main`
The main application class that handles the user interface and business logic.
- Manages three `ArrayList` collections: students, courses, and instructors
- Implements menu-driven interface for user interaction
- Handles all CRUD operations for each entity type

---

## 📖 Usage Guide

### Main Menu
When you start the application, you'll see:
```
Which section you want?
> Students
> Courses
> Instructor
> EXIT
```

### Student Section Operations
1. **View** - Display all registered students
2. **Add** - Register a new student
3. **Edit** - Modify student information
4. **Delete** - Remove a student
5. **Search** - Find a student by ID

### Course Section Operations
1. **View** - Display all courses
2. **Add** - Create a new course
3. **Edit** - Modify course details
4. **Delete** - Remove a course

### Instructor Section Operations
1. **View** - Display all instructors
2. **Add** - Register a new instructor
3. **Edit** - Modify instructor details
4. **Delete** - Remove an instructor

---

## 🔧 Features in Detail

### Input Validation
- The system validates user input to ensure correct section and operation selection
- Supports case-insensitive input (e.g., "STUDENT", "student", "Student" all work)
- Handles plural forms of input (e.g., "students" = "student")

### Data Management
- All data is stored in memory during runtime
- Multiple search capabilities for efficient data retrieval
- Edit and delete operations with ID/code-based searching

### User Experience
- Clear separation of data with visual separators
- Informative messages for all operations
- Error handling for empty lists and invalid searches

---

## 📝 Example Workflow

1. **Start Application** → Select "Students"
2. **Add Student** → Enter name, department, ID, level, GPA
3. **View Students** → See all registered students
4. **Edit Student** → Select by ID and modify details
5. **Return to Main Menu** → Select another section or EXIT

---

## 🤝 Contributing

This is an educational project. Feel free to enhance features, improve code structure, or add new functionality.

---

## 👨‍💻 Author

> Ahmed Mohamed
---


