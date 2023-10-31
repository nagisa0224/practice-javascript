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
