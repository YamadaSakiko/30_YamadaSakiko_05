import java.util.Scanner;

public class ColLesson03 {
    public static void main(String[] args) {


        Word[] words = new Word[10];

        System.out.println("わからない単語とその意味をスペースで区切って入力してください。");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int index = 0;
        while (!input.equals("e")) {
            String[] tmp = input.split(" ");
            Word wd = new Word(tmp[0], tmp[1]);
            try {
                words[index] = wd;
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("上限数をこえました");
                break;
            }
            index++;
            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
            input = sc.nextLine();

//        int index = 0;
//        while (!input.equals("e")) {
//            String[] tmp = input.split("");
//            Word wd = new Word(tmp[0], tmp[1]);
//            words[index] = wd;
//            index++;
//            System.out.println("次の単語と意味を入力してください。\"e\"で終了します。");
//            input = sc.nextLine();
//
//        }

//            for (int i = 0; i < index; i++) {
//                System.out.println("単語：" + words[i].word + "日本語：" + words[i].meaning);
//
//            }
//
//            System.out.println(index + "件、登録しました。");
        }
        for (int i = 0; i < index; i++) {
            System.out.println("単語：" + words[i].word + "日本語：" + words[i].meaning);

        }

        System.out.println(index + "件、登録しました。");


//    try{
//        words[index]=wd;
//    }
//    catch(IndesOutOfBoundsException e){
//        System.out.println("登録制限を越えました。登録済みのデータは以下になります。");
//        break;
//    }
    }
}
