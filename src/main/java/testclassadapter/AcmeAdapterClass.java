package testclassadapter;

public class AcmeAdapterClass extends AcmeClass {
    AcmeAdapterClass(AceClass ace) {
        super(ace.getName().split(" ")[0], ace.getName().split(" ")[1]);
    }
}
