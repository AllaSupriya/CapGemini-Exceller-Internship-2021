package Day1;
import java.util.*;

public class TotalAndAverageMarks {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int englishMarks = sc.nextInt();
		int java = sc.nextInt();
		int db = sc.nextInt();
		int springTools = sc.nextInt();
		double total_marks =  englishMarks + java + db + springTools;
		double avg_marks = total_marks/4;
		System.out.println("totalMarks:"+total_marks);
		System.out.println("Avg Marks:"+avg_marks);
	}
}
