import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VietnameseLatin {
    private static final String[] VIETNAMESE_pure = {"ă", "â", "đ", "ê", "ô", "ơ", "ư"};
    private static final String[] VIETNAMESE_write = {"aw", "aa", "dd", "ee", "oo", "ow", "w"};

    public static List<String> getVietnamese(String input) {
        List<String> vietnamese = new ArrayList<>();
        int inputLength = input.length();
        for (int i = 0; i < inputLength; i++) {
            for (int j = 0; j < VIETNAMESE_pure.length; j++) {
                if (input.startsWith(VIETNAMESE_write[j], i)) {
                    vietnamese.add(VIETNAMESE_write[j]);
                    i += VIETNAMESE_write[j].length() - 1;
                    break;
                }

            }
        }
        return vietnamese;
    }

    public static void main(String[] args) {
        Scanner write = new Scanner(System.in);
        System.out.println("nhập chuỗi của bạn : ");
        String input = write.nextLine();
        List<String> VietnamLetters = getVietnamese(input);
        int Countsize = VietnamLetters.size();

        System.out.println("Output: " + Countsize + " " + VietnamLetters);
    }
}
