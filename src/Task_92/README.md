<h1 class="title">Крестики-нолики (19%)</h1>
<p><b>Время: 1 сек.<br>Память: 16 Мб<br>Сложность: 19%</b></p>
<p>Крестики-нолики – логическая игра между двумя противниками на квадратном поле 3 на 3 клетки. Один из игроков играет «крестиками» (тот, кто ходит первым), другой – «ноликами». Игроки по очереди ставят на свободные клетки поля знаки (один всегда «крестики», другой всегда «нолики»). Первый, выстроивший в ряд три своих фигуры по вертикали, горизонтали или диагонали, выигрывает и на этом игра заканчивается. В том случае, когда все клетки заполнены и победитель не определен, игра завершается ничьей.</p>
<p>По состоянию игрового поля в конце игры требуется определить результат игры для первого игрока: выиграл, проиграл или сыграл вничью.</p>
<h2>Формат ввода</h2>
<p>Входной файл input.txt содержит информацию об игровом поле – три строки по три символа в каждой. Символ «X» (ASCII 88) означает «крестик», символ «O» (ASCII 79) - «нолик», а символ «.» (ASCII 46) - пустую клетку.</p>
<h2>Формат вывода</h2>
<p>В выходной файл OUTPUT.TXT выведите в случае победы первого игрока «Win», в случае его проигрыша – «Lose» и «Draw» в случае ничьей.</p>
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
            <td>.OX<br>
                .XO<br>
                XXO</td>
            <td>Win</td>
        </tr>
        <tr>
            <td>OXO<br>
                .OX<br>
                OXX</td>
            <td>Lose</td>
        </tr>
        <tr>
            <td>XOX<br>
                XOX<br>
                OXO</td>
            <td>Draw</td>
        </tr>
    </tbody>
</table>
