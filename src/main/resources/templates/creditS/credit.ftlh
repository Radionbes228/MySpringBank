<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>Document</title>
</head>
<body>
    <form method="POST" action="/credit">
        Имя кредита <input type="text"  name="creditName"><br><br>
        Сумма кредита <input id="sum" type="number" name="loanAmount"><br><br>
        Владелец кредита <input type="text" name="loanOwner"><br><br>
        Продолжительность кредита <input type="number" id="duration" name="duration"><br><br>
        <input type="submit" value="Создать">
    </form>

    <#list credits as credit>
        <h4><a href="/credit/${credit.getId()}">${credit.getCreditName()}</a></h4>
    </#list>

    <form method="GET" action="/home">
        <input type="submit" class="btn btn-dark" value="Назад">
    </form>

    <form method="GET" action="/home">
        <input type="submit" class="btn btn-dark" value="Домой">
    </form>


</body>
</html>