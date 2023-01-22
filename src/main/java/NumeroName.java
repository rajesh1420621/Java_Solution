public class NumeroName {

//    Can you write a name that turns input into a numero name?
    public String convertName(String name){
        return name.charAt(0) + String.valueOf(name.substring(1, name.length()-1).length()) + name.charAt(name.length()-1);
    }
}
