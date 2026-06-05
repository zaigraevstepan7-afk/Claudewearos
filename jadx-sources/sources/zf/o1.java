package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class o1 extends com.google.crypto.tink.shaded.protobuf.w {
    private static final o1 DEFAULT_INSTANCE;
    public static final int PARAMS_FIELD_NUMBER = 2;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 1;
    private p1 params_;
    private int version_;

    static {
        o1 o1Var = new o1();
        DEFAULT_INSTANCE = o1Var;
        com.google.crypto.tink.shaded.protobuf.w.t(o1.class, o1Var);
    }

    public static n1 A() {
        return (n1) DEFAULT_INSTANCE.h();
    }

    public static o1 B(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.o oVar) {
        return (o1) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, iVar, oVar);
    }

    public static void w(o1 o1Var) {
        o1Var.version_ = 0;
    }

    public static void x(o1 o1Var, p1 p1Var) {
        o1Var.getClass();
        p1Var.getClass();
        o1Var.params_ = p1Var;
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
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u000b\u0002\t", new Object[]{"version_", "params_"});
            case 3:
                return new o1();
            case 4:
                return new n1(DEFAULT_INSTANCE);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (o1.class) {
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

    public final p1 y() {
        p1 p1Var = this.params_;
        return p1Var == null ? p1.w() : p1Var;
    }

    public final int z() {
        return this.version_;
    }
}
