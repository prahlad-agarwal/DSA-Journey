class Solution {
    public String reformatDate(String date) {
        String[] dates = date.split(" ");

        String year = dates[2];
        String month = getMonth(dates[1]);
        String day = dates[0].substring(0, dates[0].length() - 2).length() == 1 ? "0"+dates[0].charAt(0) : dates[0].substring(0, 2);

        return (year + "-" + month + "-" + day);
    }

    private static String getMonth(String s) {
        switch (s) {
            case "Jan":
                return "01";
            case "Feb":
                return "02";
            case "Mar":
                return "03";
            case "Apr":
                return "04";
            case "May":
                return "05";
            case "Jun":
                return "06";
            case "Jul":
                return "07";
            case "Aug":
                return "08";
            case "Sep":
                return "09";
            case "Oct":
                return "10";
            case "Nov":
                return "11";
            case "Dec":
                return "12";
            default:
                return "0";
        }
    }
}