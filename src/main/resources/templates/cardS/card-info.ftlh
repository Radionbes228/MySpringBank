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

    <h2>Счёт: ${card.getSum()}</h2>

    <a href="/translation/${card.getId()}">Оплатить или перевести</a><br>
    <a>Пополнить</a><br>
    <a>История</a><br>

    <form method="GET" action="/home">
        <input type="submit" value="Домой">
    </form>

</body>
</html>