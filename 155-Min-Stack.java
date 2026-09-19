class MinStack {

    Deque<Long> stk;
    long mini;

    public MinStack() {
        stk = new ArrayDeque<>();
        mini = Long.MAX_VALUE;
    }

    public void push(int value) {

        if (stk.isEmpty()) {
            mini = value;
            stk.push((long) value);
        }
        else {
            if (value >= mini) {
                stk.push((long) value);
            }
            else {
                stk.push(2L * value - mini);
                mini = value;
            }
        }
    }

    public void pop() {

        if (stk.isEmpty()) {
            return;
        }

        long x = stk.pop();

        if (x < mini) {
            mini = 2L * mini - x;
        }
    }

    public int top() {

        if (stk.isEmpty()) {
            return -1;
        }

        long x = stk.peek();

        if (x >= mini) {
            return (int) x;
        }

        return (int) mini;
    }

    public int getMin() {
        return (int) mini;
    }
}