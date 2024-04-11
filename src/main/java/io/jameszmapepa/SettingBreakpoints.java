package io.jameszmapepa;


public class SettingBreakpoints
{
    private int[] numbers;

    public SettingBreakpoints(int[] initialNumbers) {
        this.numbers = initialNumbers;
    }

    public void addNumber(int numberToAdd) {
        int[] newNumbers = new int[numbers.length + 1];
        System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
        newNumbers[numbers.length] = numberToAdd;
        numbers = newNumbers;
        System.out.println("Added: " + numberToAdd);
    }

    public void printNumbers() {
        System.out.println("Current Numbers:");
        for (int number : numbers) {
            System.out.println(number);
        }
    }

    public static void main(String[] args) {
        int[] initialNumbers = {1, 2, 3};
        SettingBreakpoints processor = new SettingBreakpoints(initialNumbers);

        processor.printNumbers();
        processor.addNumber(4);
        processor.printNumbers();
    }
}
