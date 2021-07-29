import java.util.HashMap;
import java.util.Map;

public class NewSmartPhoneKeypad {
    public static void main(String[] args) {

            System.out.println(solution(new int[]{1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5}, "right"));

        
    }
    //keypad지정
    //손위치 지정
    //  왼손지정
    //  오른손지정
    //--  반복 --
    // 솔루션에 배열만큼 반복
    //솔루션에 배열로 들어온 숫자를 오른손으로 눌렀ㄴㄴ지 왼송ㄴ으로 눌럿는지 검증
    //  1,4,7이면 왼손으로 누를
    // L을 출력
    //왼손위치 지정
    //  3,6,9이면 오른손으로 누름
    // R을 출력
    //오른손 위치 지정
    //  2,5,8,0 이면 가까운 손가락으로누름
    //      가까운 손가락 판단
    //          두 손가락과 번호의 거리를피타고라스의 정의로 구한다
    //              만약 두 손가락의 거리가같다면
    //                  왼손잡이는 L출력 및 위치 지정
    //                  오른손잡이는 R출력  및 위치 지정
    //              거리가 다르다면
    //                  번호와 더 가까운 손가락 출력
    //                      번호와 갭차이가 더 작은 손가락 출력 및 위치 고정
    //
    //      가까운 손가락 출력
    //      가까운 손가락 이동
    //
    //      위치 고정
    //왼손과 오른손이 무조건 누르는 번호를 if문으로 지정
    //왼손잡이 일때 오른손 잡이일때 에 따라서 가까운 번호누르는 손가락 지정

    public static String solution(int[] numbers, String hand) {
        Map<String, Position> position = getKeyPad();
        Position leftHandPosition = position.get("*");
        Position rightHandPosition = position.get("#");

        String answer = "";
        for (int i = 0; i < numbers.length; i++) {
            int number = numbers[i];
            String setNumberPosition = Integer.toString(number);
            Position numberPosition = (position.get(setNumberPosition));
            double xMinusY = numberPosition.getX() - numberPosition.getY();
            double numberPositionValue = Math.pow(xMinusY, 2);
            double leftHandPositionValue = leftHandPosition.getX()-leftHandPosition.getY();
            double rightHandPositionValue =  rightHandPosition.getX() - rightHandPosition.getY();


            if (number == 1 || number == 4 || number == 7) {
                String setLeftHandPosition = Integer.toString(number);
                leftHandPosition = position.get(setLeftHandPosition);
                answer = "L";
                break;
            } else if (number == 3 || number == 6 || number == 9) {
                String setRightHandPosition = Integer.toString(number);
                rightHandPosition = position.get(setRightHandPosition);
                answer = "R";
                break;
            } else if(Math.sqrt(numberPositionValue+leftHandPositionValue) < Math.sqrt(rightHandPositionValue+numberPositionValue)) {
                answer = "L";
                break;
            }else if (Math.sqrt(numberPositionValue+leftHandPositionValue) > Math.sqrt(rightHandPositionValue+numberPositionValue)) {
                answer = "R";
                break;
            }else{
                answer = hand;
                break;
            }
        }
        return answer;
    }

    public static Map getKeyPad() {
        Map<String, Position> keyPadPosition = new HashMap<String, Position>();
        keyPadPosition.put("1", new Position(0, 0));
        keyPadPosition.put("2", new Position(1, 0));
        keyPadPosition.put("3", new Position(2, 0));
        keyPadPosition.put("4", new Position(0, 1));
        keyPadPosition.put("5", new Position(1, 1));
        keyPadPosition.put("6", new Position(2, 1));
        keyPadPosition.put("7", new Position(0, 2));
        keyPadPosition.put("8", new Position(1, 2));
        keyPadPosition.put("9", new Position(2, 2));
        keyPadPosition.put("*", new Position(0, 3));
        keyPadPosition.put("0", new Position(1, 3));
        keyPadPosition.put("#", new Position(2, 3));

        return keyPadPosition;
    }


}
