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

    <form method="POST" action="/contribution/">
        Имя вклада <input type="text" name="name">
        Сумма вклада <input type="number" name="sum">
        Процентная ставка <input type="number" name="interestRate">
        Итоговая сумма выплаты <input type="number" name="resultSum">
        <input type="submit" value="Создать">
    </form>

    <#list contributions as contribution>
        <h4><a href="/contribution/${contribution.getId()}">${contribution.getName()}</a></h4>
    </#list>



</body>
</html>