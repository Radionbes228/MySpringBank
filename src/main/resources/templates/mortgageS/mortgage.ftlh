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

    <form method="POST" action="/mortgage">
        Имя вклада <input type="text" name="name">
        Сумма вклада <input type="number" name="sum">
        Процентная ставка ${constants}<input hidden="hidden" value="${constants}" type="number" name="interestRate">
        <input type="submit" value="Создать">
    </form>

    <#list mortgages as mortgage>
        <a href="/mortgage/${mortgage.getId()}">${mortgage.getName()}</a>
    </#list>

    <form method="GET" action="/home">
        <input type="submit" value="Домой">
    </form>





</body>
</html>