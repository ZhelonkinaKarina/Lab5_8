package Lab5_8;

public class BranchingPrograms {
public static void main(String[] args) {
		
		//Завдання 1
		int n = 67;
		if (n >= 50 && n <= 100){
			System.out.println("Число " + n + " міститься в проміжку (50; 100)");
		}else {
			System.out.println("Число " + n + " не міститься в проміжку (50; 100)");
		}
		
		//Завдання 2
		int k = 358;
		int max = 0;
		while (k>0) {
			 int number = k % 10; 
	         if (number > max) { 
	                max = number;
	            }
	    k/= 10;
		}
		System.out.println("Найбільша цифра числа це " + max);
		
		//Завдання 3
		int floor = 2;
		String direction = "Донизу";
		if (floor >= 1 && floor <= 9) {
			if (direction == "Догори") {
				if (floor==2) {
					System.out.println("Кнопка 2-го поверху не працює! Ви піднялись на 3-й поверх!");
				} else {
					System.out.println("Ви піднялись на " + floor + "-й поверх!");
				}
			} else if (direction == "Донизу") {
				if (floor==2) {
					System.out.println("Кнопка 2-го поверху не працює! Ви спустились на 1-й поверх!");
			} else {
				System.out.println("Ви спустились на " + floor + "-й поверх!");
			}
		}
	}
				
		//Завдання 4
		String choice = "Yes";

        switch (choice){
            case "Так":
            case "OK":
            case "Yes":
            case "Y":
            case "+":
            case "Ok":
                System.out.println("Я погоджуюсь!");
                break;
            case "Ні":
            case "NO":
            case "N":
            case "-":
            case "No":
                System.out.println("Я відмовляюсь!");
                break;
        }
	}

}
