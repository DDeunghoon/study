import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class BeePrintExample1 {
    public static void main(String[] args) {
        List<View> views = new ArrayList<>();
        LocalDateTime time = LocalDateTime.now();
        views.add(new View("첫번째", 1, time));
        views.add(new View("두번째", 2, time));
        Page page = new Page();
        page.lamdaTest(views,View::getNow,1);
    }

    public static class Page {
        public <T, R> void lamdaTest(List<T> list, Function<T, R> cursorGetter, int limit) {
            if (list.size() > limit) {
                R cursorObject = cursorGetter.apply(list.get(limit));
                System.out.println(cursorObject);
                String cursor = Optional.ofNullable(cursorObject).map(String::valueOf).orElse(null);
                System.out.println(cursor);
                if (cursorObject instanceof LocalDateTime){
                    cursor = ((LocalDateTime)cursorObject).format(DateTimeFormatter.ISO_LOCAL_DATE_TIME);
                    System.out.println(cursor);
                }
            }
        }
    }

    public static class View {
        String name;
        int num;
        LocalDateTime now;

        public View(String name, int num, LocalDateTime now) {
            this.name = name;
            this.num = num;
            this.now = now;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public LocalDateTime getNow() {
            return now;
        }

        public void setNow(LocalDateTime now) {
            this.now = now;
        }


    }
    //   public static <T, R> Page<T> convert1(List<T> list, Function<T, R> cursorGetter, int limit, Long total) {
//       if (list.size() > limit) {
    //          R cursorObject = cursorGetter.apply(list.get(limit));
//            String cursor = Optional.ofNullable(cursorObject).map(String::valueOf).orElse(null);
//            if (cursorObject instanceof ZonedDateTime) {
//                cursor = ((ZonedDateTime) cursorObject).format(DateTimeFormatter.ISO_INSTANT);
//            }
//            return new Page<>(list.subList(0, limit), new Paging(total, cursor));
//        }
//        return new Page<>(list, new Paging(total, null));
//    }
//    List<QuickTakeView> quickTakeViews = convertQuickTakeViews(quickTakes, requestUserId);
//        return Page.convert(quickTakeViews, QuickTakeView::getCreatedAt, limit);

}
