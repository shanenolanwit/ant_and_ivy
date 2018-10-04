package shane.nolan.wit;
import com.shane.StupidClass;

/**
 * Broken Computer - Uses a StupidClass to calculate sums (not very well)
 * (This class requires StupidJar to be in it's classpath)
 * @author Shane Nolan
 *
 */
public class BrokenComputer {

	public static void main(String[] args) {
		int x = StupidClass.add(2,3);
		System.out.println("Two Plus Three is " + x);
	}

}
