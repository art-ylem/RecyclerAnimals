package com.example.recycleranimals;

import java.util.Objects;

public class Tiger extends GeneralAnimals implements Runable {
    private String voice;
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tiger)) return false;
        Tiger tiger = (Tiger) o;
        return img == tiger.img &&
                Objects.equals(voice, tiger.voice) &&
                Objects.equals(name, tiger.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(voice, name, img);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    private int img;

    public String getVoice() {
        return voice;
    }

    public void setVoice(String voice) {
        this.voice = voice;
    }
    @Override
    String voice() {
        setVoice("RRRRRRRrrrrrrrr");
        return voice;
    }

    @Override
    String name() {
        setName("tiger");
        return name;
    }

    @Override
    int img() {
        setImg(R.drawable.ic_launcher_account);
        return img;
    }

    @Override
    public void run() {

    }
}
