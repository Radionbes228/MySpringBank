<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Кредит: ${credit.getCreditName()}</title>
</head>
<body>
    <form >
        <b>${credit.getId()}</b>
        <h3>${credit.getCreditName()}</h3>
        <h3>${credit.getLoanAmount()} р.</h3>
        <h3>${credit.getLoanOwner()}</h3>
        <h3>${credit.getInterestRate()}%</h3>
    </form>

    <form method="POST" action="/credit/delete/${credit.getId()}">
        <input type="submit" value="Удалить">
    </form>

    <form method="GET" action="/credit">
        <input type="submit" value="Наад">
    </form>

</body>
</html>