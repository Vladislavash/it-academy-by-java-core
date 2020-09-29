public class task3lesson2 {
    public static void main(String[] args) {
        int s = 5920000;
        int sec;
        int m;
        int min;
        int h;
        int hour;
        int d;
        int day;
        int w;
        sec = s % 60;
        m = (s - sec) / 60;
        min = m % 60;
        h = (m - min) / 60;
        hour = h % 24;
        d = h / 24;
        day = d % 7;
        w = d / 7;
        System.out.println(w + "недель" + day + "дней" + hour + "часов" + min + "минут" + sec + "секунд" );
    }
}
