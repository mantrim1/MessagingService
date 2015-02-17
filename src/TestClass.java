
public class TestClass {
    public static void main(String[] args) {
        MessageService theMessage = new MessageService(new SoccerMessageWriterStrategy(), new GuiOutputMessageStrategy());
        theMessage.outputMessage();
    }
}