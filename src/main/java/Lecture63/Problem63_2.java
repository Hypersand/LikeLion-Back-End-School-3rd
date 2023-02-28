package Lecture63;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Problem63_2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<Device> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            list.add(new Device(a, b));
        }

        Collections.sort(list, new Comparator<Device>() {
            @Override
            public int compare(Device o1, Device o2) {
                return o1.id - o2.id;
            }
        });

        for (Device device : list) {
            System.out.println(device.id + " " + device.gas);
        }
    }

    public static class Device {
        int id;
        int gas;

        public Device(int id, int gas) {
            this.id = id;
            this.gas = gas;
        }
    }
}
