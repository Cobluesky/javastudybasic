package kakao.study.files;

import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class logMaain {
    public static void main(String[] args) {
        //파일 경로 확인
        File file = new File("log.txt");
        System.out.println(file.exists());

        //문자열을 읽기 위한 스트림을 생성;
        Map<String, String> ipAddressMap = new HashMap<String, String>();
        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            while (true) {
                String log = br.readLine();
                if (log == null) {
                    break;
                }

                //공백을 기준으로 분할
                String[] ar = log.split(" ");

                String ipAddress = ar[0];
                String domains = ar[ar.length - 4];


                ipAddressMap.put(ipAddress, domains);

            }
        } catch (Exception e) {
            System.out.println("Wut");
        }

        try (PrintWriter pw = new PrintWriter("ips.txt")) {
            for (String key : ipAddressMap.keySet()) {
                String Data = "IP Address : " + key + " / Domains : " + ipAddressMap.get(key);
                pw.println(Data);
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        System.out.println(ipAddressMap);

    }
}
