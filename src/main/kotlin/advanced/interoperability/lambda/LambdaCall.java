package advanced.interoperability.lambda;

import kotlin.jvm.functions.Function1;

public class LambdaCall {
    public static void main(String[] args) {
        // TODO (1) Zavolejte funkci foo ze souboru lambda
        LambdaKt.foo("Hello World", String::toUpperCase);

        LambdaKt.foo("Hello World Again", text -> text + " :)");

        LambdaKt.foo("Hello World Yet Again", new Function1<String, String>() {
            @Override
            public String invoke(String s) {
                return s.toLowerCase();
            }
        });
    }
}
