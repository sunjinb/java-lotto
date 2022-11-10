package lotto;

import lotto.UI.Input;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) throws IOException {
        Input input = new Input();
        int haveLottoCount = input.howMuchLotto();
        List<Integer> luckyNumbers = new ArrayList<>();
        luckyNumbers = input.getLuckyNumber();

        // [x] 잘못된 입력 받을 시에 IllegalArgumentException을 발생시키고 "[ERROR]"로 시작하는 에러 메시지 출력 후 종료한다.
        // [x] 로또 구입 금액 입력 받기  (1000원 단위로, 나누어떨어지지 않는다면 예외 처리)

        // [x] 중복되지 않는 숫자를 입력 받아야 한다.
        // [x] 당첨 번호 입력 받기 (ex - 1,2,3,4,5,6)
        // [] 보너스 번호를 입력 받기 ( ex - 7)


        // [] 발행한 로또 수량 및 번호를 출력한다. 로또 번호는 오름 차순으로 정렬
        // [] 당첨 내역 출력
        // [] 수익률은 소수점 둘째 자리에서 반올림
        // [] 예외 상황 시 에러 문구 출력
    }
}
