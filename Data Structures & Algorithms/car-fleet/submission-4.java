class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
    // First we will create a list of pairs of position and speed and sort it based on the position in descending order
    int n = position.length;
    List<int[]> cars = new ArrayList<>();
    for (int i = 0; i < n; i++) {
        cars.add(new int[]{position[i], speed[i]});
    }
    cars.sort((a, b) -> Integer.compare(b[0], a[0]));

    // Now we will traverse the list of cars and calculate the time taken by each car to reach the target and compare it with the time taken by the previous car to reach the target
    double[] timeTaken = new double[n];
    for (int i = 0; i < n; i++) {
        timeTaken[i] = (double) (target - cars.get(i)[0]) / cars.get(i)[1];
    }

    Stack<Double> stack = new Stack<>();
    for (int i = 0; i < n; i++) {
        if (stack.isEmpty() || timeTaken[i] > stack.peek()) {
            stack.push(timeTaken[i]);
        }
    }
    return stack.size();
}
}