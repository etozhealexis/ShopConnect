function registerAccount() {
    let user = {
        name: document.getElementById('username').value,
        email: document.getElementById('email').value,
        password: document.getElementById('password').value,
        passwordConfirmation: document.getElementById('passwordConfirmation').value,
    }
    let userjson = JSON.stringify(user)
    $.ajax({
        method: 'POST',
        url: '/user/register',
        contentType: 'application/json',
        data: userjson,
        success: function () {
            alert('Registration success')
            document.getElementById('main').click()
        },
        error: function () {
            alert('Something went wrong. Fill the fields correctly')
        }
    })
}