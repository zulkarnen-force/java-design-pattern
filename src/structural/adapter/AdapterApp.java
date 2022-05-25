package structural.adapter;

import structural.adapter.adapters.SquarePegAdapter;
import structural.adapter.round.RoundHole;
import structural.adapter.round.RoundPeg;
import structural.adapter.square.SquarePeg;

public class AdapterApp {
    public static void main(String[] args) {
        // Round fits round, no surprise
        RoundHole hole = new RoundHole(5);
        RoundPeg roundPeg = new RoundPeg(5);

        if (hole.fits(roundPeg)) {
            System.out.println("Round peg r5 fits round hole r5");
        }


        SquarePeg smallPeg = new SquarePeg(2);
        SquarePeg largePeg = new SquarePeg(20);
        // hole.fits(smallPeg); // won't compile

        // Adapter solves the problem
        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallPeg);
        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largePeg);

        if (hole.fits(smallSqPegAdapter)) {
            System.out.println("Square Peg w2 firs Round hole r5");
        }

        if (!hole.fits(largeSqPegAdapter)) {
            System.out.println("Square peg w20 does not fit into round hole r5");
        }



    }
}
