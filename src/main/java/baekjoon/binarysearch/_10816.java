package baekjoon.binarysearch;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class _10816 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

		// init
		int n = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		Map<Integer, Integer> map = new HashMap<>();
		while (st.hasMoreTokens()) {
			int k = Integer.parseInt(st.nextToken());
			map.put(k, map.getOrDefault(k, 0) + 1);
		}
		int m = Integer.parseInt(br.readLine());
		st = new StringTokenizer(br.readLine());
		for (int i = 0; i < m; i++) {
			int k = Integer.parseInt(st.nextToken());
			bw.write(String.valueOf(map.getOrDefault(k, 0)) + " ");
		}

		bw.flush();
		bw.close();
	}
}
