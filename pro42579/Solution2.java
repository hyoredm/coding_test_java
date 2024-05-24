package pro42579;

import java.util.*;

class Solution2 {

    static class Music implements Comparable<Music> {
        int idx;
        String genre;
        int play;

        public Music(int idx, String genre, int play) {
            this.idx = idx;
            this.genre = genre;
            this.play = play;
        }

        @Override
        public int compareTo(Music m) {
            if (this.genre.equals(m.genre)) {
                if (this.play == m.play) {
                    return this.idx - m.idx;
                }
            }
            return m.play - this.play;
        }
    }

    public int[] solution(String[] genres, int[] plays) {
        int len = genres.length;

        Map<String, Integer> map = new HashMap<>();
        List<Music> list = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            map.put(genres[i], map.getOrDefault(genres[i], 0) + plays[i]);
            list.add(new Music(i, genres[i], plays[i]));
        }

        List<String> l = new ArrayList<>(map.keySet());
        Collections.sort(l, (a, b) -> map.get(b) - map.get(a));
        Collections.sort(list);

        List<Integer> result = new ArrayList<>();
        for (String s : l) {
            int cnt = 0;
            for (Music m : list) {
                if (s.equals(m.genre)) {
                    result.add(m.idx);
                    cnt++;
                }
                if (cnt == 2) {
                    break;
                }
            }
        }

        int[] answer = new int[result.size()];
        for (int i = 0; i < result.size(); i++) {
            answer[i] = result.get(i);
        }

        return answer;
    }
}
