package Week5;

import java.util.Scanner;

public class QueueUsingTwoStacks {
    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for (int i = 0; i < n; i++) {
            int num = scan.nextInt();
            switch (num) {
                case 1:
                    queue.enqueue(scan.nextInt());      // enqueue
                    break;
                case 2:
                    queue.dequeue();                    // dequeue
                    break;
                case 3:
                    System.out.println(queue.peek());   // print/peek
                    break;
            }
        }
        scan.close();
    }

    public static class MyQueue<T> {
        private Stack<T> stack1 = new Stack<>();
        private Stack<T> stack2 = new Stack<>();

        /**
         *  Đẩy các phần tử trong ngăn xếp vào trong stack1 (In).
         *  Queue:
         * --------------------------------------------------------------------------
         *       |              |              |       15      |      8     |   4
         * --------------------------------------------------------------------------
         * Stacks:
         * |           |                       |           |
         * -------------                       -------------
         * |    15     |                       |           |
         * -------------                       -------------
         * |    8      |                       |           |
         * -------------                       -------------
         * |    4      |                       |           |
         * -------------                       -------------
         *  stack1 (In)                         stack2(Out)
         */
        public void enqueue(T num) {
            stack1.push(num);
        }

        /**
         * Nếu stack2 trống, pop tất cả các phần tử của stack1 (In) push vào stack2 (Out) và sau đó pop lại từ stack2 (Out).
         * Queue:
         * --------------------------------------------------------------------------
         *       |              |              |       15      |      8     |   4
         * --------------------------------------------------------------------------
         * Stacks:
         * |           |                       |           |
         * -------------                       -------------
         * |           |                       |    4      |
         * -------------                       -------------
         * |           |                       |    8      |
         * -------------                       -------------
         * |           |                       |    15     |
         * -------------                       -------------
         *  stack1 (In)                         stack2(Out)
         */
        public T dequeue() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return null;
            }
            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        /**
         * Tương tự như dequeue, thay vì pop chỉ thực hiện thao tác peek.
         */
        public T peek() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return null;
            }
            if (stack2.isEmpty()) {
                while ( ! stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }
    }
}