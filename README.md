# PasswordManager
A simple Password Manager built in Java using HashMap, OOP, and a basic encryption mechanism. This project allows you to securely store, update, and retrieve passwords for different services via a console interface.
🔧** Technologies & Concepts Used**
Java

HashMap (for storing credentials)

Object-Oriented Programming (OOP)

Console-based User Interface

Caesar Cipher-style Encryption (basic)

File Handling (coming soon!)

🚀 Features
✅ Add Credential (service name + password)
✅ View Stored Password
✅ Update Password
✅ Delete Credential
✅ List All Services
✅ Encrypt Passwords Internally (Bonus)

**🔐 How It Works**
All passwords are stored in an encrypted format internally using a simple Caesar Cipher logic (character shifting), and are decrypted when viewed by the user. This mimics a real-world password manager’s behavior, although it uses basic logic for learning purposes.
**PasswordManager/**
├── PasswordManager.java      # Main logic (add, get, update, remove, list)
├── Main.java                 # Menu-driven CLI interface
└── passwords.txt (optional)  # (To be added for file saving)
**📥 How to Run**
Open Command Prompt and navigate to your folder:
Compile the program:
javac *.java
Run the program:
java Main
**🧪 Sample Menu**
--- MENU ---
1. Add Credential
2. View Credential
3. Update Credential
4. Remove Credential
5. List All Services
0. Exit
**🧠 Concepts Demonstrated**
Secure storage using encryption

HashMap for constant-time lookup

String manipulation

Encapsulation using OOP

Console-driven interaction with input validation

**📦 Future Features**
Save credentials to file (passwords.txt)

Load credentials on startup

Stronger encryption (e.g., AES)

GUI interface using Java Swing

Master password authentication
