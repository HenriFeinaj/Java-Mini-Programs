import java.util.Scanner;

public class NameAge {

    public static void main (String[] args) {
        
        String[] name = new String[10];
        int[] age = new int[10];
        Scanner in = new Scanner(System.in);

        String nameMessage = ("Please enter name: ");
        String ageMessage = ("Please enter age: ");

        int count = 0;
        
        while (count < 10) {
            System.out.println(nameMessage);
            String getName = in.next();
            
            if (getName.equalsIgnoreCase("done")) {  //This is used as an command where the user terminates the program.
                break;
            }
			
            name[count] = getName;
            System.out.println(ageMessage);
            age[count] = in.nextInt();
			
			if (age[count] >= 150) {  //Avoids the case of age being above 150.
				break;
			}
			
            count++;
        }

        int[] minAndMaxIndex = findMinAndMaxIndex(age, count);
        
        System.out.println("The youngest person among all is: " + name[minAndMaxIndex[0]]);
        System.out.println("The oldest person among all is: " + name[minAndMaxIndex[1]]);

    }

    public static int[] findMinAndMaxIndex(int[] inputArray, int count) {
        
        int min = 0;
        int max = 0;
        int minIndex = 0, maxIndex = 0;
        max = min = inputArray[0];

        for (int i = 0; i < count; i++) {
            
            if (inputArray[i] > max) {
                maxIndex = i;
            }
            else if (inputArray[i] < min) {
                minIndex = i;
            }

        }
        return new int[] { minIndex, maxIndex };
    }

} 