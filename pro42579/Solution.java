package pro42579;

import java.util.*;

class Solution {

    static class Song {
        int num;
        int idx;

        public Song(int num, int idx) {
            this.num = num;
            this.idx = idx;
        }
    }



    public int[] solution(String[] genres, int[] plays) {
        int[] answer = {};

        Map<String, Integer> sum_genres = new HashMap<>();

        for(int i = 0; i < genres.length; i++) {
            sum_genres.put(genres[i], sum_genres.getOrDefault(genres[i], 0) + plays[i]);
        }

        List<String> genreSort = new ArrayList<>(sum_genres.keySet());

        genreSort.sort((o1, o2) -> sum_genres.get(o2).compareTo(sum_genres.get(o1)));

        Map<Integer, String> song_list = new HashMap<>();

        for(int i = 0; i < plays.length; i++) {
            song_list.put(plays[i], genres[i]);
        }

        List<Integer> numSort = new ArrayList<>(song_list.keySet());

        Collections.reverse(numSort);

        Map<String, ArrayList<Song>> result = new HashMap<>();

        for (String key : sum_genres.keySet()) {
            result.put(key, new ArrayList<>());
        }

        for (int s : song_list.keySet()) {
            result.get(song_list.get(s)).add(new Song(s, Arrays.asList(plays).indexOf(s)));
        }

        answer = new int[2];

        Queue<Integer> q = new LinkedList<>();

        for (String a : result.keySet()) {
            for(int i = 0; i < result.get(a).size(); i++) {
            q.offer(result.get(a).get(i).idx);
            }
        }

        for(int i = 0; i < 2; i++) {
            answer[i] = q.poll();
        }




        return answer;
    }
}
