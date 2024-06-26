package sg.edu.nus.comp.cs4218;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.OutputStream;

import sg.edu.nus.comp.cs4218.exception.AbstractApplicationException;
import sg.edu.nus.comp.cs4218.exception.ShellException;

/**
 * The Command is a common interface for all commands such as call, pipe, etc.
 */
public interface Command {

    /**
     * Evaluates command using data provided through stdin stream. Write result to stdout stream.
     */
    void evaluate(InputStream stdin, OutputStream stdout)
            throws AbstractApplicationException, ShellException, FileNotFoundException;

    /**
     * Terminates current execution of the command.
     */
    void terminate();

}
