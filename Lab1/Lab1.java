import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Lab1{
	public static void printDistinctNumbers(){
		int[] inputs = new int[10];
		String output = "";
		Scanner input = new Scanner(System.in);
		int i = 0; // Counter for input
		while(i < 10){
			int j = 0; // Counter for array
			System.out.println("Print a number");
			int potInp = input.nextInt();
			boolean inArray = false;
			for(int x = 0; x < j + 1; x++){
				if(potInp == inputs[x]){
					inArray = true;
					break;
				}
			}
			if(!inArray){
				inputs[j] = potInp;
				j++;
				output += potInp + " ";
			}
			i++;
		}
		System.out.println("Distint numbers: " + output);
	}

	public static void estimateTiming(){
		int[] numbers = new int[100000];
		Random random = new Random();
		for(int i = 0; i < 100000; i++){
			numbers[i] = random.nextInt(100000);
		}
		int key = numbers[random.nextInt(100000)];
		Arrays.sort(numbers);
		// Estimate linearSearch execution time.
		long startTime = System.currentTimeMillis();
		//System.out.println(startTime);
		for(int i = 0; i < 100000; i++){
			if(numbers[i] == key){
				break;
			}
		}
		long endTime = System.currentTimeMillis();
		//System.out.println(endTime);
		long totalTime = endTime - startTime;
		System.out.println("Execution time for linearSearch was " + totalTime + " millisecond.");
		startTime = System.currentTimeMillis();
		//System.out.println(startTime);
		binarySearch(numbers, key);
		endTime = System.currentTimeMillis();
		//System.out.println(endTime);
		totalTime = endTime - startTime;
		System.out.println("Execution time for binarySearch was " + totalTime + " millisecond.");
	}

	public static int binarySearch(int[] list, int key) {
		int low = 0;
		int high = list.length - 1;
		while (high >= low) {
			int mid = (low + high) / 2;
			if (key < list[mid])
				high = mid - 1;
			else if (key == list[mid])
				return mid;
			else
				low = mid + 1;
		}
		return -1 - low;
	}

	public static void ticTacToe(){
		Scanner scanner = new Scanner(System.in);
		char[][] board = new char[3][3];
		int turn = 1;
		boolean win = false;
		int row = 0, col = 0;
		while(turn < 9 || win != false){
			if(turn % 2 == 1){
				boolean restartTurn = true;
				while(restartTurn){
					boolean contTurn = false;
					while(contTurn == false){
						System.out.println("Player one pick a row to put your X token");
						row = scanner.nextInt();
						if(row > 3 || row < 0){
							System.out.println("Invalid number");
						}
						else{
							contTurn = true;
						}
					}
					contTurn = false;
					while(contTurn == false){
						System.out.println("Player one pick a colum to put your X token");
						col = scanner.nextInt();
						if(col > 3 || col < 0){
							System.out.println("Invalid number");
						}
						else{
							contTurn = true;
						}
					}
					if(board[row][col] != 0){
						System.out.println("Token already on specified spot");
					}
					else{
						board[row][col] = 'X';
						turn++;
						restartTurn = false;
					}
				}
			}
			else{
				boolean restartTurn = true;
				while(restartTurn){
					boolean contTurn = false;
					while(contTurn == false){
						System.out.println("Player two pick a row to put your O token");
						row = scanner.nextInt();
						if(row > 3 || row < 0){
							System.out.println("Invalid number");
						}
						else{
							contTurn = true;
						}
					}
					contTurn = false;
					while(contTurn == false){
						System.out.println("Player two pick a colum to put your O token");
						col = scanner.nextInt();
						if(col > 3 || col < 0){
							System.out.println("Invalid number");
						}
						else{
							contTurn = true;
						}
					}
					if(board[row][col] != 0){
						System.out.println("Token already on specified spot");
					}
					else{
						board[row][col] = 'O';
						turn++;
						restartTurn = false;
					}
				}
			}

			// Check for win
			if(board[0][0] == board[0][1] && board[0][1] == board[0][2] && board[0][0] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[1][0] == board[1][1] && board[1][1] == board[1][2] && board[1][0] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[2][0] == board[2][1] && board[2][1] == board[2][2] && board[2][0] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[0][0] == board[1][0] && board[1][0] == board[2][0] && board[0][0] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[0][1] == board[1][1] && board[1][1] == board[2][1] && board[0][1] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[0][2] == board[1][2] && board[1][2] == board[2][2] && board[0][2] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[0][0] == board[1][1] && board[1][1] == board[2][2] && board[0][0] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
			else if(board[0][2] == board[1][1] && board[1][1] == board[2][0] && board[0][2] != 0){
				System.out.println("Player " + turn % 2 + " wins");
				win = true;
			}
		}
	}

	public static void howManyCollatzIterations(int n){
		int i = 0; // Iterations
		String sequence = "";
		while(n != 1){
			if(n % 2 == 1){
				n = n * 3 + 1;
			}
			else{
				n /= 2;
			}
			sequence += n + " ";
			i++;
		}
		System.out.println("Number of iterations returned by the method is " + i);
		System.out.println("Sequence: " + sequence);
	}

	public static void main(String[] args){
		//ticTacToe();
		printDistinctNumbers();
		//estimateTiming();
		//howManyCollatzIterations(10);
		//howManyCollatzIterations(100);
		//howManyCollatzIterations(53);

	}
}