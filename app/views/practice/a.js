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



// ボタンがクリックされたときの処理
document.getElementById("myButton").addEventListener("click", function() {
  alert("ボタンがクリックされました！");
});

// ページにテキストを追加
document.getElementById("myText").textContent = "こんにちは、JavaScript！";

// 現在の日付と時刻を取得
const now = new Date();
const dateTimeString = now.toLocaleString();

// ページに表示
document.getElementById("myDateTime").textContent = "現在の日時: " + dateTimeString;


document.getElementById("myButton").addEventListener("click", function() {
  document.getElementById("myText").textContent = "新しいテキストです！";
});


document.getElementById("myButton").addEventListener("click", function() {
  const inputText = document.getElementById("myInput").value;
  document.getElementById("outputText").textContent = "入力されたテキスト: " + inputText;
});


const image = document.getElementById("myImage");
image.addEventListener("mouseover", function() {
  image.src = "image2.jpg";
});

image.addEventListener("mouseout", function() {
  image.src = "image1.jpg";
});


// リストアイテムを追加する関数
function addTodo() {
  const todoInput = document.getElementById("todoInput");
  const todoText = todoInput.value;
  if (todoText.trim() !== "") {
    const todoList = document.getElementById("todoList");
    const listItem = document.createElement("li");
    listItem.textContent = todoText;
    const deleteButton = document.createElement("button");
    deleteButton.textContent = "削除";
    deleteButton.addEventListener("click", function() {
      todoList.removeChild(listItem);
    });
    listItem.appendChild(deleteButton);
    todoList.appendChild(listItem);
    todoInput.value = "";
  }
}

// "追加"ボタンのクリックイベントリスナー
document.getElementById("addButton").addEventListener("click", addTodo);

// Enterキーでアイテムを追加する
document.getElementById("todoInput").addEventListener("keyup", function(event) {
  if (event.key === "Enter") {
    addTodo();
  }
});


document.getElementById("myButton").addEventListener("click", function() {
  alert("ボタンがクリックされました！");
});


console.log("hello world");

let name = "Kate";
console.log(name);

name = "Tanaka";
console.log(name);


console.log(7);

let number = 3
console.log(number);

number = 5
console.log(number);


