public class TwelveDays429 {
    public static void main(String[] args) {
        
        String opening = null;
        for (int day = 1; day <= 12; day++) {
            //int day = 2;
            //String opening;
            switch (day) {
                case 1:
                    opening = "On the first day of Christmas, my true love sent to me";
                    break;
                case 2:
                    opening = "On the second day of Christmas, my true love sent to me";
                    break;
                case 3:
                    opening = "On the third day of Christmas, my true love sent to me";
                    break;
                case 4:
                    opening = "On the fourth day of Christmas, my true love sent to me";
                    break;
                case 5:
                    opening = "On the fifth day of Christmas, my true love sent to me";
                    break;
                case 6:
                    opening = "On the sixth day of Christmas, my true love sent to me";
                    break;
                case 7:
                    opening = "On the seventh day of Christmas, my true love sent to me";
                    break;
                case 8:
                    opening = "On the eight day of Christmas, my true love sent to me";
                    break;
                case 9:
                    opening = "On the ninth day of Christmas, my true love sent to me";
                    break;
                case 10:
                    opening = "On the tenth day of Christmas, my true love sent to me";
                    break;
                case 11:
                    opening = "On the eleventh day of Christmas, my true love sent to me";
                    break;
                default:
                    opening = "On the twelfth day of Christmas, my true love sent to me";
                    break;
            } 
            System.out.println();
            System.out.println(opening);
            
            
            for (int line = day; line >= 1; line--) {
                String lyric;
                switch (line) {
                    case 1:
                        lyric = "A partridge in a pear tree.";
                        break;
                    case 2:
                        lyric = "Two turtle doves";
                        break;
                    case 3:
                        lyric = "Three French hens,";
                        break;
                    case 4:
                        lyric = "Four calling birds,";
                        break;
                    case 5:
                        lyric = "Five golden rings,";
                        break;
                    case 6:
                        lyric = "Six geese a-laying,";
                        break;
                    case 7:
                        lyric = "Seven swans a-swimming,";
                        break;
                    case 8:
                        lyric = "Eight maids a-milking,";
                        break;
                    case 9:
                        lyric = "Nine ladies dancing,";
                        break;
                    case 10:
                        lyric = "Ten lords a-leaping,";
                        break;
                    case 11:
                        lyric = "Eleven pipers piping,";
                        break;
                    default:
                        lyric = "Twelve drummers drumming,";
                        break;
                } 
                System.out.println(lyric);
            }

            
        }

        
    }
}
