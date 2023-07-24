package behavioral_design_pattern;

interface Command {
    void execute();
}

class Open implements Command {
    FileManager fileManager;

    Open(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute() {
        fileManager.openFile();
    }
}

class Close implements Command {
    FileManager fileManager;

    Close(FileManager fileManager) {
        this.fileManager = fileManager;
    }

    @Override
    public void execute() {
        fileManager.closeFile();
    }
}

class FileManager {
    void openFile() {
        System.out.println("file is opened");
    }

    void closeFile() {
        System.out.println("file is closed");
    }
}

class Invoker {
    Command command;

    void setCommand(Command command) {
        this.command = command;
    }

    void executeCommand() {
        command.execute();
    }
}

class Main3 {
    public static void main(String[] args) {
        FileManager fileManager = new FileManager();

        Open open = new Open(fileManager);
        Close close = new Close(fileManager);

        Invoker invoker = new Invoker();
        invoker.setCommand(open);
        invoker.executeCommand();

        invoker.setCommand(close);
        invoker.executeCommand();
    }
}