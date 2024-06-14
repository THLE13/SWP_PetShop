// change title 
let docTitle = document.title;
window.addEventListener("blur", () => {
    document.title = "Come back ☹️";
});

window.addEventListener("focus", () => {
    document.title = docTitle;
});

// index-part-even
const searchIcon = document.getElementById("search-icon");

searchIcon.addEventListener("click", function () {
    const searchForm = document.querySelector(".form-search");
    searchForm.classList.toggle("active");
});

// user-icon-event
const userIcon = document.getElementById("user-icon");

userIcon.addEventListener("click", function () {
//    const userName = "<%= session.getAttribute('seeUserName')%>";
//    if (userName) {
//        window.location = "pages/profile/profile-main.jsp";
//    } else {
    const userForm = document.querySelector(".form-login");
    userForm.classList.toggle("active");
//    }

});

// support-part-event
const supportIcon = document.getElementById("support-icon");

supportIcon.addEventListener("click", function () {
    const contentOption = document.querySelector(".content");
    contentOption.classList.toggle("active");
});
