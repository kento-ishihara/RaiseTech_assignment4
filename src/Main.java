import java.time.YearMonth;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Game> gamesList = new ArrayList<>();
        /**
         * gameListにゲームの要素を追加
         */
        gamesList.add(new Game("ラブandベリー", "セガ", YearMonth.of(2004, 10)));
        gamesList.add(new Game("アイカツ!", "バンダイ", YearMonth.of(2012, 10)));
        gamesList.add(new Game("アイカツスターズ!", "バンダイ", YearMonth.of(2016, 5)));
        gamesList.add(new Game("アイカツフレンズ!", "バンダイ", YearMonth.of(2018, 4)));
        gamesList.add(new Game("アイカツオンパレード!", "バンダイ", YearMonth.of(2019, 10)));
        gamesList.add(new Game("アイカツプラネット!", "バンダイ", YearMonth.of(2020, 12)));
        gamesList.add(new Game("プリティーリズムオーロラドリーム", "タカラトミー", YearMonth.of(2011, 4)));
        gamesList.add(new Game("プリティーリズムディアマイフューチャー", "タカラトミーアーツ", YearMonth.of(2012, 4)));
        gamesList.add(new Game("プリティーリズムレインボーライブ", "タカラトミーアーツ", YearMonth.of(2013, 4)));
        gamesList.add(new Game("プリパラ", "タカラトミーアーツ", YearMonth.of(2014, 4)));
        gamesList.add(new Game("アイドルタイムプリパラ", "タカラトミーアーツ", YearMonth.of(2017, 4)));
        gamesList.add(new Game("キラッとプリ☆チャン", "タカラトミーアーツ", YearMonth.of(2018, 4)));
        gamesList.add(new Game("ワッチャプリマジ!", "タカラトミーアーツ", YearMonth.of(2021, 10)));

        /**
         * gameListをStreamに変換し、発売元に"タカラトミー"を含むゲームをresult1に入れる
         * result1に入れたゲームの名前を標準出力
         */
        List<Game> result1 = gamesList.stream().filter(game -> game.getSalesAgency().contains("タカラトミー")).toList();
        for (Game game : result1) {
            System.out.println(game.getName());
        }

        System.out.println("-------------------------------------------------------");

        /**
         * gameListをStreamに変換し、稼働開始順にソートしてresult2に入れる
         * result2に入れたゲームの名前と稼働開始年月を標準出力
         */
        List<Game> result2 = gamesList.stream().sorted(Comparator.comparing(Game::getYearMonth)).toList();
        for (Game game : result2) {
            System.out.println(game.getName() + "　稼働開始年月：" + game.getYearMonth());
        }
    }
}
