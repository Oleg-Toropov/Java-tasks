<h1 class="title">Раскраска таблицы умножения (22%)</h1>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 22%</b></p>
<p>(Время: 1 сек. Память: 16 Мб Сложность: 22%)
<p>Таблицей умножения назовем таблицу размера n строк на m столбцов, в которой на пересечении i-ой строки и j-ого столбца стоит число i∙j (строки и столбцы нумеруются с единицы).</p>
<p>В одной из математических школ было решено провести педагогический эксперимент. Для того, чтобы ученикам было проще запоминать таблицу умножения, некоторые числа в ней будут покрашены в красный, некоторые - в синий, а некоторые - в зеленый цвет (оставшиеся числа будут черными).</p>
<p>Процесс покраски чисел можно условно разбить на четыре этапа. На первом этапе все числа красятся в черный цвет. На втором - все четные числа красятся в красный цвет, на третьем – все числа, делящиеся на 3, красятся в зеленый цвет, на четвертом - все числа, делящиеся на 5, красятся в синий цвет.</p>
<p>Директор школы хочет знать, какое количество картриджей для принтеров необходимо закупить для печати таблиц. Поэтому ему необходима информация о том, сколько чисел какого цвета будет в одной раскрашенной таблице умножения n на m. Напишите программу, решающую задачу подсчета соответствующих количеств.</p>
<h2>Формат ввода</h2>
<p>Входной файл input.txt содержит два натуральных числа n и m (1 ≤ n,m ≤ 1000).</p>
<h2>Формат вывода</h2>
<p>В первой строке выходного файла output.txt выведите количество чисел, покрашенных в красный цвет, во второй - в зеленый, в третьей - в синий, в четвертой - в черный. Следуйте формату, приведенному в примерах.</p>
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
            <td>10 10</td>
            <td>RED : 21<br>
                GREEN : 39<br>
                BLUE : 36<br>
                BLACK : 4</td>
        </tr>
        <tr>
            <td>5 2</td>
            <td>RED : 5<br>
                GREEN : 2<br>
                BLUE : 2<br>
                BLACK : 1</td>
        </tr>
    </tbody>
</table>
