import java.util.*;

class Meeting {
    int start;
    int end;

    Meeting(int s, int e) {
        start = s;
        end = e;
    }
}

public class MaxMeetings {

    public static int maxMeetings(int[] start, int[] end, int n) {

        Meeting[] meetings = new Meeting[n];

        for(int i = 0; i < n; i++) {
            meetings[i] = new Meeting(start[i], end[i]);
        }

        Arrays.sort(meetings, (a, b) -> a.end - b.end);

        int count = 1;
        int lastEnd = meetings[0].end;

        for(int i = 1; i < n; i++) {

            if(meetings[i].start > lastEnd) {
                count++;
                lastEnd = meetings[i].end;
            }
        }

        return count;
    }

    public static void main(String[] args) {

        int start[] = {1,3,0,5,8,5};
        int end[]   = {2,4,6,7,9,9};

        int n = start.length;

        System.out.println("Maximum meetings: " + maxMeetings(start,end,n));
    }
}