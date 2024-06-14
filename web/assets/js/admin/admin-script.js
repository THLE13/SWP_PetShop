const logoText = document.getElementById("logo");

logoText.addEventListener("click", () => {
  let navbar = document.querySelector(".navbar");
  navbar.classList.toggle("show");
});

// Show to do list for admin
document.addEventListener("DOMContentLoaded", () => {
  const toDoList = document.getElementById("to-do-list");
  const toDoListForm = document.querySelector(".to-do-list-form");

  toDoList.addEventListener("click", () => {
    console.log(toDoListForm);
    toDoListForm.classList.toggle("active");
  });
});

const taskInput = document.getElementById("task");
const taskList = document.querySelector(".taskList");
const addTask = () => {
  const taskText = taskInput.value.trim();

  if (taskText !== "") {
    const li = document.createElement("li");
    li.textContent = taskText;
    taskList.appendChild(li);
    taskInput.value = "";
    let span = document.createElement("span");
    span.innerHTML = "\u00d7";
    li.appendChild(span);
  } else {
    alert("Cannot empty Task");
  }
};

const completeTask = (e) => {
  const task = e.target.parentElememt;
  taskList.removeChild(task);
};
