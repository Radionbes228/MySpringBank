<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/static/css/creditMainPage.css">
    <link rel="stylesheet" type="text/css" href="/static/properti.Scss">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet"
    integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <title>Document</title>
</head>
<body style="padding: 20px;
            text-decoration: #060606;
            background-color: #2d5b7b">
<form method="POST" action="/credit" style="width: 500px">
    Имя кредита <input type="text" name="creditName"><br><br>
    Сумма кредита <input id="sum" type="number" name="loanAmount"><br><br>
    Процентная ставка <input type="number" name="interestRate"><br><br>
    Продолжительность кредита <input type="number" id="duration" name="duration"><br><br>
    <input type="submit" value="Создать">
</form>
<br>

<div class="myCard">
    <#list credits as credit>
        <a href="/credit/${credit.getId()}" class="dopInfo">
            <div class="card text-white bg-success mb-3">
                <div class="card-header">${credit.getCreditName()}</div>
                <div class="card-body">
                    <h5 class="card-title">${credit.getLoanAmount()} р.</h5>
                    <p class="card-text">${credit.getDuration()}</p>
                </div>
            </div>
        </a>
    </#list>
</div>

<div class="home_button">
    <form method="GET" action="/home">
        <input type="submit" class="btn btn-dark" value="Назад">
    </form>

    <form method="GET" action="/home">
        <input type="submit" class="btn btn-dark" value="Домой">
    </form>
</div>
</body>


</html>