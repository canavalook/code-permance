import java.math.RoundingMode;
import java.text.DecimalFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
	    String[] input = {"abcd123.456", "asdf1", "fef22.3441", "a.1.1", "a.1.a", "a.1", "a0.1"};
	    Pattern pattern = Pattern.compile("\\d+(\\.\\d+)?");
	    Matcher matcher;
	    for(int i = 0; i < input.length; i++) {
	        matcher = pattern.matcher(input[i]);
	        if (matcher.find()) {
	            Double numD = Double.valueOf(matcher.group());
	            DecimalFormat dFormat = new DecimalFormat("0.00");
	            dFormat.setRoundingMode(RoundingMode.DOWN);
	            System.out.println(dFormat.format(numD));
	            
	        }
	    }
	}
}
