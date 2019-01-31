public class Main{

  public static void main(String[] args){

    Utils.println("Hello there, what is your name?");
    String name = Utils.getInputString();
    Utils.println("Did you say " + name);
    String response = Utils.getInputString().toLowerCase();

    if(Utils.str_equl(response, "yes")){
      Utils.println("Good, we may continue");
    }else if(Utils.str_equl(response, "no")){
      Utils.println("Awe, sorry about that");
    }else {
      Utils.println("[ERROR] - Invalid Response");
    }

  }
}
