<h1 class="title">Тинькофф (2 задание)</h1>
<p><b>Время: 1 сек.<br>Память: 256 Мб<br>Сложность: ?</b></p>
<p>Ваня принес на кухню рулет, который он хочет разделить с коллегами. Для этого он хочет разрезать рулет на N равных частей. Разумеется, рулет можно резать только поперек. Соотвественно, Костя сделает N−1 разрез ножом через равные промежутки.</p>
<p>По возвращению с кофе-брейка Ваня задумался — а можно ли было обойтись меньшим числом движений, будь нож Вани бесконечно длинным (иначе говоря, если он мог бы сделать сколько угодно разрезов за раз, если эти разрезы лежат на одной прямой)? Считается, что места для разрезов намечены заранее, и все разрезы делаются с ювелирной точностью.</p>
<p>Оказывается, что можно. Например, если Ваня хотел бы разделить рулет на 4 части, он мог бы обойтись двумя разрезами — сначала он разделил бы рулет на две половинки, а потом совместил бы две половинки и разрезал обе пополам одновременно.</p>
<p>Вам дано число N, требуется сказать, каким минимальным числом разрезов можно обойтись.</p>
<h2>Формат ввода</h2>
<p>Дано одно натуральное число N (1 ≤ N ≤ 2 × 10<sup>9</sup>) — количество людей на кофе-брейке.</p>
<h2>Формат вывода</h2>
<p>Выведите одно число — минимальное число движений, которое придется сделать Косте.</p>
<h2>Замечание</h2>
<p>Чтобы разрезать рулет на 6 частей, Ване сначала придется разрезать его на две равные части, после чего совместить две половинки и сделать два разреза.</p>
<p>Чтобы разрезать рулет на 5 частей, Ване понадобится разделить его в соотношении 2:3, после чего совместить два рулета по левому краю и разрезать бОльший рулет на одинарные кусочки — меньший тоже разделится на одинарные.</p>
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
        <td>6</td>
        <td>3</td>
     </tr>
     <tr>
        <td>5</td>
        <td>3</td>
     </tr>
  </tbody>
</table>