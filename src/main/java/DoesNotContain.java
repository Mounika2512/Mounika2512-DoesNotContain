public class DoesNotContain {

    /**
     * The inverse of the contains value challenge: check if the array does not contain the value.
     * You should think critically about the logic that you write within the for loop.
     *
     * For a trickier problem like this, you should try explaining your thought process of working
     * through this problem with pencil and paper in plain English before attempting it in code.
     * For instance: for the contains problem, your code had to check every value to see if the value
     * matches the target, and if it matched the target, the array was sure to contain the target. Think
     * of a similar process here.
     *
     * @param arr the array we will be manipulating.
     * @param target the value we are searching for.
     * @return true if arr does not contain target. false otherwise.
     */
    public boolean arrayDoesNotContain(int[] arr, int target) {
        // Iterate through the array
        for (int value : arr) {
            // Check if the current value matches the target
            if (value == target) {
                // If a match is found, return true (array does not contain target)
                return false;
            }
        }
        // If the loop completes without finding a match, return false (array contains target)
        return true;
    }

    // Example usage:
    public static void main(String[] args) {
        DoesNotContain doesNotContain = new DoesNotContain();
        
        int[] exampleArray = {1, 2, 3, 4, 5};
        int targetValue = 6;

        boolean result = doesNotContain.arrayDoesNotContain(exampleArray, targetValue);

        System.out.println("Array does not contain " + targetValue + ": " + result);
    }
}