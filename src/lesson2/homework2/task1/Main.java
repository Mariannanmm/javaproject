package lesson2.homework2.task1;

public class Main {
    public static void main(String[] arg) {
        // 1. coordinates
        Geo geo = new Geo("-37.3159", "81.1496");

        // 2. add address
        Address address = new Address("Kulas Light", "Apt. 556", "Gwenborough", "92998-3874", geo);

        // 3. company
        Company company = new Company("Romaguera-Crona", "Multi-layered client-server neural-net", "harness real-time e-markets");

        // 4. user info+address+phone+web+company
        User user = new User(1, "Leanne Graham", "Bret", "Sincere@april.biz", address, "1-770-736-8031 x56442", "hildegard.org", company);


        System.out.println("====== My User ======");
        System.out.println(user);
    }

}
