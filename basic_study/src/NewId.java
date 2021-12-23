public class NewId {


    class Solution {
        public String solution(String new_id) {
            new_id = new_id.toLowerCase() // 1번
                    .replaceAll("[^a-z0-9-._]", "") // 2번
                    .replaceAll("[.]{2,}", ".") // 3번
                    .replaceAll("^[.]|[.]$", ""); // 4번

            if (new_id.length() == 0) new_id = "a"; // 5번

            if (new_id.length() > 15)
                new_id = new_id.substring(0, 15).replaceAll("\\.$",""); // 6번

            if (new_id.length() <= 2) {
                for (int i=new_id.length(); i< 3 ; i++){
                    new_id += new_id.charAt(new_id.length()-1);
                }

            }
            return new_id;
        }
    }
}
