<h1 class="title">Соревнование картингистов (18%)</h1>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 18%</b></p>
<p>После очередного этапа чемпионата мира по кольцевым автогонкам на автомобилях с открытыми колесами Формула-А гонщики собрались вместе в кафе, чтобы обсудить полученные результаты. Они вспомнили, что в молодости соревновались не на больших болидах, а на картах – спортивных автомобилях меньших размеров.</p>
<p>Друзья решили выяснить победителя в одной из гонок на картах. Победителем гонки являлся тот гонщик, у которого суммарное время прохождения всех кругов трассы было минимальным.</p>
<p>Поскольку окончательные результаты не сохранились, то каждый из n участников той гонки вспомнил и выписал результаты прохождения каждого из m кругов трассы. К сожалению, по этой информации гонщикам было сложно вычислить победителя той гонки. В связи с этим они попросили сделать это вас.</p>
<p>Требуется написать программу, которая вычислит победителя гонки на картах, о которой говорили гонщики.</p>
<h2>Формат ввода</h2>
<p>Первая строка входного файла input.txt содержит два целых числа n и m (1 ≤ n, m ≤ 100). Последующие 2∙n строк описывают прохождение трассы каждым из участников. Описание прохождения трассы участником состоит из двух строк. Первая строка содержит имя участника с использованием только английских букв (строчных и заглавных). Имена всех участников различны, строчные и заглавные буквы в именах различаются.</p>
<p>Вторая строка содержит m положительных целых чисел, где каждое число – это время прохождения данным участником каждого из m кругов трассы (каждое из этих чисел не превосходит 1000). Длина каждой строки с именем участника не превышает 255 символов.</p>
<h2>Формат вывода</h2>
<p>В выходной файл output.txt необходимо вывести имя победителя гонки на картах. Если победителей несколько, требуется вывести имя любого из них.</p>
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
            <td>5 3<br>
                Sumaher<br>
                2 1 1<br>
                Barikelo<br>
                2 1 2<br>
                Olonso<br>
                1 2 1<br>
                Vasya<br>
                1 1 1<br>
                Fedya<br>
                1 1 1</td>
            <td>Vasya</td>
        </tr>
    </tbody>
</table>
