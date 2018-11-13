package beam.job.module;

import java.util.function.Function;

public class Job <Input,Output>{

	private Input input;
	private Output output;
	private Function<Input, Output> definedFunction;
	
	public Input getInput() {
		return input;
	}
	public void setInput(Input input) {
		this.input = input;
	}
	public Output getOutput() {
		return output;
	}
	public void setOutput(Output output) {
		this.output = output;
	}
	public Function<Input, Output> getDefinedFunction() {
		return definedFunction;
	}
	public void setDefinedFunction(Function<Input, Output> definedFunction) {
		this.definedFunction = definedFunction;
	}
	
	
}
