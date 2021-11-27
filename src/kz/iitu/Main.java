package kz.iitu;

import java.io.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) throws IOException {

//        System.out.println(getGoodItemList());
        ArrayList<User> ggg = getGoodItemList();

        ggg.forEach(System.out::println);
        FirstPage firstPage=new FirstPage();
        firstPage.setVisible(true);

    }

    static ArrayList<User> getGoodItemList() {
        ArrayList<User> goodItems = new ArrayList<>();
        ArrayList<String> text=new ArrayList<>();
        try {
            BufferedReader br = new BufferedReader(new FileReader("Users.txt"));
            String id = "";
            while ((id = br.readLine()) != null) {
                text.add(id);


            }
        } catch (Exception ignored) {
        }
        int count=0;
        int count1 =1;
        for (int i = 0; i < text.size()/2; i++) {
            goodItems.add(new User(Integer.parseInt(text.get(count1)),text.get(count)));
            count+=2;
            count1+=2;
        }
        return goodItems;
    }

    static void saveGoodItems(ArrayList<User> goodItems) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("Users.txt"));
            for (User g : goodItems) {
                bw.write(g.getId() + "\n");
                bw.write(g.getPass() + "\n");
            }
            bw.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}