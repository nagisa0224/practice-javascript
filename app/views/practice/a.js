const age = 25;
let message = "";

if (age >= 18) {
  message = "You are an adult.";
} else {
  message = "You are a minor.";
}

document.getElementById("message").textContent = message;


const fruits = ["Apple", "Banana", "Cherry", "Date"];
const ul = document.getElementById("fruits");

fruits.forEach(function(fruit) {
  const li = document.createElement("li");
  li.textContent = fruit;
  ul.appendChild(li);
});


document.getElementById("showAlert").addEventListener("click", function() {
  const name = document.getElementById("nameInput").value;
  alert("Hello, " + name + "!");
});


const number1 = 5;
const number2 = 3;
const sum = number1 + number2;
document.getElementById("result").textContent = sum;


const fruitSelector = document.getElementById("fruitSelector");
const selectedFruit = document.getElementById("selectedFruit");

fruitSelector.addEventListener("change", function() {
  const selectedValue = fruitSelector.value;
  selectedFruit.textContent = "You selected: " + selectedValue;
});


function updateCurrentTime() {
  const currentTime = new Date();
  document.getElementById("currentTime").textContent = "Current time: " + currentTime.toLocaleString();
}

// 初回表示
updateCurrentTime();

// 1秒ごとに更新
setInterval(updateCurrentTime, 1000);

