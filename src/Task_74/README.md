<h1 class="title">Сбор черники (17%)</h1>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 17%</b></p>
<p>В фермерском хозяйстве в Карелии выращивают чернику. Она растет на круглой грядке, причем кусты высажены только по окружности. Таким образом, у каждого куста есть ровно два соседних. Всего на грядке растет N кустов.</p>
<p>Эти кусты обладают разной урожайностью, поэтому ко времени сбора на них выросло различное число ягод – на i-ом кусте выросло a<sub>i</sub> ягод.</p>
<p>В этом фермерском хозяйстве внедрена система автоматического сбора черники. Эта система состоит из управляющего модуля и нескольких собирающих модулей. Собирающий модуль за один заход, находясь непосредственно перед некоторым кустом, собирает ягоды с этого куста и с двух соседних с ним.</p>
<p>Напишите программу для нахождения максимального числа ягод, которое может собрать за один заход собирающий модуль, находясь перед некоторым кустом заданной во входном файле грядки.</p>
<h2>Формат ввода</h2>
<p>Первая строка входного файла input.txt содержит целое число N (3 ≤ N ≤ 1000) – количество кустов черники. Вторая строка содержит N целых положительных чисел a<sub>1</sub>, a<sub>2</sub>, ..., a<sub>N</sub> – число ягод черники, растущее на соответствующем кусте. Все a<sub>i</sub> не превосходят 1000.</p>
<h2>Формат вывода</h2>
<p>В выходной файл output.txt выведите ответ на задачу.</p>
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
            <td>4<br>
                1 2 3 4</td>
            <td>9</td>
        </tr>
        <tr>
            <td>3<br>
                1 2 3</td>
            <td>6</td>
        </tr>
    </tbody>
</table>
