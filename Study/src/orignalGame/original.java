package orignalGame;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class original {
    public static void main(String[] args) throws IOException {

        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        final String STR_COMMA = ",";
        int sw = 0;
        int sw1 = 1;
        int sw2 = 0;
        int sw3 = 0;
        int lvmon = 2;
        int hp = 30;
		int mp = 10;
        int lv = 1;
        int power = 9;
        int victorycnt = 0;
        int tika = 1;                       //地下の回数
        int folre = 3 - victorycnt;
        int aitemu = 5;
        int kaihuku = 5;
        int kaisinritu = 8;
        int lvup = 0;
        int sw0 = 0;
        int magickakuritu = 3;
        int seikousyo = 0;
        int neru = 8;
        int magicattck = 0;
        int magicattck1 = 0;
        int magicattck2 = 0;
        int magicattck3 = 0;
        int zero = 0;
        int kaihukuryo = 10;
        int seigyo = 10;
        int powerup = 7;
        int fightcount = 3;
        boolean ret = false;
        String fname = "セーブデータ１";
        String buf = null;
        String name = null;
        String Xname = "匿名希望";
        String aaaa;
        String sintika = "地下11階の1戦目";
        String sinkirokuname = "ひろてぃんpOとまっちゃん";

        FileOut fo = new FileOut();
        FileIn fi = new FileIn();

        System.out.println("セーブデータはありますか？(ｙ or ｎ)");
            String SaveDateSelect = br.readLine();
            if(SaveDateSelect.equals("y")){
                ret = fi.open(fname);
                if(ret == false){
                    System.out.println("セーブデータはありません");
                }
                buf = fi.readLine();
                try{
                    StringTokenizer tkn = new StringTokenizer(buf,STR_COMMA);
                    sw = Integer.parseInt(tkn.nextToken());
                    sw1 = Integer.parseInt(tkn.nextToken());
                    sw2 = Integer.parseInt(tkn.nextToken());
                    sw3 = Integer.parseInt(tkn.nextToken());
                    lvmon = Integer.parseInt(tkn.nextToken());
                    hp = Integer.parseInt(tkn.nextToken());
                    lv = Integer.parseInt(tkn.nextToken());
                    power = Integer.parseInt(tkn.nextToken());
                    victorycnt = Integer.parseInt(tkn.nextToken());
                    tika = Integer.parseInt(tkn.nextToken());
                    folre = Integer.parseInt(tkn.nextToken());
                    aitemu = Integer.parseInt(tkn.nextToken());
                    kaihuku = Integer.parseInt(tkn.nextToken());
                    kaisinritu = Integer.parseInt(tkn.nextToken());
                    lvup = Integer.parseInt(tkn.nextToken());
                    sw0 = Integer.parseInt(tkn.nextToken());
                    magickakuritu = Integer.parseInt(tkn.nextToken());
                    seikousyo = Integer.parseInt(tkn.nextToken());
                    neru = Integer.parseInt(tkn.nextToken());
                    magicattck = Integer.parseInt(tkn.nextToken());
                    magicattck1 = Integer.parseInt(tkn.nextToken());
                    magicattck2 = Integer.parseInt(tkn.nextToken());
                    magicattck3 = Integer.parseInt(tkn.nextToken());
                    zero = Integer.parseInt(tkn.nextToken());
                    kaihukuryo = Integer.parseInt(tkn.nextToken());
                    seigyo = Integer.parseInt(tkn.nextToken());
                    powerup = Integer.parseInt(tkn.nextToken());
                    fightcount = Integer.parseInt(tkn.nextToken());
                    name = tkn.nextToken();
                }catch(NoSuchElementException e) {
                    System.out.println("データに誤りがあります;" + buf);
                    System.out.println("プログラムを異常終了します" + e);
                    fi.close();
                    System.exit(1);
                }catch(NumberFormatException e) {
                    System.out.println("データに誤りがあります;" + buf);
                    System.out.println("プログラムを異常終了します" + e);
                    fi.close();
                    System.exit(1);
                }catch(Exception e){
                    System.out.println("予期せぬエラーでプログラムを強制終了します");
                    fi.close();
                    System.exit(1);
                }
                ret = fi.close();
                if(ret == false) {
                    System.out.print("プログラムを異常終了します");
                    System.exit(1);
                }
                System.out.println("ロードしました。");
                aaaa = br.readLine();
            }else if(SaveDateSelect.equals("n")){
                System.out.println("あなたの名前を入力してください");
                name = br.readLine();
                if(name.equals("")){
                    name = Xname;
                }
                System.out.println(name+"さん、いまからあるダンジョンに挑戦してもらいます");
                aaaa = br.readLine();
                System.out.println("地下何階まで行けるか挑戦してみてください");
                aaaa = br.readLine();
            }
        while (sw == 0) { //スイッチが０の間繰り返す//
            if(sw1 == 1){
                while (sw2 == 0) { //スイッチが０の間繰り返す//
                System.out.println("　　　　地下"+tika+"階　　　　");
                folre = fightcount - victorycnt; // あと何回モンスターと戦えば下に行くことができるか//
                    System.out.println("　　下の階まで　あと"+folre+"戦");
                    int monkakuritu = (int)(Math.random() * 10);// モンスターとの遭遇確率（乱数）//
                    String space = br.readLine();
                    if(monkakuritu > neru) {
                        neru = 8;
                        sw3 = 0;
                        System.out.println("誰もいなかった・・・");
                        while (sw3 == 0) { //sw3は０の間繰り返す。 ダンジョン選択表示のループ//
                            System.out.println();
                            System.out.println(name + "のHP" + hp);
                            System.out.println();
                            System.out.println("１　進む(モンスターと戦います)");
                            System.out.println("２　寝る(HPが回復します)");
                            System.out.println("３　出る(ゲームをやめる)");
                            System.out.println("４　セーブする。");
                            System.out.println();
                            System.out.println("コマンドを入力してください(１or２or３or４)");
                            String sentaku = br.readLine();
                            System.out.println();
                            if (sentaku.equals("１")) {
                                sw2 = 0;
                                sw3 = 1;
                            }else if (sentaku.equals("２")) {
                                int plusHP = 30 * tika * tika;
                                hp = hp + plusHP;
                                System.out.println("HPが"+plusHP+"回復した");
                                aaaa = br.readLine();
                                sw3 = 1;
                            }else if (sentaku.equals("３")) {
                                System.out.println("ダンジョンから出た");
                                sw = 1;
                                sw2 = 1;
                                sw3 = 1;
                            }else if (sentaku.equals("４")) {
                                ret = fo.open(fname);
                                buf = Integer.toString(sw) + STR_COMMA +
                                      Integer.toString(sw1) + STR_COMMA +
                                      Integer.toString(sw2) + STR_COMMA +
                                      Integer.toString(sw3) + STR_COMMA +
                                      Integer.toString(lvmon) + STR_COMMA +
                                      Integer.toString(hp) + STR_COMMA +
                                      Integer.toString(lv) + STR_COMMA +
                                      Integer.toString(power) + STR_COMMA +
                                      Integer.toString(victorycnt) + STR_COMMA +
                                      Integer.toString(tika) + STR_COMMA +
                                      Integer.toString(folre) + STR_COMMA +
                                      Integer.toString(aitemu) + STR_COMMA +
                                      Integer.toString(kaihuku) + STR_COMMA +
                                      Integer.toString(kaisinritu) + STR_COMMA +
                                      Integer.toString(lvup) + STR_COMMA +
                                      Integer.toString(sw0) + STR_COMMA +
                                      Integer.toString(magickakuritu) + STR_COMMA +
                                      Integer.toString(seikousyo) + STR_COMMA +
                                      Integer.toString(neru) + STR_COMMA +
                                      Integer.toString(magicattck) + STR_COMMA +
                                      Integer.toString(magicattck1) + STR_COMMA +
                                      Integer.toString(magicattck2) + STR_COMMA +
                                      Integer.toString(magicattck3) + STR_COMMA +
                                      Integer.toString(zero) + STR_COMMA +
                                      Integer.toString(kaihukuryo) + STR_COMMA +
                                      Integer.toString(seigyo) + STR_COMMA +
                                      Integer.toString(powerup) + STR_COMMA +
                                      Integer.toString(fightcount)+ STR_COMMA +
                                      name;
                                ret = fo.writeln(buf);
                                if (ret == false) {
                                    fo.close();
                                    System.out.println("プログラムを異常終了します");
                                    System.exit(1);
                                }
                                ret = fo.close();
                                if (ret == false) {
                                    System.out.println("プログラムを異常終了します");
                                    System.exit(1);
                                }
                                System.out.println("セーブしました");
                                aaaa = br.readLine();
                                sw3 = 0;
                            }else{
                                System.out.println("選択肢をちゃんと見ろw");

                                sw3 = 0;
                            }
                        }
                    }else{//モンスター遭遇確率が外れた場合//
                        System.out.println("モンスター現れた!!");
                        if (tika >= 9) {
                            System.out.println("*************** 強敵！！(回復をおススメします。)********************");
                        }else{
                        System.out.println();
                        }
                        System.out.println("どうする?");
                        System.out.println();
                        System.out.println(name + "HP>"+ hp);//HP表示//
						System.out.println(name + "MP>"+ mp);//HP表示//
                        System.out.println();
                        magickakuritu = 3;
                        kaisinritu = 9;
                        int sw6 = 0; //逃げるフラグ//
                        int sw5 = 0; //戦闘状態フラグ//
                        int monHP = (int)(Math.random() * 10 + lvmon); //モンスターのHPを乱数で決定//
                        while (sw5 == 0 && hp > 0) { //sw5が０かつ、HPが０でないとき繰り返す//
                            if(tika > 4){
                                System.out.println("モンスターのHP>"+monHP);
                            }
                            System.out.println();
                            System.out.println("1 攻撃(打撃攻撃)");
                            System.out.println("2 魔法攻撃(MPを4消費)");
                            System.out.println("3 アイテム（回復薬）");
                            System.out.println("4 逃げる(モンスターから逃げる)");
                            System.out.println("5 祈る(おすすめ！)");
                            System.out.println();
                            System.out.println("コマンドを入力してください(１ or ２ or ３ or ４ or ５)");
                            int sw4 = 0;
                            while (sw4 == 0) {
                                String sentaku1 = br.readLine();
                                System.out.println();
                                if(sentaku1.equals("1")) {
                                    System.out.println(name + "の攻撃");
                                    int attckkakuritu = (int)(Math.random() * 10);
                                    if (attckkakuritu > kaisinritu) {
                                        System.out.println("会心の一撃！");
                                        int attckpoint1 = (int)(Math.random() * 100 + power + lv);
                                        int attckpoint2 = (int)(Math.random() * 100 + power + lv);
                                        if(tika > 8){
                                            attckpoint1 = attckpoint1 * attckpoint2;
                                            monHP = monHP - attckpoint1;
                                            System.out.println(name + "は"+ attckpoint1 + "のダメージを与えた");
                                            aaaa = br.readLine();
                                            sw4 = 1;
                                        }else if(attckpoint1 > attckpoint2) {
                                            monHP = monHP - attckpoint1;
                                            System.out.println(name + "は"+ attckpoint1 + "のダメージを与えた");
                                            aaaa = br.readLine();
                                            sw4 = 1;
                                        }else{
                                            monHP = monHP - attckpoint2;
                                            System.out.println(name + "は"+ attckpoint2 + "のダメージを与えた");
                                            aaaa = br.readLine();
                                            sw4 = 1;
                                        }
                                    }else if (attckkakuritu > 1){
                                        if(tika >=6){
                                            int attckpoint = (int)(Math.random() * 10 + power + lv);
                                            int poison = attckpoint/2;
                                            monHP = monHP - attckpoint;
                                            System.out.println(name + "は"+ attckpoint + "のダメージを与えた");
                                            aaaa = br.readLine();
                                            monHP = monHP - poison;
                                            System.out.println("さらに" + name + "は"+ poison + "の毒のダメージを与えた");
                                            aaaa = br.readLine();
                                            sw4 = 1;
                                            if(tika >= 10) {
                                                System.out.println("さらに！！");
                                                aaaa = br.readLine();
                                                monHP = monHP - (attckpoint+poison+attckpoint);
                                                System.out.println(name + "は"+ (attckpoint+poison+attckpoint)+ "の大ダメージを与えた");
                                                aaaa = br.readLine();
                                            }
                                        }else{
                                        int attckpoint = (int)(Math.random() * 10 + power + lv);
                                        monHP = monHP - attckpoint;
                                        System.out.println(name + "は"+ attckpoint + "のダメージを与えた");
                                        aaaa = br.readLine();
                                        sw4 = 1;
                                        }
                                    }else {
                                        System.out.println("ミス！！");
                                        aaaa = br.readLine();
                                        System.out.println("攻撃がかわされた！");
                                        aaaa = br.readLine();
                                        sw4 = 1;
                                    }
                                }else if (sentaku1.equals("2")) {
									if(mp >= 4){
	                                    int magicjudge = (int)(Math.random() * 10);//魔法攻撃が当たる確率を決定//
	                                    int haitaseigyo = 0;
										mp = mp - 4;
	                                    while(haitaseigyo == 0){
	                                    magicattck1 = (int)(Math.random() * 10);//魔法１の攻撃力率算//
	                                    magicattck2 = (int)(Math.random() * 10);//魔法２の攻撃力率算//
	                                    if(tika >=11){
	                                        magicattck3 = (int)(Math.random() * 10);
	                                        int magicattck4 = (int)(Math.random() * 10);
	                                        int magicattck5 = (int)(Math.random() * 10);
	                                        int magicattck6 = (int)(Math.random() * 10);
	                                        magicattck  = magicattck1 * magicattck2 * magicattck3 * magicattck4 * magicattck5 * magicattck6;
	                                    }else if(tika >= 9){
	                                        magicattck3 = (int)(Math.random() * 10);
	                                        int magicattck4 = (int)(Math.random() * 10);
	                                        int magicattck5 = (int)(Math.random() * 10);
	                                        magicattck  = magicattck1 * magicattck2 * magicattck3 * magicattck4 * magicattck5;
	                                    }else if(tika >= 8){
	                                        magicattck3 = (int)(Math.random() * 10);
	                                        int magicattck4 = (int)(Math.random() * 10);
	                                        magicattck  = magicattck1 * magicattck2 * magicattck3 * magicattck4;
	                                    }else if(tika >= 7){
	                                        magicattck3 = (int)(Math.random() * 10);
	                                        magicattck  = magicattck1 * magicattck2 * magicattck3;
	                                    }else{
	                                        magicattck  = magicattck1 * magicattck2;//魔法１と魔法２を掛け合わせ、魔法攻撃力を算出//
	                                    }
	                                    if(magicattck < seigyo){
	                                        haitaseigyo = 0;
	                                    }else {
	                                        haitaseigyo = 1;
	                                    }
	                                    }
	                                    if(magicjudge > magickakuritu && magicattck > 0) {//攻撃魔法確率か規定値より上位どうかのIF//
	                                        System.out.println("成功！");
	                                        aaaa = br.readLine();
	                                        monHP = monHP - magicattck;
	                                        System.out.println(name + "は"+ magicattck + "のダメージを与えた");
	                                        aaaa = br.readLine();
	                                    }else if (magicattck == 0) {// 魔法攻撃力が０だった場合の時、ミスと表示//
	                                        System.out.println("ミス！");
	                                        aaaa = br.readLine();
	                                        System.out.println("モンスターに当らなかった・・");
	                                        aaaa = br.readLine();
	                                    }else{
	                                        System.out.println("失敗・・"); // 確率が規定値より下位の場合//
	                                        int hp2 = hp;
	                                        hp = hp - magicattck;
	                                        aaaa = br.readLine();
	                                        if (hp <= 0) {
	                                            magicattck = hp2 - 1;
	                                            System.out.println(name+"に"+magicattck + "のダメージ");
	                                            hp = 1;
	                                            System.out.println(name + "HP>1");
	                                            System.out.println();
	                                            sw5 = 0;
	                                        }else{
	                                            System.out.println(name+"に"+magicattck + "のダメージ");
	                                            System.out.println(name + "HP>"+ hp);
	                                            System.out.println();
	                                            sw5 = 0;
	                                        }
	                                    }
	                                    sw4 = 1;
									}else{
										System.out.println("MPが足りません");
									}
                                }else if (sentaku1.equals("3")) {
                                    if(aitemu > 0){
                                        int aitemusw = 0;
                                        while(aitemusw == 0){
                                            if(kaihuku > 0) {
                                                System.out.println("回復薬" + "*" + kaihuku);
                                                System.out.println();
                                                System.out.println("使いますか？");
                                                System.out.println();
                                                System.out.println("コマンドを入力してください(y or n)");
                                                String sentaku2 = br.readLine();
                                                if(sentaku2.equals("ｙ")){
                                                    zero = 0;
                                                    while(zero == 0){
                                                    System.out.println("いくつ使用しますか？（個数を入力してください）");
                                                    aaaa = br.readLine();
                                                    while(aaaa.equals("")){
                                                        System.out.println("いくつ使用しますか？（個数を入力してください）");
                                                        aaaa = br.readLine();
                                                    }
                                                    int nyuuryokukosu = Integer.parseInt(aaaa);
                                                    if (nyuuryokukosu <= kaihuku){
                                                        hp = hp + (kaihukuryo * nyuuryokukosu);
                                                        System.out.println("HPが"+(kaihukuryo * nyuuryokukosu)+"回復した！");
                                                        kaihuku = kaihuku - nyuuryokukosu;
                                                        aitemu = aitemu - nyuuryokukosu;
                                                        sw4 = 0;
                                                        aitemusw = 1;
                                                        zero = 1;
                                                        aaaa = br.readLine();
                                                        System.out.println(name + "HP" + hp);
														System.out.println(name + "MP>"+ mp);//HP表示//
                                                        System.out.println();
                                                        System.out.println("1 攻撃(打撃攻撃)");
                                                        System.out.println("2 魔法攻撃(MPを４消費)");
                                                        System.out.println("3 アイテム");
                                                        System.out.println("4 逃げる(モンスターから逃げる)");
                                                        System.out.println("5 祈る");
                                                        System.out.println();
                                                        System.out.println("コマンドを入力してください(１ or ２ or ３ or ４)");
                                                    }else{
                                                        System.out.println("そんなにないｗｗ");
                                                        aaaa = br.readLine();
                                                        aitemusw = 1;
                                                    }
                                                    }
                                                }else if (sentaku2.equals("ｎ")) {
                                                    sw4 = 0;
                                                    aitemusw = 1;
                                                    System.out.println("1 攻撃(打撃攻撃)");
                                                    System.out.println("2 魔法攻撃(MPを４消費)");
                                                    System.out.println("3 アイテム");
                                                    System.out.println("4 逃げる(モンスターから逃げる)");
                                                    System.out.println("5 祈る");
                                                    System.out.println();
                                                    System.out.println("コマンドを入力してください(１ or ２ or ３ or ４)");
                                                }else{
                                                    //System.out.println("選択肢を見ろよw");
                                                    System.out.println();
                                                    aitemusw = 0;
                                                }
                                            }
                                        }
                                    }else{
                                        System.out.println("アイテムは持っていません");
                                        sw4 = 0;
                                        System.out.println();
                                        System.out.println("コマンドを入力してください(１ or ２ or ３ or ４)");
                                    }
                                }else if (sentaku1.equals("4")){
                                    int escape = (int)(Math.random() * 10);
                                    if (escape > 4) {
                                    System.out.println("逃げた");
                                    sw4 = 1;
                                    monHP = 0;
                                    sw6 = 1;
                                    }else{
                                    System.out.println("逃げれなかったwww");
                                    sw4 = 1;
                                    }
                                }else if (sentaku1.equals("5")) {
                                    System.out.println(name+"は精一杯祈った・・・");
                                    aaaa = br.readLine();
                                    kaisinritu = kaisinritu - 3;
                                    magickakuritu = magickakuritu - 2;
                                    neru = neru - 2;
                                    System.out.println("会心率が上がった");
                                    aaaa = br.readLine();
                                    System.out.println("魔法成功率が上がった");
                                    aaaa = br.readLine();
                                    System.out.println("モンスターに遭遇しづらくなった！！");
                                    aaaa = br.readLine();
									System.out.println("mpが２回復した！！");
									mp = mp + 2;
                                    aaaa = br.readLine();
                                    sw4 = 1;
                                }else{
                                    System.out.println();
                                    System.out.println("1 攻撃(打撃攻撃)");
                                    System.out.println("2 魔法攻撃(MPを４消費)");
                                    System.out.println("3 アイテム");
                                    System.out.println("4 逃げる(モンスターから逃げる)");
                                    System.out.println("5 祈る");
                                    System.out.println();
                                    System.out.println("コマンドを入力してください(１ or ２ or ３ or ４)");
                                }
                            }
                        if(monHP > 0) {
                            System.out.println("モンスターの攻撃");
                            int monstermiss = (int)(Math.random() * 10);
                            if(monstermiss > 2){
                                int attckpoint = (int)(Math.random() * 10 + lvmon);
                                hp = hp - attckpoint;
                                System.out.println(name + "に" + attckpoint + "のダメージ");
                                aaaa = br.readLine();
                            }else{
                                System.out.println("ミス！！");
                                aaaa = br.readLine();
                                System.out.println(name+"はひらりと攻撃をかわした！");
                                aaaa = br.readLine();
                            }
                            if (hp <= 0) {
                                System.out.println(name + "HP>0");
                                System.out.println();
                                sw5 = 0;
                            }else{
                            System.out.println(name + "HP>"+ hp);
                            System.out.println();
                            sw5 = 0;
                            }
                        }else if (sw6 == 1) {
                            sw5 = 1;
                        }else{
                            System.out.println("勝利した");
                            aaaa = br.readLine();
                            victorycnt++;
                            sw5 = 1;
                            int plusHP = (int)(Math.random() * 10 + 1);
                            int aitemukakuritu = (int)(Math.random() * 10);
                            plusHP = plusHP * tika * 2;
                            hp = hp + plusHP;
                            System.out.println("HPが"+plusHP+"回復した");
                            if(aitemukakuritu > 2){
                                if(tika < 2) {
                                    aitemu = aitemu + 1;
                                    kaihuku = kaihuku + 1;
                                    System.out.println("回復薬１つ手に入れた");
                                    aaaa = br.readLine();
                                }else if (tika < 3){
                                    aitemu = aitemu + 2;
                                    kaihuku = kaihuku + 2;
                                    System.out.println("回復薬２つ手に入れた");
                                    aaaa = br.readLine();
                                }else if (tika < 4){{
                                    aitemu = aitemu + 6;
                                    kaihuku = kaihuku + 6;
                                    System.out.println("回復薬6つ手に入れた");
                                    aaaa = br.readLine();
                                }
                            }
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                            System.out.println();
                        }
                        if(victorycnt == fightcount) {
                            System.out.println("　　　　地下"+tika+"階　　　　clera!");
                            aaaa = br.readLine();
                            System.out.println("回復薬を"+(tika * 8)+"コ手に入れた！");
                            kaihuku = kaihuku + (tika * 8);
                            aitemu = aitemu + (tika * 8);
                            aaaa = br.readLine();
                            System.out.println("レベルが上がりました。");
                            aaaa = br.readLine();
							mp = 10;
                            lv = 2;
                            while(sw0 == 0) {
                                lvup = (int)(Math.random() * 10);
                                if(lvup < 4){
                                    sw0 = 0;
                                }else{
                                    sw0 = 1;
                                }
                            }
                            power = power + lvup;
                            System.out.println("攻撃力が"+lvup+"上がった。");
                            aaaa = br.readLine();
                            System.out.println("HPが"+(15 * tika)+"回復した");
                            hp = hp + (15 * tika);
                            aaaa = br.readLine();
                            tika = tika + 1;
							if(tika < 4){
                            	seigyo = 2 * tika * tika;
							}else if(tika < 8){
								seigyo = 7 * tika * tika;
							}else if(tika < 11){
								seigyo = 10 * tika * tika;
							}else if(tika < 13){
								seigyo = 15 * tika * tika;
							}else if(tika < 15){
								seigyo = 20 * tika * tika;
							}
                            if(tika == 5){
                                System.out.println("モンスターのHPが見えるようになった！");
                                aaaa = br.readLine();
                            }else if (tika == 4) {
                                System.out.println("魔法がもっと強力になった");
                                aaaa = br.readLine();
                            }else if (tika == 5) {
                                System.out.println("攻撃力がとてもあがった！！");
                                power = power + 50;
                                aaaa = br.readLine();
                            }else if (tika == 6) {
                                System.out.println("攻撃に「毒」の効果が追加された！！");
                                aaaa = br.readLine();
                                System.out.println("攻撃力がとてもあがった！！");
                                power = power + 100;
                                aaaa = br.readLine();
                                System.out.println("魔法がもっと強力になった");
                                aaaa = br.readLine();
                                System.out.println("回復する量があがった！！");
                                kaihukuryo = kaihukuryo + 30;
                                powerup = powerup + 1;
                                aaaa = br.readLine();
                            }else if (tika == powerup) {
                                System.out.println("攻撃力がとてもあがった！！");
                                power = power + 200;
                                aaaa = br.readLine();
                                System.out.println("魔法がもっと強力になった");
                                aaaa = br.readLine();
                                System.out.println("回復する量があがった！！");
                                kaihukuryo = kaihukuryo + 30;
                                powerup = powerup + 1;
                                aaaa = br.readLine();

                                }
                            if(tika == 10){
                                System.out.println("攻撃で「追加攻撃」を覚えた！");
                                aaaa = br.readLine();
                                System.out.println("回復薬を100コ手に入れた！");
                                kaihuku = kaihuku + 100;
                                aitemu = aitemu + 100;
                                System.out.println("回復する量がとてつもなくあがった！！");
                                kaihukuryo = kaihukuryo + 50;
                                aaaa = br.readLine();
                            }
                            lvmon = lvmon + 7 +lvmon;
                            victorycnt = 0;
                            sw2 = 0;
                            System.out.println("　　　　地下へ進みます");
                            aaaa = br.readLine();
                            fightcount = (int)(Math.random() * 10);
                            if (fightcount >= 7) {
                                fightcount = 3;
                            }else if (fightcount > 4) {
                                fightcount = 2;
                            }else {
                                fightcount = 1;
                            }
                        }
                        }if (hp <= 0){
                            System.out.println("ゲームオーバーw");
                            System.out.println(name + "さんの記録は・・・");
                            aaaa = br.readLine();
                            System.out.println("--------------------------------------------------");
                            System.out.println("地下"+tika+"階");
                            System.out.println(folre+"戦目です！");
                            sw = 1;
                            sw1 =0;
                            sw2 =1;
                            sw3 =1;
                            if (tika < 7) {
								System.out.println("あなたのランクは・・Ｃですｗｗ(平均以下やん)");
							}else if (tika < 10) {
								System.out.println("あなたのランクは・・Ｂです　(平均ですね)");
							}else if (tika < 11) {
								System.out.println("あなたのランクは・・Ａです！！　（すごすぎｗｗ）");
    						}else{
								System.out.println("あなたのランクは・・Ｓ？・・・え？まじで？（神ですね・・！）");
							}
                            aaaa = br.readLine();
                            System.out.println("ベストスコアは"+sinkirokuname+"さんの"+sintika+"です!!");
                        }
                        }
                    }
                }
            }
        }
    }
}