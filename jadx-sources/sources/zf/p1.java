package zf;

/* compiled from: r8-map-id-d9727bc7e00235ac513a61fce9aaf2b7a3ad41c0941d80eeaba89f3cd6d3eec5 */
/* loaded from: classes2.dex */
public final class p1 extends com.google.crypto.tink.shaded.protobuf.w {
    private static final p1 DEFAULT_INSTANCE;
    public static final int DEK_TEMPLATE_FIELD_NUMBER = 2;
    public static final int KEK_URI_FIELD_NUMBER = 1;
    private static volatile com.google.crypto.tink.shaded.protobuf.w0 PARSER;
    private a1 dekTemplate_;
    private String kekUri_ = "";

    static {
        p1 p1Var = new p1();
        DEFAULT_INSTANCE = p1Var;
        com.google.crypto.tink.shaded.protobuf.w.t(p1.class, p1Var);
    }

    public static p1 A(com.google.crypto.tink.shaded.protobuf.i iVar, com.google.crypto.tink.shaded.protobuf.o oVar) {
        return (p1) com.google.crypto.tink.shaded.protobuf.w.r(DEFAULT_INSTANCE, iVar, oVar);
    }

    public static p1 w() {
        return DEFAULT_INSTANCE;
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
                return new com.google.crypto.tink.shaded.protobuf.a1(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0208\u0002\t", new Object[]{"kekUri_", "dekTemplate_"});
            case 3:
                return new p1();
            case 4:
                return new k0(DEFAULT_INSTANCE, 3);
            case 5:
                return DEFAULT_INSTANCE;
            case 6:
                com.google.crypto.tink.shaded.protobuf.w0 w0Var = PARSER;
                if (w0Var != null) {
                    return w0Var;
                }
                synchronized (p1.class) {
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

    public final a1 x() {
        a1 a1Var = this.dekTemplate_;
        return a1Var == null ? a1.z() : a1Var;
    }

    public final String y() {
        return this.kekUri_;
    }

    public final boolean z() {
        return this.dekTemplate_ != null;
    }
}
