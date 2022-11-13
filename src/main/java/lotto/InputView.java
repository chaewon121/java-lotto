package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static lotto.practice.InputView.inputPurchase;
import static lotto.practice.InputView.inputWinLotto;

public class InputView {

    private static final String INPUT_PURCHASE_MESSAGE = "구입금액을 입력해 주세요.";
    private static final String INPUT_WIN_LOTTO_MESSAGE = "당첨 번호를 입력해 주세요.";

    public static int inputPurchase() {
        System.out.println(INPUT_PURCHASE_MESSAGE);
        String purchase = Console.readLine();
        return Integer.parseInt(purchase);
    }

    public static List<Integer> inputWinLotto() {
        System.out.println(INPUT_WIN_LOTTO_MESSAGE);
        String lottoNumbers = Console.readLine();
        return Arrays.stream(lottoNumbers.split(","))
                .map(Integer::parseInt)
                .collect(Collectors.toList());
    }
}
