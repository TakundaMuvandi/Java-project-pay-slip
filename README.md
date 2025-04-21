# 💰 Income Tracker – Java Console App

A simple Java console application designed to help individuals calculate and log daily earnings, including base pay and tips. The app also recommends a savings amount and writes a summary to a local file for future reference.

---

## 🧾 Features

- Collects hours worked and determines if work was done on a weekday or weekend
- Calculates total pay based on dynamic hourly rates
- Accepts additional tip input
- Recommends a savings amount (default: 75% of total income)
- Displays allowance (what’s left after savings)
- Logs all data with a timestamp to `Income.txt`

---

## 📂 Files Included

- `InCome.java` - Core application logic for income calculation and file logging
- `Main.java` - Sample starter code (prints a greeting and demo loop)

---

## 🛠 How to Run

1. **Clone the Repository**
   ```bash
   git clone https://github.com/yourusername/income-tracker-java.git
   cd income-tracker-java
Compile the Java Files

bash
Copy
Edit
javac InCome.java Main.java
Run the Application

bash
Copy
Edit
java InCome
Check Output

Console displays income breakdown

Logs saved in Income.txt

📌 Notes
Be sure to run this app in a directory where file writing is allowed.

Modify savingsRate, weekdayRate, and weekendRate as needed for your personal tracking.

👨‍💻 Author
Takunda Muvandi
Java Developer | Cybersecurity Enthusiast
