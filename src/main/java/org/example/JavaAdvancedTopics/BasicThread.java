package org.example.JavaAdvancedTopics;

public class BasicThread extends Thread {
    private String name;
    private Integer tempo;

    public BasicThread(String name, Integer tempo) {
        this.name = name;
        this.tempo = tempo;
        start();
    }

    @Override
    public void run() {
        try {
            super.run();
            for (int i = 0; i < 11; i++) {
                System.out.println(this.name + "  " + i);
                Thread.sleep(tempo);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

