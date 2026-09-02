package String;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String str = "programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {

            boolean duplicate = false;

            for (int j = 0; j < result.length(); j++) {

                if (str.charAt(i) == result.charAt(j)) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                result = result + str.charAt(i);
            }
        }

        System.out.println(result);


	}

}
