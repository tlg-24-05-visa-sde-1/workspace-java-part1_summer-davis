package come.randomnumber.client;

import com.randomnumber.RandomNumFrequency;

class RandomNumFrequencyClient {

  public static void main(String[] args) {

    // instantiate object
    RandomNumFrequency number = new RandomNumFrequency();

    // create array of 1000 numbers
    int[] randomNumbers = new int[1000];
    // track index
    int count = 0;

    // generate array of 1000 random numbers
    while (count < 1000) {
      randomNumbers[count] = number.randomInt(1, 20);
    }

    // create a result array
    int[] results = new int[1000];

    // create a count array
    int[] resultCounts = new int[1000];

    // iterate through the array and count occurrences of each result
    for (int num : randomNumbers) {
      // put result in
    }
  }
}
