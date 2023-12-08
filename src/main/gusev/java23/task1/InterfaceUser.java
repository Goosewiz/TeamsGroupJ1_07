package main.gusev.java23.task1;

public class InterfaceUser {
    SomeInterface<String> inUse;
    SomeInterface<String> getUsed(){
        SomeInterface<String> answer = inUse;
        return answer;
    }
    void useInterface(SomeInterface<String> I){
    }
}
