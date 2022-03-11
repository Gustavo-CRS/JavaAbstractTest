package com.sovos;
import java.text.DecimalFormat;
public class Main {

    public static void main(String[] args) {
        DecimalFormat df = new DecimalFormat();
        Chefe ch = new Chefe("nome", "sla", 27000);
        PorComissao pc = new PorComissao("comissao", "sla", 12000, 50,20);
        PorHora ph = new PorHora("hora", "sla", 125, 160);
        PorItem pi = new PorItem("item", "sla", 780, 12);
        System.out.println(ch.toString() + " ganha $" + df.format(ch.ganha()));
        System.out.println(pc.toString() + " ganha $" + df.format(pc.ganha()));
        System.out.println(pi.toString() + " ganha $" + df.format(pi.ganha()));
        System.out.println(ph.toString() + " ganha $" + df.format(ph.ganha()));
    }
}
