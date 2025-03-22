import java.util.Scanner;
public class HelloWorld {

    public static void main(String[] args) {

            String c2,c3,c4;
         String dec = "r";
         System.out.println("Choose your own Adventure game!");
         System.out.println("");
            Scanner input = new Scanner(System.in);
         while(dec.equals("r")){

        
                System.out.println("You have been transported to the year 3433. You wake up and notice that you're no longer on Earth. Gravity feels different. It's dark outside and as you stand up, you realize you're outside... a house?");
                 System.out.println("What will you do next ");
             System.out.println("Select one: [a] Walk towards the house or [b] call out to the house");
             String choice = input.nextLine();
         if(choice.equals("a")){
            System.out.println("You approach the house and walk up the stairs to the front door. You're about to knock when suddenly you notice the lights inside the house turn on. ");
            System.out.println("You step into the strange metallic house, the door slamming shut behind you. A dim, pulsing light runs through the walls like veins. ");
            System.out.println("The air hums with an electric charge.A whisper—not from a person, but from the house itself—slithers through the air.You must choose. A section of the wall shifts, revealing two passages ahead");
            System.out.println("SELECT one : [a] The corridor of shadows and [b] The Staircase of Time.");
            c2 = input.nextLine();
            if(c2.equals("a")){ 
                System.out.println("The mist thickens as you walk. The walls seem to move, shifting between stone and metal. At the end of the corridor stands a mirror. But it does not reflect you—it shows another version of you.");
                System.out.println("This version reaches out. Its lips move, but no sound comes out.");
                System.out.println("Two doors materialize beside the mirror.");
                System.out.println("Left door: Leads into a bright, sterile room where a single heartbeat pulses in the air");
                System.out.println("Right door: Leads into a void of absolute blackness. Something breathes in there.");
                System.out.println("Which do you enter? Click [a] or [b]");
                c3 = input.nextLine();
                if(c3.equals("a")){
                    System.out.println("The sterile room is empty, except for a single hospital bed. You step closer, and the sound of the heartbeat pulses louder.Then, you see it.");
                    System.out.println("You are lying on the bed. Unmoving. Connected to wires, barely breathing.The whispers in the corridor return, now clear: Wake up.A shock runs through you. Your vision blurs.");
               
                }

          
            }
            else if(c2.equals("b")){

             }

         }
         else if(choice.equals("b")){
            System.out.println("You decide to stay where you are and call out to the house and then u hear a bit of rustling inside the house but no one comes out.");
            System.out.println("");
       
         }
            else{
            System.out.println("WRONG! Choose the option between [a] or [b] please");
            }
            System.out.println("Would u like to exit or restart : click [e] to exit and [r] to restart");
            dec = input.nextLine();
            if(dec.equals("r")){
                System.out.println("You start again......");
            }
            else if(dec.equals("e")){
                System.out.println("Thanks for playing!");
                break;
            }
         
         
         

        }
        

    }
}
