package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class m1 extends com.google.crypto.tink.shaded.protobuf.w {
    private static final m1 DEFAULT_INSTANCE;
    public static final int KEY_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER;
    private String keyUri_ = "";

    static {
        m1 m1Var = new m1();
        DEFAULT_INSTANCE = m1Var;
        com.google.crypto.tink.shaded.protobuf.w.t(m1.class, m1Var);
    }

    public static m1 w() {
        return DEFAULT_INSTANCE;
    }

    public static m1 y(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.o oVar) {
        return (m1) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, iVar, oVar);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.w
    public final Object i(int i10) {
        com.google.crypto.tink.shaded.protobuf.w0 vVar;
        switch (y3.e.b(i10)) {
            case 0:
                return (byte) 1;
            case 1:
                return null;
            case 2:
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0000\u0000\u0001\u0208", new Object[]{"keyUri_"});
            case 3:
                return new m1();
            case 4:
                return new k0(DEFAULT_INSTANCE, 2);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (m1.class) {
                    try {
                        vVar = PARSER;
                        if (vVar == null) {
                            vVar = new com.google.crypto.tink.shaded.protobuf.v();
                            PARSER = vVar;
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                return vVar;
            default:
                throw new UnsupportedOperationException();
        }
    }

    public final String x() {
        return this.keyUri_;
    }
}
