<h1 class="title">NEERC (17%)</h1>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 17%</b></p>
<p>В полуфинале студенческого чемпионата мира по программированию NEERC (http://neerc.ifmo.ru) участвуют команды из n институтов. Участники для проведения соревнований распределяются по k залам, каждый из которых имеет размеры, достаточные для размещения всех команд от всех институтов. При этом по правилам соревнований в одном зале может находиться не более одной команды от института.</p>
<p>Многие институты уже подали заявки на участие в полуфинале. Оргкомитет полуфинала хочет допустить до участия максимально возможное количество команд. При этом, разумеется, должна существовать возможность рассадить их по залам без нарушения правил.</p>
<p>Напишите программу, определяющую максимальное количество команд, которые можно допустить до участия в полуфинале.</p>
<h2>Формат ввода</h2>
<p>Первая строка входного файла input.txt содержит число n - число институтов, подавших заявки. Вторая строка входного файла содержит n чисел a<sub>1</sub>, …, a<sub>n</sub> (a<sub>i</sub> - это количество команд, заявленных от института номер i). Последняя строка входного файла содержит число k - количество залов, в которых проходят соревнования.</p>
<p>Все числа во входном файле целые, положительные и не превосходят 10000.</p>
<h2>Формат вывода</h2>
<p>В выходной файл output.txt выведите одно целое число - ответ на задачу.</p>
<h3>Примеры</h3>
<table class="sample-tests">
<thead>
    <tr>
        <th>Ввод</th>
        <th>Вывод</th>
    </tr>
</thead>
<tbody>
        <tr>
            <td>3<br>
                1 2 4<br>
                3</td>
            <td>6</td>
        </tr>
        <tr>
            <td>3<br>
                1 2 4<br>
                4</td>
            <td>7</td>
        </tr>
    </tbody>
</table>
