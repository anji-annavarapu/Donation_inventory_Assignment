# 🧾 Donation Inventory Assignment

This Java console application manages donation and distribution records for a local shelter. It allows users to register donations, view distributed items by date, and manage inventory using simple command-line operations.

---

```## 📁 Project Structure
Donation_inventory_Assignment
├── .idea/ # IntelliJ project config files
├── src/ # All source files go here
│ ├── Donation.java
│ ├── Distribution.java
│ ├── DistributionManager.java
│ └── Main.java
├── .gitignore
├── donated_inventory.iml # IntelliJ project file
└── README.md


## ✅ Requirements

- Java Development Kit (JDK) 8 or higher
- Git (optional, for cloning)
- Command line OR an IDE like IntelliJ IDEA, Eclipse, or VS Code

---

## 💻 How to Run the Application (on any machine)

### 👉 Option 1: Run using Command Line

#### 1. Clone or Download the Project

bash
git clone https://github.com/anji-annavarapu/Donation_inventory_Assignment.git
cd Donation_inventory_Assignment
Or download as ZIP and extract.

2. Compile the Java files
javac -d out src/*.java
This compiles all .java files from src and places .class files in the out/ folder.

3. Run the Application
java -cp out Main
Make sure Main.java contains the public static void main(String[] args) method.
