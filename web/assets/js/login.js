document.addEventListener("DOMContentLoaded", () => {
    const letGoButton = document.querySelector(".let-go");

    if (letGoButton) {
        letGoButton.addEventListener("click", function myFunction() {
            letGoButton.style.display = "none";

            const loginPage = document.querySelector(".login-page");
            const registerPage = document.querySelector(".register-page");
            const showRegister = document.getElementById("show-register");
            const showLogin = document.getElementById("show-login");

            if (registerPage && loginPage && showRegister && showLogin) {
                registerPage.classList.add("active");

                showLogin.addEventListener("click", (e) => {
                    e.preventDefault();
                    registerPage.classList.remove("active");
                    loginPage.classList.add("active");
                });

                showRegister.addEventListener("click", (e) => {
                    e.preventDefault();
                    loginPage.classList.remove("active");
                    registerPage.classList.add("active");
                });
            } else {
                console.error("One or more elements not found");
            }
        });
    } else {
        console.error("letGoButton not found");
    }
});
