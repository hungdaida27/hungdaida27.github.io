public enum Category {
    CPU("Vi xử lý"), MAIN("Bo mạch chủ"), RAM("Bộ nhớ"), VGA("Card đồ họa"), PSU("Nguồn máy tính"), SSD("Ổ cứng");

    private String value;

    private Category(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

}
