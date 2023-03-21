package 백준;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class 회의실배정_클래스적용 {
	 public static int getSchedule(Meeting[] m) {

	        Arrays.sort(m); // 회의 종료시간(오름) 순서대로 정렬
	        int beforeEnd = m[0].end; // 첫번째 회의 확정
	        int cnt = 1;
	        for (int j = 1; j < m.length; j++) {
	            // 확정된 앞 회의의 종료시간이 다음 회의시작보다 같거나 크다면 회의 확정
	            if (beforeEnd <= m[j].start) {
	                ++cnt;
	                beforeEnd = m[j].end;
	            }
	        }
	        return cnt;
	    }

	    public static void main(String[] args) throws NumberFormatException, IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        int count = Integer.parseInt(br.readLine().trim());
	        Meeting m[] = new Meeting[count];

	        StringTokenizer st = null;
	        for (int i = 0; i < count; i++) {
	            st = new StringTokenizer(br.readLine());
	            m[i] = new Meeting(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
	        }
	        System.out.println(getSchedule(m));
	    }
	    static class Meeting implements Comparable<Meeting> {
	        int start;
	        int end;
	        
	        public Meeting(int start, int end) {
	            super();
	            this.start = start;
	            this.end = end;
	        }

	        @Override
	        public int compareTo(Meeting o) {
	        	if(this.end == o.end)
	        		return this.start - o.start;
	        	return this.end - o.end;
	        	
//	            int value = Integer.compare(end , o.end); 
//	            if(value != 0){ // 종료시간이 다르다면
//	                return value;
//	            }
//	            return Integer.compare(start, o.start); // 종료시간이 같을 경우 시작시간이 빠른 순으로 정렬되도록 한다.
	        }
	    }
	}