import java.util.Arrays;
import java.util.Comparator;

class Job {
    int id, profit, deadline;
    Job(int x, int y, int z){
        this.id = x;
        this.deadline = y;
        this.profit = z;
    }
}

class Solution {
    // Function to find the maximum profit and the number of jobs done.
    int[] JobScheduling(Job arr[], int n) {
        // Sort jobs in decreasing order of profit
        Arrays.sort(arr, new Comparator<Job>() {
            public int compare(Job a, Job b) {
                return b.profit - a.profit;
            }
        });

        // Find the maximum deadline to define the range of time slots
        int maxDeadline = 0;
        for (Job job : arr) {
            if (job.deadline > maxDeadline) {
                maxDeadline = job.deadline;
            }
        }

        // Array to keep track of free time slots
        boolean[] slots = new boolean[maxDeadline + 1];

        int jobCount = 0;
        int maxProfit = 0;

        // Iterate through the sorted jobs
        for (Job job : arr) {
            // Find a free slot for this job (starting from the last possible slot)
            for (int j = job.deadline; j > 0; j--) {
                if (!slots[j]) {
                    // Slot found
                    slots[j] = true;
                    jobCount++;
                    maxProfit += job.profit;
                    break;
                }
            }
        }

        return new int[]{jobCount, maxProfit};
    }

    public static void main(String[] args) {
        Job[] jobs = {
                new Job(1, 4, 20),
                new Job(2, 1, 10),
                new Job(3, 1, 40),
                new Job(4, 1, 30)
        };

        Solution solution = new Solution();
        int[] result = solution.JobScheduling(jobs, jobs.length);
        System.out.println("Number of jobs done: " + result[0]);
        System.out.println("Maximum profit: " + result[1]);
    }
}
