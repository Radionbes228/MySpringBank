<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>

    <form method="POST" action="/registration">
        <span class="input-group-text" id="basic-addon1">Surname</span>
        <input type="text" name="surname"><br>
        <span class="input-group-text" id="basic-addon1">Name</span>
        <input type="text" name="name"><br>
        <span class="input-group-text" id="basic-addon1">Patronymic</span>
        <input type="text" name="patronymic"><br>
        <span class="input-group-text" id="basic-addon1">Email</span>
        <input type="email" name="email"><br>
        <span class="input-group-text" id="basic-addon1">Password</span>
        <input type="text" name="password"><br>
        <span class="input-group-text" id="basic-addon1">Date of birth</span>
        <input type="date" name="dateOfBirth"><br>
        <span class="input-group-text" id="basic-addon1">Floor</span>
        <input type="radio" name="floor"><br>
        <span class="input-group-text" id="basic-addon1">Passport series</span>
        <input type="number" name="passportSeries"><br>
        <span class="input-group-text" id="basic-addon1">Passport number</span>
        <input type="number" name="passportNumber"><br><br>
        <input type="submit" value="Зарегестрироваться">
    </form>
</body>
</html>