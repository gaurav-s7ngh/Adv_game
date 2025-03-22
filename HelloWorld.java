import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

        String c2, c3;
        String dec = "r";
        System.out.println("WELCOME TO HOUSE OF ECHOES!");
        System.out.println("");
        Scanner input = new Scanner(System.in);
        
        while (dec.equals("r")) {
            System.out.println("You have been transported to the year 3433. You wake up and notice that you're no longer on Earth. Gravity feels different. It's dark outside and as you stand up, you realize you're outside... a house?");
            System.out.println("What will you do next ");
            System.out.println("Select one: [a] Walk towards the house or [b] call out to the house");
            String choice = input.nextLine();
            
            if (choice.equals("a")) {
                System.out.println("You approach the house and walk up the stairs to the front door. You're about to knock when suddenly you notice the lights inside the house turn on.");
                System.out.println("You step into the strange metallic house, the door slamming shut behind you. A dim, pulsing light runs through the walls like veins.");
                System.out.println("The air hums with an electric charge. A whisper—not from a person, but from the house itself—slithers through the air. You must choose. A section of the wall shifts, revealing two passages ahead");
                System.out.println("SELECT one: [a] The corridor of shadows and [b] The Staircase of Time.");
                c2 = input.nextLine();
                
                if (c2.equals("a")) { 
                    System.out.println("The mist thickens as you walk. The walls seem to move, shifting between stone and metal. At the end of the corridor stands a mirror. But it does not reflect you—it shows another version of you.");
                    System.out.println("This version reaches out. Its lips move, but no sound comes out.");
                    System.out.println("Two doors materialize beside the mirror.");
                    System.out.println("Left door: Leads into a bright, sterile room where a single heartbeat pulses in the air");
                    System.out.println("Right door: Leads into a void of absolute blackness. Something breathes in there.");
                    System.out.println("Which do you enter? Click [a] or [b]");
                    c3 = input.nextLine();
                    
                    if (c3.equals("a")) {
                        System.out.println("The sterile room is empty, except for a single hospital bed. You step closer, and the sound of the heartbeat pulses louder. Then, you see it.");
                        System.out.println("You are lying on the bed. Unmoving. Connected to wires, barely breathing. The whispers in the corridor return, now clear: Wake up. A shock runs through you. Your vision blurs.");
                        System.out.println("When you open your eyes again, you are somewhere else. Back on Earth. In a hospital bed. Doctors surround you. Their voices are distant, but one thing is clear—You had been in a coma.");
                        System.out.println("3433? The house? The whispers? Was it real, or just a fragmented dream?");
                        System.out.println("You may never know.");
                    } else if (c3.equals("b")) {
                        System.out.println("The void swallows you. There is no floor beneath your feet, no sky above you—just a vast nothingness. Then, you hear breathing.");
                        System.out.println("Something shifts in the darkness. Eyes open—hundreds of them.");
                        System.out.println("A voice, deep and ancient, rumbles: [You were never meant to leave.] A cold sensation washes over you as realization dawns. This is not a place people return from.");
                        System.out.println("And then—silence.");
                    }
                } 
                else if (c2.equals("b")) {
                    System.out.println("To your right, a spiral staircase ascends into soft, flickering light. The air smells strangely nostalgic, like an old book or a memory you can't quite grasp. As you step closer, you hear something—laughter? Your own voice, from childhood.");
                    System.out.println("The higher you climb, the stronger the pull of déjà vu.");
                    System.out.println("At the top of the stairs, you find a room filled with floating clocks, all ticking at different speeds. A desk sits in the center, with an open book. Your name is written inside, along with events you do not remember. The last entry is unfinished. It simply reads: [The choice is yours].");
                    System.out.println("Two windows appear, each showing a different world.");
                    System.out.println("Left window: A city you do not recognize, but somehow know you once lived in.");
                    System.out.println("Right window: A desolate wasteland with something moving in the sand.");
                    System.out.println("Click [a] if you chose the city or click [b] if you chose the wasteland");
                    c3 = input.nextLine();
                    
                    if (c3.equals("a")) {
                        System.out.println("You step through the window and find yourself in a bustling city. People pass by, unaware that you don't belong. But something feels familiar. You check your reflection in a glass surface—you have a new face, a new identity.");
                        System.out.println("A note in your pocket reads: [Live this life]. The past is gone. This is your second chance.");
                    } else if (c3.equals("b")) {
                        System.out.println("The wasteland stretches before you, endless and silent. The sand shifts unnaturally. You hear whispers—figures emerging from the dunes, familiar yet forgotten.");
                        System.out.println("A voice in the wind whispers: [You will not be remembered.] And then, you fade, lost to time.");
                    }
                }
            } 
   else if (choice.equals("b")) {
    System.out.println("You decide to stay where you are and call out to the house. At first, there's silence. Then, a faint rustling inside.");
    System.out.println("The wind picks up, carrying a distant whisper. The house seems to breathe. Suddenly, the front door creaks open slightly, but no one steps out.");
    System.out.println("Do you: [a] Walk cautiously towards the door or [b] Call out again, demanding a response?");
    c2 = input.nextLine();

    if (c2.equals("a")) {
        System.out.println("You take careful steps toward the door. The floorboards groan beneath your weight.");
        System.out.println("Peering inside, you see a grand hallway lit by flickering candles. Shadows dance along the walls.");
        System.out.println("A voice echoes from within: 'You shouldn't have come.'");
        System.out.println("Do you: [a] Enter the house or [b] Step back and run?");
        c3 = input.nextLine();

        if (c3.equals("a")) {
            System.out.println("You step inside, and the door slams shut behind you. A shiver runs down your spine.");
            System.out.println("Ahead, two doors stand before you. One glows with a soft blue light, the other is completely black.");
            System.out.println("Which do you choose? [a] The glowing blue door or [b] The black door?");
            c3 = input.nextLine();

            if (c3.equals("a")) {
                System.out.println("You push open the blue door and find yourself in a room filled with floating stars.");
                System.out.println("A celestial figure stands before you. 'You have entered the realm of forgotten dreams,' it says.");
                System.out.println("Your body begins to feel weightless. You are no longer bound by time.");
            } else if (c3.equals("b")) {
                System.out.println("The black door creaks open, revealing complete darkness.");
                System.out.println("A hand—cold and lifeless—grabs your arm. 'You belong to the house now,' a voice whispers.");
                System.out.println("The last thing you see is a pair of glowing red eyes before everything fades.");
            }
        } else if (c3.equals("b")) {
            System.out.println("You step back, heart pounding, and turn to run.");
            System.out.println("But as you do, the ground beneath you shifts. You are no longer outside the house—you are inside.");
            System.out.println("The house has claimed you.");
        }

    } else if (c2.equals("b")) {
        System.out.println("You call out again, louder this time. 'Who's there?' you demand.");
        System.out.println("A faint light flickers from the upper window. A shadow passes.");
        System.out.println("Then, the door swings open wider, revealing a long hallway with no end in sight.");
        System.out.println("Do you: [a] Step inside or [b] Turn and leave?");
        c3 = input.nextLine();

        if (c3.equals("a")) {
            System.out.println("You take a deep breath and step inside. The moment you do, the door slams shut behind you.");
            System.out.println("A staircase spirals upwards, and a whisper calls your name.");
            System.out.println("Do you: [a] Follow the whisper or [b] Ignore it and explore the ground floor?");
            c3 = input.nextLine();

            if (c3.equals("a")) {
                System.out.println("You ascend the staircase. The whispers grow louder.");
                System.out.println("At the top, you see a mirror. But your reflection is... different.");
                System.out.println("It reaches out to you and says: 'We have been waiting.'");
            } else if (c3.equals("b")) {
                System.out.println("You decide to explore the ground floor.");
                System.out.println("As you walk down the hallway, doors begin to vanish behind you.");
                System.out.println("You are trapped.");
            }
        } else if (c3.equals("b")) {
            System.out.println("You turn to leave, but the house has other plans.");
            System.out.println("The world around you warps, and suddenly, you are inside the house anyway.");
            System.out.println("The walls whisper secrets you cannot understand.");
        }
    }
}

            else {
                System.out.println("WRONG! Choose the option between [a] or [b] please");
            }
            
            // Restart or exit the game
            System.out.println("Would you like to exit or restart: click [e] to exit and [r] to restart");
            dec = input.nextLine();
            if (dec.equals("r")) {
                System.out.println("You start again......");
            } else if (dec.equals("e")) {
                System.out.println("Thanks for playing!");
                break;
            }
        }
    }
}
