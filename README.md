# Logic-Gate-Simulation-Using-Perceptrons-and-Neural-Networks

This project is a JavaFX-based educational tool that simulates how perceptrons and simple neural networks can learn to model logic gates such as AND, OR, NAND, NOR, XOR, and XNOR. It includes support for various activation functions, training rate customization, epoch selection, and visual output of decision boundaries.

---

## 🚀 Features

- 🔘 Simulate logic gates (AND, OR, NAND, NOR, XOR, XNOR, NOT)
- ⚙️ Choose between no hidden layer (perceptron) and one hidden layer (neural network)
- 🧠 Supports multiple activation functions:
  - Step Function
  - Sigmoid
  - ReLU
  - tanh
- 📊 Visualize decision boundaries using dynamic plotting
- 🎚️ Configurable training rate and number of epochs
- 👨‍🏫 Designed as an educational tool to demonstrate how neural networks learn

---

## 🖥️ Technologies Used

- Java 17+
- JavaFX for UI
- Swing (`JFrame`) for plotting
- Object-Oriented Programming (OOP) principles

---

## 🧩 How It Works

1. Choose a logic gate from the dropdown menu.
2. Select activation functions for the output and hidden layers (if applicable).
3. Enter a training rate (between **0.1 and 0.9**) and number of epochs (between **100 and 10000**).
4. Click the button to train the model.
5. The network will train and update its weights based on the inputs and expected outputs.
6. Decision boundaries will be displayed visually after each epoch.

---

## 📸 Screenshots

![image](https://github.com/user-attachments/assets/f823e05b-cb6f-4b1f-a426-2c2ceece7be3)

---

## 📂 Project Structure

```
com/
└── example/
    └── project2ai/
        ├── HelloController.java   # Main controller for JavaFX interface
        ├── LineAndPointPanel.java # Custom Swing panel for plotting
        └── ...
```

---

## ✅ Requirements

- Java 17 or later
- JavaFX SDK
- An IDE such as IntelliJ IDEA or Eclipse

---

## 🛠️ How to Run

1. Clone the repository:

   ```bash
   git clone https://github.com/AdamQobbaj/Logic-Gate-Simulation-Using-Perceptrons-and-Neural-Networks
   ```

2. Open the project in your IDE and make sure JavaFX is configured properly.

3. Run the `HelloController` class or launch the JavaFX application via your FXML loader.

---

## 🧠 Educational Focus

This project is ideal for:
- Students learning about neural networks and perceptrons
- Visual learners who benefit from seeing how weights evolve
- Computer Engineering and AI course projects

---

## 📌 To-Do

- [ ] Replace Swing with JavaFX charting for consistency
- [ ] Add support for more complex logic circuits
- [ ] Improve real-time graphing of error vs. epoch

---

## 👨‍💻 Authors

- **Adam Qobbaj**  
- **Eyas Hannon**

---

## 📜 License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.
