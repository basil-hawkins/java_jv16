<!DOCTYPE html>

<html>

  <head>

    <meta charset="utf-8">

    <title>名称未設定</title>

    <link rel="stylesheet" type="text/css" href="css/reset.css">
    <link rel="stylesheet" type="text/css" href="css/taikei.css">
    <script src="js/top.js"></script>
  </head>
<div id="wrap">
  <body>

    <div id="back">
        <a href="home.html"><p>◁　シルエットを選択　</p></a>
    </div>

    <!-- --------------------------------------------------------- -->
    <!-- ここから下はモデル選択の設定 -->
<div class="slideshow middle">

    <ul class="slides">
        <input type="radio" name="r" id="r1" checked>
        <input type="radio" name="r" id="r2">
        <input type="radio" name="r" id="r3">
        <input type="radio" name="r" id="r4">
   <!--追加したい場合-->
   <!--<input type="radio" name="r" id="r-n">-->

        <li class="slide s1">
            <img src="images/hutuu_1.png" alt="">
        </li>
        <li class="slide">
            <img src="images/debu_1.png" alt="">
        </li>
        <li class="slide">
            <img src="images/ninpu_1.png" alt="">
        </li>
        <li class="slide">
            <img src="images/kodomo_1.png" alt="">
        </li>
    <!--追加したい場合-->
    <!--
　　　　　<li class="slide">
            <img src="image/s-n.jpg" alt="">
        </li>
    -->
    </ul>

    <div class="navigation">
        <label for="r1" class="bar"></label>
        <label for="r2" class="bar"></label>
        <label for="r3" class="bar"></label>
        <label for="r4" class="bar"></label>
    <!--追加したい場合-->
    <!--<label for="r-n" class="bar"></label>-->
    </div>
  </div>
    <!-- --------------------------------------------------------- -->



    <!-- --------------------------------------------------------- -->
    <!-- ここから下はラジオボックス設定 -->
    <!-- inputの中身のnameを別にしにして分けてる -->
      <div class="radiobox">
        <input id="radio1" class="radiobutton" name="hoge" type="radio" value="ラジオボタン1" />
        <label for="radio1">MEN</label>
        <input id="radio2" class="radiobutton" name="hoge" type="radio" value="ラジオボタン2" />
        <label for="radio2">WOMEN</label>
      </div><br><br>
          <h1>ジャンルを絞る</h1>
          <br>
          <div id="select">
            <div class="selectbox">
            <input id="radio3" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio3">キレカジ</label>
            <input id="radio4" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio4">カジュアル</label>
            <input id="radio5" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio5">ストリート</label>
            <br><br><br>
            <input id="radio6" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio6">サロン</label>
            <input id="radio7" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio7">スポーティー</label>
            <input id="radio8" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio8">アメカジ</label>
            <br><br><br>
            <input id="radio9" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio9">モード</label>
            <input id="radio10" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio10">きれいめ</label>
            <input id="radio11" class="radiobutton" name="set" type="radio" value="ラジオボタン1" />
            <label for="radio11">サーフ</label>
    </div>
    <div id="next">
        <a href="teian.html"><p>これで決定　▷</p></a>
    </div>
</div>

  </body>
</div>

</html>